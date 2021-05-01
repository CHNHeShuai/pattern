package com.jerry.gupao.pattern.delegate;

import java.util.HashMap;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 22:07
 */
public class HrGirls implements Boss {
    HashMap<String, Boss> target = new HashMap<>();
    public HrGirls() {
        target.put("写PPT文案", new ZhangSan());
        target.put("宣传策划", new LiSi());
        target.put("布置会场", new WangWu());
        target.put("物资采购", new ZhaoLiu());
    }
    @Override
    public void workAllot(String workName) {
        target.get(workName).workAllot(workName);
    }
}
