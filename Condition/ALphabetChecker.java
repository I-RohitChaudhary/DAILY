import java.util.*;
public class ALphabetChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input-->");
        if(sc.hasNextInt()){
            System.out.println("The given input is not Alphabet");
        }
        else{
            System.out.println("The given input is Alphabet");
        }
    }
}
