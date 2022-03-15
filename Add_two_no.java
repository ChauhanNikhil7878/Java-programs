public class Main
{
 int sum(int x, int y)
    {
        return (x+y);
        
    }
      public static void main(String[] args) 
	{   
	    int result;
	    Main obj1 = new Main();
	    result = obj1.sum(10,20);
	    System.out.println("The result is::" + result);
	}
}
