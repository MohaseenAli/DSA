package DSA;
import java.util.*;
public class LLCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("3");
        list.addFirst("2");
        list.addLast("4");
        list.addFirst("1");
        list.addLast("5");
        System.out.println(list);
        System.out.println("Size = "+list.size());

        for(String lst:list){
            System.out.print(lst+"->");
        }
        System.out.println("null");

        System.out.println("=================================");
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        for(String lst:list){
            System.out.print(lst+"->");
        }
        System.out.println("null");
    }
}
