
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Kumkum is This";
		String word = "malayalam";
		Palindrome p = new Palindrome();
		//p.StringPalindrome1(str);
		//p.StringPalindrome2(str);
		//p.WordPalindrom(word);
	}
	
	public void StringPalindrome1(String inputString)
	{
		String reverseString = "";
		String arr[] = inputString.split(" ");
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			reverseString = reverseString + arr[i];
			
			if( i != 0 )
			{
				reverseString = reverseString + " ";//added additional space
			}
		}	
		
		if(inputString.equals(reverseString))
		{
			System.out.println("String '" + inputString+"' is a Palindrome!");
		}
		else
		{
			System.out.println("String '" + inputString+"' is not a Palindrome!");
		}
	}
	
	
	public void StringPalindrome2(String inputString)
	{
		String arr[] = inputString.split(" ");
		boolean bFlag = true;
		
		//int j = 0;
		
		for(int i = arr.length-1, j = 0; i >= (arr.length)/2; i--, j++)
		{
			if(!arr[i].toString().equals(arr[j]))
			{
				bFlag = false;
				break;
			}
		}
		
		if(bFlag)
			System.out.println("String '" + inputString+"' is a Palindrome!");
		else
			System.out.println("String '" + inputString+"' is not a Palindrome!");
	}
	
	
	public void WordPalindrom(String word)
	{
		String reverseWord = "";
				
		for(int i = word.length()-1; i >= 0; i--)
		{
			reverseWord = reverseWord + word.charAt(i);
		}
	
	if(word.equals(reverseWord))
		System.out.println("Word '" +word+"' is a Palindrome!");
	else
		System.out.println("Word '" +word+"' is not a Palindrome!");
	}
}
