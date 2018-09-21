package cn.maxcj.springcloud.service;


import cn.maxcj.springcloud.entities.GoodsType;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "shopping-goods")
public interface GoodsTypeClientService {
    @RequestMapping(value = "/goodstype/add",method = RequestMethod.POST)
    public boolean add(@RequestBody GoodsType goodsType);

    @RequestMapping(value = "/goodstype/get/{tid}",method = RequestMethod.GET)
    public GoodsType get(@PathVariable("gid") Integer gid);

    @RequestMapping(value = "/goodstype/list",method = RequestMethod.GET)
    public List<GoodsType> list();
}
