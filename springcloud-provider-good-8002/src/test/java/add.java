import cn.maxcj.springcloud.dao.GoodsDAO;
import cn.maxcj.springcloud.entities.Goods;
import cn.maxcj.springcloud.service.impl.GoodsServiceImpl;
import org.junit.Test;

public class add {


    @Test
    public void test(){
        Goods goods = new Goods();
        goods.setGname("fsbsdfj");

        GoodsServiceImpl goodsService = new GoodsServiceImpl();
        goodsService.AddGoods(goods);
    }


}
