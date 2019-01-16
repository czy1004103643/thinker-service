package com.thinker.service.controller;

import com.thinker.service.dao.TestMapper;
import com.thinker.service.dto.*;
import com.thinker.service.entity.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestMapper testMapper;

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        Test test=new Test();
        test.setName("testtest");
        testMapper.insert(test);
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
        ExperInfo1.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head1.png");
        ExperInfo1.setPosition("阿里资深架构师");
        ExperInfo1.setOld_position("百度技术经理");
        ExperInfo1.setPrice(250);
        ExperInfo1.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        String[] strings = new String[]{"技术开发","系统架构","团队管理"};
        List<String> category= Arrays.asList(strings);
        ExperInfo1.setCategory(category);
        ExperInfo1.setService_times(312);
        ExperInfo1.setService_mode(1);

        ExperInfoDTO ExperInfo2=new ExperInfoDTO();
        ExperInfo2.setUserid(100000000);
        ExperInfo2.setName("黄金");
        ExperInfo2.setNickname("任我行");
        ExperInfo2.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head2.png");
        ExperInfo2.setPosition("阿里资深架构师");
        ExperInfo2.setOld_position("百度技术经理");
        ExperInfo2.setPrice(250);
        ExperInfo2.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo2.setCategory(category);
        ExperInfo2.setService_times(312);
        ExperInfo2.setService_mode(1);

        ExperInfoDTO ExperInfo3=new ExperInfoDTO();
        ExperInfo3.setUserid(100000000);
        ExperInfo3.setName("高朋");
        ExperInfo3.setNickname("风清扬");
        ExperInfo3.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head3.png");
        ExperInfo3.setPosition("阿里资深架构师");
        ExperInfo3.setOld_position("百度技术经理");
        ExperInfo3.setPrice(250);
        ExperInfo3.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo3.setCategory(category);
        ExperInfo3.setService_times(312);
        ExperInfo3.setService_mode(1);

        ExperInfoDTO ExperInfo4=new ExperInfoDTO();
        ExperInfo4.setUserid(100000000);
        ExperInfo4.setName("马明兴");
        ExperInfo4.setNickname("小马哥");
        ExperInfo4.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head4.png");
        ExperInfo4.setPosition("阿里资深架构师");
        ExperInfo4.setOld_position("百度技术经理");
        ExperInfo4.setPrice(250);
        ExperInfo4.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo4.setCategory(category);
        ExperInfo4.setService_times(312);
        ExperInfo4.setService_mode(1);

        ExperInfoDTO ExperInfo5=new ExperInfoDTO();
        ExperInfo5.setUserid(100000000);
        ExperInfo5.setName("陈林");
        ExperInfo5.setNickname("小林子");
        ExperInfo5.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head5.png");
        ExperInfo5.setPosition("阿里资深架构师");
        ExperInfo5.setOld_position("百度技术经理");
        ExperInfo5.setPrice(250);
        ExperInfo5.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo5.setCategory(category);
        ExperInfo5.setService_times(312);
        ExperInfo5.setService_mode(1);

        ExperInfoDTO ExperInfo6=new ExperInfoDTO();
        ExperInfo6.setUserid(100000000);
        ExperInfo6.setName("王晨伟");
        ExperInfo6.setNickname("伟哥");
        ExperInfo6.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head6.png");
        ExperInfo6.setPosition("腾讯资深架构师");
        ExperInfo6.setOld_position("百度技术经理");
        ExperInfo6.setPrice(250);
        ExperInfo6.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo6.setCategory(category);
        ExperInfo6.setService_times(312);
        ExperInfo6.setService_mode(1);

        ExperInfoDTO ExperInfo7=new ExperInfoDTO();
        ExperInfo7.setUserid(100000000);
        ExperInfo7.setName("王晨伟");
        ExperInfo7.setNickname("伟哥");
        ExperInfo7.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head7.png");
        ExperInfo7.setPosition("百度资深架构师");
        ExperInfo7.setOld_position("点评技术经理");
        ExperInfo7.setPrice(250);
        ExperInfo7.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo7.setCategory(category);
        ExperInfo7.setService_times(312);
        ExperInfo7.setService_mode(1);

        ExperInfoDTO ExperInfo8=new ExperInfoDTO();
        ExperInfo8.setUserid(100000000);
        ExperInfo8.setName("黄璜");
        ExperInfo8.setNickname("黑旋风");
        ExperInfo8.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head8.png");
        ExperInfo8.setPosition("百度资深架构师");
        ExperInfo8.setOld_position("点评技术经理");
        ExperInfo8.setPrice(250);
        ExperInfo8.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo8.setCategory(category);
        ExperInfo8.setService_times(312);
        ExperInfo8.setService_mode(1);

        ExperInfoDTO ExperInfo9=new ExperInfoDTO();
        ExperInfo9.setUserid(100000000);
        ExperInfo9.setName("黄伟");
        ExperInfo9.setNickname("小蜻蜓");
        ExperInfo9.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head9.png");
        ExperInfo9.setPosition("百度资深架构师");
        ExperInfo9.setOld_position("点评技术经理");
        ExperInfo9.setPrice(250);
        ExperInfo9.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo9.setCategory(category);
        ExperInfo9.setService_times(312);
        ExperInfo9.setService_mode(1);

        ExperInfoDTO ExperInfo10=new ExperInfoDTO();
        ExperInfo10.setUserid(100000000);
        ExperInfo10.setName("朱伟");
        ExperInfo10.setNickname("小蜻蜓");
        ExperInfo10.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head10.png");
        ExperInfo10.setPosition("运满满资深架构师");
        ExperInfo10.setOld_position("点评技术经理");
        ExperInfo10.setPrice(250);
        ExperInfo10.setBrief_introduction("是一个很牛的专家，有10多年的经验");
        ExperInfo10.setCategory(category);
        ExperInfo10.setService_times(312);
        ExperInfo10.setService_mode(1);

        list.add(ExperInfo1);
        list.add(ExperInfo2);
        list.add(ExperInfo3);
        list.add(ExperInfo4);
        list.add(ExperInfo5);
        list.add(ExperInfo6);
        list.add(ExperInfo7);
        list.add(ExperInfo8);
        list.add(ExperInfo9);
        list.add(ExperInfo10);

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
        ExperInfo1.setHead_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head10.png");
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
