import java.util.*;
import java.lang.Object;
public class QuickSort3{
    public void swap(int[]a,int F,int S){
	int d = a[F];
	a[F]= a[S];
	a[S]= d;
    }
    public void toString (int[]a){
	String an = "";
	for (int d=0;d<a.length;d++){
	    an= an+a[d]+",";
	}
	System.out.println(an);
    }
     public int partition(int []a,int L,int R){

	 
	if(a.length<=1){
	    return 0 ;
	}
	Random r = new Random();
	int d= L + r.nextInt(R-L);
	int temp = a[d];

       	a[d]= a[R];
	a[R]= temp;
	
	int wall =L;
	for(int xx =L;xx<R;xx++){
	    if (a[xx]<= temp){
	       	swap(a,xx,wall);
		wall++;
		
		
	    }
	    else if (a[wall]<= temp){
		swap(a,xx,wall);
		xx--;
	    }
	}
	
	swap(a,wall,R);
	
	/*int RWall = wall-1;
	for (int xx =L;xx<wall;xx++){
	    if(a[xx]== a[wall]){
		swap(a,RWall,xx);
		RWall--;
	    }
	    }*/

	return wall;
	
     }
    public void quickSort3(int[]a,int l,int h){
	if (h - l < 1){
	    return;
	}
	else {
	    
	    int wall =partition(a,l,h);
	    
	    
	    quickSort3(a,l,wall-1);
	    
	    quickSort3(a,wall+1,h);
	  
	}
    }
   
    
		
    
    public static void main(String[] args){
	int[] dd = new int[6];
	QuickSort3 hai = new QuickSort3();
	dd[0]= 22;
	dd[1]= 5;
	dd[2]= 81 ;
	dd[3]= 100;
	dd[4]= 6;
	dd[5]= 21;
        hai.quickSort3(dd,0,dd.length-1);
	hai.toString(dd);
	 
    }   
}