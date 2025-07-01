import java.util.*;
public class ArrayL{
public static void main(String arg[]){
    ArrayList<Integer> list1=new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);

    System.out.println(list1);

   int v= list1.get(2);
   System.out.println(v);

   list1.remove(2);

   list1.set(1,10);

    list1.add(2,3);
   System.out.println(list1.contains(3));
    System.out.println(list1.contains(11));

    System.out.println(list1);
}
}