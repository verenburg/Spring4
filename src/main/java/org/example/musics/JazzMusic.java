package org.example.musics;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music{
    private List<String> songs = new ArrayList<String>();

    {
        songs.add("Jazz composition 1");
        songs.add("What are wonderful world");
        songs.add("Jazz composition 2");
    }
    public List<String> getSongs() {
        return songs;
    }
}
