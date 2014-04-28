public class Node{
    private int data;
    private Node left, right;
    public Node(int x){
	data =x;
	left = null;
	right = null;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public void setLeft(Node x){
	left = x;
    }
    public void setRight(Node x){
	right = x;
    }
    public int getData(){
	return data;
    }
}



