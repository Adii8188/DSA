public class Bin1{
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

    static class BinaryTree{
        static int ind=-1;
        public static Node buildTree(int nodes[]){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }
            Node newNode=new Node(nodes[ind]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            
            return newNode;
        }

        public static void preOrder(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return ;
            }

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }


        public static void inOrder(Node root){
            if(root==null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }


        public static void postOrder(Node root){
            if(root==null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

    }
public static void main(String arg[]){
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree b=new BinaryTree();
    Node root=b.buildTree(nodes);
   // System.out.println(root.left.data);
      b.preOrder(root);
      System.out.println();
      b.inOrder(root);
      System.out.println();
      b.postOrder(root);
}
}