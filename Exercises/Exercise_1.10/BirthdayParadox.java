/** The birthday paradox says that the probability that two people in a room will
have the same birthday is more than half, provided n, the number of people in the
room, is more than 23. This property is not really a paradox, but many people
find it surprising. Design a Java program that can test this paradox by a series
of experiments on randomly generated birthdays, which test this paradox for n =
5,10,15,20, . . . ,100.*/
import java.util.Random;
import java.util.Arrays;
public class BirthdayParadox{

  private static Random random=new Random();
      //generate birthdays randomly
  public static int [] generateBirthdaysRandomly(int n){
    int [] birthdays=new int [n];
    for(int i=0;i<n;i++){
      birthdays[i]=Math.abs((random.nextInt()%31))+1;
    }
    return birthdays;
  }

  //check how many times the birthdate appears
  public static int timesTheBirthdateOccurs(int date,int [] birthdates){
    int count=0;
    for(int i=0;i<birthdates.length;i++){
      if(date==birthdates[i]){
        count++;
      }
    }
    return count;
  }

  //calculate probability that two have thw same birthdays
  public static void printProbability(int count,int counts){
    double probability=counts/count;
    System.out.println("the probablity that two share birthdates = "+probability);
  }

  public static void main(String[] args) {
    for (int i=5;i<101;i+=5){
          System.out.println("Birthdays for "+ i +" persons");
          int [] dates=generateBirthdaysRandomly(i);
          System.out.println(Arrays.toString(dates));
          System.out.println(dates[0]+" occurs "+timesTheBirthdateOccurs(dates[0],dates)+" times\n");
    }
  }
}
