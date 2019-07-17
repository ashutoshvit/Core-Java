package InterviewPrograms;
import java.lang.Integer;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeImplLevelOrder {
	private BSTNode root;
	 
    public boolean isEmpty() {
 
        return (this.root == null);
    }
 
    public void insert(Integer data) {
 
        System.out.print("[input: "+data+"]");
        if(root == null) {
            this.root = new BSTNode(data);
            System.out.println(" -> inserted: "+data);
            return;
        }
 
        insertNode(this.root, data);
        System.out.print(" -> inserted: "+data);
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
 
    public void levelOrderTraversal() {
 
        Queue<BSTNode> discovedNodeQueue = new LinkedList<>();
        if(this.root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        discovedNodeQueue.add(this.root);
        while (!discovedNodeQueue.isEmpty()) {
 
        	BSTNode tmpNode = discovedNodeQueue.remove();
            if(tmpNode.getLeft() != null) { discovedNodeQueue.add(tmpNode.getLeft()); }
            if(tmpNode.getRight() != null) { discovedNodeQueue.add(tmpNode.getRight()); }
            System.out.print(tmpNode.getData()+" ");
        }
    }
    public static void main(String a[]) {
    	 
    	BinarySearchTreeImplLevelOrder bst = new BinarySearchTreeImplLevelOrder();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("-------------------");
        System.out.println("Level order traversal");
        bst.levelOrderTraversal();
    }
 

}
