package pers.yezi.shop.web.service.impl;

import org.springframework.stereotype.Service;
import pers.yezi.shop.web.dao.AreasDao;
import pers.yezi.shop.web.model.Areas;
import pers.yezi.shop.web.service.AreasService;

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
