/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author 2114928
 */
public interface CodeType {
    public String load(String fileName);
    public void save(String content,String name);
}
