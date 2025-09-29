import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int d){
        this.data=d;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree
{
    TreeNode root=null;
    void insert(int d){
        root=insertdata(root,d);
    }
    TreeNode insertdata(TreeNode root, int d){
        TreeNode newNode=new TreeNode(d);
        if(root==null) return newNode;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left==null){
                temp.left=newNode;
                break;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=newNode;
                break;
            }
            else{
                q.add(temp.right);
            }
        }
        return root;
    }
    void preorder(){
        preordertraversal(root);
    }
    void preordertraversal(TreeNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            preordertraversal(root.left);
            preordertraversal(root.right);
            
        }
    }
    void postorder(){
        postordertraversal(root);
    }
    void postordertraversal(TreeNode root){
        if(root!=null){
            postordertraversal(root.left);
            postordertraversal(root.right);
            System.out.print(root.data+" ");
        }
    }
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.preorder();
		System.out.println();
		tree.postorder();
	}
}
