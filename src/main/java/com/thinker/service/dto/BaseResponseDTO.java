package com.thinker.service.dto;

import java.io.Serializable;
import java.util.HashMap;

public class BaseResponseDTO<T> implements Serializable{
    /**
     * 状态
     */
    private String code = ResponseStatusCode.OPERATION_SUCCESS.getCode();

    /**
     * 错误信息 返回错误时必填
     */
    private String message = ResponseStatusCode.OPERATION_SUCCESS.getMsg();

    /**
     * 数据
     */
    private T data;

    public String getMessage() {
        return message;
    }

    public BaseResponseDTO setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public BaseResponseDTO setData(T data) {
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BaseResponseDTO setStatusCode(ResponseStatusCode statusCode) {
        this.setCode(statusCode.getCode());
        this.setMessage(statusCode.getMsg());
        return this;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "statusCode=" + code +
                ", statusMsg='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * @param data
     * @return BaseResponse
     * @description 成功结果的的快速生成
     */
    public static <T> BaseResponseDTO successInstance(T data) {
        BaseResponseDTO<T> response = new BaseResponseDTO<>();
        response.setStatusCode(ResponseStatusCode.OPERATION_SUCCESS);
        return response.setData(data);
    }

    /**
     * @param msg
     * @return BaseResponse
     * @description 成功结果的的快速生成
     */
    public static BaseResponseDTO successInstance(String msg) {
        BaseResponseDTO response = new BaseResponseDTO();
        response.setStatusCode(ResponseStatusCode.OPERATION_SUCCESS);
        response.setMessage(msg);
        return response;
    }

    /**
     * @return BaseResponse
     * @description 成功结果的的快速生成
     */
    public static BaseResponseDTO successInstance() {
        BaseResponseDTO response = new BaseResponseDTO();
        response.setStatusCode(ResponseStatusCode.OPERATION_SUCCESS);
        response.setData(new HashMap<>());
        return response;
    }

}
