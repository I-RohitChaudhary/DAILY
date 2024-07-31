import java.util.*;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float grade = sc.nextFloat();
        grad(grade);
    }
    static void grad(float grade){
        if(grade >= 90){
            System.out.println("Grade A");
        }
        else if (grade >= 80){
            System.out.println("Grade B");
        }
        else if(grade >=70){
            System.out.println("Grade C");
        }
        else if(grade >=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
