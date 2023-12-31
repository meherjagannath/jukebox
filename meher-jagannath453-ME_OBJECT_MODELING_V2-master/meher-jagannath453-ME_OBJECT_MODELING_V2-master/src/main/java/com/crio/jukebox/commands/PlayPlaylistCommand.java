package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.IPlaylistService;

public class PlayPlaylistCommand implements ICommand {

    private final IPlaylistService playlistService;

    public PlayPlaylistCommand(IPlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    // playPlaylist(String userId, String playlistId)
    // tokens = PLAY-PLAYLIST 1 1
    @Override
    public void execute(List<String> tokens) {
        if (tokens.get(0).equalsIgnoreCase("PLAY-PLAYLIST")) {
            String playPlaylist = playlistService.playPlaylist(tokens.get(1), tokens.get(2));
            System.out.println(playPlaylist);


        }
    }
}
