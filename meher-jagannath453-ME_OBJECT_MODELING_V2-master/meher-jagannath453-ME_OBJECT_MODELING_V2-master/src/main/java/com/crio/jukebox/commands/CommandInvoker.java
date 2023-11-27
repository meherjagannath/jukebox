package com.crio.jukebox.commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CommandInvoker {
    public static final Map<String, ICommand> commandMap = new HashMap<>();

    // register the command into hashmap
    public void register(String commandName, ICommand command) {
        commandMap.put(commandName, command);
    }


    // execute the register command
    public void executeCommand(String commandName, List<String> tokens)
            throws NoSuchElementException {
        ICommand command = getCommand(commandName);
        if (command == null) {
            throw new NoSuchElementException();

        }
        command.execute(tokens);

    }

    // get the registered command
    private ICommand getCommand(String commandName) {
        return commandMap.get(commandName);
    }



}
