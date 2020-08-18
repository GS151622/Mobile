
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,12,101,9,44,77,2,99,1};
		MinMax obj = new MinMax();
		obj.MinMaxFunction1(arr);
	}
	
	public void MinMaxFunction1 (int arr[])
	{
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i<arr.length; i++)
		{
			if(max < arr[i]) //or arr[i] > max
				max = arr[i];
			if(min > arr[i]) //or arr[i] < min
				min = arr[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}	
}
