package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.Order;
import org.mockito.internal.matchers.Or;

import java.util.List;

public interface ShoppingCarService {
    public boolean AddGoodToShoppingCar(Order order);

    public boolean DeleteShoppingCar(Integer oid);

    public boolean UpdateShoppingCar(Order order);

    public Order SelectByid(Integer oid);

    public List<Order> SelectByUser(Integer uid);
}
