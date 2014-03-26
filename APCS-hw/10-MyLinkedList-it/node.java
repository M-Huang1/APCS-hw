import java.io.*;
import java.util.*;
public class node<E> {
    private E data;
    private node<E> next;
    public node (E d){
	data =d;
	next = null;
    }
    public void setData(E d){
	data =d;
    }
    public E getData(){
	return data;
    }
    public void setNext(node n){
	next= n;
    }
    public node<E> getNext(){
	return next;
    }
    
    
}