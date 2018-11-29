package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.StaffMemberDTO;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "I write descriptions");
		controller.createManagerEmployee("Manuel Manager Employee", "Dirección molona 5", "665226666", 80.0);
		
		
		controller.payAllEmployeers();
/*
		En principi s'ha de crear un objecte DTO per cada altre objecte(Employee i volunteer), 
		però ara només crearé un DTO per l'StaffMember per simplificar-ho.
*/	
		
		for(StaffMemberDTO s : controller.getAllEmployees()) {
			System.out.println(s.getName());
			System.out.println(s.getAddress());
			System.out.println(s.getPhone());
			System.out.println(s.getTotalpaid());

		}
		
		System.out.println();
		for(String s : controller.getEmployeeSalary()) {
			System.out.println(s);
		}
		
	
		
	}

}
