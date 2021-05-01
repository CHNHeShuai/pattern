package com.jerry.gupao.pattern.adapter;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:27
 */
public class LoginAdapterTest {
    public static void main(String[] args) {
        Login login = new Login();
        boolean qq = login.qqLogin("qq");
        System.out.println(qq);
    }
}
