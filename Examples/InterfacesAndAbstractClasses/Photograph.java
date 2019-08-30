public class Photograph implements Sellable {
    private String desc;
    private int price;
    private boolean color;
    private String locality;

    // constructor
    public Photograph(String des, int pric, boolean c, String loc) {
        this.desc = des;
        this.price = pric;
        this.color = c;
        this.locality = loc;
    }

    @Override
    public String description() {
        return desc;
    }

    @Override
    public int listPrice() {
        return price;
    }

    @Override
    public int lowestPrice() {
        return price / 2;
    }

    @Override
    public String locality() {
        return locality;
    }

    public static void main(String[] args) {
        Photograph p = new Photograph("A4 size", 240, true, "Kenyan");
        System.out.println(p.description());
    }
}