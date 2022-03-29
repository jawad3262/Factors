package Factorials;

public class Factorials {
	
	public int factorials(int n)
	{	int Results = 1;
		for(int i = 2; i <= n; i++)
			Results *= i;
		return Results;
	}

}