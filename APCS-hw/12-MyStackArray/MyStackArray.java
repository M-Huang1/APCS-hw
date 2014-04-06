public class MyStackArray{
    private String[] stack = new String[10];
    private String top;
    private int numElts;
    public MyStackArray(){
	top = "";
	numElts=0;
    }
    public void push(String s){
	stack[numElts]= s;
	top = s;
	numElts++;
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
	return stack[numElts];
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