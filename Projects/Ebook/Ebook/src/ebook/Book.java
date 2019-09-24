/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package ebook;
/*
 * @author samjay
 */
public class Book {
    private String title;
    private String author;
    private String ISBN_number;
    private double price;
    
    //default constructor
    public Book(){
    }
    //
    public Book(String mtitle){
        title=mtitle;
    }
    //
    public Book (String mTitle,String mAuthor,String mISBN,double mPrice ){
        title=mTitle;
        author=mAuthor;
        ISBN_number=mISBN;
        price=mPrice;
    }
  //getters
    public String getTitle(){
        return title;
    }
     public String getAuthor(){
        return author;
    }
      public String getISBN(){
        return ISBN_number;
    }
       public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
       return ""+title+"\t"+author+"\t"+ISBN_number+"\tKsh"+price;
    }
    

}
