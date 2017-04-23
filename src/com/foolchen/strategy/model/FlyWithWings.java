package com.foolchen.strategy.model;

/**
 * 使用翅膀进行飞行<p/>
 * {@link FlyBehaviour}的实现类，实现了使用翅膀进行飞行
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class FlyWithWings implements FlyBehaviour {

  @Override public void fly() {
    System.out.println("使用翅膀飞行！");
  }
}
