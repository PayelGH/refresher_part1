package basic.practice1;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<Object>();//note does not have any boundary like array
        list.add("Hello");
        list.add("World");
        list.add(1230);
        list.add("Oh ");
        list.add(134.99);
        list.add("John");
        list.add("Tina ");
//        System.out.println(list);
//
//        list.remove(3);
//        System.out.println(list);
//
//        list.add(3, "Baby baby ");
//        System.out.println(list);
//
//        //how to read all values in ArrayList : same as Array : using for each
        for( Object e:list ){
            System.out.println(e);
        }
    }
    }


