package org.example.devises;

import org.example.musics.Music;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;



public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {

        Random rnd = new Random();
        int randomNum = rnd.nextInt(musicList.size());
        Music music = musicList.get(randomNum);

        Random rnd2 = new Random();
        int randomNum2 = rnd2.nextInt(music.getSongs().size());

        return "Playing: " + music.getSongs().get(randomNum2) + " with volume " + getVolume();
    }
}
