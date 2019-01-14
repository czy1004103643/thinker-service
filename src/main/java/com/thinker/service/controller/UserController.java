package com.thinker.service.controller;

import com.thinker.service.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/user")
@Api(description = "用户管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "ok";
    }

    @ApiOperation("用户注册")
    @PostMapping(value = "/userRegister")
    public BaseResponseDTO userRegister(@RequestBody RequestUserRegisterDTO UserRegisterDTO) {
        return BaseResponseDTO.successInstance();
    }

    @ApiOperation("用户登录")
    @PostMapping(value = "/Login")
    public BaseResponseDTO userLogin(@RequestBody RequestUserLoginDTO UserLoginDTO) {
        UserTokenDTO token=new UserTokenDTO();
        token.setUser_type(1);
        token.setToken("dGhpcyBpcyBhIGV4YW1wbGU=");
        token.setExpireTime("2016-05-01 01:11:11");
        return BaseResponseDTO.successInstance(token);
    }

    @ApiOperation("用户重置密码")
    @PostMapping(value = "/resetPasswd")
    public BaseResponseDTO resetPasswd(@RequestBody RequestResetPasswdDTO ResetPasswdDTO) {
        return BaseResponseDTO.successInstance();
    }

    @ApiOperation("获取验证码")
    @PostMapping(value = "/getSmsCode")
    public BaseResponseDTO getSmsCode(@RequestBody RequestGetSmsCodeDTO GetSmsCodeDTO) {
        SmsCodeDTO smscode=new SmsCodeDTO();
        smscode.setSmscode("您的短信验证码是：0453，有效期3分钟");
        return BaseResponseDTO.successInstance(smscode);
    }

    @ApiOperation("获取专家列表")
    @PostMapping(value = "/getExpertList")
    public BaseResponseDTO getExpertList(@RequestBody RequestExpertListDTO ExpertListDTO) {
        return BaseResponseDTO.successInstance(creatdata());
    }

    /*构造专家列表数据*/
    private ExpertListDTO creatdata()
    {
        ExpertListDTO ExpertList=new ExpertListDTO();
        ExpertList.setTotal(10);

        List<ExperInfoDTO> list=new ArrayList<ExperInfoDTO>();

        ExperInfoDTO ExperInfo1=new ExperInfoDTO();
        ExperInfo1.setUserid(100000000);
        ExperInfo1.setName("张三");
        ExperInfo1.setNickname("令狐冲");
        ExperInfo1.setHead_image("http://hangzhou.oss.com/image/wewq73423w217ydwer.jpeg");
        ExperInfo1.setPosition("阿里资深架构师");
        ExperInfo1.setOld_position("百度技术经理");
        ExperInfo1.setPrice(250);
        ExperInfo1.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        String[] strings = new String[]{"技术开发","系统架构","团队管理"};
        List<String> category= Arrays.asList(strings);
        ExperInfo1.setCategory(category);
        ExperInfo1.setService_times(312);
        ExperInfo1.setService_mode(1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);
        list.add(ExperInfo1);

        ExpertList.setExpertlist(list);
        return ExpertList;
    }

    @ApiOperation("获取热门专家列表")
    @PostMapping(value = "/getHotExpertList")
    public BaseResponseDTO getHotExpertList(@RequestBody RequestExpertListDTO ExpertListDTO) {
        return BaseResponseDTO.successInstance(creatdata());
    }

    @ApiOperation("获取专家基本信息")
    @PostMapping(value = "/getExperInfo")
    public BaseResponseDTO getExperInfo(@RequestBody RequestByUseridDTO ByUseridDTO) {
        ExperInfoDTO ExperInfo1=new ExperInfoDTO();
        ExperInfo1.setUserid(100000000);
        ExperInfo1.setName("张三");
        ExperInfo1.setNickname("令狐冲");
        ExperInfo1.setHead_image("http://hangzhou.oss.com/image/wewq73423w217ydwer.jpeg");
        ExperInfo1.setPosition("阿里资深架构师");
        ExperInfo1.setOld_position("百度技术经理");
        ExperInfo1.setPrice(250);
        ExperInfo1.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        String[] strings = new String[]{"技术开发","系统架构","团队管理"};
        List<String> category= Arrays.asList(strings);
        ExperInfo1.setCategory(category);
        ExperInfo1.setService_times(312);
        ExperInfo1.setService_mode(1);

        return BaseResponseDTO.successInstance(ExperInfo1);
    }
}
