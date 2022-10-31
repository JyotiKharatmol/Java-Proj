
public class EnhancedforLoopsandConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = {2,1,3,4,6,4,5,7,9,10,13,122};
		
		//print only the multiples of 2
		
		//check if one number is a multiple of 2 and then break
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i]%2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i]+" is not a multiple of 2");
			}
		}
		
		
		
		
		
		
		
		
	}

}
