package projects;

import java.util.Scanner;

public class array1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] arrayuserinput;
	System.out.println("ju lutem vendosni size te arrayt");
	int size= scanner.nextInt();
	arrayuserinput=new String[size];
	scanner.nextLine();	
	for(int i=0;i<arrayuserinput.length;i++) {
		System.out.println("ju lutem vendosni element"+(i+1));
		arrayuserinput[i]=scanner.nextLine();
		
			
		}
	for(int i=0;i<arrayuserinput.length;i++) {
		System.out.println(arrayuserinput[i]+" ");
	}
	
	
}
}
