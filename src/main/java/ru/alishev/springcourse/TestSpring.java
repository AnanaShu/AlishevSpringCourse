package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //этот класс обращается к файлу applicationContext.xml, считывает его и помещает все бины,
        //которые там описаны в ApplicationContext

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compare = musicPlayer == musicPlayer2;
        System.out.println(compare);
        musicPlayer.setVolume(45);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());

        context.close();
    }

}
