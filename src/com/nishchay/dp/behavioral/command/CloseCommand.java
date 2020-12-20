package com.nishchay.dp.behavioral.command;

public class CloseCommand implements ICommand {

  private IReceiver receiver;

  public CloseCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    this.receiver.closeFile();
  }

}