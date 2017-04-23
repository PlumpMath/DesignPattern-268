package com.foolchen.strategy;

import com.foolchen.strategy.model.Duck;
import com.foolchen.strategy.model.FlyRocketPowered;
import com.foolchen.strategy.model.MallardDuck;
import com.foolchen.strategy.model.ModelDuck;
import com.foolchen.strategy.model.Squeak;

/**
 * 策略模式测试类
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class MiniDuckSimulator {
  public static void main(String[] args) {
    // 定义一只野鸭
    Duck duck = new MallardDuck();
    // 野鸭依次执行行为
    perform(duck);
    System.out.println("*******************");
    // 定义一只模型鸭
    duck = new ModelDuck();
    // 模型鸭依次执行行为
    perform(duck);
    System.out.println("*******************");

    // 为模型鸭设置新的飞行方式和鸣叫方式
    duck.setFlyBehaviour(new FlyRocketPowered());
    duck.setQuackBehaviour(new Squeak());
    perform(duck);
  }

  private static void perform(Duck duck) {
    duck.display();
    duck.performFly();
    duck.quack();
  }
}
