import java.util.*;
public class String_pal {
    public static boolean palidrome(String name){
        int left = 0;
        int right = name.length()-1;
        while (left < right) {
            if (name.charAt(left) != name.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asking for user input
        System.out.print("Plz, Enter your name :");
        String name = sc.next().toLowerCase().trim();
        if (palidrome(name)){
            System.out.print("The given String is palidrome in natue !");
        }
        else{
            System.out.print("The given String is not palidrome in nature");
        }
    }
}
