package basic.practice1;
import java.util.ArrayList;
import java.util.Collections;
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
//        //how to read all values in ArrayList : same as Array : using for each : unsorted
//        for(Object e: list){
//            System.out.println(e);
//        }
        //sorted : using Collections.sort(list)
        Collections.sort(list);
        for(String e:list){
            System.out.println(e);
        }
    }
}


