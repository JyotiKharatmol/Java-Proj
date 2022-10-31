
public class CoreJavaSession3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//string is an object, string is a combination of characters
		
		//declare string in two ways -
		
		//1. literal one
		//2. with new keyword opertion - which creates a memory location for the array.
		//literal one
		String[] s = {"Jyoti Maruti Kharatmol"};
		String[] s1 = {"Jyoti Maruti Kharatmol"};
		String[] s2 ={"hello"};
		
		
		
		
		//here s1 variable is not storing any data and it uses s variable memory only.
		
		//using new operator - which will mandatorily create a memory location of a variable which is storing the same variable
		
		String s3 = new String("Jyoti Maruti Kharatmol");
		String splittedString[] = s3.split("Maruti");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim());

		//System.out.println(splittedString[2]);

		for(int i=s3.length()-1; i>=0; i--)
		{
			
			System.out.println((s3.charAt(i)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
