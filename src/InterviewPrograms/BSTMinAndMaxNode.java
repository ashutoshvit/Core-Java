package InterviewPrograms;
import java.lang.Integer;
public class BSTMinAndMaxNode {
	private BSTNode root=null;
	public boolean isEmpty() {
		return(this.root==null);
	}
	public void insert(Integer data) {
		System.out.println("->input : "+data);
		if(root==null) {
			this.root=new BSTNode(data);
			System.out.println("Inserted : "+data);
			return;
		}
		insertNode(this.root,data);
		System.out.println("-> inserted: "+data);
		System.out.println();
	}
	private BSTNode insertNode(BSTNode root, Integer data) {
		BSTNode tempNode=null;
		System.out.println("-> "+root.getData());
		if(root.getData()>=data) {
			System.out.println("Inserting Node at [L] side");
			if(root.getLeft()==null) {
				root.setLeft(new BSTNode(data));
				return root.getLeft();
			}else {
				tempNode=root.getLeft();
			}
		}
		else {
			System.out.println("Inserting Node at [R] side");
			if(root.getRight()==null) {
				root.setRight(new BSTNode(data));
				return root.getRight();
			}
			else {
				tempNode=root.getRight();
			}
		}
		
		return insertNode(tempNode,data);
	}
	public Integer findMinValue() {
		 
        return minValue(this.root);
    }
 
    public Integer findMaxValue() {
 
        return maxValue(this.root);
    }
 
    private Integer minValue(BSTNode node) {
 
        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
    }
 
    private Integer maxValue(BSTNode node) {
 
        if(node.getRight() != null) {
            return maxValue(node.getRight());
        }
        return node.getData();
    }
	public static void main(String[] args) {
		BSTMinAndMaxNode bst = new BSTMinAndMaxNode();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        bst.insert(2);
        System.out.println("-------------------");
        System.out.println("Min value: "+bst.findMaxValue());
        System.out.println("Max value: "+bst.findMaxValue());
	}

}
