package com.foolchen.strategy.model;

/**
 * 不会飞行<p/>
 * {@link FlyBehaviour}的实现，实现了"不会飞行"行为
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class FlyNoWay implements FlyBehaviour {
  @Override public void fly() {
    System.out.println("我不会飞！");
  }
}
