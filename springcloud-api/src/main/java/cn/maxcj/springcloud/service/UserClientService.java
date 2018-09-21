package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "shopping-user")
public interface UserClientService {

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public boolean add(@RequestBody User user);

    @RequestMapping(value = "/user/get/{uid}",method = RequestMethod.GET)
    public User get(@PathVariable("uid") Integer uid);

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> list();

}
