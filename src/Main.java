import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, password, initial amount to create an account");

//        creating user
        String name=sc.nextLine();
        String passWord=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,passWord,balance);

//        add amount
        String message=user.addMount(5000);
        System.out.println(message);

//        withdraw money
        System.out.println("Enter amount you want to withdraw");
        double amount=sc.nextDouble();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println(user.withDraw(amount,pass));
        }
    }
