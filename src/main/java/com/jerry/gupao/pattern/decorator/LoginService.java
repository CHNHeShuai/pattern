package com.jerry.gupao.pattern.decorator;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:44
 */
public interface LoginService {

    boolean login(String username,String password);

    boolean register(String username,String password);
}
