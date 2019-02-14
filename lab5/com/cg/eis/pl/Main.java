package lab5.com.cg.eis.pl;

import java.util.Scanner;

import lab5.com.cg.eis.service.Service;

public class Main {
	
	static Service s = new Service();
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter your choice \n"
					+ "1. creat User \n"
					+ "2. show your details \n"
					+ "3. show your Insurance Scheme \n"
					+ "4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
				
				case 1: createUser();	break;
				
				case 2: showUserDetails(); 	break;
				
				case 3: showInsuranceScheme();	break;
				
				case 4: System.exit(0);
				
				default : System.out.println("Wrong choice");
			}
		}

	}

	private static void createUser() {
		
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user Name");
		String name = sc.nextLine();
		System.out.println("Enter User Salary");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println(s.creatEmployee(id, name, salary));
		
	}

	private static void showUserDetails() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(s.display(id));
	}

	private static void showInsuranceScheme() {
		System.out.println("Enter user Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(s.getInsuranceScheme(id));
	}

}
