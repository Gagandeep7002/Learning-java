import java.util.*;

class bubbleSort{
    public static void main(String args[]){
        int n;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}