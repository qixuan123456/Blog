package com.qxx.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Xuan
 * Date: 2021/11/4
 * Time: 10:08
 */
@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;


    public static Result succ(Object object){
        return succ(200,"操作成功",object);
    }

    public static Result succ(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg){
        return fail(400,msg,null);
    }

    public static Result fail(String msg,Object data){
        return fail(400,msg,data);
    }

    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
