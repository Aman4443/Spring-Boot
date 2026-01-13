package com.in28min.spring.learn_spring_framework.game;

public class PacMan implements gamingConsole {
public void up() {
	System.out.println(" Pacman jump");
}
public void down() {
	System.out.println(" PacMan down into hole");
}
public void left() {
	System.out.println("PacMan stop");
}
public void right() {
	System.out.println("PacMan accelerate");
}
}
