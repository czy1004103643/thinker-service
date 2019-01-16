package com.thinker.service.controller;

import com.thinker.service.dto.AdDTO;
import com.thinker.service.dto.BaseResponseDTO;
import com.thinker.service.dto.ConfigDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/v1/config")
@Api(description = "配置服务", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConfigController {
    private static Logger logger = LoggerFactory.getLogger(ServiceController.class);

    @ApiOperation("获取配置列表")
    @PostMapping(value = "/getConfigList")
    public BaseResponseDTO getConfigList() {
        ConfigDTO Config=new ConfigDTO();

        List<AdDTO> adlist=new ArrayList<>();
        AdDTO ad1=new AdDTO();
        ad1.setAd_describe("轮播广告");
        ad1.setAd_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/I1.png");
        ad1.setAd_link("http://www.163.com");

        AdDTO ad2=new AdDTO();
        ad2.setAd_describe("轮播广告");
        ad2.setAd_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/I2.png");
        ad2.setAd_link("http://www.163.com");

        AdDTO ad3=new AdDTO();
        ad3.setAd_describe("轮播广告");
        ad3.setAd_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/I3.png");
        ad3.setAd_link("http://www.163.com");

        adlist.add(ad3);
        adlist.add(ad3);
        adlist.add(ad3);
        Config.setAdlist(adlist);
        return BaseResponseDTO.successInstance(Config);
    }
}
