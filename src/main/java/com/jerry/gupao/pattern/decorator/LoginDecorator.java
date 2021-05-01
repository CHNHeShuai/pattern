package com.jerry.gupao.pattern.decorator;


/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:46
 */
public abstract class LoginDecorator implements LoginService {

    protected LoginService loginService;
    public LoginDecorator(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public boolean login(String username, String password) {
        return loginService.login(username,password);
    }

    @Override
    public boolean register(String username, String password) {
        return loginService.register(username,password);
    }

    /**
     * QQ登陆
     * @param qq
     * @return
     */
    public abstract boolean qqLogin(String qq);

    /**
     * QQ登陆
     * @param wechat
     * @return
     */
    public abstract boolean wechatLogin(String wechat);

}
