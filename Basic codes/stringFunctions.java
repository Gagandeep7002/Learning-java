class stringFunctions{
    public static void main(String[] args) {

        //Creating a string.

        String name = "Gagandeep";
        String country = new String("India");
        System.out.println("My name is "+name+" . I live in "+country+".");

        //String Functions.
        String formattedString = String.format("My name is %s . I live in %s.",name,country);
        System.out.println(formattedString);

        System.out.println(name.length());

        System.out.println(name.isEmpty());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(formattedString.contains("is"));

        System.out.println(name.equals(country));
    }
}