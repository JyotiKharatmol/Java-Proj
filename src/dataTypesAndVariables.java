
public class dataTypesAndVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				//types of data -> 5,a,abcd,5.654,true
				
				int num =5;
				float dec = 5.5f;
				float deci = 5.554344f;
				double decimal=5.6;
				char letter ='a';
				String words="Jyoti Maruti Kharatmol";
				boolean value =true;
				System.out.println(num+" is storing the integer value of myNum");
				System.out.println(words+" is my name");
				System.out.println(value+" condition");
				System.out.println(letter+" is stored");
				System.out.println("value of the decimal is "+decimal);

				//Arrays - are used to store multiple values in one variable
				
				int[] arr = new int[5];
				arr[0]=6;
				arr[1]=3;
				arr[2]=1;
				arr[3]=5;
				arr[4]=2;
				
			int[] arr2 = {1,3,4,35,5,2,1,5,6,8,776,644,4};
				
			//System.out.println(arr2[1]);
			//System.out.println(arr[4]);
			
				
		/*	for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
				*/
			
			for(int i=0;i<arr2.length;i++)
			{
				System.out.println(arr2[i]);
			}
			
			String[] name = {"jyoti", "selenium", "java", "concepts"};
			
			for(int i=0; i<name.length; i++)
			{
				System.out.println(name[i]);
			}
			
			//enhanced for loops 
			
			
			for(String s:name)
			{
				System.out.println(s);
			}
			
			
			for(int a :arr2)
			{
				System.out.println(a);
			}
			
			
				
				
				
				
				
				
				
				
				
				
			}

		

	}


