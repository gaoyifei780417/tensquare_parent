package entity;

import java.io.Serializable;

/**
 * @User 数据的公共接口的数据访问模型
 * @ClassName Result  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 13:20  时间
 * @Version 1.0 版本
 */
public class Result<T> implements Serializable {
    private boolean flag;// 是否成功
    private Integer code;// 返回码
    private String message;// 返回信息
    private Object data;// 返回数据

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    /**
     * 增删改的时候使用的构造器
     * @param flag
     * @param code
     * @param message
     */
    public Result(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, Object data) {
        super();
        this.flag = flag;
        this.code = code;
        this.data = data;
    }
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
