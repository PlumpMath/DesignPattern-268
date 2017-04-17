package com.foolchen.command;

/**
 * 简单的控制器,带有插槽,可以控制设备
 *
 * @author chenchong. Created on 2017/3/19.
 */
public class SimpleRemoteControl {

  Command slot;

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    this.slot = command;
  }

  public void buttonWasPressed() {
    this.slot.execute();
  }
}
