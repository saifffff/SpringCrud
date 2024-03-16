package springServices;

import org.springframework.stereotype.Service;

import Model.User;
import springDao.UserDaoImpl;

@Service
public class UserService {
	private UserDaoImpl userDao;
	
	public int createUser(User user) {
		int rv = userDao.createUser(user);
		return rv;
	}
}
