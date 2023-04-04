package Core.LambdaAndInterfaces_7;

public class BinaryTree {
    private Node root;
    public BinaryTree() {
        root=null;
    }

    public void addTreeNode(Node root,int val){
        if(root==null){
            root=new Node(val);
        }
        else if(root.val<val){
            addTreeNode(root.leftNode,val);
        }
        else if (root.val>val){
            addTreeNode(root.rightNode,val);
        }
        else {
            System.out.println("Wrong number");
        }

    }


    private static class Node{
        public Node leftNode;
        public Node rightNode;
        public int val;

        public Node(int val) {
            this.leftNode = null;
            this.rightNode = null;
            this.val = val;
        }


    }
}

class Main{
    public static void main(String[] args) {
     BinaryTree binaryTree=new BinaryTree();

    }
}




