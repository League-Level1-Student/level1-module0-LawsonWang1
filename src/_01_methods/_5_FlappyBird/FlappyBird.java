package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage bird;
    int x = 0;
    int y = 200;
    int birdYVelocity = -10;
    int gravity = 1;
    int pipeX = 400;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	bird = loadImage("bird.png");
        bird.resize(100,100);
    }

    @Override
    public void draw() {
        background(126, 219, 222);
        image(bird,x,y);
        
    }

    public void mousePressed() {
    	birdYVelocity = 0;
    	fill(0,255,0);
    	rect(pipeX,400,50,200);
    	pipeX -= 10;
    }
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
