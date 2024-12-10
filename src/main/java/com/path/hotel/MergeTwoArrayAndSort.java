package com.path.hotel;

public class MergeTwoArrayAndSort {
	
	public static void main(String[] args) {
	
		/*
	int[] arr1 = {4,8,5,3,7};
	int[] arr2 = {1,3,6,3,7};
	
	int[] mergeArray = new int[arr1.length+arr2.length];
	
	//for merge first array
	for(int i=0;i<arr1.length;i++) {
		mergeArray[i]=arr1[i];
	}
	//for merge second array
	for(int i=0;i<arr2.length;i++) {
		mergeArray[arr1.length+i]=arr2[i];
	}
	*/
	
	int[] mergeArray = {4,8,5,3,7,1,3,6,3,7};
	//print the merge Array before sort
	for(int i=0;i<mergeArray.length;i++) {
		System.out.print(mergeArray[i]+" ");
	}
		
	//sort the array using bubble sort
	for(int i=0;i<mergeArray.length-1;i++) {
		
		for(int j=0;j<mergeArray.length-i-1;j++) {
			if(mergeArray[j]>mergeArray[j+1]) {
				int temp = mergeArray[i];
				mergeArray[j]=mergeArray[j+1];
				mergeArray[j+1]=temp;
			}
		}
	}
	
	System.out.println();
	//print the merge Array after sort
		for(int i=0;i<mergeArray.length;i++) {
			System.out.print(mergeArray[i]+" ");
		}
	
	}
}
