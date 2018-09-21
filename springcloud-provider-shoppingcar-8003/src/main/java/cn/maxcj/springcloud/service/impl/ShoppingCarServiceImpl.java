package cn.maxcj.springcloud.service.impl;

import cn.maxcj.springcloud.dao.ShoppingCarDAO;
import cn.maxcj.springcloud.entities.Order;
import cn.maxcj.springcloud.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("ALL")
public class ShoppingCarServiceImpl implements ShoppingCarService {

    @Autowired
    private ShoppingCarDAO shoppingCarDAO;


    @Override
    public boolean AddGoodToShoppingCar(Order order) {
        return shoppingCarDAO.AddGoodToShoppingCar(order);
    }

    @Override
    public boolean DeleteShoppingCar(Integer oid) {
        return shoppingCarDAO.DeleteShoppingCar(oid);
    }

    @Override
    public boolean UpdateShoppingCar(Order order) {
        return UpdateShoppingCar(order);
    }

    @Override
    public Order SelectByid(Integer oid) {
        return shoppingCarDAO.SelectByid(oid);
    }

    @Override
    public List<Order> SelectByUser(Integer uid) {
        return shoppingCarDAO.SelectByUser(uid);
    }
}
