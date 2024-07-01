package cn.jiyun.config;

import lombok.Data;

@Data
public class R<T> {

    private Integer code; //返回结果编码 1 代表成功 0 代表失败
    private String msg; //返回信息
    private T data;  //返回数据

    public static <T>R<T> success(T data){
        R<T> t = new R<>();
        t.code = 1;
        t.data = data;
        return t;
    }

    public static R error(String msg){
        R t = new R();
        t.code=0;
        t.msg = msg;
        return t;

    }



}
