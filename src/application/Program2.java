package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		System.out.println("===Test 1 department findById ===");
		DepartmentDao dpDao = DaoFactory.createDepartmentDao();
		Department dp = dpDao.findById(1);
		System.out.println(dp);
		
		
		System.out.println("===Test 2 department findAll ===");
		List<Department> department = dpDao.findAll();
		
		for(Department obj : department) {
			System.out.println(obj);
		}
	
		
		System.out.println("=== Test 3: department insert ===");
		Department newDepar = new Department(null, "Almoxarifado");
		dpDao.insert(newDepar);
		System.out.println("Insert new id: " + newDepar.getId());
		
		
		System.out.println("=== Test 4: department upadate ===");
		dp = dpDao.findById(7);
		dp.setName("Alm");
		dpDao.update(dp);
		System.out.println("Update completed");
		
		System.out.println("=== Test 5: department delete ===");
		dpDao.deleteById(7);
		System.out.println("Delete completed");
	}

}