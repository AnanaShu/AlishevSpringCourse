package ru.alishev.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    List<Music> genreList;

    @Bean
    public List<Music> action (){
        List<Music> result = new ArrayList<>();
        result.add(new ClassicalMusic());
        result.add(new RockMusic());
        result.add(new JazzMusic());
        return result;
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(action());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
