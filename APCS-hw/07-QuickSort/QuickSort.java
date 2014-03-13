import java.util.*;
import java.lang.Object;
public class QuickSort{
    /*public int partition(int[]a,int k,int low,int high){
	int d = a[k];
	while (low < high){
	    while (a[low] < d){
		low ++;
	    }
	    while (a[high]>d){
		high --;
	    }
	    int temp = a[low];
	    a[low]= a[high];
	    a[high]= temp;
	}
	return low;
	}*/
    public void toString (int[]a){
	String an = "";
	for (int d=0;d<a.length;d++){
	    an= an+a[d]+",";
	}
	System.out.println(an);
    }
    public int partition(int[]a,int k){
	if(a.length<=1){
	    return 0;
	}
	
	int d = a[k];
	int low = 0;
	int high = a.length-1;
	while (low < high){
	    while (a[low] < d){
		low ++;
	    }
	    while (a[high]>d){
		high --;
	    }
	    if(low<= high){
	    int temp = a[low];
	    a[low]= a[high];
	    a[high]= temp;
	 
	    }
	}

	return low;
    }
     public int[] quickSort(int[]a){
	

	if (a.length <= 1){
	    return a;
	}
	else{
	    Random rand = new Random();
	    int r = rand.nextInt(a.length);
	    int dex = partition(a,0);
	    int[] lower = new int[dex];
	    int[] higher = new int[a.length-dex-1];
	    for (int xx =0;xx<dex;xx++){
		lower[xx]= a[xx];
	    }
	   
	    for(int xx = dex+1;xx<a.length;xx++){
		higher[xx-(dex+1)]= a[xx];
	    }
	   ;
	    quickSort(lower);
	    quickSort(higher);
	    int[]ans = new int[a.length];
	    for (int xx= 0;xx<dex+1;xx++){
		if(xx== dex){
		    ans[xx]= a[dex];}
		else{
		    ans[xx]=lower[xx];
		}
	    }
	  
	    for(int xx= dex+1;xx <a.length;xx++){
		ans[xx]= higher[xx-(dex+1)];
	    }
	   

	    return ans;
	    
	}
     }
		
    
    public static void main(String[] args){
	int[] dd = new int[6];
	QuickSort hai = new QuickSort();
	dd[0]= 5;
	dd[1]= 7 ;
	dd[2]= 17;
	dd[3]= 4;
	dd[4]= 1;
	dd[5]= 3;
	dd = hai.quickSort(dd);
	hai.toString(dd);
	 
    }   
}