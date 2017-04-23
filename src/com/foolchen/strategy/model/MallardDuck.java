package com.foolchen.strategy.model;

/**
 * 野鸭
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
    this.flyBehaviour = new FlyWithWings();// 野鸭默认会使用翅膀进行飞行
    this.quackBehaviour = new Quack();// 野鸭默认会叫
  }

  @Override public void display() {
    System.out.println("这是一只野鸭！");
  }
}
