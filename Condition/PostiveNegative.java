import java.util.*;
public class PostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-->");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("The number is positve");
        }
        else if(number < 0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("It's zero");
        }
    }
}
