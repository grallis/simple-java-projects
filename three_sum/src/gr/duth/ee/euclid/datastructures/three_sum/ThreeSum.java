package gr.duth.ee.euclid.datastructures.three_sum;

public class ThreeSum {

	public static int compute(int[] x) {
		
		int pair=0;
		int s;
		int a,b;
		int temp;
		
		for(a=0; a<x.length-1; a++){
			for(b=0; b<x.length-1; b++){
				if(x[b]>x[b+1]){
					temp=x[b];
					x[b]=x[b+1];
					x[b+1]=temp;
				}
			}
		}
		
		for(int i=0; i<x.length-1; i++){ 
			if(i==0 || x[i]>x[i-1]){
				
				int left=i+1;
				int right=x.length-1;
				
				while(left<right){
					s=x[left]+x[right];
					if(s== -x[i]){
							pair=pair+1;
					
							do{
								right=right-1;
							}while(x[right]==x[right+1]);
							
							do{
								left=left+1;
							}while(x[left]==x[left-1]);
					}		
					else if(s>-x[i]){
						right=right-1;
					}
					
					else left=left+1;
				}
			}
		}return pair;
	}

}