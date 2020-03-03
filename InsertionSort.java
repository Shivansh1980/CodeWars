import java.util.*;
class InsertionSort{
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
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.print("\nSorted Array is : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");						 			
		}
	}
}