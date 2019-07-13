package Thread_java8;

import java.util.Arrays;

public class MyArrayList {

	public Object[] myStore;
	private int actSize=0;
	
	public MyArrayList() {
		myStore = new Object[10];
		
	}
	
	public Object get(int index) {
		if(index<actSize) {
			return myStore[index];
		}else {
			throw new ArrayIndexOutOfBoundsException();
			
		}
	}
	
	public void add(Object obj) {
		if(myStore.length-actSize<=5) {
			increaseListSize();
		}
		myStore[actSize++]=obj;
	}
	
	private void increaseListSize() {
	
		myStore=Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("\nNew Length: "+myStore.length);
		
	}
	public int size() {
		return actSize;
		
	}
	
	public Object remove(int index) {
		if(index<actSize) {
			Object obj=myStore[index];
			myStore[index]=null;
			int temp= index;
			while(temp<actSize) {
				myStore[temp]=myStore[temp+1];
				myStore[temp+1]=null;
				temp++;
				
			}
			actSize--;
			return obj;
			
		}
		else {throw new ArrayIndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");

	}
}
}