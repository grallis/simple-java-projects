package gr.duth.ee.euclid.datastructures.contiguous_integer_search;

public class ContiguousIntegerSearch {

        public static int contiguousIntegerSearch(int[] values, int valueLengthToFind) {
                int i,k=valueLengthToFind;
                int count=1;

                for(i=0; i<values.length-1; i++){
                        if(values[i]-values[i+1]==1){
                                count++;
                                if(count==k){
                                        return i;
                                } else count=1;

                        } 
                } return -1;
        }
}