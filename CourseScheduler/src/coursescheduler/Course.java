package coursescheduler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maste
 */
public class Course {
    private String name;
    private String semester;
    private Instructor instructor;
    
    public Course() {
        name = "";
        semester = "";
        instructor = null;
    }
    public Course(String name, String semseter, Instructor instructor) {
        this.name = name;
        this.semester = semester;
        this.instructor = instructor;
    }
}
