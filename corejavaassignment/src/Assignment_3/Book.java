package Assignment_3;

import com.sun.org.apache.bcel.internal.generic.IREM;

public class Book extends IREM {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Book: [ID: " + super.toString() + ", Title: " + getTitle() + ", Author: " + author + "]");
    }

    public String toString() {
        return getTitle() + " by " + author;
    }

	private String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}