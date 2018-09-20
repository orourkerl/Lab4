/* <Regan O'Rourke>
 * <CMSC 256>
 * <Lab 4>
 */

import java.util.*;              
import java.io.File;                    //Importing a file class to let me use a file
import java.io.FileNotFoundException;   //Used if the user inputs the wrong file

public class Lab4 {
	

	public static void sortArray(int[] array)
	{
		int i = 0;
		int k = 0;
		int[] arr = array;
		int[] deArr = new int[10];

		Arrays.sort(arr);

		while (arr[i+1] > arr[i])
		{
			deArr[k] = arr[i+1];
			k++;
		}
	}	
		
	public static void main(String[] args) throws FileNotFoundException
	{
		
		int[] tempArray = new int[args.length];
				
		for (int i = 0; i < tempArray.length; i ++)
		{
			tempArray[i] = Integer.parseInt(args[i]);
		}
		
		sortArray(tempArray);

		/*Scanner user = new Scanner(System.in);            //Input from user
		File input = new File("testPlan.txt");      	//Input file
		Scanner in = new Scanner(input);                  //Reads file
		int[] arrayTemp = new int[10];					//Temporary array
		int i = 0;
		

		while (in.hasNextInt())
		{
			while (arrayTemp.length )
			arrayTemp[i] = in.nextInt();
			i++;
				
		}

		System.out.println(arrayTemp);
*/
	}
}
