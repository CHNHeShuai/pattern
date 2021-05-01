package com.jerry.gupao.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:19
 */
public class UserCache {

    private static Map<String,String> map = new HashMap<>();

    public static void register(String username,String password){
        map.put(username,password);
    }

    public static String getPwd(String username){
        return map.get(username);
    }

}
