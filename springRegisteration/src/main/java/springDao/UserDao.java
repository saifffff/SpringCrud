package springDao;

import java.util.List;

import Model.User;

public interface UserDao {
	public int createUser(User user);
	public List<User> getAll();
}
