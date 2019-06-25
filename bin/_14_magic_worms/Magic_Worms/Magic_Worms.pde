void setup () {
  size ( 700, 700) ;
  background (0, 255, 193);
}


void draw() {
  for( int i =0; i < 300; i++) {
  
    fill(255,0,48);
    ellipse(random(width),(random(height)),100,100);
    
    
  }
}
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
