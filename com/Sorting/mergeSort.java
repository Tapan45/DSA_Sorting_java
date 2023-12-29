package com.Sorting;

public class mergeSort {
       int [] array;
       int [] tempMerge;
       int length;
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []inputArr = {45,56,12,24,57,89,27};
        mergeSort ms = new mergeSort();
        ms. sort(inputArr);
        for (int i : inputArr) {
        	System.out.print( i + " ");
        }
	}
     public void sort(int inputArr[])
     {
    	 this.array=inputArr;
    	 this .length=inputArr.length;
    	 this . tempMerge= new int[length];        
    	 
    	 divideArray(0,length-1);
    	 
     }
     public void divideArray(int lowerindex,int higherindex) {
    	 if (lowerindex < higherindex)
    	 {
    		 int middle = lowerindex +(higherindex-lowerindex)/2;
    		 divideArray(lowerindex,middle);//left side sort
    		 divideArray(middle+1,higherindex);//right sight 
    		 merge(lowerindex,middle,higherindex);
    	 }
    	  	 
     }
     public void merge(int lowerindex, int middle,int higherindex) {
    	 for (int i=lowerindex;i<=higherindex;i++) {
    		 tempMerge[i]=array[i];
    		 
    	 }
    	 int i= lowerindex;
    	 int j= middle+1;
    	 int k= lowerindex;
    	 while (i<= middle && j<=higherindex) {
    		if (tempMerge [i]<= tempMerge[j]) {
    		 array[k]=tempMerge[i];
    		 i++;
    	 }
    	 else {
    		 array[k]= tempMerge[j];
    		 j++;
    	 }
    	 k++;
     }
    	 while (i<= middle) {
    		 array[k]=tempMerge[i];
    		 k++;
    		 i++;
    	 }
}
}