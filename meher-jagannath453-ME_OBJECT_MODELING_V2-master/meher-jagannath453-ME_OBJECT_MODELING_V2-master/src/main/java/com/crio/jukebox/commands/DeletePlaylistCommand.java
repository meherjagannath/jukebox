package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.IPlaylistService;

public class DeletePlaylistCommand implements ICommand {

    private final IPlaylistService playlistService;

    public DeletePlaylistCommand(IPlaylistService playlistService) {
        this.playlistService = playlistService;

    }

    // deleteplaylist(userid, playlistd)
    // token = [DELETE-PLAYLIST 1 2]
    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        if (tokens.get(0).equalsIgnoreCase("DELETE-PLAYLIST")) {
            String deletedPlaylist = playlistService.delete(tokens.get(1), tokens.get(2));
            System.out.println(deletedPlaylist);


        }


    }
}
