import java.util.*;

public class HashMapSet {

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("usa", 10);
        hm.put("france", 50);
        hm.put("dubai", 70);
        hm.put("nepal", 90);

     Set<String>keys=hm.keySet();
     System.out.println(keys);   

     for (String k : keys) {
        
        System.out.println("key="+k+",value="+hm.get(k));
        
     }


    }
    
}
