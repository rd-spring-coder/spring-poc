/**
 * 
 */
package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.model.BaseVO;
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
public class HierarchyTestController extends BaseContoller{

	@RequestMapping("/uri1")
	public String uri1(@ModelAttribute("requestVO")ChildOne one){
		return "common";
	}
	
	@RequestMapping("/uri2")
	public String uri2(@ModelAttribute("requestVO")ChildTwo two){
		return "common";
	}
	
	@ModelAttribute("requestVO")
	public void populateAttributes(ModelMap model){
		ChildOne one = new ChildOne();
		one.setTestVar("test");
		model.addAttribute("requestVO",one);
	}

	@RequestMapping("/uri3-form")
	public String uri3Form(@ModelAttribute("requestVO")ChildOne one){
		return "test_common";
	}
	@Override
	@RequestMapping("/uri3")
	protected String commonBehavior1(@ModelAttribute("requestVO")BaseVO vo, ModelMap model) {
		ChildOne one = null;
		if(vo instanceof ChildOne){
			one = (ChildOne)vo;
		}
		System.out.println(one.getInstanceVarChild1());
		return "common";
	}
	
	@Override
	@RequestMapping("/uri3-2")
	protected String commonBehavior2(ModelMap model) {
		ChildOne one = null;
		if(model.get("requestVO") instanceof ChildOne){
			one = (ChildOne)model.get("requestVO");
		}
		System.out.println(one.getInstanceVarChild1());
		return "common";
	}
	
	
}
