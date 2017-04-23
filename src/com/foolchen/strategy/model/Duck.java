package com.foolchen.strategy.model;

/**
 * 抽象类<p/>
 * 定义了鸭子拥有的基本行为
 *
 * @author chenchong. Created on 2017/4/23.
 */
public abstract class Duck {
  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  /** 改变飞行策略的方法，用于动态设置新的飞行策略 */
  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  /** 设置鸣叫策略的方法，用于动态设置新的鸣叫策略 */
  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public abstract void display();

  /** 执行飞行行为，具体的飞行委托给{@link FlyBehaviour}实现 */
  public void performFly() {
    this.flyBehaviour.fly();
  }

  /** 执行鸣叫行为，具体的鸣叫委托给{@link QuackBehaviour}实现 */
  public void quack() {
    this.quackBehaviour.quack();
  }

  /** 执行游泳，所有的鸭子都会游泳（包括橡皮鸭子和诱饵鸭），所以不需要委托给其他类进行处理 */
  public void swim() {
    System.out.println("所有的鸭子都会游泳！");
  }
}
