package com.design.patterns.command.history;

import java.util.ArrayDeque;
import java.util.Deque;

import com.design.patterns.command.Command;

public class CommandHistory {
		
	private Deque<Command> stack = new ArrayDeque<Command>();	
}
