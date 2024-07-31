import java.util.*;

public class SwitchConditon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = sc.next().toLowerCase().trim();
        sc.close();
        dayWeek(day);
       
    }
    static void dayWeek(String day) {
        switch (day) {
            case "monday":
                System.out.println("IT's Monday");
                break;
            case "tuesday":
                System.out.println("IT's Tuesday");
                break;
            case "wednesday":
                System.out.println("IT's Wednesday");
                break;
            case "thursday":
                System.out.println("IT's Thursday");
                break;
            case "friday":
                System.out.println("IT's Friday");
                break;
            case "saturday":
                System.out.println("IT's Saturday");
                break;
            default:
                System.out.println("Not vaild input");
                break;
        }
    }
}
