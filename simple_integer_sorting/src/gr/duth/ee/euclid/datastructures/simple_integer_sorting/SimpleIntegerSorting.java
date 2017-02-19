package gr.duth.ee.euclid.datastructures.simple_integer_sorting;

public class SimpleIntegerSorting {


	public static int[] simpleIntegerSorting(int[] values) {
		int j,s,temp;
		
		for(s=0; s<values.length-1; s++){
			for(j=0; j<values.length-1; j++){
				if(values[j]<values[j+1]){
					temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
				}
			}
		} return values;
	}
}