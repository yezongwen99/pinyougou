package pers.yezi.shop.web.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import pers.yezi.shop.web.PinyougouShopWebApplicationTests;
import pers.yezi.shop.web.model.Areas;
import pers.yezi.shop.web.service.AreasService;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
public class ShopControllerTest extends PinyougouShopWebApplicationTests {

    @Resource
    private AreasService areasService;

    @Test
    public void listAll() {
        List<Areas> areas = this.areasService.listAll();
        log.info("查询的结构为:areas={}", JSON.toJSONString(areas));
    }
}