import java.util.*;

public class Student_Average{
	public static void main(String args[]){
	
		int variable1=0;
		int variable2=0;
		int student_Result=0;
		int subject_Result[]={0,0,0};
		int array[][]=new int[3][3];

		Scanner object=new Scanner(System.in);

		for(variable1=0;variable1<array[0].length;variable1++){
		
			System.out.println("Enter "+(variable1+1)+" student marks:");
			System.out.println();
			for(variable2=0;variable2<array[0].length;variable2++){
				System.out.println("Enter subject"+(variable2+1)+" Marks:");
				array[variable1][variable2]=object.nextInt();
			}
		}	
	
		for(variable1=0;variable1<array[0].length;variable1++){

			for(variable2=0;variable2<array[0].length;variable2++){
				student_Result=student_Result+array[variable1][variable2];
				subject_Result[variable1]=subject_Result[variable1]+array[variable2][variable1];
			}
			System.out.println();
			System.out.println("Student "+(variable1+1)+" total marks:"+student_Result);
			System.out.println("Student "+(variable1+1)+" average marks:"+(student_Result/3));
			student_Result=0;
		}
		
		for(variable1=0;variable1<subject_Result.length;variable1++){
			System.out.println();
			System.out.println("Subject"+(variable1+1)+" total marks:"+subject_Result[variable1]);
			System.out.println("Subject"+(variable1+1)+" average marks:"+(subject_Result[variable1]/3));

		}
	
	}
}