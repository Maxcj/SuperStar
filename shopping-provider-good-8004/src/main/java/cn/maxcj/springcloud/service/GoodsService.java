package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.Goods;
import java.util.List;

public interface GoodsService {
    /**
     * 增加商品
     */
    public int AddGoods(Goods goods);

    /**
     * 删除商品
     */
    public boolean DeleteGoodById(Integer gid);

    /**
     * 修改商品
     */
    public boolean EditGood(Goods goods);

    /**
     * 查询某个商品
     */
    public Goods SelectGoodById(Integer gid);

    /**
     * 查询商品列表
     */
    public List<Goods> SelectAll();


}
