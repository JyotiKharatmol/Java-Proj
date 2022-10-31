
public class CoreJavaSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//different types of data types
		
		int a=5;
		double b = 5.5;
		java.lang.String name = "Jyoti";
		char c = 'e';
		boolean t = true;
		float f = 5.4f;
		
		System.out.println(a + " is an integer value");
		System.out.println(b + " is a decimal value");
		System.out.println(name + " is my nanme");
		System.out.println(c + " stores a character value");
		System.out.println(t + " stores a boolean value");
		System.out.println(f + " is a float value");
		
		//Arrays declaration
		
	/*	int[] arr = new int[5];
		arr[0]= 2;
		arr[1]=7;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		*/
		int[] arr2= {1,4,3,6,8,2,9,15};
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
			{
			
			System.out.println(arr2[i]);
			break;
		}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
			
			
		/*String[] name1 = {"jyoti", "one", "two", "three"};
		
		for(int i=0; i<name1.length; i++)
		{
			System.out.println(name1[i]);
		}
		
		//advanced for loop
		
		for(String s:name1)
		{
			System.out.println(s);
		}
		for( int a1:arr2)
		{
			System.out.println(a1);
		}
		
		//multiple of 2 print in arr2
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}