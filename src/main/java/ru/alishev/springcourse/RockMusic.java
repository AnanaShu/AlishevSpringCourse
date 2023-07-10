package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockSongs = new ArrayList<>();
    {
        rockSongs.add("rock song 1");
        rockSongs.add("rock song 2");
        rockSongs.add("rock song 3");

    }


    @Override
    public List<String> getSongs() {
        return rockSongs;
    }
}
