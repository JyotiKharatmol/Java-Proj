import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arrayList is used to in order to store dynamic values
		
		//arrayList is class of import.java.util package and need to create object in order to access the methods present in it
		
		//array have fixed/static value of the length, to make it dynamic we use arraylist
		
		ArrayList a = new ArrayList();
		
		a.add("jyoti");
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		a.remove(1);
		System.out.println(a.get(3));
		
		
		
	}

}
