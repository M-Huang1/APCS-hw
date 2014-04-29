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
	    Node p = root;
	    Node p1 = root;
	    while(p != null&& p.getData()!= x){
		if(p.getData() > x){
		    p1 = p;
		    p = p.getLeft();
		}
		else {
		    p1 = p;
		    p= p.getRight();
		}
	    }
	    if(p1.getData() <= x){
		p1.setRight(new Node(x));
	    }
	    else {
		p1.setLeft(new Node(x));
	    }
	}
		    
	 
	
    }
    public void delete(int x){
	Node p = root;
	Node p1 = root;
	while(p != null&& p.getData()!= x){
	    if(p.getData() > x){
		p1 = p;
		p = p.getLeft();
	    }
	    else {
		p1 = p;
		p= p.getRight();
	    }
	}
	if(p.getData()>x){
	    if(p1.getLeft().getRight() == null && p1.getLeft().getLeft()== null){
		p1.setLeft(p1.getLeft().getRight());
	    }
	    else if(p1.getLeft().getRight() != null && p1.getLeft().getLeft() == null){
		p1.setLeft(p.getLeft().getRight());
	    }
	    else if (p1.getLeft().getLeft() != null && p1.getLeft().getRight() == null){
		p1.setLeft(p.getLeft().getLeft());
	    }
	    else{
		Node p2 = p.getLeft();
		Node p3 = p.getLeft();
		while (p3 != null){
		    p2 = p3;
		    p3 = p3.getRight();
		}
		p1.getLeft().setData(p2.getData());
		p2.setRight(p3.getRight());
	    }
	}
	else if(p.getData()<x){
	    if(p1.getRight().getRight() == null && p.getRight().getLeft()== null){
		p1.setRight(p.getLeft().getRight());
	    }
	    else if(p1.getRight().getRight() != null && p1.getRight().getLeft() == null){
		p1.setRight(p1.getRight().getRight());
	    }
	    else if (p.getLeft().getLeft() != null && p.getLeft().getRight() == null){
		p1.setLeft(p1.getRight().getLeft());
	    }
	    else{
		Node p2 = p.getRight();
		Node p3 = p.getRight();
		while (p3 != null){
		    p2 = p3;
		    p3 = p3.getLeft();
		}
		p1.getLeft().setData(p2.getData());
		p2.setLeft(p3.getLeft());
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
   
    public Node search (int x){
	Node p = root;
	Node p1 = root;
	while(p != null&& p.getData()!= x){
		if(p.getData() > x){
		    p1 = p;
		    p = p.getLeft();
		}
		else {
		    p1 = p;
		    p= p.getRight();
		}
	    }
	return p1;
    }
    
}