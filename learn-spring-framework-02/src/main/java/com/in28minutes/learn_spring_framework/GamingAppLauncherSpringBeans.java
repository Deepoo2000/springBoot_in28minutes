package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
public class GamingAppLauncherSpringBeans {
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


    public static void main(String[] args) {

       try ( var context = new AnnotationConfigApplicationContext(GamingAppLauncherSpringBeans.class)){
           context.getBean(GamingConsole.class).up();
           context.getBean(GameRunner.class).run();
           context.getBean(MarioGame.class).up();
           context.getBean(SuperContraGame.class).up();
       }

    }
}
