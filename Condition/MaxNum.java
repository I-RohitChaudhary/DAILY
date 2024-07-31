import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers-->");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // if(num1 >num2){
        //     System.out.println("The first number is greater ");
        // }
        // else if(num1 == num2){
        //     System.out.println("The  numbers is eqaul ");
        // }
        // else{
        //     System.out.println("The second number is greater");
        // }
        System.out.println(Math.min(num1, num2));
    }
}
