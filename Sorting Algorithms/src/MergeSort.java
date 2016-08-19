/*
 * 2016
 * @ABDELRAHMAN ELATTAR
 * Applying Merge Sort using Divide and Conquer algorithm
 * 
 * Time Complexity:
 * for best, worst, and average cases is O(nlog(n))
 */
public class MergeSort 
{
	private int[] list;
	private int size;
	
	MergeSort(int size)
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
	private void merge(int[] left, int[] right, int[] total)
	{
		int lengthLeft = left.length;
		int lengthRight = right.length;
		int i=0, j=0, k=0;
		
		while(i<lengthLeft && j<lengthRight)
		{
			if(left[i] <= right[j])
			{
				total[k] = left[i];
				i++;
			}
			else
			{
				total[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<lengthLeft)
		{
			total[k] = left[i];
			i++;
			k++;
		}
		while(j<lengthRight)
		{
			total[k] = right[j];
			j++;
			k++;
		}
	}
	public void sortArray(int[] list)
	{
		int n = list.length;
		if(n<2)
			return;
		
		int middlePosition = n/2;
		int[] leftArray = new int[middlePosition];
		int[] rightArray = new int[n-middlePosition];
		
		int i=0;
		while(i < middlePosition)
		{
			leftArray[i] = list[i];
			i++;
		}
		
		int j=0;
		while(i < n)
		{
			rightArray[j] = list[i];
			i++;
			j++;
		}
		
		sortArray(leftArray);
		sortArray(rightArray);
		merge(leftArray, rightArray, list);
		this.list = list;
	}
	public void printArray()
	{
		for(int i=0; i<size; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
}
