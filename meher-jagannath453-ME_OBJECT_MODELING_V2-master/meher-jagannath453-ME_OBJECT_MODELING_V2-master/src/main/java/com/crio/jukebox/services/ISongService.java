package com.crio.jukebox.services;

public interface ISongService {
    public String playSong(String userId, String songToPlay);

    public String loadSong(String fileName);

}
