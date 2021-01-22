package br.com.paschua.signin.repository;

import br.com.paschua.signin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fernando
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
