import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */

    // // prob 1 
    // double target = 12.345;
    // System.out.println("Enter a number");
    // double input = scan.nextDouble();

    // if (input == target)
    // {
    //   System.out.println("YES!");

    // }
    // else
    // {
    //   System.out.println("NO");
    // }

    //prob 2 
    // int target = 48;
    // System.out.println("Enter a number");
    // int input = scan.nextInt(); // takes in the users input, basically the user input 

    // if (input == target)
    // {
    //   System.out.println("YES!");
    // }
    // else
    // {
    //   System.out.println("NO"); 
    // }

    // prob 3 
    System.out.println("Enter two integers");
    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    // int twice = Mathpow.(input1, 2);

    int twice = input1 + input1; 

    if (input2 == twice)
    {
      System.out.println("YES!");
    }
    else
    {
      System.out.println("NO"); 
    }

    // prob 4
    

    
  


    



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
