package com.tianbiaoge.example.fanruidemo.util;

import com.tianbiaoge.example.fanruidemo.constant.ExceptionConstant;
import com.tianbiaoge.example.fanruidemo.domain.Result;

/**
 * @Describe 结果集工具类
 * @Author lc
 * @CreateTime 2017/11/23
 */
public class ResultUtil {

    /**
     * @param object 数据
     * @return
     * @Describe 带数据的成功返回方法
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ExceptionConstant.SUCCESS_CODE);
        result.setMsg(ExceptionConstant.SUCCESS);
        result.setData(object);
        return result;
    }

    /**
     * @return
     * @Describe 不带数据的成功返回方法
     */
    public static Result success() {
        return success(null);
    }

    /**
     * @param code 错误码
     * @param msg  错误描述
     * @return
     * @Describe 不带数据的错误返回方法
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * @param code   错误码
     * @param msg    错误描述
     * @param object 错误数据
     * @return
     * @Describe 带数据的错误返回方法
     */
    public static Result error(Integer code, String msg, Object object) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }
}


