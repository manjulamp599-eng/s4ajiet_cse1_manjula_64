import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        HashSet<Integer>cse=new HashSet<>();
        cse.add(30);
        cse.add(3);
        cse.add(12);
        cse.add(13);
        cse.add(22);
        cse.add(23);
        cse.remove(30);
        cse.size();
        cse.add(31);
    System.out.println(cse);
    System.out.println(cse.contains(31));
    }
}
