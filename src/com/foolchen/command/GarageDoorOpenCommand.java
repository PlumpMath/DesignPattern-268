package com.foolchen.command;

import com.foolchen.command.objects.GarageDoor;

/**
 * 打开车库门的命令
 *
 * @author chenchong. Created on 2017/3/19.
 */
public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override public void execute() {
    this.garageDoor.up();
  }
}
