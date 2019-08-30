/**generates a simple progression(0,1,2,3...) */
public class Progression{
    //the current value
    protected long current;
    //default constructor
    public Progression(){
        this(0);
    }
    // constructor with parameter
    public Progression(long start){
        current=start;
    }
    //next value
    public long nextValue(){
        long result=current;
        advance();
        return result;
    }

    public void advance(){
        current +=5;
    }
    //print progression
    public void printProgression(int n){
        // System.out.print(nextValue());
        for(int i=0;i<n;i++){
            System.out.print(" "+nextValue());
        }
    }
    public static void main(String[] args) {
        Progression p= new Progression(5);
        p.printProgression(5);

    }
}