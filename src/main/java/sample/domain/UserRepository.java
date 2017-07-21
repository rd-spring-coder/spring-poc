package sample.domain;

import org.springframework.data.repository.Repository;
/**
 * Domain repository for {@link User}
 * @author rd
 *
 */
public interface UserRepository extends Repository<User, Long> {

	public User findByUsername(String username);
}
