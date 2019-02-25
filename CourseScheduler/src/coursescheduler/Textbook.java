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
public class Textbook {
    private String title;
    private String publisher;
    private int edition;
    
    public Textbook() {
        title = "";
        publisher = "";
        edition = 0;
    }
    public Textbook(String title, String publisher, int edition) {
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
    }
    public String toString() {
        return (title + "\n" + publisher + "\n" + edition);
    }
}
