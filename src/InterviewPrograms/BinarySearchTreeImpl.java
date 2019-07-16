package InterviewPrograms;
import java.lang.Integer;
public class BinarySearchTreeImpl {
	private BSTNode root;
	public boolean isEmpty() {
		return(this.root==null);
	}
	public void insert(Integer data) {
		System.out.println("[inserting data : " + data+"]");
		if(root==null) {
			this.root=new BSTNode(data);
			System.out.println("-> Inserted "+data);
			return;
		}
		insertNode(this.root,data);
		System.out.println("-> Inserted "+data);
		System.out.println();
	}
	private BSTNode insertNode(BSTNode root, Integer data) {
		BSTNode tempNode=null;
		System.out.println("->"+root.getData());
		if(root.getData()>=data) {
			System.out.println("[L]");
			if(root.getLeft()==null) {
				root.setLeft(new BSTNode(data));
				return root.getLeft();
			}else {
				tempNode=root.getLeft();
			}
			
		}else {
			System.out.println("[R]");
			if(root.getRight()==null) {
				root.setRight(new BSTNode(data));
				return root.getRight();
			}else {
				tempNode=root.getRight();
			}
		}
		return insertNode(tempNode,data);
		
	}
	public static void main(String[] args) {
		BinarySearchTreeImpl bst= new BinarySearchTreeImpl();
		bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
	}

}
