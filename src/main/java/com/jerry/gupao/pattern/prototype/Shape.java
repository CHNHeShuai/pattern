package com.jerry.gupao.pattern.prototype;

/**
 * 形状
 * @AUTHOR hs
 * @DATE 2021/4/25 21:00
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    public String getId() {
        return id;
    }

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    /**
     * 浅拷贝
     */
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


}
