package service.Implements;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void find() {

        System.out.println("开始搜索");
        userDao.find();
    }

    @Override
    public void delete(String delete) {

        System.out.println("开始删除");
        userDao.find();
        userDao.delete(delete);
    }

    @Override
    public void save(String node) {

        System.out.println("开始添加节点");
        userDao.find();
        userDao.save(node);
    }
}
