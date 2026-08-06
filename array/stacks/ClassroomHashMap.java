import java.util.HashMap;
public class ClassroomHashMap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer>hm=new HashMap<>();
        // add
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("usa", 50);
        hm.put("france", 30);
        System.out.println(hm);
        System.out.println(hm.get("china"));
        System.out.println(hm.containsKey("up"));
        hm.remove("france");
         System.out.println(hm);
         //size
         System.out.println(hm.size());
         //clear
         hm.clear();
         //isempty
       System.out.println(hm.isEmpty());
        
       

    }
    
}
