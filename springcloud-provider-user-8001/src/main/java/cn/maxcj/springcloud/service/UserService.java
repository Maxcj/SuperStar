package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public boolean add(User user);

    public User login(String username, String password);

    public User get(Integer id);

    public List<User> list();

}
