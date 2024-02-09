/*import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;*/

import java.util.Scanner;

public class Main { 

  static MyMath myMath;
  
  public static void main(String[] args) {

    boolean more = true;

    @SuppressWarnings("resource")

    Scanner input = new Scanner(System.in);

    while(more == true){

      myMath = new MyMath();

      //System.out.println("What operation would you like to use?");

      //String operation = input.nextLine();

      System.out.println("\nWelcome to the calculator!\n");

      System.out.println("What is your first number?\n");

      double numOne = input.nextDouble();

      System.out.println("\nWhat is your second number?\n");

      double numTwo = input.nextDouble();

      System.out.println("\nWhat operation would you like to use?\n\n0 Addition | 1 Subtraction | 2 Multiplication | 3 Division | 4 Modulos\n");

      double operation = input.nextDouble();

      if(operation == 0){

        System.out.println("\nYour total is: " + Double.valueOf(myMath.add(numOne, numTwo)));

      }else if(operation == 1){

        System.out.println("\nYour total is: " + Double.valueOf(myMath.sub(numOne, numTwo)));

      }else if(operation == 2){

        System.out.println("\nYour total is: " + Double.valueOf(myMath.multiply(numOne, numTwo)));

      }else if(operation == 3){

        System.out.println("\nYour total is: " + Double.valueOf(myMath.divide(numOne, numTwo)));

      }else if(operation == 4){

      System.out.println("\nYour total is: " + Double.valueOf(myMath.mod(numOne, numTwo)));

      }

      more = false;

      while(more == false){

        System.out.println("\nWould you like to try another equation?\n\n1 Yes | 0 No\n");

        double response = input.nextDouble();

        if(response == 0){

          System.out.println("Thank you for using the calculator!");

          input.close();

          return;

        }else if(response == 1){

          more = true;

        }
      
      }

      //testMultiply();
    
    }

  }

  /*@Test

  static void testMultiply() {

    assertEquals(2*3, myMath.multiply(2, 3));

  }*/

}