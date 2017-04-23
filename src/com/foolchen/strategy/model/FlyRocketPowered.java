package com.foolchen.strategy.model;

/**
 * 使用火箭动力进行飞行<p/>
 * {@link FlyBehaviour}的实现类，针对部分无法使用翅膀飞行的情况定义了使用火箭动力进行飞行
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class FlyRocketPowered implements FlyBehaviour {
  @Override public void fly() {
    System.out.println("使用火箭进行飞行！");
  }
}
