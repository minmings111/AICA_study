package app.labs.ex06.mvc02.dao;

import java.util.List;
import java.util.Map;

import app.labs.ex06.mvc02.model.EmpVO;

// 기능 설계
public interface IEmpRepository {
	int getEmpCount();
	int getEmpCount(int deptId);
	
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
	
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	int deleteEmp(int empId, String email); // 삭제는 복구가 힘들다. 그래서 까다롭게 하는게 좋음. 갯수를 생각하세요...
	
	void deleteJobHistory(int empId);
	
	List<Map<String, Object>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
	
}

