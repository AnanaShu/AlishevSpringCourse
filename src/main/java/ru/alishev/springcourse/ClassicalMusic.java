package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("classical song 1");
        classicalMusicList.add("classical song 2");
        classicalMusicList.add("classical song 3");
    }



    @Override
    public List<String> getSongs() {

        return classicalMusicList;
    }

}


