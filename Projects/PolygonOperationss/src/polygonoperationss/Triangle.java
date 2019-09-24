/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package polygonoperationss;

import java.util.Scanner;

/*
 * @author samjay
 */
public class Triangle implements  Polygon{
    
    private Scanner input=new Scanner(System.in);
    
    private  double base;
    private double sideA;
    private double sideB;
    private double height;
    double ans;
   //default constructor
    public Triangle(){
    }
    public Triangle(double b,double sA,double sB){
        base=b;
        sideA=sA;
        sideB=sB;
    }
    public double setBase(){
        System.out.print("base: ");
        base=input.nextDouble();
        return base;
    }
    @Override
    public void area() {
        if(sideA == sideB){
            height =Math.sqrt((Math.pow(sideA, 2))-Math.pow((0.5*base), 2));
           ans= (0.5 * base * height);
            System.out.println("area = "+ans);
        }
        else{
            System.out.println("Special case");
        }
         
    }

    @Override
    public void perimeter() {
         ans = sideA+sideB+base;
         System.out.println("perimeter = "+ans);
    }
    

}
