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
public class Course {
    protected String code;
    protected Lecturer teacher; 
    protected String coursework;
    protected String room;
    
    public void Course(String code, Lecturer lecturer, String coursework, String room)
    {
        code = this.code;
        lecturer = this.teacher;
        coursework = this.coursework;
        room = this.room; 
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCoursework() {
        return coursework;
    }

    public void setCoursework(String coursework) {
        this.coursework = coursework;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    
    
}
