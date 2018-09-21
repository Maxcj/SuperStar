package cn.maxcj.springcloud.controller;


import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.service.GoodsClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController_Consume {

    @Autowired
    private GoodsClientService service;

    @RequestMapping(value = "/consumer/goods/get/{id}")
    public Goods get(@PathVariable("gid") Integer gid)
    {
        return this.service.get(gid);
    }

    @RequestMapping(value = "/consumer/goodss")
    public List<Goods> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/goods/add")
    public Object add(Goods goods)
    {
        return this.service.add(goods);
    }
}
