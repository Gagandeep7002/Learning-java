import java.util.Scanner;

class userInputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();//Inputs strings
        System.out.println("Hello "+name+" how old are you?");
        int age = scanner.nextInt();//Inputs integer
        scanner.nextLine();//This next line function is used to take the "\n" operator left in pool by next int function.
        System.out.println(age+" is a great age to start coding");
        scanner.close();
    }
}
