package com.foolchen.command.objects;

/**
 * 车库门<p/>
 * 定义了车库门的各种行为
 *
 * @author chenchong. Created on 2017/3/19.
 */
public class GarageDoor {
  /** 开门(升起) */
  public void up() {
    System.out.println("车库门升起");
  }

  /** 关门(降下) */
  public void down() {
    System.out.println("车库门降下");
  }

  /** 停止 */
  public void stop() {
    System.out.println("车库门停止");
  }
}
