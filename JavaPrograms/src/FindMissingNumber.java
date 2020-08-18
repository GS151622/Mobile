//Find a missing number in an number series

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20};
		int iMissingNum = 0;
		FindMissingNumber obj = new FindMissingNumber();
		//iMissingNum = obj.FindMissingNum1(arr);
		iMissingNum = obj.FindMissingNum2(arr);
		System.out.println("Missing number: "+iMissingNum);
	}
	
	//First way
	public int FindMissingNum1(int arr[])
	{
		int n = arr.length+1; //Added 1 for missing number
		int expectedTotal = n*(n+1)/2;
		int actualTotal = 0;
		
		for (int i = 0; i <= arr.length-1; i++)
		{
			actualTotal = actualTotal + arr[i];
		}
		
		return (expectedTotal - actualTotal);		
	}
	
	//Seond way
	public int FindMissingNum2(int arr[])
	{
		int iMissingNum = 0;
		
		for (int i = 0; i <= arr.length-1; i++)
		{
			if(arr[i] != i+1)
			{
				iMissingNum = i+1;
				break;
			}
		}
		
		return iMissingNum;		
	}
}
