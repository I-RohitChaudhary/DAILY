public class BubbleSorting {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubble(int[] arr) {
        System.out.print("BEFORE SORTING : ");
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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
    public static void selection(int[] arr){
        System.out.print("BEFORE SORTING : ");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small] > arr[j]){
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i]=temp;
        }
        System.out.println("");
        System.out.print("AFTER SORTING :");
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 71, 22, 3 };
       // bubble(arr);
        selection(arr);
    }
}
