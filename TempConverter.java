import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of  conversion: ");
        String type = sc.nextLine().toLowerCase().trim();
        System.out.print("Now, Enter the temperature :");
        double temp = sc.nextDouble();
        char res = type.charAt(0);
        switch (res) {
            case 'd':
                double output = (temp * 9 / 5) + 32;
                System.out.println("The conversion from Degree to Fahrenheit " + output);
                break;
            case 'f':
                double output1 = (temp - 32) + 9 / 5;
                System.out.println("The conversion from Degree to Fahrenheit " + output1);
                break;

            default:
                System.out.println("Plz, Enter VAILD INPUT !");
                break;
        }
    }
}
