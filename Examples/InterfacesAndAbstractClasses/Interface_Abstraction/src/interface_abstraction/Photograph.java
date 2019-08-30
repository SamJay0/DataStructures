/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package interface_abstraction;
/*
 * @author samjay
 */
public  class Photograph implements Sellable{
    
    private String description;
    private int price;
    
    //constructor
    public Photograph(String desc,int pri){
        description=desc;
        price=pri;
        
    }

    @Override
    public String description() {
        return description;
    }
    @Override
    public int listPrice(){
        return price;
    }
    //returns lowest price in cents
     @Override
    public int lowestPrice(){
        return price/2;
    }

}
