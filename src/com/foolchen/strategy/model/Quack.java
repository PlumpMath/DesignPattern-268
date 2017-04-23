package com.foolchen.strategy.model;

/**
 * 鸣叫行为的实现
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class Quack implements QuackBehaviour {
  @Override public void quack() {
    System.out.println("Quack");
  }
}
