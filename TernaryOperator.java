import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num =sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num1 =sc.nextInt();
        System.out.println("The number 1: "+num);
        System.out.println("The number 2: "+num1);
        int max = (num> num1) ? num : num1;
        System.out.println("The greater number is "+max);
    }
}
