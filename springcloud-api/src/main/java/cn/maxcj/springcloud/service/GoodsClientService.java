package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.Goods;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "SHOPPING-GOODS")
public interface GoodsClientService {

    @RequestMapping(value = "/goods/add",method = RequestMethod.POST)
    public Integer add(@RequestBody Goods goods);

    @RequestMapping(value = "/consumer/goods/get/{gid}", method = RequestMethod.GET)
    public Goods get(@PathVariable("gid") Integer gid);

    @RequestMapping(value = "/consumer/goodss", method = RequestMethod.GET)
    public List<Goods> list();
}
