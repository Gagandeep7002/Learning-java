import java.util.Arrays;

class array {
    public static void main(String[] args) {
        char vowels[] = {'o','e','u','a','i'};

        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        int i = Arrays.binarySearch(vowels, 'i');
        System.out.println(i);
        Arrays.fill(vowels,1,3, 'z');
        System.out.println(Arrays.toString(vowels));
        
        char copy[] = Arrays.copyOfRange(vowels,2,4);
        System.out.println(Arrays.toString(copy));

    }
}
