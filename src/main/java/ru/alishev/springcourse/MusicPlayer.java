package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<Music> genreList = new ArrayList<>();


    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        Random random = new Random();
       return genreList.get(random.nextInt(genreList.size())).getSong();
    }
}
