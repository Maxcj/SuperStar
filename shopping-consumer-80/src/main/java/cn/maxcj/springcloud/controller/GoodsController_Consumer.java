package cn.maxcj.springcloud.controller;


import cn.maxcj.springcloud.entities.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GoodsController_Consumer {

    private static final String URL = "http://SHOPPING-GOODS";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/goods/add")
    public Integer add(Goods goods){
        return restTemplate.postForObject(URL+"/goods/add",goods,Integer.class);
    }


    @RequestMapping(value = "/consumer/goods/get/{gid}")
    public Goods get(@PathVariable("gid") Integer gid){
        return restTemplate.getForObject(URL+"/goods/"+gid,Goods.class);
    }

    @RequestMapping(value = "/consumer/goodss")
    public List<Goods> list(){
        return restTemplate.getForObject(URL+"/goodss",List.class);
    }

    @RequestMapping(value = "/consumer/goods/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(URL + "/goods/discovery", Object.class);
    }




}
