import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        Double withdraw_amount = myObj.nextDouble();
        int deposit_amount = myObj.nextInt();

        System.out.println("Username is: " + userName);  // Output user input
    }
}