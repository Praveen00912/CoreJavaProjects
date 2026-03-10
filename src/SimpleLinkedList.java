import java.util.LinkedList;

public class SimpleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("D");
		linkedList.add("E");
		
		System.out.println("Before adding C"+linkedList);
		linkedList.add(2,"C");
		System.out.println("After adding C"+linkedList);
		linkedList.remove(2);
		System.out.println("After removing element at index 2 "+linkedList);
		linkedList.addFirst("Start");
		System.out.println(linkedList);
		linkedList.addLast("End");
		System.out.println(linkedList);
		
		//remove the first element from LinkedList
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		//remove the last element from LinkedList
		linkedList.removeLast();
		System.out.println(linkedList);
		}

}
