
import java.util.*;

public class Histogram {
    public static final int MAX = 101;  // max possible score

    public static void main(String[] args) {
    	
    	System.out.println("enter something between 0-100");
    	System.out.println("signal the end by puting a number out of range");
    	
    	int[] enter = new int[10];
    	int count=0;
    	
    	
    	Scanner in = new Scanner(System.in);
    	int inPut= in.nextInt();
    	while (inPut<MAX){
    		count = (inPut - 1)  / 10;
    		enter[count] +=1;
    		inPut= in.nextInt();
    	}
    	
    	
    	
    	for (int i = 0; i < enter.length; i++) {
    		if(enter[i]==0){
    			System.out.println(i + "1-"+(i+1)+"0"+": "+"|");
    		}
            if (enter[i] != 0) {
                System.out.print(i + "1-"+(i+1)+"0"+": "+"|");
                for (int j = 1; j <= enter[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }    	
    }
}
    	
        

            