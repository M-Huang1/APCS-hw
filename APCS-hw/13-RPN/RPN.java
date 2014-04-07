public class RPN {
    MyStack stack = new MyStack();
    public boolean isNumeric(String str)  
    {  
	try  
	    {  
		Double d = Double.parseDouble(str);  
	    }  
	catch(NumberFormatException x)  
	    {  
		return false;  
	    }  
	return true;  
    }
    public int postFix(String s){
	if (isNumeric(s)){
	    stack.push(s);
	    return Integer.parseInt(s);
	}
	else if (stack.getSize() >= 2){
	    if(s == "+"){
		int first = Integer.parseInt(stack.pop());
		int second = Integer.parseInt(stack.pop());
		int added = first + second;
		String addedS= String.valueOf(added);
		stack.push(addedS);
		System.out.println(addedS);
		return added;
	    }
	
	    else if(s == "-"){
		int first = Integer.parseInt(stack.pop());
		int second = Integer.parseInt(stack.pop());
		int added = first - second;
		String addedS= String.valueOf(added);
		stack.push(addedS);
		System.out.println(addedS);
		return added;
	    }
	    else if(s == "*"){
		int first = Integer.parseInt(stack.pop());
		int second = Integer.parseInt(stack.pop());
		int added = first * second;
		String addedS= String.valueOf(added);
		stack.push(addedS);
		System.out.println(addedS);
		return added;
	    }
	    else if(s == "/"){
		int first = Integer.parseInt(stack.pop());
		int second = Integer.parseInt(stack.pop());
		int added = first/second;
		String addedS= String.valueOf(added);
		stack.push(addedS);
		System.out.println(addedS);
		return added;
	    }
	}
	else {
	    System.out.println("Please enter a number or operator (given that you have two or more numbers in the stack");
	    return 0;
	}
	return 0;
    }
    public void clear(){
	MyStack stack1 = new MyStack();
	stack = stack1;
    }
    public static void main(String[]args){
	RPN calc = new RPN();
	calc.postFix("5");
	calc.postFix("5");
	calc.postFix("5");
	calc.postFix("+");
	calc.postFix("*");
	calc.postFix("*");
	
    }
	
}

	        