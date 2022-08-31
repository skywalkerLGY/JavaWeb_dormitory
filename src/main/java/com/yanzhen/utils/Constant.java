package com.yanzhen.utils;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    //用户类型  依靠数字来实现权限
    public static Map<Integer,String> typeString = new HashMap<>();


    static {
        typeString.put(0,"管理员");
        typeString.put(1,"宿管员");
    }

}


