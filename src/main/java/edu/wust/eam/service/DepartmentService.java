package edu.wust.eam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.wust.eam.bean.Department;
import edu.wust.eam.mapper.DepartmentMapper;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }
}
