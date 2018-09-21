package cn.maxcj.springcloud.controller;

import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.entities.GoodsType;
import cn.maxcj.springcloud.entities.Order;
import cn.maxcj.springcloud.service.impl.ShoppingCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class ShoppingCarController {

    @Autowired
    private ShoppingCarServiceImpl shoppingCarService;


    @PostMapping("/shoppingcar/add")
    public String add(@RequestBody Order order) {
        shoppingCarService.AddGoodToShoppingCar(order);
        System.out.println("===========添加的订单详情================");
        System.out.println(order.toString());
        /**
         * return到所有视频列表页面
         */
        return "";
    }

    /**
     * 查询某个用户的所有的订单
     * @param model
     * @return
     */
    @GetMapping("/shoppingcar")
    public String list(@PathVariable("uid") Integer uid, Model model){
        List<Order> car = shoppingCarService.SelectByUser(uid);

        for (Order order: car){
            System.out.println("===========订单详情================");
            System.out.println(order.toString());
        }
        /**
         * return 到商品列表页面
         */
        return "";
    }

    @RequestMapping("/shoppingcar/{uid}")
    public List<Order> list(@PathVariable("uid") Integer uid){
        /*List<Order> car = shoppingCarService.SelectByUser(uid);

        for (Order order: car){
            System.out.println("===========订单详情================");
            System.out.println(order.toString());
        }
        *//**
         * return 到商品列表页面
         *//*
        return car;*/
        return shoppingCarService.SelectByUser(uid);
    }




    @PutMapping("/shoppingcar")
    public String update(Order order){

        shoppingCarService.UpdateShoppingCar(order);

        return "";
    }

    @DeleteMapping("/shoppingcar/{oid}")
    public String deleteGoods(@PathVariable("oid") Integer oid){
        shoppingCarService.DeleteShoppingCar(oid);

        System.out.println("============已经删除"+oid+"订单===============");
        /**
         * return 到商品列表页面
         */
        return "";
    }
}
