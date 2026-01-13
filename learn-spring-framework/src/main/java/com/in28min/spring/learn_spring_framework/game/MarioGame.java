package com.in28min.spring.learn_spring_framework.game;

public class MarioGame implements gamingConsole {
public void up() {
	System.out.println("jump");
}
public void down() {
	System.out.println("down into hole");
}
public void left() {
	System.out.println("stop");
}
public void right() {
	System.out.println("accelerate");
}
}
