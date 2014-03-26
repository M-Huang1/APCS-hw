import java.util.*;
public class MyLinkedListI<E> implements Iterable<E>{
    private node<E> head;
    private int length = 0;
    public MyLinkedListI(){
	head = null;
    }
    public myLLIterator<E> iterator(){
	myLLIterator<E> iterate = new myLLIterator<E>(head);
	return iterate;
    }
    public void add(E d){

	node<E> tmp = new node<E>(d);
	//head = tmp;
	tmp.setNext(head);
	head =tmp;
	length ++;
	

    }
    public void add(int i,E s){
	
	if(i>length+1){
	    return;
	}
	
	length ++;
	node<E> add = new node<E>(s);
	node<E>[] nodes = (node<E>[])new  Object[length];
	for (int x =0;x <length;x++){
	    if (x == i){
		nodes[x]= add;
		
	    }
	    else {
		nodes[x]= head;
		head = head.getNext();
	    }
	}

	head = new node<E>(nodes[length-1].getData());
	for (int xx=length-2;xx>=0;xx--){
	    add(nodes[xx].getData());}
	
    }
    
	
	
	    
    public E get(int i){
	node<E> temp = head;
	for (int x =0;x <= i;x ++){
	    if (x == i)
		return temp.getData();
	    else {
		temp = temp.getNext();
	    }
	}
	return null ;
    }
    public E set(int i,E s){
	
	if(i>length+1){
	    return null;
	}
	E ret;
	E[] datas = (E[])new Object[length];
	for (int x =0;x <length;x++){
	    if (x == i){
		ret = head.getData();
		datas[x]= s;
		head = head.getNext();
	    }
	    else{
	    datas[x]= head.getData();
	    head = head.getNext();
	    }
	}
	
	head = new node<E>(datas[length-1]);
	for (int xx=length-2;xx>=0;xx--){
	    add(datas[xx]);
	}
	ret = null;
	return ret;
	
	
	
    }
    public E remove(int i){
	
	if(i>length+1){
	    return null;
	}
	length --;
	E ret;
	
	node<E>[] nodes = (node<E>[])new Object[length];
	int dex =0;
	for (int x =0;x <length+1;x++){
	    if (x == i){
		ret = head.getData();
		head = head.getNext();
		
	    }
		
	    
	    else {
		nodes[dex]= head;
		head = head.getNext();
		dex++;
	    }
	}
	head = new node<E>(nodes[length-1].getData());
	for (int xx=length-2;xx>=0;xx--){
	    add(nodes[xx].getData());
	}
	ret = null;
	return ret;
    }
    public int find(E s){
	node<E> temp = head;
	for (int xx =0;xx<length;xx++){
	    if (temp.getData().equals(s)){
		return xx;
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	System.out.println("Cannot be found");
	return -1;
    }
    public int length(){
	return length;
    }
	
	
	
    public String toString(){
	String s = "";
	node temp = head;
	while(temp != null){

	    s += temp.toString()+" ";
	    temp = temp.getNext();
	}
	return s;
	
    }
}
    
	
