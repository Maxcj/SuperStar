package cn.maxcj.springcloud.dao;

import cn.maxcj.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public boolean addUser(User user);

    public User login(String username, String password);

    public User findById(Integer id);

    public List<User> findAll();
}
