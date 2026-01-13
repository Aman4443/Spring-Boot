package com.in28min.spring.learn_spring_framework.game;

public class GameRunner {
private gamingConsole game;
	public GameRunner(gamingConsole game) {
		this.game = game;
	}
public void run() {
	game.up();
	game.down();
	game.left();
	game.right();
}
}
