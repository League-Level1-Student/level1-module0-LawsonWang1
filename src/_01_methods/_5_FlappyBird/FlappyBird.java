package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage bird;
    int birdX = 0;
    float birdY = 200f;
    int upperY = 0;
    int lowerY = 320;
    float birdYVelocity = -1;
    float gravity = 0.15f;
    float pipeX = 400f;
    int pipeGap = 120;
    int upperPipeHeight = 200;
    int pipeWidth = 50;
    int lowerPipeTop = 280; 
    
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
        if (birdY > 0) {
    	background(126, 219, 222);
        image(bird,birdX,birdY);
        birdYVelocity += gravity;
        birdY += birdYVelocity;
        fill(0,255,0);
        rect(pipeX,upperY,pipeWidth,upperPipeHeight);
        rect(pipeX,lowerY,pipeWidth,lowerPipeTop);
        pipeX -=1.5f;
        }
        if (pipeX < 0) {
        teleportPipes();
        }
    }

    public void mousePressed() { 
    	birdYVelocity= -2.5f;
    }
    
    public void teleportPipes() {
    	pipeX = 400f;
    	upperPipeHeight = (int) random(50, 300);
    	lowerPipeTop = HEIGHT - (upperPipeHeight + pipeGap);
    	lowerY = HEIGHT - lowerPipeTop;
    	
    }
    
    boolean intersectsPipes() { 
        if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
           return true; }
       else if (birdY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
}

  
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
