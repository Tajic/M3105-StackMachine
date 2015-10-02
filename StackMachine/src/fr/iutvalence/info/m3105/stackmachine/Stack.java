package fr.iutvalence.info.m3105.stackmachine;

public class Stack{
	
	private final int values[];
	private int pos;
	private final int size;
		
	public Stack(int size) throws InvalidParametersException{
		super();
		this.size = size;
		values = new int[size];
		pos = -1;
	}

	public void push(int value) throws StackOverflowException{
		pos++;
		values[pos] = value;		
	}
	
	public int pop() throws StackUnderflowException{
		int ret = values[pos];
		values[pos] = 0;
		pos--;		
		return ret;
	}
	
	public boolean isEmpty(){
		return pos != -1 ? false : true;
	}
		
	public int getNbValues(){
		return pos;
	}
	
	public int peek(){
		return values[pos];
	}
	
	public void clear() {
		for(int i=0;i<size;i++){
			values[i] = 0;
		}
		pos = -1;
	}
	
	public void dup() throws StackOverflowException{
		values[pos+1] = values[pos];
		pos++;
	}
	
}
