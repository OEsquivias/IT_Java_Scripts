package com.jobs.application;


import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;


public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee managerEmployee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManagerEmployee());
		repository.addMember(managerEmployee);
	}


	public void payAllEmployeers() {
		List<AbsStaffMember> repo = EmployeeRepository.getAllMembers();
		for (AbsStaffMember m : repo) {
			m.pay();
		}

	
	}

	public String[] getAllEmployees() throws Exception {
		List<AbsStaffMember> repo = EmployeeRepository.getAllMembers();
		String[] allEmployees = new String[repo.size()];
		for (int i = 0; i < repo.size() ;i++ ) {
			StaffMemberDTO member = new StaffMemberDTO(repo.get(i));
			allEmployees[i] = member.getName();
		}
		return allEmployees;
	}
	
//// Previous method	
//	public String[] getAllEmployees() {
//		List<AbsStaffMember> repo = EmployeeRepository.getAllMembers();
//		String[] allEmployees = new String[repo.size()];
//		for (int i = 0; i < repo.size() ;i++ ) {
//			allEmployees[i] = repo.get(i).getName();
//		}
//		return allEmployees;
//	}

	public String[] getEmployeeSalary() throws Exception {
		List<AbsStaffMember> repo = EmployeeRepository.getAllMembers();
		String[] allEmployees = new String[repo.size()];
		for (int i = 0; i < repo.size() ;i++ ) {
			StaffMemberDTO member = new StaffMemberDTO(repo.get(i));
			allEmployees[i] = member.getName() + ": " + member.getTotalpaid();
		}
		return allEmployees;
	}
	
////Previous method	
//	public String[] getEmployeeSalary() {
//		List<AbsStaffMember> repo = EmployeeRepository.getAllMembers();
//		String[] salaryEmployee = new String[repo.size()];
//		for (int i = 0; i < repo.size() ;i++ ) {
//			salaryEmployee[i] = repo.get(i).getName() + ": " + repo.get(i).getTotalPaid();
//		}
//		return salaryEmployee;
//	}
	

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
		
	}
	

	
}
