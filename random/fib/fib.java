class Fib
{
	public static void main(String[] args)
	{
		list(Integer.parseInt(args[0]));
	}
	public static void list(long amount)
	{
		long output = 0;
		long[] pastInts = new long[2];
		pastInts[0] = 0;
		pastInts[1] = 0;

		for(long i = 0; i < amount; i++)
		{
			if(i == 1)	pastInts[1]++;

			pastInts[0] = pastInts[1];
			pastInts[1] = output;
			output = pastInts[0] + pastInts[1];
			
			System.out.println(output);
		}
	}
}
//  0 1 1 2 3 5 8 13