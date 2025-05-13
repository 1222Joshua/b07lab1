public class Polynomial
{
	double[] polynomial;
	public Polynomial()
	{
		polynomial=new double[0];
	}
	public Polynomial(double[] input_array)
	{
		int len=input_array.length;
		polynomial=new double[len];
		for (int i=0; i<len; i++)
		{
			polynomial[i]=input_array[i];
		}
	}
	public Polynomial add(Polynomial p)
	{
		Polynomial result;
		if (p.polynomial.length>polynomial.length)
		{
			result=new Polynomial(p.polynomial);
			for (int i=0; i<polynomial.length; i++)
			{
				result.polynomial[i]+=polynomial[i];
			}
		}
		else
		{
			result=new Polynomial(polynomial);
			for (int i=0; i<p.polynomial.length; i++)
			{
				result.polynomial[i]+=p.polynomial[i];
			}
		}
		return result;
	}
	public double evaluate(double x)
	{
		double result=0;
		for(double i=0; i<polynomial.length; i++)
		{
			result=result+polynomial[(int)i]*(Math.pow(x, i));
		}
		return result;
	}
	public boolean hasRoot(double x)
	{
		if(this.evaluate(x)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}