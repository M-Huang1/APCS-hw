public class DoubleLLcircular<E> {
    
    private class Node<E> {
E data;
Node<E> next, prev;
public Node (E d) {
this.data = d;
}
public String toString() {
return "" + data;
}
public void setData(E d) {
data = d;
}
public E getData() {
return data;
}
public void setNext(Node<E> n) {
next = n;
}
public Node<E> getNext() {
return next;
}
public void setPrev(Node<E> p) {
prev = p;
}
public Node<E> getPrev() {
return prev;
}
    }
    
    private Node<E> current;

    public void insert(E d) {
Node<E> n = new Node<E>(d);
if (current == null) {
current = n;
}
else {
n.prev = current.prev;
n.next = current;
current.prev = n;
current = n;
if (current.getPrev() != null) {
current.getPrev().setNext(current);
}
}
Node<E> tmp1 = current;
while(tmp1!=null) {
if (!tmp1.getData().equals(current.getData())){
break;
}
else {
tmp1 = tmp1.getNext()
}
}
if (tmp1 = null) {
loop();
}
    }

    public void loop() {
Node<E> tmp1 = current;
Node<E> tmp2 = current;
while(tmp1 != null) {
tmp1 = tmp1.getPrev();
}
while(tmp2 != null) {
tmp2 = tmp2.getNext();
}
tmp2.setNext(tmp1);
while(tmp1 != null) {
tmp1 = tmp1.getNext();
}
while(tmp2 != null) {
tmp2 = tmp2.getPrev();
}
    }

    public E getCurrent() {
return current.getData();
    }

    public void forward() {
if (current.getNext() != null) {
current = current.getNext();
}
    }

    public void back() {
if (current.getPrev() != null) {
current = current.getPrev();
}
    }

    public String toString() {
if (current == null) {
return "";
}
while (current.getPrev() != null) {
current = current.getPrev();
}

Node<E> tmp = current;
String s = "";
while (tmp != null) {
s = s + tmp.getData() + " ";
tmp = tmp.getNext();
}
return s;
    }

    public static void main(String[] args) {
DoubleLLcircular<String> L = new DoubleLLcircular<String>();
System.out.println(L);
L.insert("hello");
System.out.println(L);
L.insert("world");
System.out.println(L);
L.insert("three");
System.out.println(L);
//pt.2
System.out.println(L.getCurrent());
L.forward();
L.insert("inserted");
System.out.println(L);

    }
}