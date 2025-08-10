package wiprofirst.allasiment;

public class firstassiment {

	public static void main(String[] args) {
		int arr[] = {12,13,14,8,11};
		int length = arr.length;
		int average = 0;
		int sum = 0;
		for(int i = 0;i<length;i++) {
			if(arr[i] < 10) {
				arr[i] = arr[i] * 2;
			}
		}
		for(int i = 0;i<length;i++) {
			System.out.println(arr[i]);
			
			sum +=  arr[i];
		
		}
		average = sum / length;
		System.out.println("average : "+ average);
		
	}
}
