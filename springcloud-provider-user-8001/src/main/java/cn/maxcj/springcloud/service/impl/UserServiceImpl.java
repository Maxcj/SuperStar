package cn.maxcj.springcloud.service.impl;

import cn.maxcj.springcloud.dao.UserDao;
import cn.maxcj.springcloud.entities.User;
import cn.maxcj.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public boolean add(User user) {
        return dao.addUser(user);
    }

    @Override
    public User login(String username, String password) {
        return dao.login(username, password);
    }

    @Override
    public User get(Integer id) {
        return dao.findById(id);
    }

    @Override
    public List<User> list() {
        return dao.findAll();
    }
}
