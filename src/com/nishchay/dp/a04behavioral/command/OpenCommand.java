package com.nishchay.dp.a04behavioral.command;

public class OpenCommand implements ICommand {

  private IReceiver receiver;

  public OpenCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    this.receiver.openFile();
  }

}