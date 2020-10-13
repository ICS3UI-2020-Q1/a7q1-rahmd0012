import java.util.Scanner;
/**
 * a program that finds the letter grade of a user after entering a number grade
 * @author Daniel Rahmani
 */
public class Main {

  // create a method to find the grade
  public static void examGrade(double mark){
    if(mark >= 80.0){
      System.out.println("Your letter grade is A");
    } else if(mark < 80 && mark >=70){
      System.out.println("Your letter grade is B");
    } else if(mark < 70 && mark >= 60){
      System.out.println("Your letter grade if C");
    } else if(mark < 60 && mark >=50){
      System.out.println("Your letter grade if D");
    } else 
    System.out.println("Your letter grade if F");
  }
  

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for their number grade
    System.out.println("Please enter a number grade");
    double mark = input.nextDouble();
    examGrade(mark);


  }
}
