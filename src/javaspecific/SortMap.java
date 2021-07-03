package javaspecific;

import java.util.*;

public class SortMap {

    public static HashMap<String, String> sortByValue(HashMap<String, String> hm)
    {
        List<Map.Entry<String, String> > list =
                new LinkedList<Map.Entry<String, String> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, String> >() {
            public int compare(Map.Entry<String, String> o1,
                               Map.Entry<String, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, String> temp = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args)
    {

        HashMap<String, String> flowers = new HashMap<String, String>();

        // enter data into hashmap

        flowers.put("Hibiscus", "Red");
        flowers.put("Daisy", "White");
        flowers.put("Marigold", "Orange");
        flowers.put("Sunflower", "Yellow");
        flowers.put("Lavender", "Purple");
        System.out.println("Map Sorted By Value: ");
        Map<String, String> flowers1 = sortByValue(flowers);

        // print the sorted hashmap
        for (Map.Entry<String, String> en : flowers1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
