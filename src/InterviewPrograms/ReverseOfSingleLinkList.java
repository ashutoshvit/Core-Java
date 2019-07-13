package InterviewPrograms;

public class ReverseOfSingleLinkList<T> {
	private Node<T> head;
	public void add(T element) {
		Node<T> nd=new Node<T>();
		nd.setValue(element);
		System.out.println("Adding element :"+element);
		Node<T> temp=head;
		while(true) {
			if(temp==null) {
				//ie temp is pointing to start point ie head and end are same;
				head=nd;
				break;
			}
			else if(temp.getNextRef()==null) {
				temp.setNextRef(nd);
				break;
			}
			else {
				temp=temp.getNextRef();
			}
		}
	}
	public void traverse() {
		Node<T> temp=head;
		while(true) {
			if(temp==null) {
				break;
			}
			System.out.println(temp.getValue());
			temp=temp.getNextRef();
		}
	}
	
	public void reverse() {
		System.out.println("\n Traversing the linked list \n");
		Node<T> prev=null;
		Node<T> current=head;
		Node<T> next=null;
		while(current!=null) {
			next=current.getNextRef();
			current.setNextRef(prev);
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public static void main(String[] args) {
		ReverseOfSingleLinkList<Integer> sl=new ReverseOfSingleLinkList<>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(39);
		sl.add(null);
		System.out.println();
		sl.traverse();
		System.out.println();
		sl.reverse();
		sl.traverse();
	}

}

class Node<T> implements Comparable<T>{

	private T value;
	private Node<T> nextRef;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	@Override
	public int compareTo(T arg) {
		if(arg==this.value)
			return 0;
		else
			return 1;
	}
	
}
