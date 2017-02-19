package gr.duth.ee.euclid.datastructures.simple_integer_stack;

public class SimpleIntegerStack {
	int stack[];
	int first=-1;
	
	public SimpleIntegerStack(int maxSize) {
		stack= new int [maxSize];
	}

	public void push(int element) {
		if(first<stack.length-1){
			first++;
			stack[first]=element;
		}
	}

	public void pop() {
		if(first>=0){
			first--;
		}
	}

	public int top() {
		if(first>=0)
			return stack[first];
		else
			return -1;
	}
}
