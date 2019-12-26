package pers.yezi.shop.service.impl;

import org.springframework.stereotype.Service;
import pers.yezi.shop.dao.AreasDao;
import pers.yezi.shop.model.Areas;
import pers.yezi.shop.service.AreasService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreasServiceImpl implements AreasService {

    @Resource
    private AreasDao areasDao;

    @Override
    public List<Areas> listAll() {
        return this.areasDao.listAll();
    }
}
