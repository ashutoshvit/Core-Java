package InterviewPrograms;
import java.lang.Integer;


public class BinarySearchImpl {
	BSTNode root=null;
	public boolean isEmpty() {
		return this.root==null;
	}
	public void insert(Integer data) {
		System.out.println("input :"+data);
		if(root==null) {
			this.root=new BSTNode(data);
			System.out.println("-> inserted :"+data);
			return;
		}
		insertNode(this.root,data);
		System.out.println("Node is inserted :"+data);
		System.out.println();
	
	}
	private BSTNode insertNode(BSTNode root, Integer data) {
		 
		BSTNode tmpNode = null;
        System.out.print(" ->"+root.getData());
        if(root.getData() >= data) {
            System.out.print(" [L]");
            if(root.getLeft() == null) {
                root.setLeft(new BSTNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRight() == null) {
                root.setRight(new BSTNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
 
        return insertNode(tmpNode, data);
	}
	private Integer findHeight() {
		return getNodeHight(this.root);
	}
	private Integer getNodeHight(BSTNode node) {
		if(node==null) {
			return -1;
		}
		return Math.max(getNodeHight(node.getLeft()), getNodeHight(node.getRight()));
	}
	public static void main(String[] args) {
		BinarySearchImpl bst = new BinarySearchImpl();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        bst.insert(2);
        System.out.println("-------------------");
        System.out.println("Height of the tree: "+bst.findHeight());
	}
}
