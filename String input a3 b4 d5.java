public class RepeatPattern {
    public static void main(String[] args) {
        String input = "a3 b4 d5";
        
        String[] parts = input.split(" ");
        
        for (String part : parts) {
            char ch = part.charAt(0);
            int count = Integer.parseInt(part.substring(1));
            
            for (int i = 0; i < count; i++) {
                System.out.print(ch);
            }
            System.out.print(" ");
        }
    }
}
