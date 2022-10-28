package model.dao;

import java.util.List;

import modelo.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findbyId(Integer id);
	List<Department> findAll();
	
	
	
}
