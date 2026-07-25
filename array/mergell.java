public class mergell {

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




private  Node getMid(Node head){

    Node slow=head;
    Node fast=head.next;
    while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next;
    }
  return slow;

}

private Node merge(Node head1,Node head2){

    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
    while(head1 !=null && head2 !=null){
          
        if(head1.data<=head2.data){
         temp.next=head1;
         head1=head1.next;
         temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
   
    }
   

            while(head1!=null){
                temp.next=head1;
         head1=head1.next;
         temp=temp.next;
            }

            while(head2!=null){
                temp.next=head2;
            head2=head2.next;
            temp=temp.next;

            }



return mergedLL.next;
}


public Node mergesort(Node head){
    if(head==null || head.next ==null){
        return head;
    }
    //mid
Node mid  = getMid(head);

Node rightHead=mid.next;
mid.next=null;

//left&right ms
Node newleft=mergesort(head);
Node newright=mergesort(rightHead);

//merge
return merge(newleft,newright) ;

}

 public void zigzag(){
//mid find
 Node slow=head;
    Node fast=head.next;
    while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next;
    }
  Node mid =slow;
//reverse
Node curr=mid.next;
mid.next=null;
Node prev=null;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;

}
Node left=head;
Node right=prev;
Node nextL;
Node nextR;


//alternate merging
while(left !=null && right !=null){
    nextL=left.next;
    left.next=right;
    nextR=right.next;
    right.next=nextL;

left=nextL;
right=nextR;


 }
 }


public static void main(String[] args) {
      
mergell ll=new mergell();
ll.AddFirst(3);
ll.AddFirst(4);
ll.AddFirst(9);ll.AddFirst(7);
ll.AddLast(1);
ll.AddLast(5);
ll.AddLast(2);
ll.AddLast(6);
ll.print();
ll.zigzag();
ll.print();

    }
    
}
