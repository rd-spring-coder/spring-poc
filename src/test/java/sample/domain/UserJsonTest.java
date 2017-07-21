/**
 * 
 */
package sample.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * <p>
 * JSON test for {@link User}
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
@RunWith(SpringRunner.class)
@JsonTest
public class UserJsonTest {

	@Autowired
	private JacksonTester<User> userJson;
	
	@Test
	public void serializeJson() throws Exception {
		User user = new User("Ritesh",new VehicleIdentificationNumber("01234567890123456"));
		//System.out.println(this.json.write(details));
		
		/*ObjectMapper objectMapper = new ObjectMapper();
		String userString = objectMapper.writeValueAsString(details);
		System.out.println(userString);
		assertThat(userString, containsString("username"));*/
		System.out.println(this.userJson.write(user));
		assertThat(this.userJson.write(user)).isEqualToJson("user.json");
		
	}

	/*@Test
	public void deserializeJson() throws Exception {
		String content = "{\"make\":\"Ford\",\"model\":\"Focus\"}";
		assertThat(this.json.parse(content))
				.isEqualTo(new VehicleDetails("Ford", "Focus"));
		assertThat(this.json.parseObject(content).getMake()).isEqualTo("Ford");
	}*/
}
