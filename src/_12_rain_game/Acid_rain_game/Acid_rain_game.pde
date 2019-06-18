int randomNumber;
void setup() {
  size (1000,1000);
  
}


void draw() {
  background(255, 64,72);
 fill(0,255,2);
  stroke(0,255,13);
  ellipse(randomNumber,y,100,150);
y+=100;
if (y > 1000){
   y=0;
randomNumber = (int) random(width); 
 }
}
int y = 79;
 
  
