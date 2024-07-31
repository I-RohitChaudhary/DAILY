class _1SquareHollowPattern {
    // Driver code
    public static void main(String[] args) {
        int n = 5; // range for loop
        for (int i = 1; i <= n; i++) { // outer loop for row 
            for (int j = 1; j <= n; j++) { // inner loop for column
                if (i == 1 || j == 1 || i == 5 || j == 5) // to control the flow 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");//  for changing line
        }
    }
}