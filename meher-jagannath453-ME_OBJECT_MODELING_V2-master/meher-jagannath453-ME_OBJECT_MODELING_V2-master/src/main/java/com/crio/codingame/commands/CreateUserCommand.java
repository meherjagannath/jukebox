package com.crio.codingame.commands;

import java.util.List;

import com.crio.codingame.entities.User;
import com.crio.codingame.services.IUserService;

public class CreateUserCommand implements ICommand{

    private final IUserService userService;
    
    public CreateUserCommand(IUserService userService) {
        this.userService = userService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute create method of IUserService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["CREATE_QUESTION","Ross"]

    @Override
    public void execute(List<String> tokens) {
      // Extract the user name from the tokens list
    if (tokens.size() < 2) {
        // Handle the case where the user name is missing
        System.out.println("Error: Missing user name.");
        return;
    }

    String userName = tokens.get(1);

    // Create the user using the UserService
    User user = userService.create(userName);
    if(user == null){
        System.out.println("Failed to create user.");
    }
    // Print the newly created user to the console
    else System.out.println(user);

    }
    
}
