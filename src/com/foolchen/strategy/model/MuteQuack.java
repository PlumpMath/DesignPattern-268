package com.foolchen.strategy.model;

/**
 * 鸣叫行为的实现<p/>
 * 实现了"不会鸣叫"
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class MuteQuack implements QuackBehaviour {
  @Override public void quack() {
    System.out.println("<<Silence>>");
  }
}
