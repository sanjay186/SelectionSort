
import java.util.Scanner;

public class SelectionSort {
	public void sort (int arr[] , int it){
		int min;
		for(int i=0 ; i<it; i++){
			min=i;
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
				//System.out.println(arr[j]);
				if(i!=min)
				{	
				System.out.println(min  + " ");
				int temp= arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
				}
				
				//System.out.println(arr[j]);
			
			
			
			
		}
		
	}
	public void print(int arr[]){
		int N= arr.length;
		for(int i=0;i<N;i++){
			System.out.print(arr[i] + " ");
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int it = s.nextInt();
		int[] arr= new int[n];
		for(int i =0;i<n;i++){
			arr[i] = s.nextInt();
		}
	s.close();
	SelectionSort st = new SelectionSort();
	st.sort(arr, it);
	System.out.println("sort arry");
	st.print(arr);
	}
	
	
}
