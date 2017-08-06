/**
 * 
 */
package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.model.Hello;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
@Controller
public class JavaBeanController {

	@RequestMapping("/no-model-attribute")
	public String noModelAttribute(Hello hello,BindingResult result, ModelMap model){
		return "no-model-attribute";
	}
}
