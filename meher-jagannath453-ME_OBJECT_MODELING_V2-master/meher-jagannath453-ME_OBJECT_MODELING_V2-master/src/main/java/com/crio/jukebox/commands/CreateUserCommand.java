package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.IUserService;

public class CreateUserCommand implements ICommand {

    private final IUserService userService;

    public CreateUserCommand(IUserService userService) {
        this.userService = userService;
    }

    // create(String userId, String playlistName, List<String> songId)
    // Tokens=["CREATE-USER" ,"Kiran"]
    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        if (tokens.get(0).equalsIgnoreCase("CREATE-USER")) {
            String user = userService.create(tokens.get(1));
            System.out.println(user);


        }

    }
}


