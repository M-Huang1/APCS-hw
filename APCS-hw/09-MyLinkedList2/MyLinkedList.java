public class MyLinkedList{
    private node head;
    private int length = 0;
    public MyLinkedList(){
	head = new node("0");
    }
     public void addDummy(){
	node d = new node("0");
	d.setNext(head);
	head = d;
     }
    public void removeDummy(){
	head = head.getNext();
    }
    public void add(String d){
	removeDummy();
	node tmp = new node(d);
	//head = tmp;
	tmp.setNext(head);
	head =tmp;
	length ++;
	addDummy();

    }
    public void add(int i,String s){
	
	if(i>length+1){
	    return;
	}
	removeDummy();
	length ++;
	node add = new node(s);
	node[] nodes = new node[length];
	for (int x =0;x <length;x++){
	    if (x == i){
		nodes[x]= add;
		
	    }
	    else {
		nodes[x]= head;
		head = head.getNext();
	    }
	}

	head = new node(nodes[length-1].getData());
	for (int xx=length-2;xx>=0;xx--){
	    add(nodes[xx].getData());}
	addDummy();
    }
    
	
	
	    
    public String get(int i){
	removeDummy();
	node temp = head;
	for (int x =0;x <= i;x ++){
	    if (x == i)
		return temp.getData();
	    else {
		temp = temp.getNext();
	    }
	}
	addDummy();
	return "Out of Bounds";
    }
    public String set(int i,String s){
	removeDummy();
	if(i>length+1){
	    return "Out of Bounds";
	}
	String ret= "";
	String[] datas = new String[length];
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
	
	head = new node(datas[length-1]);
	for (int xx=length-2;xx>=0;xx--){
	    add(datas[xx]);
	}
	addDummy();
	return ret;
	
	
	
    }
    public String remove(int i){
	removeDummy();
	if(i>length+1){
	    return "Out of Bounds";
	}
	length --;
	String ret = "";
	
	node[] nodes = new node[length];
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
	head = new node(nodes[length-1].getData());
	for (int xx=length-2;xx>=0;xx--){
	    add(nodes[xx].getData());
	}
	addDummy();
	return ret;
    }
    public int find(String s){
	removeDummy();
	node temp = head;
	for (int xx =0;xx<length;xx++){
	    if (temp.getData().equals(s)){
		addDummy();
		return xx;
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	System.out.println("Cannot be found");
	addDummy();
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
    
	
