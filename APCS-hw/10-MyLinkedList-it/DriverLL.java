import java.io.*;
import java.util.*;

public class DriverLL{

    public static void main(String[] args){

MyLinkedListI hai = new MyLinkedListI();
hai.add(1);
hai.add(2);
hai.add(4);
hai.add(6);
hai.add(100);
System.out.println(hai);

myLLIterator it = hai.iterator();

while(it.hasNext()){
System.out.println(it.next());
}
System.out.println();

for(Object s : hai){
System.out.println(s);
}


    }

}