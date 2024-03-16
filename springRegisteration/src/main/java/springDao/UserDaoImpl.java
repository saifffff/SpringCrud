package springDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int createUser(User user) {
		this.hibernateTemplate.save(user);
		return 1;
	}

}
