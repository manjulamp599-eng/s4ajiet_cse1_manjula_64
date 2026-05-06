import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList <> ();
        list.add(10);
        list.add(25);
        list.add(13);
        list.add(23);
        list.add(0,12);
        list.set(1,22);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println("list="+list);
    }
}
