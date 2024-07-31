import java.util.Scanner;
public class CondQuest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }
    static void check(int num){
        if (num > 0){
            System.out.println("Number is positive");
        }
        else if(num == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is negative");
        }
    }
    
}
