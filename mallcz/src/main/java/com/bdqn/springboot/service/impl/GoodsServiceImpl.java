package com.bdqn.springboot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bdqn.springboot.entity.Goods;
import com.bdqn.springboot.dao.GoodsMapper;
import com.bdqn.springboot.entity.Goodscolor;
import com.bdqn.springboot.entity.Versions;
import com.bdqn.springboot.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author KazuGin
 * @since 2019-11-28
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {


    @Resource
    private GoodsMapper goodsMapper;


    /**
     * 询查主列表有分页
     *
     * @param page
     * @param goods
     * @return
     * @throws Exception
     */
    @Override
    public IPage<Goods> getGoodsList(Page<Goods> page, Goods goods) throws Exception {
        return goodsMapper.getGoodsList(page,goods);
    }

    @Override
    public List<Versions> getVersions(Integer id) {
        return goodsMapper.getVersions(id);
    }

    @Override
    public List<Goodscolor> getGoodscolor(Integer id) {
        return goodsMapper.getGoodscolor(id);
    }

    @Override
    public int updateGodosState(Map<String, Object> map) throws Exception {
        return goodsMapper.updateGodosState(map);
    }

    @Override
    public List<Versions> Versionslist(Long goodsId) throws Exception {
        return goodsMapper.Versionslist(goodsId);
    }

    @Override
    public List<Goodscolor> GoodscolorlistById(Long goodsId) throws Exception {
        return goodsMapper.GoodscolorlistById(goodsId);
    }
}
