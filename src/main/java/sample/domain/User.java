package sample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * <p>
 * Domain class modeling a real world User
 * who has an id,a unique user name and a {@link VehicleIdentificationNumber}
 * 
 * </p>
 * @author Ritesh Dharmatti
 * @see	VehicleIdentificationNumber
 */
@Entity
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique = true)
	private String username;
	
	private VehicleIdentificationNumber vin;
	
	protected User(){}
	
	public User(String username,VehicleIdentificationNumber vin){
		Assert.notNull(username,"Username must not be null");
		Assert.hasLength(username,"Username must not be empty");
		Assert.notNull(vin,"VIN must not be null");
		this.username = username;
		this.vin = vin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public VehicleIdentificationNumber getVin() {
		return vin;
	}
	
}
