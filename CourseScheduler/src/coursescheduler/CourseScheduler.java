/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author Maste
 */
public class CourseScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor test1 = new Instructor();
        Instructor test2 = new Instructor("First Name","Last Name","Building",5);
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        
        Textbook book1 = new Textbook();
        Textbook book2 = new Textbook("A name","by some guy",-12);
        System.out.println(book1.toString());
        System.out.println("");
        System.out.println(book2.toString());
    }
    
}
