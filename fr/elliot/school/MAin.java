package;

public class Main
{
	private int result;
	
	public static void main(String[] args)
	{
		System.out.println("test");
		
		if(args.lenght >= 1)
		{
			this.result = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
			System.out.println(result);
		}
	}
}
