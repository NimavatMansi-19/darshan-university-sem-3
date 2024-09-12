
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
public class Symmetric{

        public boolean   Sys(Tree l,Tree r){
            if(l==null && r==null){
                return true;
            }
            if(l==null || r==null){
                return false;
            }
            
               if(l.val!=r.val){
                    return false;
               }
                if(Sys(l.left,r.right)){
                    return false;
                }
                if(Sys(l.right,r.left)){
                    return false;
                }
               
            
            return true;
        }
        public boolean Sysroot(Tree root){
            if(root.left==null && root.right==null){
                return true;
            }
           return Sys(root.left, root.right);
        }
        public static void main(String[] args){
            Tree tree = new Tree(1);
            tree.left = new Tree(2);
            tree.right = new Tree(2);
            tree.left.left = new Tree(3);
            tree.left.right = new Tree(4);
            tree.right.left = new Tree(4);
            tree.right.right = new Tree(3);
            Symmetric s=new Symmetric();
            System.out.println(s.Sysroot(tree));
            
        }
    }
    
    