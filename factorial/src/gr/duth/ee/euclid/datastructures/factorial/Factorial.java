package gr.duth.ee.euclid.datastructures.factorial;

public class Factorial {

	public static long compute(long x) {
		long result=1;
		long i;
		
		if(x!=0 || x!=1){
			for(i=2; i<=x; i++){
		
		result=result*i;
		
		}
		
	} return result;

}
}
