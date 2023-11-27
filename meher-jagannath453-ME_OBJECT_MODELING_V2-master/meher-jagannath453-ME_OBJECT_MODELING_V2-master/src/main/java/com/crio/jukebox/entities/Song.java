package com.crio.jukebox.entities;

public class Song extends BaseEntity {
    private final String songName;
    private final String genre;
    private final String artist;
    private final String albumName;
    private final String featuredArtists;


    public Song(Song song) {
        this(song.id, song.songName, song.genre, song.albumName, song.artist, song.featuredArtists);
    }

    public Song(String id, String songName, String genre, String albumName, String artist,
            String featuredArtists) {
        this(songName, genre, albumName, artist, featuredArtists);
        this.id = id;
    }

    public Song(String name, String genre, String albumName, String artist,
            String featuredArtists) {
        this.songName = name;
        this.genre = genre;
        this.albumName = albumName;
        this.artist = artist;
        this.featuredArtists = featuredArtists;
    }

    public String getSongName() {
        return songName;
    }

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getFeaturedArtists() {
        return featuredArtists;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((albumName == null) ? 0 : albumName.hashCode());
        result = prime * result + ((artist == null) ? 0 : artist.hashCode());
        result = prime * result + ((featuredArtists == null) ? 0 : featuredArtists.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((songName == null) ? 0 : songName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (albumName == null) {
            if (other.albumName != null)
                return false;
        } else if (!albumName.equals(other.albumName))
            return false;
        if (artist == null) {
            if (other.artist != null)
                return false;
        } else if (!artist.equals(other.artist))
            return false;
        if (featuredArtists == null) {
            if (other.featuredArtists != null)
                return false;
        } else if (!featuredArtists.equals(other.featuredArtists))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (songName == null) {
            if (other.songName != null)
                return false;
        } else if (!songName.equals(other.songName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Song [albumName=" + albumName + ", artist=" + artist + ", featuredArtists="
                + featuredArtists + ", genre=" + genre + ", songName=" + songName + "]";
    }



}
