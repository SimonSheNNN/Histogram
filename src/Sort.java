import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {

	
	public static final int MAX = 51;  // max possible score
	public static void main(String[] args) {
	
		List<Integer> ints= new ArrayList<Integer>();
		int[] enter = new int[51];
		int count=0;
		theList( count, enter,  ints);
		startGame(ints);
	}//main
		
		
	
	public static void startGame(List<Integer> ints){
		System.out.println("which sort method do you want to use? 1 for selection sort, 2 for insertion sort");
		Scanner in = new Scanner(System.in);
		int sortNum=in.nextInt();
		String whichSort;
		if(sortNum==1){
			selectionSort(ints);
			whichSort="selection sort";
		}
		else{
			whichSort="insertion sort";
			insertionSort(ints);
		}
		
		System.out.println("the"+whichSort+" sort is:");
		System.out.println(ints);
	}
	
	
	public static void theList(int count, int[]enter, List<Integer> ints){
		System.out.println("enter something between 0-50");
		System.out.println("signal the end by puting a number out of range");
		Scanner in = new Scanner(System.in);
		int inPut= in.nextInt();
		while (inPut<MAX){
			count = inPut;
			enter[count] +=1;
			ints.add(inPut);
			inPut= in.nextInt();
		}//while
		for (int i = 0; i < enter.length; i++) {
            if (enter[i] >= 0) {
                System.out.println(i+":"+enter[i]);
            }
        }    	
		System.out.println(ints);
	}//theList
	
	public static void selectionSort(List<Integer> ints){
		
		int length = ints.size();
		
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++){
				System.out.println("looking for # less than" + ints.get(min));
				if (ints.get(min) > ints.get(j)){
					System.out.println( ints.get(j)+" is smaller than " + ints.get(min));
					min = j;
				}//if
				
			}//for 2
			
			Integer temp = ints.get(min);
			ints.set(min,ints.get(i));
			ints.set(i,temp);
			System.out.println(ints);	
		}//for 1

	}//class
	
	public static void insertionSort(List<Integer> ints){
		
		int length = ints.size();
	
		for (int i = 1; i < length; i++) {
			for (int j=i-1;j>=0;j--){
				System.out.println("looking for place for " + ints.get(i)+" to place in");
				if(ints.get(i)<ints.get(j)){
					System.out.println( ints.get(i)+" is smaller than " + ints.get(j));
					System.out.println( "switch" );
					Integer temp=ints.get(j);
					ints.set(j,ints.get(i));
					ints.set(i,temp);
					i=j;
				}
				else{
					System.out.println( ints.get(i)+" is not smaller than or equal to " + ints.get(j) +", keep " + ints.get(i));
				}
			}
			System.out.println(ints);
		}
		
	}//class
	
	
}//overall






	
	
	
