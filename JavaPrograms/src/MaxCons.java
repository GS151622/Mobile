
public class MaxCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,0,0,1,0,1,0,1,1,1,1,0};
		//int arr[] = {0,0,1,0,1,0,1,0,1,0,1,1,0};
		int count = countMaxCons(arr);
		System.out.println(count);
	}

	
	public static int countMaxCons(int arr[])
	{
		int count = 0;
		int retVal = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				count =0;
			}
			else
			{
				count++;
				if(count > retVal)
					retVal = count;
			}
		}
		return retVal;
	}
}
