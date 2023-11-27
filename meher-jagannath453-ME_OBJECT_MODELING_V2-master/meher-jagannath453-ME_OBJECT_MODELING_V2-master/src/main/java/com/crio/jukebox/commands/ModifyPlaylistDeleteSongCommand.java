package com.crio.jukebox.commands;

import java.util.ArrayList;
import java.util.List;
import com.crio.jukebox.services.IPlaylistService;

public class ModifyPlaylistDeleteSongCommand implements ICommand {

    private final IPlaylistService playlistService;

    public ModifyPlaylistDeleteSongCommand(IPlaylistService playlistService) {
        this.playlistService = playlistService;

    }

    // modifyPlaylist(String message, String userId, String playlistId, List<String> songId)
    // tokens = MODIFY-PLAYLIST DELETE-SONG 1 1 3 4
    @Override
    public void execute(List<String> tokens) {
        if (tokens.get(0).equalsIgnoreCase("DELETE-SONG")) {
            int tokensSize = tokens.size();
            List<String> songIds = new ArrayList<>();
            for (int i = 4; i < tokensSize; i++) {
                songIds.add(tokens.get(i));

            }
            String deleteSongFromPlaylist = playlistService.modifyPlaylist(tokens.get(1),
                    tokens.get(2), tokens.get(3), songIds);
            System.out.println(deleteSongFromPlaylist);

        }

    }



}
