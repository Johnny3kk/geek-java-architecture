package HomeWork6;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserController implements Serializable {

    private UserMapper userMapper;

    private User user;

    private List<User> users;

    public void preloadData(ComponentSystemEvent componentSystemEvent) {
        this.users = userMapper.findAllUsers();
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
