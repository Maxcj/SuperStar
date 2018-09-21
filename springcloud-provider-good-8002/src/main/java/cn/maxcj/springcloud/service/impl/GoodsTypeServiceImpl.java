package cn.maxcj.springcloud.service.impl;

import cn.maxcj.springcloud.dao.GoodsDAO;
import cn.maxcj.springcloud.entities.GoodsType;
import cn.maxcj.springcloud.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("ALL")
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsDAO dao;


    @Override
    public boolean AddType(GoodsType goodsType) {
        return dao.AddType(goodsType);
    }

    @Override
    public boolean DeleteType(Integer tid) {
        return dao.DeleteType(tid);
    }

    @Override
    public boolean UpdateType(GoodsType goodsType) {
        return dao.UpdateType(goodsType);
    }

    @Override
    public GoodsType SelectTypeById(Integer tid) {
        return dao.SelectTypeById(tid);
    }

    @Override
    public List<GoodsType> SelectAllType() {
        return dao.SelectAllType();
    }
}
