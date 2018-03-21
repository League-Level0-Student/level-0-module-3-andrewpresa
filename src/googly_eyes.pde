void setup(){
  PImage face = loadImage("Pants.jpg");
  size(800,600);
  face.resize(width,height);
  background(face);
  
}

void draw(){
  if(mouseX<253){
    mouseX=253;}
  
  else if(mouseY<103){
    mouseY=103;}

 
  fill(255,255,255);
  ellipse(274,122,100,50);
  ellipse(361,117,100,50);
  fill(0,0,0);
  ellipse(mouseX ,mouseY ,30,30);
  ellipse(mouseX + 87,mouseY + 5,30,30);
  
  
  
if(mousePressed){
    println(mouseX+" "+mouseY);
  }
   
  }
  