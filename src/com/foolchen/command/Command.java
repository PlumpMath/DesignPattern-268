package com.foolchen.command;

/**
 * 命令接口<p/>
 * 该接口仅包含一个{@link #execute()}方法,供实现
 *
 * @author chenchong. Created on 2017/3/19.
 */
public interface Command {
  void execute();
}
