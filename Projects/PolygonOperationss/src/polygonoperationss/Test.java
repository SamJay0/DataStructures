/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package polygonoperationss;

import java.util.Scanner;

/*
 * @author samjay
 */
public class Test {

    public static void choice() {
        System.out.print("####Welcome to POLYGON OPERATIONS,Let us know what Polygon you're Working on:####\n"
                + "\t1.Triangle\n"
                + "\t2.Quadilateral\n"
                + "\t3.Pentagon\n"
                + "\t4.Hexagon\n"
                + "\t5.Octagon\n"
                + "Enter your choice:");
    }

    public static void respondToUserChoice() {
        Scanner scan = new Scanner(System.in);
        int choice;
        while (!(scan.hasNextInt())) {
            scan.nextLine();
            System.out.print("please enter a number:");
        }
        choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("1.Equilateral \t 2.Isosceles\n enter choice: ");
                while (!(scan.hasNextInt())) {
                    scan.nextLine();
                    System.out.print("please enter a number:");
                }
                int pick = scan.nextInt();
                switch (pick) {
                    case 1: {
                        System.out.print("enter dimesion: ");
                        double dim = scan.nextDouble();
                        EquilateralTriangle tri = new EquilateralTriangle(dim);
                        tri.area();
                        tri.perimeter();
                        break;
                    }
                    case 2: {
                        System.out.print("enter dimensions: base: ");
                        double b = scan.nextDouble();
                        System.out.print("sides: ");
                        double side= scan.nextDouble();
                        Triangle tri2 = new IsoscelesTriangle(b, side);
                        tri2.area();
                        tri2.perimeter();
                        break;
                    }
                    default:
                        System.out.println("invalid choice!!");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Coming up");
                break;
            }
            case 3: {
                System.out.println("Coming up");
                break;
            }
            case 4: {
                System.out.println("Coming up");
                break;
            }
            case 5: {
                System.out.println("Coming up");
                break;
            }
            default: {
                System.out.println("Not in range");
                break;
            }
        }
    }

    public static void main(String[] args) {
        choice();
        respondToUserChoice();
    }

}
