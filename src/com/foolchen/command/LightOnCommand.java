package com.foolchen.command;

import com.foolchen.command.objects.Light;

/**
 * 开灯命令<p/>
 * 该类中需要包含一个{@link Light}对象,用于实际执行操作
 *
 * @author chenchong. Created on 2017/3/19.
 */
public class LightOnCommand implements Command {
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override public void execute() {
    // 此处执行点亮电灯的操作
    this.light.on();
  }
}
