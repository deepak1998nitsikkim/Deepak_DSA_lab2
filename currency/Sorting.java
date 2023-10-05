package com.greatlearning.lab.currency;

public class Sorting {
	public void sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = low+(high-low)/2;
			//using low+(high-low)/2 to avoid integer overflow error
			//Left Part
			sort(arr,low,mid);
			//Right Part
			sort(arr,mid+1,high);
			//Reaches when we no longer split or already sorted sub array.
			merge(arr,low,mid,high);
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
        //calculate size of left and right sub arrays
		int n1 = mid -low +1;
		int n2 = high-mid;

		int[] leftArr = new int[n1];
		int[] rightArr =new int[n2];
		
		//Copy elements of actual array to left sub array
		for(int i=0;i<n1;i++) {
			leftArr[i]=arr[low+i];
		}
		//Copy elements of actual array to right sub array
		for(int j=0;j<n2;j++) {
			rightArr[j]=arr[mid+1+j];
		}

		int i=0,j=0;
		//pointer to actual array(arr)
		int k =low;

		//comparison between left and right array
		while(i<n1 && j<n2){
			if(leftArr[i] > rightArr[j]){
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
	//Copy the remaining elements in right sub array if any
		while(i<n1) {
			arr[k++]=leftArr[i++];
		}
    //Copy the remaining elements in right sub array if any
	while(j<n2) {
		arr[k++]=rightArr[j++];
	}
	}

}

