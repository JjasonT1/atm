import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {

    /*
     * declare variables
     */
    int balance = 1000000;
    int deposit;

    int withdraw;

    // declare scanner object
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("ATM Machine, Please choose a option");
      System.out.println("Select 1 for withdrawal");
      System.out.println("Select 2 for deposit");
      System.out.println("Select 3 for Balance On Screen");
      System.out.println("Select 4 to Exit");

      int choice = input.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Please enter the amount you would like to withdraw");
          System.out.println("Your current balance is: " + balance);
          withdraw = input.nextInt();

          if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("Your new balance is: " + balance);
          } else {
            System.out.println("Not enough funds");
          }
          System.out.println("");
          break;

        case 2:
          System.out.println("Please enter the amount you would like to deposit");
          deposit = input.nextInt();

          balance = balance + deposit;
          System.out.println("Depost has successfully updated");
          System.out.println("Your new balance is: " + balance);
          System.out.println("");
          break;

        case 3:
          System.out.println("You Balance is : " + balance);
          System.out.println("");
          break;

        case 4:
          System.out.println("Thank you for banking with us");
          System.exit(0);
      }
    }
  }
}
