/**
 * 
 */
package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.model.ChildOne;
import sample.model.ChildTwo;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
@Controller
public class HierarchyTestController {

	@RequestMapping("/uri1")
	public String uri1(@ModelAttribute("requestVO")ChildOne one){
		return "common";
	}
	
	@RequestMapping("/uri2")
	public String uri2(@ModelAttribute("requestVO")ChildTwo two){
		return "common";
	}
}
