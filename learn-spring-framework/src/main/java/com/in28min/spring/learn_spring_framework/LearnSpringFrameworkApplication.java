package com.in28min.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28min.spring.learn_spring_framework.game.GameRunner;
import com.in28min.spring.learn_spring_framework.game.MarioGame;
import com.in28min.spring.learn_spring_framework.game.PacMan;
import com.in28min.spring.learn_spring_framework.game.SuperContraGame;
   
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		 //MarioGame game = new MarioGame();
		PacMan game = new PacMan();
		 // SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
