public class Sorting {

    // printing array Method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    // Method helps to sort using bubble sorting technique :
    public static void bubble(int[] arr) {
        // printing the before sorting
        System.out.print("BEFORE SORTING : ");
        printArray(arr);
        // outer loop to tranverse over array
        for (int i = 0; i < arr.length - 1; i++) {
            // inner loop to compare each element in array
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping after comparing
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("AFTER SORTING :");
        printArray(arr);
    }

    // Method helps to sort array using Selection Sort Technique
    public static void selection(int[] arr) {
        // printing before sorting 
        System.out.print("BEFORE SORTING :");
        printArray(arr);
        // outer loop help to tranverse over each element
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            // inner loop help to terimate array from starting
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            // Swapping per iterate only one time
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        System.out.println("");
        // printing after sorting
        System.out.print("AFTER SORTING :");
        printArray(arr);
    }

    //Method helps to sort array using Insertion sort Technique
    public static void insertion(int[] arr){
        System.out.print("BEFORE SORTING :");
        printArray(arr);
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            //sorted part ko track karna
            while(j >= 0 && current < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current; // placement
        }
        System.out.println("");
        // printing after sorting
        System.out.print("AFTER SORTING :");
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = { 7, 1, 2, 3, 8 };
        // bubble(arr); // Static method call for Bubble sorting
        // selection(arr); // Static method call for Selection sorting 
        insertion(arr); // Static method call for insertion Sorting
    }
}