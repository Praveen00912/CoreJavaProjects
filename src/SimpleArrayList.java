import java.util.ArrayList;

public class SimpleArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println("Before adding C"+arrayList);
		arrayList.add(2,"C");
		System.out.println("After adding C"+arrayList);
		arrayList.remove(2);
		System.out.println("After removing element at index 2 "+arrayList);
	}

}
