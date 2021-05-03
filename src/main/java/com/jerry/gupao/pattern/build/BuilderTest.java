package com.jerry.gupao.pattern.build;

/**
 * @AUTHOR hs
 * @DATE 2021/5/3 21:34
 */
public class BuilderTest {
    public static void main(String[] args) {
       TicketHelper helper = new TicketHelper();
       helper.buildAdult("成年人");
       helper.buildChildrenForSet("儿童有座");
       helper.buildChildrenNoSet("儿童无座");
       helper.buildElderly("老年人");
       helper.buildSodier("军人及其家属");
       TicketBuilder.builder(helper);

    }
}
