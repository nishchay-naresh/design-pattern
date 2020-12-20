package com.nishchay.dp.behavioral.command;

public class Invoker {

	private ICommand command;

	public Invoker(ICommand command) {
		this.command = command;
	}

	public void execute() {
		this.command.execute();
	}
}