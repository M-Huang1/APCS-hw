public class MyStackArray{
    private String[] stack = new String[10];
    private String top;
    private int numElts;
    public void grow(){
	if(numElts >= stack.length){
	    String[] stack1 = new String[numElts+10];
	    for(int x =0;x<numElts;x++){
		stack1[x]= stack[x];
	    }
	    stack = stack1;
	}
    public MyStackArray(){
	top = "";
	numElts=0;
    }
    public void push(String s){
	stack[numElts]= s;
	top = s;
	numElts++;
	grow();
    }
    public String pop(){
	String ss;
	if(numElts<=1){
	    return "The Stack is empty";
	}
	else{
	    ss = stack[numElts];
	    stack[numElts-1]= "";
	    numElts--;
	    return ss;
	}
    }
    public String peek(){
	return stack[numElts-1];
    }
    public boolean isEmpty(){
	if (numElts <=0){
	    return true;
	}
	else{
	    return false;
	}
    }
    public int getSize(){
	return numElts;
    }
    public String toString(){
	String tmp ="";
	int size1 = numElts;
	for(;size1 >0;size1--){
	    tmp += stack[size1-1] + ", ";
	}
	return tmp;
    }
}