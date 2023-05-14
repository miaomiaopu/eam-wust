package edu.wust.eam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.wust.eam.bean.Department;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department")
    public List<Department> getDepartments();
}
