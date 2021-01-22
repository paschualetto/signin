package br.com.paschua.signin.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    private String name;

    private String email;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
