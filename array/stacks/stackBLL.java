import java.util.Stack;

public class stackBLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

static class Stack{
    static Node head=null;
    public static boolean isEmpty(){
      return head==null;
    }

    public static void push(int data){
        
    }

}



public static void main(String[] args) {
    Stack s=new Stack();
    s.push(1);
      s.push(2);
        s.push(3);
          s.push(4);
            s.push(5);
          while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
          }
}
    
}
