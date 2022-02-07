
public class BubbleSort {
	public static void bubbleSort(int arr[],int len) {
		for(int i = 0;i<len-1;i++) {
			for(int j = i+1;j<len;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
