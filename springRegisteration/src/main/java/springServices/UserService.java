package springServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.User;
import springDao.UserDao;
import springDao.UserDaoImpl;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		int rv = this.userDao.createUser(user);
		return rv;
	}
	
	public List<User> getAllUsers(){
		List<User> allUsers= this.userDao.getAll();
		return allUsers;
	}
}
