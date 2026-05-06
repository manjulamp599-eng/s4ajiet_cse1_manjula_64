import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();
        map.put("Mango", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);
     System.out.println("Mango count: " + map.get("Mango"));
        map.remove("Banana");
        if (map.containsKey("Orange")) 
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
      System.out.println("Orange count: " + map.get("Orange"));      
        }
    }
}
