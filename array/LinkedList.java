

public class LinkedList {
    


public static  class Node{

int data;
Node next;

public Node(int data){
    this.data=data;
    this.next=null;
}



}
public static Node head;
public static Node tail;
public static int size;

public void AddFirst(int data){
    //step1 create new node
      Node newnode= new Node( data);
      size++;
      //agar head null hai that means koi node hi nhi hai toh newnode ko hi head aur tail bana denge
    if(head==null){
       head=tail=newnode;
       return;
    }
   
  //step 2 newnode.next=head;
    newnode.next=head;
    //ab newnode hi head ban jayega
   head= newnode;
}
public void AddLast(int data){
  //step 1 create new node
  Node newnode= new Node(data);
  size++;
  //agar list khali hui toh
  if(head==null){
    head=tail=newnode;
    return;
  }
  tail.next=newnode;
  tail=newnode;
}

public  void   print(){
  if(head==null){
    System.out.println("NULL");
  }
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data + " -> ");
    temp=temp.next;
  }
  System.out.print("NULL");
  System.out.println();
}
public void addIndex(int idx,int data){
  if(idx==0){
    AddFirst(data);
    return;
  }
   
  
  Node newnode=new Node(data);
  size++;
  Node temp=head;
  int i=0;
   while(i<idx-1){
   temp=temp.next;
    i++;

  }
 newnode.next=temp.next;
    temp.next=newnode;


}
public int removeFirst(){
  if(size==0){
    System.out.println("LL is empty");
    return Integer.MIN_VALUE;
  }else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
  }
  int val=head.data;
  head=head.next;
  size--;
  return val;
}

public static void main(String[] args) {

LinkedList ll=new LinkedList();

   ll.AddFirst(5);
    ll.AddFirst(4);
     ll.AddFirst(3);
      ll.AddFirst(2);
       ll.AddFirst(1);
       ll.AddLast(6);
       ll.AddLast(7);
       ll.addIndex(3, 33);
    ll. print();
     System.out.println(ll.size);
    ll.removeFirst();
    ll.print();
    System.out.println(ll.size);
           
}



}
