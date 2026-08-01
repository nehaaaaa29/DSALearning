public class QueueLL {

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        public static Node front;
        public static Node rear;

       public static boolean isEmpty()
       {
        return front==null && rear==null;
       }


      public static void push(int data)
      {
        Node newNode =new Node(data);
          if(front==null)
          {
             front =rear=newNode;
             return;
         }

         
         rear.next=newNode;
         
         rear=newNode;

      }

      public static int remove()
      {
       if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
       }
        int val=front.data;
        if(rear==front){
            rear=front=null;
           
        }else{
             front =front.next;
        }
        

       return val;

      }

      public static int peek()
      {
        if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
       }
       int val=front.data;
       return val;

      }


    
}
    public static void main(String[] args) {
        Queue n=new Queue();

        n.push(4);
        n.push(5);
        while(!n.isEmpty()){
            System.out.println(n.peek());
            n.remove();
        }

    }
    
}
