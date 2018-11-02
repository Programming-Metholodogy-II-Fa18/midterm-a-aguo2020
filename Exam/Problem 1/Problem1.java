package problem1;
public class Problem1 {
	public void ExamSort(int[]a,int size){
		if(size <=1) return;
		int mid = size/2;
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for(int i = 0; i < left.length; i++){
			left[i] = a[i];
		}
		
		for(int i = 0; i < right.length; i++){
			right[i] = a[i+mid];
		}
		
		ExamSort(left,mid);
		ExamSort(right,size-mid);
		merge(left,right,a);
	}
	
	public void merge(int[] left, int[] right, int[] a){
		int i =0; int j=0; int k=0;
		
		while(i<left.length && j<right.length){
			if(left[i] <= right[j]){
				a[k] = left[i];
				i++;
			}
			else{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length){
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length){
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Problem1 ob = new Problem1();
		int[] a = {15,9,60,44,12,1,4};
		ob.ExamSort(a,a.length);
		ob.print(a);

	}
}
