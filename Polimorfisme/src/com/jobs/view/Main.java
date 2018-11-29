package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "I write descriptions");
		controller.createManagerEmployee("Manuel Manager Employee", "Dirección molona 5", "665226666", 80.0);
		
		
		controller.payAllEmployeers();

		
		for(String s : controller.getAllEmployees()) {
			System.out.println(s);
		}
		System.out.println();
		for(String s : controller.getEmployeeSalary()) {
			System.out.println(s);
		}
		
	
		
	}

}
