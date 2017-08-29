/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeType.impl;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import code.CodeType;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class UnicodeEncodingValidator implements CodeType{

    public String load(String fileName){
        return fileName;
    }
    public void save(String content,String name){
        LOG.info("Saving in Unicode...");
    }
    public boolean validateEncoding(String text) {
        LOG.info("Validating UNICODE-Enconding for text....");
        return true;
    }
    private static final Logger LOG = Logger.getLogger(UnicodeEncodingValidator.class.getName());
  
    
    
    
}
