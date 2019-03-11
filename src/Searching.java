import java.util.*;
public class Searching {
	public static void main(String[] args) {
		
		int array[]={23,56,50,6,98,19,23,54,21,10,7};
		int searching_Element=0;

		Scanner object=new Scanner(System.in);
		System.out.println("Enter element to be search:");
		searching_Element=object.nextInt();

		int first_Index=0;
		int last_Index=array.length-1;

		for(first_Index=0;first_Index<=last_Index;first_Index++,last_Index--){
			
			if((array[first_Index]==searching_Element)||(array[last_Index]==searching_Element)){
				
				break;
			}
			
		}
		
		if(first_Index>last_Index){

			System.out.println("Element not found!!!");
		}
		else{

			if(array[first_Index]==searching_Element){
			
				System.out.println("Element found at Index:"+first_Index);	
			}
			else{
			
				System.out.println("Element found at Index:"+last_Index);
			}
		}
	}
}
