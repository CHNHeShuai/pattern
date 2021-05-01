package com.jerry.gupao.pattern.adapter;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:14
 */
public class Login extends LoginAdapter {


    @Override
    public boolean login(String username, String password) {
        if(UserCache.getPwd(username).equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean register(String username, String password) {
        UserCache.register(username,password);
        return this.login(username,password);
    }


    /**
     * QQ登陆
     * @param qq
     * @return
     */
    public boolean qqLogin(String qq){
        if(UserCache.getPwd(qq) == null){
            UserCache.register(qq,qq);
        }
        return this.login(qq,qq);
    }

    /**
     * QQ登陆
     * @param wechat
     * @return
     */
    public boolean wechatLogin(String wechat){
        if(UserCache.getPwd(wechat) == null){
            UserCache.register(wechat,wechat);
        }
        return this.login(wechat,wechat);
    }



}
