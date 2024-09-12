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
    Tree temp=root;
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
    public Tree InsertBSTIttr(Tree root,int val) {
        Tree t=new Tree(val);
        Tree cur=root;
        Tree prev=null;
        while(cur!=null){
            prev=cur;
            if(val<cur.val){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        if(prev==null){
            prev=t;
        }else if(val<prev.val){
            prev.left=t;
        }else{
            prev.right=t;
        }
        return  root;
        
    }
    public void InsertIttr(int val) {
        root=InsertBST(root, val);
    }
    public boolean  Search(int val) {
       return SearchBST(root,val);
        
    }
    public Boolean SearchBST(Tree root,int data) {
        if(root==null){
            return false;
        }else if(root.val==data){
            return true;
        }else if(data>root.val){
            return SearchBST(root.right, data);
        }else{
           return  SearchBST(root.left, data);
        }
        //return false;
    }
    public Tree Del(Tree root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.val) {
            root.left = Del(root.left, val);
        } else if (val > root.val) {
            root.right = Del(root.right, val);
        } else {
            // Node to be deleted found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Find the inorder successor (smallest in the right subtree)
            Tree successor = getMinValueNode(root.right);
            root.val = successor.val;
            // Delete the inorder successor
            root.right = Del(root.right, successor.val);
        }
        return root;
    }

    public Tree getMinValueNode(Tree node) {
        Tree current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void DelTree(int val) {
        Del(root,val);
    }
    public void In(Tree temp) {
        if(temp!=null){
            In(temp.left);
            System.out.print(temp.val+",");
            In(temp.right);
        } 
    }
    public void PrintTree() {
        System.out.println("InOrder Traversal");
        In(root);
           }
}
public class Tree_Insert_Delete_Search{
    public static void main(String[] args) {
        BST a=new BST();
        a.InsertIttr(3);
        a.InsertIttr(2);
        a.InsertIttr(5);
        a.Insert(10);
        a.DelTree(5);
        a.PrintTree();
       // System.out.println(a.Search(1));
        
    }
}