
public class testSorting {

	public static void main(String[] args)
	{
		int[] array = {5,2,10,14,1,6,12};
		InsertionSort is = new InsertionSort(7);
		is.setList(array);
		is.sortArray();
		is.printArray();
	}

}
