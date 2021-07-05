import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Bank sunny = new Bank();
        sunny.showMenu();
    }
}


//declaring bank varaibles such as username, balance, customerName, customerID

class Bank{
    double Balance;
    String Username;
    String customerName;
    String customerID;
    String Password;

    void create_Account(String Username, String Password){

    }

    void deposit(int amount){
        Balance += amount;
        //Balance, amount
    }

    void withdraw(int amount){
        Balance -= amount;
        //Balance, amount
    }


    //display a number of options that allows the user to interact with the banking application
    //option A: create account
    //option B: deposit money
    //option C: withdraw money
    //option D: check balance
    //option E: exit
    void showMenu(){
    char option = '\0';
    Scanner scanner = new Scanner(System.in);


    do{
        System.out.println("please enter an option from A,B,C,D,E");
        option = scanner.next().charAt(0);

        //TODO HERE

        switch(option){
            case 'A':
                System.out.println("this is in A");
                break;
                //TODO

            case 'B':
                System.out.println("this is in B");
                break;
                //TODO
                //finish the rest of the cases

            case'C':
                //TODO

            case'D':
                //TODO


        }
    }while(option != 'E');
        System.out.println("have a nice day!");

    }// end of showMenu()

}//end of Bank Class


