import java.util.Scanner;
public class Demo {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] marksArray = new int[3];
		System.out.println("Demo Report");
		// to store the marks of student
		displayMarks(marksArray);
		// to display marks of the student
		storeStudentArray(marksArray);

	}

	public static void displayMarks(int[] marksArray) {
		System.out.println("Displaying Marks");
		for(int marks: marksArray) {
			System.out.println(marks);
		}
	}
	
	public static void storeStudentArray(int [] marksArray){
		for(int i=0;i<marksArray.length;i++) {
			System.out.println("Enter Marks "+(i+1)+":");
			marksArray[i]= sc.nextInt();
			
		}
	}

}






/*import  java.util.Scanner;
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		if(n<0)
		{
			n=-n;
		}else {
			
		}
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}*/

