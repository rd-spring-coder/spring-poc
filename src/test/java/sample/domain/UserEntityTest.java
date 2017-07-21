package sample.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import sample.domain.User;
import sample.domain.VehicleIdentificationNumber;


/**
 * <p>
 * Test class for domain {@link User}
 * and its dependent domains {@link VehicleIdentificationNumber}
 * Handling four cases
 * <PRE>
 *public void 
 *	createWhenUsernameIsNullShouldThrowException()
 *public void 
 *	createWhenUsernameIsEmptyShouldThrowException()
 *public void 
 *	createWhenVinIsNullShouldThrowException()
 *public void 
 *	saveShouldPersistData()
 * </PRE>
 * </p>
 * 
 * @author Ritesh Dharmatti
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserEntityTest {

	private static final VehicleIdentificationNumber VIN = new VehicleIdentificationNumber("01234567890123456");

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Autowired
	private TestEntityManager entityManager;
	
	/**
	 * Test case to validate an exception condition
	 * <p>
	 * Condition : Username field should not be null
	 * </p>
	 */
	@Test
	public void createWhenUsernameIsNullShouldThrowException() {
		
		this.thrown.expect(IllegalArgumentException.class);
		this.thrown.expectMessage("Username must not be null");
		new User(null,VIN);
	}
	
	/**
	 * Test case to validate an exception condition
	 * <p>
	 * Condition : Username field should not be empty
	 * </p>
	 */
	@Test
	public void createWhenUsernameIsEmptyShouldThrowException(){
		this.thrown.expect(IllegalArgumentException.class);
		this.thrown.expectMessage("Username must not be empty");
		new User("",VIN);
	}
	
	/**
	 * Test case to validate an exception condition
	 * <p>
	 * Condition : Vin field should not be null
	 * </p>
	 */
	@Test
	public void createWhenVinIsNullShouldThrowException(){
		this.thrown.expect(IllegalArgumentException.class);
		this.thrown.expectMessage("VIN must not be null");
		new User("Ritesh",null);
	}
	
	/**
	 * Test case to validate - saving the user
	 */
	@Test
	public void saveShouldPersistData(){
		User user = this.entityManager.persistFlushFind(new User("ritesh",VIN));
		assertThat(user.getUsername()).isEqualTo("ritesh");
		assertThat(user.getVin()).isEqualTo(VIN);
	}
	
	

}
