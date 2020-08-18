//Fibonacci Series for n = 10 -- 0,1,1,2,3,5,8,13,21,34...
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fNum = 10; 
		FibonacciSeries(fNum);
	}

	public static void FibonacciSeries(int fibNum)
	{
		int prev = 0;
		int next = 1;
		int curr = 0;
		
		if(fibNum > 0)
		{
			if(fibNum == 1)
				System.out.print(prev);
			else
			{
				System.out.print(prev+", "+next);
				for (int i = 3; i<=fibNum; i++)
				{
					curr = prev+next;
					System.out.print(", "+curr);
					prev = next;
					next = curr;
				}
			}
		}
	}
}
