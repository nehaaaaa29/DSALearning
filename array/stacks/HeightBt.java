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
    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }
       int leftdiam=diameter2(root.left);
       int rightdiam=diameter2(root.right);
      int leftheight=height(root.left);
      int rightheight=height(root.right);
      int selfdiam=leftheight+rightheight+1;
     return Math.max(selfdiam,Math.max(leftdiam,rightdiam));

    }
    static class info{
        int diam;
        int ht;
        public info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static info diameter(Node root){
        if(root==null){
            return new info(0,0);
        }

        info leftinfo=diameter(root.left);
        info rightinfo=diameter(root.right);

        int diam=Math.max(Math.max(leftinfo.diam , rightinfo.diam) , leftinfo.ht+ rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new info (diam,ht);
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
        System.out.println(diameter2(root));

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);
    }
}
