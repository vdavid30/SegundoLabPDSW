/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

/**
 *
 * @author hcadavid
 */
public interface PersistenceHandler {
    
    public void save(String content, String fileName);
    public String load(String fileName);
    
}
