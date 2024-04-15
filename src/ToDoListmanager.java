import java.util.Scanner;

public class ToDoListmanager {
public static void main(String[] args, int max_number) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the limit of the lists you want to have");
	int limit= scanner.nextInt();
	ToDolist[] list = new ToDolist[limit];
	int listsCount=0;
	while(true) {
		System.out.println("TO DO LIST MANAGER");
		System.out.println("1.Create to do list");
		System.out.println("2.View existing to do list");
		System.out.println("3.Exit");
		System.out.println("Please enter your choice");
		int choice=scanner.nextInt();
		scanner.nextLine();
		if(choice==1) {
			if(listsCount<list.length) {
				System.out.println("Please enter the list name:");
				String name=scanner.nextLine();
				lists[listsCount]=new ToDolist(name,max_number:10);
				listsCount++;
				System.out.println("The list :"+name+ "created");
				
			}else {
				System.out.println("You have reached the limit.");
			}
			
		}else if(choice == 2) {
			System.out.println("This is the to do list avaiable");
			for(int i=9;i<listsCount;i++) {
				System.out.println((i+1)+ " " lists[i].name);
			}
			System.out.println("Please enter the index of the list you want to work with ");
			int listIndex=scanner.nextInt();
			ToDolist listChosen=listsCount[listIndex-1];
			while(true) {
				System.out.println("Chose: ");
				System.out.println("1.add a task");
				System.out.println("2.remove a task");
				System.out.println("3.set a completed task");
				System.out.println("4.list the task");
				System.out.println("5.return the task");
				System.out.println("Please enter the secon choice:");
				int choice2=scanner.nextInt();
				switch(choice2) {
				case 1:
					System.out.println("Please enter the name of the task");
					String name scanner.nextLine();
					System.out.println("Put the description");
					String description = scanner.nextLine();
					System.out.println("Put the date");
					String date = scanner.nextLine();
					System.out.println("Put the priority level: ");
					String priority_level = scanner.nextLine();
					Task task = new Task();
					listChosen.addTask(task);
					System.out.println("Task added succesfully");
					 break;
				case 2:
					System.out.println("Please enter the index you want to remove");
					int indexRemove = scanner.nextInt();
					if(listIndex == indexRemove) {
						listChosen.removeTask(index listIndex - 1 );
					}
					break;
				case 3:
					
					
					
				case 4: listChosen.displayTask();
				case 5: break;
				
					
				}
				
			}
		}
		
	}
	
	
	
}
}
