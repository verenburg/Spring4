package org.example;

import org.example.devises.Computer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicPlayerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        //RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        //ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        /*List<Music> playList = new ArrayList<Music>();
        playList.add(rockMusic);
        playList.add(classicalMusic);*/

        Computer computer1 = context.getBean("computer", Computer.class );

        System.out.println(computer1.getPlayer().getName());
        System.out.println(computer1.getPlayer().getVolume());
        System.out.println(computer1.getPlayer().playMusic());
        Computer computer2 = context.getBean("computer", Computer.class );
        System.out.println(computer2 == computer1);


        context.close();

    }

}
