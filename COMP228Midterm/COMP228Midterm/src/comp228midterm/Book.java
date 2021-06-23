/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228midterm;

/**
 *
 * @author faiaz
 */
public abstract class Book {
    
    // Variable Declaration
    private String title;
    private String ISBN;
    private String publisher;
    public Double price;
    private Integer year;

    // Constructor
    public Book (String title, String ISBN, String publisher, Double price,Integer year){

        // Variable Initialization
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    // Getters and Setters
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public String getpublisher() { return publisher; }
    public void setLeadActor(String publisher) { this.publisher = publisher; }
    public Double getPrice() { return price; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    // Abstract getters/setters
    
    public abstract void setPrice(Double price);
    
    public abstract String getGenre ();

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\nISBN: " + this.getISBN() +"\n Publisher: " + this.getpublisher()
                + "\nBook Price: $" + String.format("%.2f%n",this.getPrice()) + "Year: " + this.getYear();
    }
}
