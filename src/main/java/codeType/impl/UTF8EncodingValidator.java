/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeType.impl;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import code.CodeType;
import java.util.Random;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class UTF8EncodingValidator implements CodeType{
    public String load(String fileName){
        return fileName;
    }
    public void save(String content,String name){
        LOG.info("Saving in UTF8-Encoding....Failed :( ");
    }
    public boolean validateRequiredEncoding(String text) {
        LOG.info("Validating UTF8-Enconding for text....");
        return new Random(System.currentTimeMillis()).nextBoolean();        
    }
    
    private static final Logger LOG = Logger.getLogger(UTF8EncodingValidator.class.getName());
    
}
