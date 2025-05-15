package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] userArray = new User[3];
		
		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		User u03 = new Employee("master", "m7788", "운영자", 5000000 );
		
		userArray[0] = u01;
		userArray[1] = u02;
		userArray[2] = u03;
		
		for(int i=0; i<userArray.length; i++) {
			userArray[i].showInfo();
		}
		
		int salary = ((Employee)userArray[2]).getSalary();
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");
	}

}