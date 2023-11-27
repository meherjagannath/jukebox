package com.crio.jukebox.commands;

import java.util.List;
import com.crio.jukebox.services.ISongService;

public class PlaySongCommand implements ICommand {


    private final ISongService songService;

    public PlaySongCommand(ISongService songService) {
        this.songService = songService;
    }

    // playSong(String userId,String songToPlay)
    // tokens = PLAY-SONG 1 5
    // PLAY-SONG 1 NEXT
    // PLAY-SONG 1 NEXT
    // PLAY-SONG 1 BACK
    // PLAY-SONG 1 BACK
    // PLAY-SONG 1 19

    @Override
    public void execute(List<String> tokens) {
        if (tokens.get(0).equalsIgnoreCase("PLAY-SONG")) {
            String playSong = songService.playSong(tokens.get(1), tokens.get(2));
            System.out.println(playSong);


        }

    }

}
