package hibernatefetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class TestEmpController {
	
	@Autowired
	public TestEmpInterface testEmpRepository;

	@PostMapping("/createEmp")
	public TestEmp emp(@RequestBody TestEmp employee) {
		return testEmpRepository.save(employee);
	}
	
	@GetMapping("/getEmployees")
	public List<TestEmp> getAllEmployees(){
		return testEmpRepository.findAll();
	}
	
	@GetMapping("/getById/{empId}")
	public ResponseObject getEmployee(@PathVariable long empId){
		ResponseObject obj=new ResponseObject();
		try {
		obj.setData(testEmpRepository.findById(empId).orElseThrow(()-> new Exception(("The Employee was not found with Id: "+empId))));
		}catch (Exception e) {
			obj.setData(e.getMessage());
		}
		return obj;
	}
}
