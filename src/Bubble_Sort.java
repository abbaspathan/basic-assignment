import java.util.*;

public class Bubble_Sort{
	
	public static void main(String args[]){
		
		int array[]={45,23,6,56,98,2,76,23};

		int first_Element=0;
		int variable=array.length-1;
		int temporary=0;
		
		
		for(int index=0;index<array.length;index++)
		{
			for(first_Element=0;first_Element<variable;first_Element++){
		
				if(array[first_Element]>array[first_Element+1]){
			
					temporary=array[first_Element];
					array[first_Element]=array[first_Element+1];
					array[first_Element+1]=temporary;
				}
			}
			variable--;
		}

		System.out.println("Sorted elements are:");
		for(int value:array){
			
			System.out.println(value);
		}
	}
}