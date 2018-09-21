package cn.maxcj.springcloud.controller;

import cn.maxcj.springcloud.entities.User;
import cn.maxcj.springcloud.service.impl.UserServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public User get(@PathVariable("uid") Integer uid){
        User user = this.userService.get(uid);
        if (null == user){
            throw new RuntimeException("此ID"+uid+"没有对应的信息");
        }
        return user;
    }

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public User login(@RequestParam("username") String username, @RequestParam("password") String password, Model model,HttpSession session){
        return userService.login(username, password);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signup(String username, String password) {
        /**
         * 注册
         */
        return null;
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

    public User processHystrix_Get(@PathVariable("uid") Integer uid){
        User user =  new User();
        user.setUid(uid);
        user.setUsername("该ID：" + uid + "没有没有对应的信息,null--@HystrixCommand");
        user.setDb_source("no this database in MySQL");
        return user;
    }






}
