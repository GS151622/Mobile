
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 109;
		
		PrimeNumber p = new PrimeNumber();
		boolean b = p.IsPrime(iNum);
		if(b) //or you can write like if(b==true)
			System.out.println("The number "+iNum+" is Prime");
		else
			System.out.println("The number "+iNum+" is not a Prime");
		
	}
	
	public boolean IsPrime(int num) //Assuming input is not 1, 0 or -ve number
	{
		boolean bool = true; //Assuming the number is prime
		
		for (int i = 2; i <= num/2; i++)
		{
			if(num%i == 0)
			{
				bool = false;// The number is not prime
				break;
			}
		}
		return bool;
	}
}
