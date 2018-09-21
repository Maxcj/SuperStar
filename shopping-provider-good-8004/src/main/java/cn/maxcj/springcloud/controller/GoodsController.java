package cn.maxcj.springcloud.controller;

import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.entities.GoodsType;
import cn.maxcj.springcloud.service.impl.GoodsServiceImpl;
import cn.maxcj.springcloud.service.impl.GoodsTypeServiceImpl;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;

    @Autowired
    private GoodsTypeServiceImpl goodsTypeService;

    @Autowired
    private DiscoveryClient client;


    @GetMapping("/goods")
    public List<GoodsType> ToAddPage(Model model){
        /**
         * 获取所有的商品种类
         */
        return goodsTypeService.SelectAllType();

    }

    @PostMapping("/goods/add")
    public int add(@RequestBody Goods goods) {
        System.out.println("添加商品");
        System.out.println(goods.toString());
        return goodsService.AddGoods(goods);
    }

    /**
     * 查询所有的商品
     * @param model
     * @return
     */
    @GetMapping("/goodss")
    public List<Goods> list(){
        return goodsService.SelectAll();
    }
    /**
     * 获取商品信息并到编辑页面
     * @param gid
     * @param model
     * @return
     */
    @GetMapping("/goods/{gid}")
    public Goods toEditPage(@PathVariable("gid") Integer gid, Model model){
       return goodsService.SelectGoodById(gid);

    }

    /**
     * 保存商品修改
     * @param goods
     * @return
     */
    @PutMapping("/goods")
    public boolean updateGoods(Goods goods){
        return goodsService.EditGood(goods);

    }

    @DeleteMapping("/goods/{gid}")
    public boolean deleteGoods(@PathVariable("gid") Integer gid){
       return goodsService.DeleteGoodById(gid);
    }

    @RequestMapping(value = "/goods/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("SHOPPING-GOODS");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }






}
