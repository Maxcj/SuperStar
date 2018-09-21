package cn.maxcj.springcloud.service;

import cn.maxcj.springcloud.entities.GoodsType;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GoodsTypeService {
    public boolean AddType(GoodsType goodsType);

    public boolean DeleteType(Integer tid);

    public boolean UpdateType(GoodsType goodsType);

    public GoodsType SelectTypeById(Integer tid);

    public List<GoodsType> SelectAllType();
}
