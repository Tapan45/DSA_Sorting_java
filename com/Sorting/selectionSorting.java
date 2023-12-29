package com.Sorting;

public class selectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
		int []a= {54,67,32,12,25,45};
		int min;
		for (int i=0;i<a.length;i++)
		{
			min=i;
			for (int j=i+1;j<a.length;j++) {
				if( a[j]<a[min]) {
					min=j;
				}
					}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i=0;i<a.length;i++)
          System.out.print(a[i]+" ");
	}

}
