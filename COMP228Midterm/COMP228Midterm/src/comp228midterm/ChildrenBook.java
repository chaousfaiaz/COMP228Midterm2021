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

import javax.swing.JOptionPane;
public class ChildrenBook extends Book{
    
     // Constructor
    public ChildrenBook(String title, String ISBN, String publisher, Double price, Integer year) {
        super(title, ISBN, publisher, price, year);

        setPrice(this.getPrice());
        // Informs User of Changes
        JOptionPane.showMessageDialog(null, "Price of Children's Book is  10%\n $" + String.format("%.2f%n",this.getPrice()));
    }

    // Sets the budget of the movie
    @Override
    public void setPrice(Double price) {
        // Increase budget by 10%
        this.price = price;
    }

    // Returns the Genre Name
    @Override
    public String getGenre() {
        return this.getClass().getName();
    }
}

