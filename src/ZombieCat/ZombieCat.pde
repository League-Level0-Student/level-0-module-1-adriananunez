void setup(){
 size(1000, 1000);

  
  
}
void draw(){
  PImage face = loadImage("cat.jpg");
image(face, 42, 52);
face.resize(112,102);
fill(mouseX,mouseY,216);
ellipse(300, 200, 150, 150);
if(mousePressed){
  println(mouseX+" "+mouseY);
}
ellipse(490,202,150,150);
fill(255,0,0);
ellipse(300,200,50,42);
ellipse(490,202,50,42);






  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}