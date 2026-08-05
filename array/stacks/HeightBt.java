public class HeightBt {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data=data;
            this.right=null;
            this.left=null;

        }
            
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int max=Math.max(lh,rh)+1;
        return max;


        
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
       int lcount=count(root.left);
       int rcount=count(root.right);
       int treecount=lcount+rcount+1;
       return treecount;

        
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }

      int leftsum=sum(root.left) ;   
      int rightsum=sum(root.right);
      int treesum=leftsum+rightsum+root.data;
      return treesum;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
       root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int res=height(root);
        System.out.println(res);
        System.out.println(count(root));
        System.out.println(sum(root));
        
    }
}
