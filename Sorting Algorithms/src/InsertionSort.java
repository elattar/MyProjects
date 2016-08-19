/*
 * 2016
 * @ABDELRAHMAN ELATTAR
 * 
 * Time Complexity is:
 * for best case O(n) in ascending order or already sorted will not enter while loop
 * for worst case O(n^2) in descending order
 * for average O(n^2)
 */

public class InsertionSort 
{
	private int[] list;
	private int size;
	
	InsertionSort(int size)
	{
		this.size = size;
		list = new int[size];		
	}
	public void setList(int[] list)
	{
		for(int i=0; i<size; i++)
		{
			this.list[i] = list[i];
		}
	}
	public void sortArray()
	{
		for(int i=1; i<size-1; i++)
		{
			int tempValue = list[i];
			int index = i;
			while( index>0 && list[(index-1)]>tempValue)
			{
				list[index] = list[index-1];
				index--;
			}
			list[index] = tempValue;
		}
	}
	public void printArray()
	{
		for(int i=0; i<size; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
}
