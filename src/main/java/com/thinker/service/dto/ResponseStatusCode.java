package com.thinker.service.dto;

public enum ResponseStatusCode {
    /**
     * 操作成功
     */
    OPERATION_SUCCESS("success", "");

    /**
     * 返回状态码
     */
    private String code;

    /**
     * 返回状态信息
     */
    private String msg;

    ResponseStatusCode(String statusCode, String statusMsg) {
        this.code = statusCode;
        this.msg = statusMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseStatusCode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
