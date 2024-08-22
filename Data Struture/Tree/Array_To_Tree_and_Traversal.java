class BT{
 class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
Tree root;
BT(int[] arr){
    if(arr.length>0){
        root=consTree(arr,0);
    }
}
public Tree consTree(int [] arr,int index){
    if(index>=arr.length){
        return null;
    }
    Tree node=new Tree(arr[index]);
    node.left=consTree(arr,2*index+1);
    node.right=consTree(arr,2*index+2);
    return node;
}
public void inOrder(Tree node) {
    if (node != null) {
        inOrder(node.left);
        System.out.print(node.data + ",");
        inOrder(node.right);
    }
}
public void preOrder(Tree node) {
    if(node!=null){
        System.out.print(node.data+",");
        preOrder(node.left);
        preOrder(node.right);
    }
    
}
public void postOrder(Tree node) {
    if(node!=null){
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+",");
    }
    
}
public void printInOrder() {
    System.out.println("Inorder");
    inOrder(root);
    System.out.println();
    
}
public void printPreOrder() {
    System.out.println("Preorder");
    preOrder(root);
    System.out.println();
}
public void printPostOrder() {
    System.out.println("Postorder");
    postOrder(root);
    System.out.println();
}
}
public class Array_To_Tree_and_Traversal{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        BT ans=new BT(a);
        ans.printInOrder();
        ans.printPreOrder();

       
    }
}