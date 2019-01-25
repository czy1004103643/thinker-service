package com.thinker.service.controller;

import com.thinker.service.dto.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/service")
@Api(description = "咨询服务", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServiceController {
    private static Logger logger = LoggerFactory.getLogger(ServiceController.class);

    @ApiOperation("获取服务类目列表")
    @PostMapping(value = "/getCategoryList")
    public BaseResponseDTO getCategoryList() {
        List<CategoryDTO> list=new ArrayList<>();

        CategoryDTO dto1=new CategoryDTO();
        dto1.setCategory_id(1);
        dto1.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c1.png");
        dto1.setCategory_name("系统架构");

        CategoryDTO dto2=new CategoryDTO();
        dto2.setCategory_id(2);
        dto2.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c2.png");
        dto2.setCategory_name("技术开发");

        CategoryDTO dto3=new CategoryDTO();
        dto3.setCategory_id(3);
        dto3.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c3.png");
        dto3.setCategory_name("研发流程");

        CategoryDTO dto4=new CategoryDTO();
        dto4.setCategory_id(4);
        dto4.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c4.png");
        dto4.setCategory_name("人工智能");

        CategoryDTO dto5=new CategoryDTO();
        dto5.setCategory_id(5);
        dto5.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c5.png");
        dto5.setCategory_name("产品设计");

        CategoryDTO dto6=new CategoryDTO();
        dto6.setCategory_id(6);
        dto6.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c6.png");
        dto6.setCategory_name("产品运营");

        CategoryDTO dto7=new CategoryDTO();
        dto7.setCategory_id(7);
        dto7.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c7.png");
        dto7.setCategory_name("人才招聘");

        CategoryDTO dto8=new CategoryDTO();
        dto8.setCategory_id(8);
        dto8.setCategory_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/c8.png");
        dto8.setCategory_name("团队管理");

        list.add(dto1);
        list.add(dto2);
        list.add(dto3);
        list.add(dto4);
        list.add(dto5);
        list.add(dto6);
        list.add(dto7);
        list.add(dto8);
        return BaseResponseDTO.successInstance(list);
    }

    @ApiOperation("获取专家服务方式")
    @PostMapping(value = "/getServiceMode")
    public BaseResponseDTO getServiceMode() {
        ServiceModeDTO ServiceMode=new ServiceModeDTO();
        ServiceMode.setService_mode(1);
        return BaseResponseDTO.successInstance(ServiceMode);
    }

    @ApiOperation("设置专家服务方式")
    @PostMapping(value = "/setServiceMode")
    public BaseResponseDTO setServiceMode(@RequestBody RequestServiceModeDTO ServiceModeDTO) {
        ServiceModeDTO ServiceMode=new ServiceModeDTO();
        ServiceMode.setService_mode(1);
        return BaseResponseDTO.successInstance(ServiceMode);
    }

    /*制造数据*/
    private List<AppointmentTimeDTO> creatdata()
    {
        AppointmentTimeDTO AppointmentTime1=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime2=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime3=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime4=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime5=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime6=new AppointmentTimeDTO();
        AppointmentTimeDTO AppointmentTime7=new AppointmentTimeDTO();
        List<Integer> listtime=Arrays.asList(3,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2);
        AppointmentTime1.setDate(20181201);
        AppointmentTime1.setWeek(1);
        AppointmentTime1.setTimes(listtime);
        AppointmentTime2.setDate(20181202);
        AppointmentTime2.setWeek(2);
        AppointmentTime2.setTimes(listtime);
        AppointmentTime3.setDate(20181203);
        AppointmentTime3.setWeek(3);
        AppointmentTime3.setTimes(listtime);
        AppointmentTime4.setDate(20181204);
        AppointmentTime4.setWeek(4);
        AppointmentTime4.setTimes(listtime);
        AppointmentTime5.setDate(20181205);
        AppointmentTime5.setWeek(5);
        AppointmentTime5.setTimes(listtime);
        AppointmentTime6.setDate(20181206);
        AppointmentTime6.setWeek(6);
        AppointmentTime6.setTimes(listtime);
        AppointmentTime7.setDate(20181207);
        AppointmentTime7.setWeek(7);
        AppointmentTime7.setTimes(listtime);

        List<AppointmentTimeDTO> list=new ArrayList<>();
        list.add(AppointmentTime1);
        list.add(AppointmentTime2);
        list.add(AppointmentTime3);
        list.add(AppointmentTime4);
        list.add(AppointmentTime5);
        list.add(AppointmentTime6);
        list.add(AppointmentTime7);

        return list;
    }

    @ApiOperation("获取专家预约时间")
    @PostMapping(value = "/getAppointmentTime")
    public BaseResponseDTO getAppointmentTime(@RequestBody RequestAppointmentTimeDTO AppointmentTimeDTO) {
        return BaseResponseDTO.successInstance(creatdata());
    }

    @ApiOperation("设置专家预约时间")
    @PostMapping(value = "/setAppointmentTime")
    public BaseResponseDTO setAppointmentTime(@RequestBody RequestSetAppointmentTimeDTO SetAppointmentTimeDTO) {
        List<SetAppointmentTimeDTO> list=new ArrayList<>();
        String[] strings = new String[]{"08:00","09:00","21:00","22:00"};
        List<String> times= Arrays.asList(strings);

        SetAppointmentTimeDTO SetAppointmentTime1=new SetAppointmentTimeDTO();
        SetAppointmentTime1.setWeek(1);
        SetAppointmentTime1.setTimes(times);

        SetAppointmentTimeDTO SetAppointmentTime2=new SetAppointmentTimeDTO();
        SetAppointmentTime2.setWeek(2);
        SetAppointmentTime2.setTimes(times);

        SetAppointmentTimeDTO SetAppointmentTime3=new SetAppointmentTimeDTO();
        SetAppointmentTime3.setWeek(3);
        SetAppointmentTime3.setTimes(times);

        SetAppointmentTimeDTO SetAppointmentTime7=new SetAppointmentTimeDTO();
        SetAppointmentTime7.setWeek(7);
        SetAppointmentTime7.setTimes(times);

        list.add(SetAppointmentTime1);
        list.add(SetAppointmentTime2);
        list.add(SetAppointmentTime3);
        list.add(SetAppointmentTime7);

        return BaseResponseDTO.successInstance(list);
    }

    @ApiOperation("设置专家例外时间")
    @PostMapping(value = "/setExceptionTime")
    public BaseResponseDTO setExceptionTime(@RequestBody RequestSetExceptionTimeDTO SetExceptionTimeDTO) {
        SetExceptionTimeDTO SetExceptionTime=new SetExceptionTimeDTO();
        String[] strings = new String[]{"2018-12-01 08:00","2018-12-03 09:00","2018-12-21 21:00","2018-12-24 22:00"};
        List<String> times= Arrays.asList(strings);
        SetExceptionTime.setTimes(times);
        return BaseResponseDTO.successInstance(SetExceptionTime);
    }

    @ApiOperation("获取用户评论列表")
    @PostMapping(value = "/getCommentList")
    public BaseResponseDTO getCommentList(@RequestBody RequestCommentListDTO CommentListDTO) {
        CommentListDTO CommentList=new CommentListDTO();

        CommentDTO Comment1=new CommentDTO();
        Comment1.setUser_userid(100000000);
        Comment1.setUser_name("黄江");
        Comment1.setUser_nickname("令狐冲");
        Comment1.setUser_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head1.png");
        Comment1.setExpert_userid(200000000);
        Comment1.setExpert_name("张成");
        Comment1.setExpert_nickname("多隆");
        Comment1.setExpert_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head2.png");
        Comment1.setComment("这个专家很牛，技术很强，讲解透彻");

        CommentDTO Comment2=new CommentDTO();
        Comment2.setUser_userid(100000000);
        Comment2.setUser_name("陈伟");
        Comment2.setUser_nickname("风清扬");
        Comment2.setUser_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head3.png");
        Comment2.setExpert_userid(200000000);
        Comment2.setExpert_name("彭甲");
        Comment2.setExpert_nickname("小甲子");
        Comment2.setExpert_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head4.png");
        Comment2.setComment("这个专家很牛，技术很强，讲解透彻");

        CommentDTO Comment3=new CommentDTO();
        Comment3.setUser_userid(100000000);
        Comment3.setUser_name("王成");
        Comment3.setUser_nickname("宋江");
        Comment3.setUser_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head5.png");
        Comment3.setExpert_userid(200000000);
        Comment3.setExpert_name("雷军");
        Comment3.setExpert_nickname("雷老板");
        Comment3.setExpert_head_image("http://thinkerosstest.oss-cn-shanghai-finance-1-pub.aliyuncs.com/head6.png");
        Comment3.setComment("这个专家很牛，技术很强，讲解透彻");


        List<CommentDTO> list=new ArrayList<>();
        list.add(Comment1);
        list.add(Comment2);
        list.add(Comment3);
        CommentList.setTotal(3);
        CommentList.setCommentlist(list);

        return BaseResponseDTO.successInstance(CommentList);
    }
}
