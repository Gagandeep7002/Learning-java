import java.util.Scanner;

class conditions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        if (a==b){
            System.out.println("The two numbers are equal.");
        }else{
            System.out.println("The two numbers are not equal.");
        }

        scanner.close();
    }
}