package cn.maxcj.springcloud.dao;

import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.entities.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDAO {
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

    public boolean AddType(GoodsType goodsType);

    public boolean DeleteType(Integer tid);

    public boolean UpdateType(GoodsType goodsType);

    public GoodsType SelectTypeById(Integer tid);

    public List<GoodsType> SelectAllType();

}
