
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Your eligible");
        } else {
            System.out.println("Not eligible");
        }

    }
}
