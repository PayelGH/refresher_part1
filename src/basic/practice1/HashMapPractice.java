package basic.practice1;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<Integer, String>();
        map.put(101, "John");
        map.put(105, "Luke");
        map.put(107, "Mike");
        map.put(112, "Troy");
        map.put(115, "Jake");
        map.put(121, "Alan");
        map.put(126, "Goldie");

        System.out.println(map);
        map.remove(112);

        TreeMap<Integer, String> sort = new TreeMap<>();  // TreeMap to store values of HashMap
        sort.putAll(map); // Copy all data from hashMap into TreeMap

        for(Map.Entry e:sort.entrySet()){  // Display the key and values in TreeMap which is naturally sorted
            System.out.println(e.getKey()+ " "+ e.getValue());

            //normal unsorted case : for(Map.Entry e :map.entrySet()){
            //                       System.out.println(e.getKey()+ " " +e.getValue());
                             }

    }
}
