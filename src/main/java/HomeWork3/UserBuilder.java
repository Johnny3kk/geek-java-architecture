package HomeWork3;

import java.util.Set;

public class UserBuilder {

    private Integer id;

    private String name;

    private String password;

    private String email;

    private Integer age;

    private Set<Role> roles;

    public UserBuilder() {

    }


    public UserBuilder id(Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;

    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public UserBuilder roles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public User build() {
        return new User(id, name, password, email, age, roles);
    }

}
