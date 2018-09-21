package cn.maxcj.springcloud.controller;

import cn.maxcj.springcloud.entities.GoodsType;
import cn.maxcj.springcloud.service.impl.GoodsTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("ALL")
@RestController
public class GoodsTypeController {
    @Autowired
    private GoodsTypeServiceImpl goodsTypeService;

    /**
     * 增加商品种类
     * @param goodsType
     * @return
     */
    @PostMapping("/goodstype/add")
    public String add(@RequestBody GoodsType goodsType) {
        goodsTypeService.AddType(goodsType);
        System.out.println("===========添加的商品种类================");
        System.out.println(goodsType.toString());
        /**
         * return到所有视频列表页面
         */
        return "";
    }

    /**
     * 删除商品种类
     * @param tid
     * @return
     */
    @DeleteMapping("/goodstype/{tid}")
    public String deleteGoodsType(@PathVariable("tid") Integer tid){
        /**
         * 查询出此种类
         */
        GoodsType goodsType = goodsTypeService.SelectTypeById(tid);
        /**
         * 删除
         */
        goodsTypeService.DeleteType(tid);
        System.out.println("===========已经删除商品种类"+goodsType.getTname()+"================");
        return "";
    }

    /**
     * 修改商品种类
     * @param goodsType
     * @return
     */
    @PutMapping("/goodstype")
    public String updateEmp(GoodsType goodsType){
        goodsTypeService.UpdateType(goodsType);
        return "";
    }

    /**
     * 查询所有的商品种类
     * @param model
     * @return
     */
    @GetMapping("/goodstype")
    public List<GoodsType> list(){
        /*Collection<GoodsType> goodsTypeCollection = goodsTypeService.SelectAllType();*/

        /*model.addAttribute("goodsTypeCollection",goodsTypeCollection);*/
        return goodsTypeService.SelectAllType();

       // return "";
    }
}
