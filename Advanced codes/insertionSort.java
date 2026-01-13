import java.util.Scanner;

class insertionSort {
    public static void main(String[] args) {
        int n;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1 ; i<n ; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= curr;
        }
        System.out.println("Sorted array : ");
        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
