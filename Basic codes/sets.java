import java.util.*;

class sets{
    public static void main(String[] args) {
        
        int l1[] = {1,2,3,4,5};
        int l2[] = {2,4,6,8,10};
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int a : l1){
            set1.add(a);
        }
        for (int b : l2){
            set2.add(b);
        }
        System.out.println("The first set is : "+ set1);
        System.out.println("The second set is : "+ set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("The union of set1 and set2 is : "+union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("The intersetion of set1 and set2 is : "+intersection);

    }
}