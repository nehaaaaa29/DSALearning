public class doubleLL {
    public class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }

     public static Node head;
     public static Node tail;
     public static int size;

     // add

     public void addFirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;

     }
      

public void addLast(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
        newnode.next=null;
    }



public int removeFirst(){
    if(head==null){
        System.out.println("list is empty");
    }
if(size==1){
    int val=head.data;
    head=tail=null;
    size--;
    return val;
}
    int val=head.data;
  head=head.next;
  head.prev=null;
  size--;
  return val;

}
public int deletelast(){

    if(head==null){
        System.out.println("list is empty");
    }
if(size==1){
    int val=head.data;
    head=tail=null;
    size--;
    return val;
}
    int val=tail.data;
    tail=tail.prev;
    tail.next=null;
    size--;
    return val;

}



    public  void print(){
        Node temp=head;
        while(temp!=null){
         System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        doubleLL dll=new doubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.print();
        dll.removeFirst();
        dll.deletelast();
        dll.print();

        dll.addLast(6);
         dll.print();
    }
    
}
