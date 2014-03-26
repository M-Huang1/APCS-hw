import java.util.*;
public class myLLIterator<E> implements Iterator<E>{
    private node<E> currentNode;
    public myLLIterator (node<E> n){
	currentNode = n;
    }
    public boolean hasNext(){
	return currentNode.getNext() != null;
    }
    public E next(){
	if(hasNext()){
	    E now = currentNode.getData();
	    currentNode = currentNode.getNext();
	    return now;
	}
	else{
	
	return null;
    }
    }
    public void remove(){
	
    }
    
}