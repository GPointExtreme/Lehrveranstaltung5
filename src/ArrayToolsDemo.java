
public class ArrayToolsDemo {

	public static void main(String[] args) {
		
		//intersectCount ausführen mit zwei Arrays als Input.
		int array1[] = {1, 2, 3, 4};
		int array2[] = {3, 4, 5, 6};
		
		int array[] = ArrayTools.intersectCount(array1, array2);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
