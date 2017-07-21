/**
 * 
 */
package sample.domain;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
public class Employee {
	
	//This works
	//@NotEmpty(message="{employee.name.notNull}")
	//This doesn't work
	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	

}
