package Exercise;

import java.util.Scanner;

public class project {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to \"HEALTH HUB\".");
		System.out.println("\nIt is an application which is designed for better life of older people.");
		System.out.println("In this application you can check the proper cure of your diseases.");
		System.out.println("You can also crate your \"TASK LIST\" to follow your day to dayroutine.");
		System.out.println("\nTo start with it, please enter the following details");
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		System.out.print("Enter your height(cm): ");
		int h = s.nextInt();
		System.out.println();
		System.out.println("The secret of genius is to carry the spirit of the child into the old age.");
		System.out.println("And you are that Genius.");
				
		
		personalData data = new personalData(name, age, h);
		System.out.println();
		int l = 0;
		System.out.println("Let's explore some MAIN MENU of our application.");
		do {
			System.out.println();
			System.out.println("MAIN MENU");
			System.out.println();
			int x = data.menu();
			switch (x) {
			case 1: {
				System.out.println();				
				System.out.println("PLease mention if you have any of the following issues ?");
				System.out.println("\n(1) Cardiovascular Diseases");
				System.out.println("(2) Thyroid");
				System.out.println("(3) Respiratory Diseases");
				System.out.println("(4) Diabetes");
				System.out.println("(5) None");
				int c = 4;
				do {
					System.out.print("\nEnter your choice: ");
					String option = s.nextLine();
					System.out.println();
					
					for(char ch : option.toCharArray()) {
						switch (ch) {
						case '1': {
							System.out.println("(1) Hyper/Hypo: You should focus more on diet, exercise and eat less salt and monitor your BP regularly.");
							c = 5;
							break;
						}
						case '2': {
							System.out.println("(2) Thyroid: You might be gaining someweight. \n     You should monitor \"T3\"and \"T4\" properly.");
							c = 5;
							break;
						}
						case '3': {
							System.out.println("(3) Asthma: Diet, Do exercise regularly but avoid vigours exercise and also \"NO SMOKING\".");
							c = 5;
							break;
						}
						case '4': {
							System.out.println("(4) Diabetes: Do exericse, take proper diet and provide sugar and sweets as much as possible.");
							c = 5;
							break;
						}
						case '5': {
							System.out.println("That's great, you maintained yourself very well.");
							System.out.println("Here are some tips for further prevention.");
							System.out.println("Take proper diet and walk for atleast 30 mins. twice a day, also get time for time consultations for Presymptomatics.");
							c = 5;
							break;
						}
						default:
							System.out.println("Please enter valid option.");
							return;
						}
					}
				} while (c!=5);
				break;
			}
			case 2: {
				System.out.print("Enter your Weight(kg): ");
				int wt = s.nextInt();
				data.setWeight(wt);
				data.checkWt();
				break;
			}
			case 3: {
				System.out.println("BLOOD PRESSURE MONITOR");
				System.out.println();
				System.out.print("Enter your Blood Pressure(in 'mmHg'): ");
				int bp = s.nextInt();
				data.setBP(bp);
				data.checkBP();
				break;
			}
			
			case 4: {
				System.out.println("TASK MANAGER");
				System.out.println();
				System.out.println("Create and Schedule your own task and set its time");
				System.out.println();
				int q = 3;
				do {
					System.out.print("Enter your task name: ");
					s.nextLine();
					String tn = s.nextLine();
					System.out.print("Enter the schedule time(HH:MM): ");
					int hr = s.nextInt();
					int min = s.nextInt();
					data.addTask(tn, hr, min);
					System.out.println();
					System.out.println("Press 0 to add another task.");
					System.out.println("Press 1 to explore other options available in TASK LIST.");
					System.out.println("Press 2 to go back to MAIN MENU.");
					System.out.println();
					System.out.print("Enter your choice: ");
					q = s.nextInt();
				} while (q==0);
				
				while (q == 1){
					System.out.println();
					char y;
					System.out.println("Welcome to the TASK LIST.");
					System.out.println("Available options for TASK LIST are: ");
					do {
						System.out.println();
						System.out.println("Press a to view your created TASK LIST.");
						System.out.println("Press b to update the status of completed tasks.");
						System.out.println("Press c to delete particular task from TASK LIST.");
						System.out.println("Press d to clear all tasks from TASK LIST.");
						System.out.println("Press e to go back to the MAIN MENU.");
						System.out.println();
						System.out.print("Enter your choice: ");
						y = s.next().charAt(0);
						switch (y) {
							case 'a': {
								System.out.println();
								data.myTask();
								break;
							}
							case 'b': {
								System.out.println();
								System.out.print("Enter the task name which you have completed: ");
								s.nextLine();
								String test = s.nextLine();
								data.updateStatus(test);
								break;
							}
							case 'c': {
								System.out.println();
								System.out.print("Enter the task name which you wish to delete: ");
								s.nextLine();
								String t = s.nextLine();
								data.deleteTask(t);
								break;
							}
							case 'd': {
								System.out.println();
								data.clear();
								break;
							}
							case 'e':{
								q = 5;
								break;
							}
							default: {
								System.out.println();
								System.out.print("Please enter valid choice.");
								return;
							}
						}
					} while (y != 'e');
				}
				break;
			}
			
			
			case 5: {
				System.out.println(data);
				break;
			}
			case 6: {
				l = 5;
				break;
			}
			default:
				System.out.println("Please enter valid choice.");
			}	
		}
		while(l == 0);
		System.out.println();
		System.out.println("\"To ensure GOOD HEALTH: Eat lightly, breathe deeply, live moderately and maintain an interest in life.\" \n");
		System.out.println("THANK YOU!");
		
		s.close();
	}
}
