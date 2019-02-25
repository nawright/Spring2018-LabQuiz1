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
    private Textbook textbook;
    
    public Course() {
        name = "";
        semester = "";
        instructor = null;
        textbook = null;
    }
    public Course(String name, String semseter, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.semester = semester;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    public String toString() {
        String first = name + " , " + semester;
        return (first + "\n" + instructor.toString() + "\n" + textbook.toString()); 
    }
}
