package basic.practice1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();//note does not have any boundary like array
        list.add("India");
        list.add("Sweden");
        list.add("Austria");
        list.add("Canada");
        list.add("Denmark");
        list.add("Zambia");
        list.add("Uganda ");
//
//        //how to read all values in ArrayList 1a)  : same as Array : using for each : unsorted
//        for(Object e: list){
//            System.out.println(e);
//        }
        //how to read all values in ArrayList 1b)  : same as Array : using for each : sorted
//        Collections.sort(list);
//        for(String e:list){
//            System.out.println(e);

        //how to read all values in ArrayList 2)  : using Iterator class and .iterator() method

            Iterator<String> iterator= list.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        System.out.println("End of program");

        }
    }



