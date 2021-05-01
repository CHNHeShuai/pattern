package com.jerry.gupao.pattern.adapter;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:11
 */
public abstract class LoginAdapter {

    public abstract boolean login(String username,String password);

    public abstract boolean register(String username,String password);

}
