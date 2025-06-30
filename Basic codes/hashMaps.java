import java.util.HashMap;

class hashMaps {
    public static void main(String[] args) {
        HashMap<String , Integer> scores = new HashMap<>();

        scores.put("Physics", 89);
        scores.put("Chemistry", 93);
        scores.put("Maths", 91);
        scores.put("English", 89);
        scores.put("CS", 97);

        scores.replace("English", 87);

        System.out.println(scores.toString());

        //HashMap functions

        System.out.println(scores.get("CS"));

        System.out.println(scores.getOrDefault("Accounts", -1));

        System.out.println(scores.size());

        System.out.println(scores.remove("English"));

        System.out.println(scores.containsKey("Maths"));

        // for each loop

        scores.forEach((subject , score) -> {
            System.out.println(subject + " - " + score);
        });

        scores.clear();
        System.out.println(scores.isEmpty());
    }    
}
