/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

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
        //System.out.println(test1.toString());
        //System.out.println(test2.toString());
        
        Textbook book1 = new Textbook();
        Textbook book2 = new Textbook("A name","by some guy",-12);
        //System.out.println(book1.toString());
        System.out.println("");
        //System.out.println(book2.toString());
        
        //Course class1 = new Course();
        Course class2 = new Course("Nolan","2020",test2,book2);
        //System.out.println(class1.toString());
        //System.out.println("");
        //System.out.println(class2.toString());
        
        ArrayList<Course> courses = new ArrayList<>();
        readCourseData(courses,args[0]);
    }
    public static void readCourseData(ArrayList courses, String fileName) {
        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()) {
                String messy = input.nextLine();
                String[] mess = new String[2];
                mess = messy.split(",");
                String name = mess[0].trim();
                String semester = mess[1].trim();
                String messy2 = input.nextLine();
                String[] mess2 = messy2.split("\\*");
                String firstName = mess2[0].trim();
                String lastName = mess2[1].trim();
                String building = mess2[2].trim();
                String stringRoom = mess2[3].trim();
                int room = parseInt(stringRoom);
                String title = input.nextLine().trim();
                String publish = input.nextLine().trim();
                int edition = parseInt(input.nextLine());
                Instructor instructor = new Instructor(firstName,lastName,building,room);
                Textbook textbook = new Textbook (title,publish,edition);
                Course course = new Course(name,semester,instructor,textbook);
                courses.add(course);
            }
            int length = courses.size();
            for ( int i = 0; i < length; i++) {
                String print = courses.get(i).toString();
                System.out.println(print);
            }
        }
        catch(java.io.FileNotFoundException ex ) {
            System.err.println("Could not find the file for printing");
            System.exit(-1);
        }
        
    }
    
}
