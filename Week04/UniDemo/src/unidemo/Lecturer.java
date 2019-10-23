/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author otaylor4
 */
public class Lecturer extends UniPeople{
    String name;
    String id;
    String course;
    
    public void lecturer(String name, String id)
    {
        name = this.name;
        id = this.id; 
    }
}
