//it is also Called Binary Exponential
//find the a^b in O(log n) Complexity
import java.util.*;
public class ModularExponential{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long a=sc.nextInt();
			long b=sc.nextInt();
			System.out.println("Iterative Funtion  :-  "+pow(a,b));
			System.out.println("Reecursive Function  :-  "+binPow(a,b));
		}
	}
	//using Iterative Function
	public static long pow(long a,long b){
		long res=1;
		while(b>0){
			//if the b is odd
			if ((b&1)==1)
				res=(res*a);
			//b/=2
			b=b>>1;
			a=(a*a);
		}
		return res;
	}
	//Using Recursion
	public static long binPow(long a,long b){
		if (b==0)
			return 1;
		long res=binPow(a,b>>1);
		if (b%2!=0)
			return res*res*a;
		else
			return res*res;
	}
}
