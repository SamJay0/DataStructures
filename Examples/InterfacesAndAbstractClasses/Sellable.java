//interfaces have methoods without bodies
public interface Sellable {
    // returns description
    public String description();

    // returns list price in cents
    public int listPrice();

    // returns lowest Price in cents accepted
    public int lowestPrice();

    //returns locality
    public String locality();
}