package cn.maxcj.springcloud.controller;

import cn.maxcj.springcloud.entities.User;
import cn.maxcj.springcloud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import javax.servlet.http.HttpSession;

@SuppressWarnings("ALL")
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }

    @RequestMapping(value = "/user/get/{uid}",method = RequestMethod.GET)
    public User get(@PathVariable("uid") Integer uid){
        return userService.get(uid);
    }

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping(value = "/user/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("SHOPPING-USER");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
