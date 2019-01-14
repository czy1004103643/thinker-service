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
        CategoryDTO dto=new CategoryDTO();
        dto.setCategory_id(1);
        dto.setCategory_image("http://hangzhou.oss.com/image/wewq73423w217ydwer.jpeg");
        dto.setCategory_name("系统架构");

        list.add(dto);
        list.add(dto);
        list.add(dto);
        list.add(dto);
        list.add(dto);
        list.add(dto);
        list.add(dto);
        list.add(dto);
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
        List<TimesDTO> listtime=new ArrayList<>();
        TimesDTO time1=new TimesDTO();
        time1.setTime("08:00");
        time1.setStatus(1);
        TimesDTO time2=new TimesDTO();
        time2.setTime("09:00");
        time2.setStatus(1);
        TimesDTO time3=new TimesDTO();
        time3.setTime("11:00");
        time3.setStatus(1);
        listtime.add(time1);
        listtime.add(time2);
        listtime.add(time3);
        AppointmentTime1.setDate("2018-12-01");
        AppointmentTime1.setWeek(1);
        AppointmentTime1.setTimes(listtime);
        AppointmentTime2.setDate("2018-12-02");
        AppointmentTime2.setWeek(2);
        AppointmentTime2.setTimes(listtime);
        AppointmentTime3.setDate("2018-12-03");
        AppointmentTime3.setWeek(3);
        AppointmentTime3.setTimes(listtime);
        AppointmentTime4.setDate("2018-12-04");
        AppointmentTime4.setWeek(4);
        AppointmentTime4.setTimes(listtime);
        AppointmentTime5.setDate("2018-12-05");
        AppointmentTime5.setWeek(5);
        AppointmentTime5.setTimes(listtime);
        AppointmentTime6.setDate("2018-12-06");
        AppointmentTime6.setWeek(6);
        AppointmentTime6.setTimes(listtime);
        AppointmentTime7.setDate("2018-12-07");
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
        CommentDTO Comment=new CommentDTO();
        Comment.setUser_userid(100000000);
        Comment.setUser_name("张三");
        Comment.setUser_nickname("令狐冲");
        Comment.setUser_head_image("http://hangzhou.oss.com/image/wewq73423w217ydwer.jpeg");
        Comment.setExpert_userid(200000000);
        Comment.setExpert_name("李四");
        Comment.setExpert_nickname("多隆");
        Comment.setExpert_head_image("http://hangzhou.oss.com/image/wewq73423w217ydwer.jpeg");
        Comment.setComment("这个专家很牛，技术很强，讲解透彻");
        List<CommentDTO> list=new ArrayList<>();
        list.add(Comment);
        list.add(Comment);
        list.add(Comment);
        list.add(Comment);
        list.add(Comment);
        CommentList.setTotal(5);
        CommentList.setCommentlist(list);

        return BaseResponseDTO.successInstance(CommentList);
    }
}
