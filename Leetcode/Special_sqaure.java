public class Special_sqaure {
    public static void main(String[] args) {
       int n =5 ;
        // for (int i = n ;i >=1;i--){
        //     for (int j = n; j>i;j--){      
        //         System.out.print(j+" ");
        //     }
        //     for (int j = i; j>=1;j--){      
        //         System.out.print(i+" ");
        //     }
        //     for (int j = i; j>=2;j--){      
        //         System.out.print(i+" ");
        //     }
        //    for (int j =i-1; j>= 1;j--){      
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }

        for (int i=n ;i>=1;i--){
            for (int j = n; j>=i;j--){      
                 System.out.print(j);
            }
            for(int k=1 ;k<=i;k++){
                System.out.print(i);
            }
            System.out.println(" ");

        }
    }
}
