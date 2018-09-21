package cn.maxcj.springcloud.dao;

import cn.maxcj.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShoppingCarDAO {
    public boolean AddGoodToShoppingCar(Order order);

    public boolean DeleteShoppingCar(Integer oid);

    public boolean UpdateShoppingCar(Order order);

    public Order SelectByid(Integer oid);

    public List<Order> SelectByUser(Integer uid);
}
