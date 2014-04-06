public class node {
    private String data;
    private node next;
    public node(String d){
	data =d;
	next = null;
    }
    public void setData(String d){
	data =d;
    }
    public String getData(){
	return data;
    }
    public void setNext(node n){
	next= n;
    }
    public node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
  