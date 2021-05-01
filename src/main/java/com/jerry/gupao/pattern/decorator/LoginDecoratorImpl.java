package com.jerry.gupao.pattern.decorator;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:53
 */
public class LoginDecoratorImpl extends LoginDecorator {

    public LoginDecoratorImpl(LoginService loginService) {
        super(loginService);
    }

    @Override
    public boolean qqLogin(String qq) {
        return loginService.login(qq,qq);
    }

    @Override
    public boolean wechatLogin(String wechat) {
        return false;
    }


}
