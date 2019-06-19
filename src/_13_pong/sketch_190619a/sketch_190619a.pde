import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup() {
  size (700, 700);

  minim = new Minim (this);
  sound = minim.loadSample("bonk.wav", 128);
}


int ballX = 100;
int ballY = 200;
int speedX = 9;
int speedY = 11;




void draw () {
  background(214, 15, 255);
  fill(250, 255, 3);
  stroke(214, 15, 255);
  ellipse(ballX, ballY, 70, 70);
  ballX+= speedX;
  ballY+= speedY;

  if (ballX > width) {
    speedX=-speedX; 
    sound.trigger();
  }
  if (ballX<0) {
    speedX =-speedX;
    sound.trigger();
  }


  if (ballY > height) {
    speedY=-speedY;
    sound.trigger();
  }
  if (ballY<0) {
    speedY =-speedY;


    sound.trigger();
  }
  rect(mouseX, 600, 200, 50);



  if (intersects(ballX, ballY, mouseX, 600, 200)) {
     speedY =-speedY;
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else
    return false;
}
