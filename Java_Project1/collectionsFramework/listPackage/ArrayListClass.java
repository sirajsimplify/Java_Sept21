package listPackage;

import java.util.*;


public class ArrayListClass {
	
	public static void main(String[] args) {
		ArrayListClass a = new ArrayListClass();
		a.arraylistConcepts();
		a.linkedListConcepts();
		a.vectorConcepts();
		a.stackConcepts();
	}
	
	public void arraylistConcepts() {
		System.out.println("***arraylistConcepts***");
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Akshay");//Adding object in arraylist  
		list.add("Khanna");  
		list.add("Akshay");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}
	
	public void linkedListConcepts() {
		System.out.println("***linkedListConcepts***");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Akshay");  
		al.add("Khanna");  
		al.add("Akshay");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
	public void vectorConcepts() {
		System.out.println("***vectorConcepts***");
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Zandu Balm");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
	public void stackConcepts() {
		System.out.println("***stackConcepts***");
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}

}
