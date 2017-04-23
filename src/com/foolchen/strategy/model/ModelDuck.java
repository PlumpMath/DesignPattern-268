package com.foolchen.strategy.model;

/**
 * 模型鸭
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class ModelDuck extends Duck {
  public ModelDuck() {
    this.flyBehaviour = new FlyNoWay();// 模型鸭默认不会飞
    this.quackBehaviour = new MuteQuack();// 模型鸭默认不会叫
  }

  @Override public void display() {
    System.out.println("这是一只模型鸭");
  }
}
