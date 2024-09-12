
class BST{
    class Tree{
        int val;
        Tree left;
        Tree right;
        Tree(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
     Tree root;
    BST(){
        root=null;
    }
    public void Insert(int val) {
        root=InsertBST(root,val);
        
    }
    public  Tree InsertBST(Tree root,int val) {
        if(root==null){
            root=new Tree(val);
            return root;
        }
        if(val<root.val){
            root.left=InsertBST(root.left, val);
        }else if(val>root.val){
            root.right=InsertBST(root.right, val);
        }
        return root;
    }
   
    public boolean Check(Tree root1,Tree root2){
        if(root1==null && root2==null){
            return  true;
        }if(root1==null || root2==null){
            return false;
        }
        return (root1.val==root2.val) && Check(root1.left, root2.left) && Check(root1.right, root2.right);
    }
    public boolean  Checkans(BST a,BST b) {
       return  Check(a.root, b.root);
        
    }
    public void Inorder(Tree root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.val+",");
            Inorder(root.right);
        }
    }
    public void PrintTree(){
        Inorder(root);
        System.out.println();
    }

}
public class Same_Or_Not {
    public static void main(String[] args) {
        BST a=new BST();
        a.Insert(3);
        a.Insert(2);
        a.Insert(1);
        a.PrintTree();
        BST b=new BST();
        b.Insert(3);
        b.Insert(5);
        b.Insert(1);
        b.PrintTree();
      System.out.println(a.Checkans(a, b));
    }
}
