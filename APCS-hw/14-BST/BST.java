public class BST {
    private Node root;
    public BST(){
	root = null;
    }
    public void insert(int x){
	if(root == null){
	    root = new Node(x);
	}
	else {
	    Node c = root;
	    Node e = search(x);
	    if(e.getData()>x){
		e.setLeft(new Node(x));
	    }
	    else if(e.getData()<x){
		e.setRight(new Node(x));
	    }
	    else if(e == null){
		e = new Node(x);
	    }
	}
    }
    public Node search2(Node c,int x){
	if (c == null){
	    return c;
	}
	else if(c.getData()== x){
	    return c;
	}
	else if (c.getData()> x){
	    search2(c.getLeft(),x);
	}
	else {
	    search2(c.getRight(),x);
	}
	return c;
    }
    public Node search(int x){
	Node c= root;
	while (c.getRight().getData() != x && c.getLeft().getData() != x ){
	    if(c == null){
		return c;
	    }
	    else if (c.getData() >x){
		c = c.getLeft();
	    }
	    else {
		c = c.getRight();
	    }
	}
	return c;
    }
    
}