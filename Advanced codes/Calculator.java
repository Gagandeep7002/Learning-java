import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the operation you want to perform(+,-,*,/,%,power): ");
        String op = scanner.nextLine();

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

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
        }else if (op.equals("power")){
            System.out.printf("%f^%f = %f",a,b,Math.pow(a , b));
        }

        scanner.close();
    }
}
