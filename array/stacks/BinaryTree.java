import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{

   int data;
   Node left;
   Node right;
   Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
   }

    }
    static class binaryTree{
        static int  index=-1;
        public static Node buildTree(int nodes[]){
              index++;
            if(nodes[index]==-1){
                return null;
            }
          Node newNode=new Node(nodes[index]);
          newNode.left=buildTree(nodes);
          newNode.right=buildTree(nodes);

          return newNode;

        }

      public static void preorder(Node root){
        if(root==null){
            System.out.print("-1"+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
         

      }
      

      public static void Inorder(Node root){
        
        if(root==null){
            System.out.print("-1"+" ");
            return;
        }

        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
      }
      public static void Postorder(Node root){
        
        if(root==null){
            System.out.print("-1"+" ");
            return;
        }

        Postorder(root.left);
       
        Postorder(root.right);
         System.out.print(root.data+" ");
      }
      public static void levelorder(Node root){
        if(root==null){
            return;
        }
         Queue<Node>q=new LinkedList<>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
            
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
         }else{
            System.out.print(currNode.data+" ");
            if(currNode.left !=null){
                q.add(currNode.left);
            }
              if(currNode.right !=null){
                q.add(currNode.right);
            }
         }
    
      }

    }
}

public static void main(String[] args) {
    
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    binaryTree tree=new binaryTree();
    Node root= tree.buildTree(nodes);
    System.out.println(root.data);
    tree.preorder(root);
    System.out.println();
    tree.Inorder(root);
    System.out.println();
    tree.Postorder(root);
    System.out.println();
    tree.levelorder(root);

   




}


    
}
