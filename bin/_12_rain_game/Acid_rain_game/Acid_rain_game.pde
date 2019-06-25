int randomNumber;
void setup() {
  size (1000,900);
  
}


void draw() {
  background(255, 64,72);
 fill(0,255,2);
  stroke(0,255,13);
  ellipse(randomNumber,y,100,150);
y+=1000;
if (y > 900){
   y=0;
   checkCatch (randomNumber);
randomNumber = (int) random(width); 
 }
 fill(60,168,206); {
 rect(mouseX, 800, 150,50);
}
 fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20); 
}
int y = 79;
 int score = 0; 
  void checkCatch(int x){
         if (x > mouseX && x < mouseX+100){
            score++;
         }
     else if (score > 0) {
            score-=0; 
         }
        println("Your score is now: " + score);
 
         }
