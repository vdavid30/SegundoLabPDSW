/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.impl;

import code.CodeType;
import codeType.impl.UTF8EncodingValidator;
import com.google.inject.Inject;
import edu.eci.pdsw.samples.persistence.PersistenceHandler;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class PlainPersistenceHandler implements PersistenceHandler{
    @Inject
    private CodeType codeTy;
    @Override
    public void save(String content, String fileName) {
        
        codeTy.save(content,fileName);
        LOG.info("Saving "+fileName+" in PLAIN TEXT"); 
        
    }
    private static final Logger LOG = Logger.getLogger(PlainPersistenceHandler.class.getName());

    @Override
    public String load(String fileName) {
        LOG.info("LOADING "+fileName+" in PLAIN TEXT");
        return codeTy.load(fileName);        
    }
    
}
