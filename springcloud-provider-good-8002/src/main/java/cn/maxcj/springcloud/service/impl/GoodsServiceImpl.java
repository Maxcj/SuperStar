package cn.maxcj.springcloud.service.impl;

import cn.maxcj.springcloud.dao.GoodsDAO;
import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("ALL")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO dao;

    @Override
    public int AddGoods(Goods goods) {
        return dao.AddGoods(goods);
    }

    @Override
    public boolean DeleteGoodById(Integer gid) {
        return DeleteGoodById(gid);
    }

    @Override
    public boolean EditGood(Goods goods) {
        return dao.EditGood(goods);
    }

    @Override
    public Goods SelectGoodById(Integer gid) {
        return dao.SelectGoodById(gid);
    }

    @Override
    public List<Goods> SelectAll() {
        return dao.SelectAll();
    }
}
