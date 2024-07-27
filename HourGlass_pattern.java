public class HourGlass_pattern {
    public static void hourGlass(int n,int m) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
              if (k == 0 || k == i) {
                    System.out.print(" u");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < m; i++) {
            for (int j = m; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i+1; k++) {
                System.out.print(" u");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        hourGlass(5,4);
    }
}
