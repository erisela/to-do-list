package projects;

public class array {
public static void main(String[] args) {
	int [] myList;
	int myList1[];
	myList1=new int[10];
	
	double[] myArray = new double[10];
	System.out.println("my array.length");
	
	double[] myArray1= {1,2,3,7,10};
	
	System.out.println(myArray1[2]);

}
public static void createArray() {
	int [] values=new int[5];
	//popullimi i arrayt --- do i japim vlera elementit ne varesi te indeksit
	
	for(int i=0;i<=values.length;i++) {
		values[i]=1;
	}
	for(int i=0;i<values.length;i++) {
		System.out.println(values[i]+" ");
	}
}
}

