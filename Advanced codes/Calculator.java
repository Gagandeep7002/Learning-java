import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\nEnter the operation you want to perform(+,-,*,/,%,power,exit): ");
            String op = scanner.nextLine();
            if (op.equalsIgnoreCase("exit")){
                break;
            }

            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();
        
            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();
            scanner.nextLine();
            if (op.equals("+")){
                System.out.printf("%f + %f = %f",a,b,a+b);
            }else if (op.equals("-")){
                System.out.printf("%f - %f = %f",a,b,a-b);
            }else if (op.equals("*")){
                System.out.printf("%f * %f = %f",a,b,a*b);
            }else if (op.equals("/")){
                if (b==0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.printf("%f / %f = %f",a,b,a/b);
                }
            }else if (op.equals("%")){
                System.out.printf("%f remainder %f = %f",a,b,a%b);
            }else if (op.equalsIgnoreCase("power")){
                System.out.printf("%f^%f = %f",a,b,Math.pow(a , b));
            }else{
                System.out.println("Invalid operator");
            }
        }
        scanner.close();
    }
}
