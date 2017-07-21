/**
 * 
 */
package sample.model;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
public class BaseVO {

	private String instanceVar1;

	/**
	 * @param instanceVar1
	 */
	public BaseVO() {
		super();
		this.instanceVar1 = "abc";
	}

	public String getInstanceVar1() {
		return instanceVar1;
	}

	public void setInstanceVar1(String instanceVar1) {
		this.instanceVar1 = instanceVar1;
	}
}
