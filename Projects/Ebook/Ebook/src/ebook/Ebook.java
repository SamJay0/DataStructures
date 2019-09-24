/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
/** Write a Java program that simulates a system that supports the functions of an e-
book reader. You should include methods for users of your system to “buy” new
books, view their list of purchased books, and read their purchased books. Your
system should use actual books, which have expired copyrights and are available
on the Internet, to populate your set of available books for users of your system
to “purchase” and read.*/
package ebook;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

/**
 * @author samjay
 */
public class Ebook {
    private static Scanner input= new Scanner(System.in);
    static Book [] booksAvailable=new Book[10];
    static Book [] booksPurchased = new Book[10];
    //show books Available
    public static void displayBooksAvailable(){
        for(int i=0;i<booksAvailable.length;i++){
            booksAvailable[i]=new Book((i+1)+". Think Big", "Ben Carson", "BC673J", 2300);
            System.out.println( booksAvailable[i].toString());
        }
        
    }
    //buy book from those available on internet
    public static void buy(){
        displayBooksAvailable();
        System.out.print("enter book number: ");
        int choice;
        while(!(input.hasNextInt())){
            input.nextLine();
            System.out.print("please enter a number:  ");
        }
        choice = input.nextInt();
        switch(choice){
            case 1:{
                int ans =JOptionPane.showConfirmDialog(null, ""+booksAvailable[choice-1].getTitle()+" by "+booksAvailable[choice-1].getAuthor(), 
                        "You Picked on", JOptionPane.YES_OPTION);
                        if(ans== JOptionPane.YES_OPTION){
                            System.out.println("You just bought "+booksAvailable[choice-1].toString());
                        }
                break;
            }
            case 2:{
                System.out.println("coming up");
                break;
            }
            default:{
                System.out.println("coming up");
                break;
            }
        }

    }
    //View list of purchased books
    public void viewListOfPurchasedBooks(){
    }
    //read purchased book
    public void readBook(){
        
    }
    public static void main(String[] args) {
        buy();
    }

}
