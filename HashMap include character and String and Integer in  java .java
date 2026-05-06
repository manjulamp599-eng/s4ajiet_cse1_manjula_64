import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       String s = "college";

        HashMap<Character, Integer> k = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (k.containsKey(c)) {
                k.put(c, k.get(c) + 1);
            } else {
                k.put(c, 1);
            }
        }
        for (char ch : k.keySet()) {
            if (k.get(ch) > 1) {
                System.out.println(ch + " -> " + k.get(ch));
                
            }
        }
         HashMap<String, Integer> map = new HashMap<>();
        map.put("Mango", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);
    System.out.println("Mango count: " + map.get("Mango"));
        map.remove("Banana");
            if (map.containsKey("Orange")) {
            for (String key : map.keySet()) {
                System.out.println(key + " -> " + map.get(key));
            }
        }
    System.out.println("Orange count: " + map.get("Orange"));
    }
}
