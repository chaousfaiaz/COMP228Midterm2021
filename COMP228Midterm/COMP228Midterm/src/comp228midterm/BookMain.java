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
public class BookMain {
    
    public static void main (String [] args){
        Integer selection ;
        selection = Integer.parseInt(JOptionPane.showInputDialog("What type of Book Do you want? \n Select 1 or 2 for input\n 1. Science Book? \n OR \n 2. Childrens Book?"));
        if (selection == 1) {
            // Create Instance variable of type Science Book  with User Inputs and Display Info
            Book newBook1 = new ScienceBook(JOptionPane.showInputDialog("Title of the Book: "), 
                    JOptionPane.showInputDialog("ISBN Code: "), 
                    JOptionPane.showInputDialog("Publisher Name: "), 
                    Double.parseDouble(JOptionPane.showInputDialog("Book Cost: ")),
                    Integer.parseInt(JOptionPane.showInputDialog(" Release Year: ")));

            // Displays the Children Book Information
            JOptionPane.showMessageDialog(null,newBook1.toString() + "\nGenre: "+ newBook1.getGenre(), "Book Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (selection == 2) {
            // Create Instance variable of type Children's Book with User Inputs
            Book newBook2 = new ChildrenBook(JOptionPane.showInputDialog("Title of the Book: "), 
                    JOptionPane.showInputDialog("ISBN Code: "), 
                    JOptionPane.showInputDialog("Publishers Name: "), 
                    Double.parseDouble(JOptionPane.showInputDialog("Book Cost: ")), 
                    Integer.parseInt(JOptionPane.showInputDialog(" Release Year: ")));

            // Displays the Movie Information
            JOptionPane.showMessageDialog(null,newBook2.toString() + "\nGenre: "+newBook2.getGenre(), "Book Information", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
