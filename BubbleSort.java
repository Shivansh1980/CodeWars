import java.util.*;
class BubbleSort{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();						 			
		}
		System.out.print("\nEntered Array Elements : ");
		for(int i : arr)
			System.out.print(i+" ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("\nSorted Array is : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");						 			
		}
	}
}