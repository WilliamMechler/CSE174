
public class Lab11Part2 {

public static void main(String[] args) {
		
	    //Making an array
		double dblArray1[] = new double [10];
		
		//the current size
		int currentsize = 5;
		
		for(int i = 0; i < 5; i++) {
			
			dblArray1[i] = i *2;
		}
		
		double smallest;int position;
		System.out.println("Smallest from Array1 =" + GetSmallest(dblArray1));
		
		
		System.out.println("Position from Array1 =" + GetPosition(dblArray1,4,currentsize));

	}
	
	/**
    Will fine the smallest value in the array
    @param  myArray is the array
    @return will return the smallest number in the array
   */
	public static double GetSmallest(double[] myArray) {
		
		double smallest= Double.MAX_VALUE;

		
		for(double i : myArray) {
			
			
			if(smallest > i) {
				
				smallest = i;
				
			}
		}
		
		return smallest;  
		
	}
	
	
	/**
    Will get the position of a current
    @param myArray is the array
    @param checkValue the value you are looking for
    @param size the size of the array being used
    @return will return the position of the character in the array
   */
	public static int GetPosition(double[] myArray,double checkValue, int size) {
		
		int position = -1;
		
		for(int i = 0; i <= size; i++) {
			
			if(checkValue == myArray[i]) {
				
				position = i;
				
			}
		}
		
		return position;  
		
	}

}
