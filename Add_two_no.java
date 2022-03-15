public class Calculate
{
 int num1, num2; // Member variable
 Calculate(int x, int y) //constructor initilize the value of class
    {
     num1 = x;
     num2 = y;
    }
    int sum()
{
    return(num1+num2);
}    

	public static void main(String[] args) 
	{   
	    int result;
	    Calculate obj1 = new Calculate(10,20);
	    result = obj1.sum();
		System.out.println("The result is::" + result);
	}
}