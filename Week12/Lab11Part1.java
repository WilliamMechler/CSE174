
public class Lab11Part1 {

	public static void main(String[] args) {
		
		double dblArray1[] = {15.4, 3.12, 7.15, 41.5, 8.76, 12.99, 15.76, 998.1, 35.0};
		
		double dblArray2[] = {81.4, 54.0, 13.85, 36.0, 18.4, 911.18, 15888.4, 4123.3,0.5};
		
		double dblArray3[] = {12,34,34543,5345,345,345,34,543,5346,65,5765,45753,4756,7};
		
		double dblArray4[] = {98,66,.89,7.8,6.767,.68,.7,8.7,7.7,6.5,4.5,4.54,5.45,.45};
		
		double smallest;int position;
		System.out.println("Smallest from Array1 =" + GetSmallest(dblArray1));
		System.out.println("Smallest from Array2 =" + GetSmallest(dblArray2));
		System.out.println("Smallest from Array3 =" + GetSmallest(dblArray3));
		System.out.println("Smallest from Array4 =" + GetSmallest(dblArray4));
		
		System.out.println("Position from Array1 =" + GetPosition(dblArray1,41.5));
		System.out.println("Position from Array2 =" + GetPosition(dblArray2,36.0));
		System.out.println("Position from Array3 =" + GetPosition(dblArray3,5346.0));
		System.out.println("Position from Array4 =" + GetPosition(dblArray4,8.7));
	}
	
	/**
    
    @param  Input is the string we want to test 
    @return will return the numbers of times a character is in a string
   */
	public static double GetSmallest(double[] myArray) {
		
		double smallest= Double.MAX_VALUE;

		
		for(int i = 0; i < myArray.length; i++) {
			
			
			if(smallest > myArray[i]) {
				
				smallest = myArray[i];
				
			}
		}
		
		return smallest;  
		
	}
	
	
	/**
    Will get the position of a current
    @param  Input is the string we want to test 
    @return will return the numbers of times a character is in a string
   */
	public static int GetPosition(double[] myArray,double checkValue) {
		
		int position = -1;
		
		for(int i = 0; i < myArray.length; i++) {
			
			if(checkValue == myArray[i]) {
				
				position = i;
				
			}
		}
		
		return position;  
		
	}
}
