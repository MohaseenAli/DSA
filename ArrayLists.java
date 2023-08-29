package DSA;


import java.util.*;

public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

//       Add element
        list.add(0);
        list.add(3);
        list.add(2);
        System.out.println(list);

//        get element
        int element = list.get(2);
        System.out.println(element);

//        add in between
        list.add(1,1);
        System.out.println(list);

//        Set element
        list.set(0,5);
        System.out.println(list);

//        delete element
        list.remove(0);
        System.out.println(list);

//        size
        int size = list.size();
        System.out.println(size);

//        loop
        for (int i =0 ; i<size ; i++){
            System.out.print(list.get(i));
        }
        System.out.println();
//        enhanced loop
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();
//        sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
