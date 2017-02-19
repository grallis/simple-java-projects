package gr.duth.ee.euclid.datastructures.prime;

public class Prime {

    public static Boolean isPrime(int x) {
    	
    	for(int i=2;i<x;i++) {
            if(x%i==0)
                return false;
        }
        return true;
}
}
