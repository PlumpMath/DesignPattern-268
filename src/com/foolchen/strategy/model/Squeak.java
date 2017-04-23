package com.foolchen.strategy.model;

/**
 * 鸣叫行为的实现<p/>
 * 实现了"吱吱叫"
 *
 * @author chenchong. Created on 2017/4/23.
 */
public class Squeak implements QuackBehaviour {
  @Override public void quack() {
    System.out.println("Squeak");
  }
}
