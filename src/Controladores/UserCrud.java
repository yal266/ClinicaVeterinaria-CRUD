package Controladores;

import Clases.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserCrud {

    private static UserCrud userCRUD = new UserCrud();
    private Map<String, User> bd = new HashMap<String, User>();

    public UserCrud() {
        this.create(new User(1, "Yasmin Dominguez","admin", "12345"));
    }

    public void create(User user) {
        this.bd.put(user.getNombre_usu(), user);
    }

    public User read(String nomusuario) {
        return this.bd.get(nomusuario);
    }

    public void update(User user) {
        if (this.bd.containsKey(user.getNombre_usu())) {
            this.bd.put(user.getNombre_usu(), user);
        }
    }

    public void delete(User user) {
        this.bd.remove(user.getNombre_usu());
    }

    public Collection<User> getList() {
        return this.bd.values();
    }
}
