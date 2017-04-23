package com.foolchen.command;

import com.foolchen.command.model.GarageDoor;
import com.foolchen.command.model.Light;

/**
 * 测试类,用于测试遥控器
 *
 * @author chenchong. Created on 2017/3/19.
 */
public class RemoteControlTest {

  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();

    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.buttonWasPressed();

    GarageDoor garageDoor = new GarageDoor();
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
    remote.setCommand(garageOpen);
    remote.setCommand(garageOpen);
    remote.buttonWasPressed();
  }
}
