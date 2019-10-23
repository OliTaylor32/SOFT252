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
public class UniPeople {
    
    Course course;
    int id; 
    String name; 
    
    public void UniPeople(Course course, int id, String name){
        course = this.course;
        id = this.id;
        name = this.name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
