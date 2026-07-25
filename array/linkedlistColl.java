import java.util.LinkedList;
public class linkedlistColl {
    



public static void main(String[] args) {
    LinkedList <Integer>ll=new LinkedList<>();
    
    
ll.addFirst(2);
ll.addFirst(1);
ll.addLast(3);
ll.addLast(4);
ll.add(4, 5);

System.out.println(ll);
ll.remove(3);
System.out.println(ll);

}


}
