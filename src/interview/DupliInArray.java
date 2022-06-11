package interview;

public class DupliInArray {

	public static void main(String[] args) {
			int [] arr= {1,2,3,4,5,2,6};
			for (int i=0;i<arr.length;i++) {
				for (int j=i+1;j<arr.length;j++) {
					if (arr[i]==arr[j]) {
						System.out.println("Duplicate element found at"+(j+1)+"and element is"+arr[j]);
					}
				}
			}
	}

}
