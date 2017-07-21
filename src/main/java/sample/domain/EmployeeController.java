/**
 * 
 */
package sample.domain;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
@Controller
public class EmployeeController {
	
	@GetMapping("/emp")
	public String emp(Employee employee){
		return "employeeForm";
	}
	
	@PostMapping("/save")
	public String saveEmp(@Valid Employee employee,BindingResult result){
		if(result.hasErrors()){
			return "employeeForm";
		}
		return null;
	}

}
