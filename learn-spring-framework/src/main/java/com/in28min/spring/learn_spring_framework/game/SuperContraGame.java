package com.in28min.spring.learn_spring_framework.game;

public class SuperContraGame  implements gamingConsole{
public void up() {
	System.out.println(" SuperContraGame jump");
}
public void down() {
	System.out.println("SuperContraGame down into hole");
}
public void left() {
	System.out.println("SuperContraGame stop");
}
public void right() {
	System.out.println("SuperContraGame accelerate");
}
}
