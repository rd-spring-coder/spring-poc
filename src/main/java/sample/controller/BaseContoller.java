/**
 * 
 */
package sample.controller;

import org.springframework.ui.ModelMap;

import sample.model.BaseVO;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
public abstract class BaseContoller {

	protected String commonBehavior2(ModelMap model){
		System.out.println("common behavior");
		return null;
	}
	
	protected String commonBehavior1(BaseVO vo, ModelMap model){
		System.out.println("common behavior");
		return null;
	}
}
