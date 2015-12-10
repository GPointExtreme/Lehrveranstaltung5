
public class ArrayToolsDemo {

	public static void main(String[] args) {
		
		//intersectCount ausführen mit zwei Arrays als Input.
		int array1[] = {1, 2, 3, 4};
		int array2[] = {3, 4, 5, 6};
		
		int array[] = ArrayTools.intersectCount(array1, array2);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------");
		
		int array3[] = {1, 2, 3, 2, 3, 4};
		
		int array4[] = ArrayTools.distinct(array3);
		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i]);
		}
		System.out.println("----------------");
		
		int array5[] = {1, 2, 3, 2, 3, 4};
		System.out.println(ArrayTools.isSorted(array5));
		
		int array6[] = {1, 2, 3, 4, 5, 6};
		System.out.println(ArrayTools.isSorted(array6));
	}
}
