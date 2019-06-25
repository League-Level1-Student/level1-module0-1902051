 import ddf.minim.*;   
 Minim minim;        
  AudioPlayer song;  
 PImage pictureOfRecord; 
 int angle = 1000;
void setup() { 
  minim = new Minim(this);    //in the setup method     
 song = minim.loadFile("args.wav", 512); 
  size(600,600);                               
        pictureOfRecord= loadImage("record.png");     
       pictureOfRecord.resize(400,400);

}


void draw() {
background (255,0,0);
  
  
  if (mousePressed) {
  rotateImage(pictureOfRecord, angle);
  angle++;
song.play();
  song.pause();

}
  
  
  image(pictureOfRecord,100,100);  


}



void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-width/2, -height/2);
    }
