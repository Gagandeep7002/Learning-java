import java.util.ArrayList;
import java.util.Comparator;

class arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int a=1 ; a<=5 ; a++){
            numbers.add(a);
        }

        //ArrayLists Functions.
        //Displays the arraylist
        System.out.println(numbers.toString());
        //Displays true if the list is empty
        System.out.println(numbers.isEmpty());
        //Displays true if an element is present
        System.out.println(numbers.contains(3));
        //Removes the element on the specified index
        System.out.println(numbers.remove(3));
        //Sorts the arraylist in specified order
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        //for each loop
        System.out.println("Before : "+numbers.toString());

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number*2);
        });

        System.out.println("After : "+numbers.toString());
    }    
}
