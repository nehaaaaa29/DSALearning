

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

public int removeLast(){
if(size==0){
  System.out.println("Linked list is empty");
   return Integer.MIN_VALUE;
}
else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;
    return val;
  }
  Node prev=head;
  for(int i=0;i<size-2;i++){
    prev=prev.next;
  }
 int val=prev.next.data;

  prev.next=null;
  tail=prev;
  size--;
  return val;
}

//iterative serch

public int search(int key){
 
   int  idx=0;
   Node temp=head;
   while(temp !=null){
    if(temp.data==key){
      return idx;
      
    }
    temp=temp.next;
    idx++;
  
   }


  return -1;
}
//helper fun
public int helperfun(Node head,int key){

  if(head==null){
    return -1;
  }
   
  if(head.data ==key){
  return 0;
  }

  int idx=helperfun(head.next, key);
  if(idx==-1){
    return -1;
  }
  return idx+1;


}

//recursive search

public int recSearch(int  key){

  return helperfun( head, key);

}

public void reverse(){
  Node prev=null;
  Node curr=tail=head;
  Node next;
  while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
  }
  head=prev;
}
public void deleteNode(int n){
  int sz=0;
  Node temp=head;
  while(temp!=null){
    temp=temp.next;
    sz++;
  }


  if(n==sz){
    head=head.next;
    return;
  }


  int i=1;
   int idx=sz-n;
   Node prev=head;

   while(i<idx){
    prev=prev.next;

  i++;
   }
   prev.next=prev.next.next;
   return;


}


public static boolean iscycle(){
  Node slow=head;
  Node fast=head;
  while(fast!=null && fast.next !=null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
     return  true;
    }

  }

  return false;
  
}

public static void removecycle(){
 Node slow=head;
  Node fast=head;
  boolean cycle=false;
  while(fast!=null && fast.next !=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
     cycle=true;
     break;
    }

  }
  if(cycle==false){
    return;
  }

  slow=head;
  Node prev=null;
  while(slow !=fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;
  }


  prev.next=null;



 
 

}



public static void main(String[] args) {

LinkedList ll=new LinkedList();

head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=head;
System.out.println(iscycle());

  
           
}



}
