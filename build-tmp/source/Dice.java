import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die dood;
public void setup()
{
	noLoop();
	size(400,400);
}
public void draw()
{
	background(0);
	for(int y=0; y<400; y+=50){
		for(int x=0; x<400; x+=50){	
			dood=new Die(x,y);
			dood.show();
}
}
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int integer, myX, myY;
	Die(int x, int y) //constructor
	{
		myY=y;
		myX=x;
		roll();
	}
	public void roll()
	{
		integer=(int)(Math.random()*6)+1;
	}
	public void show()
	{
		fill(255, 255, 255);
		rect(myX+5, myY+5,40,40);
		fill(0);
		if(integer==1)
		{
	    	ellipse(myX + 50/2, myY + 50/2, 5, 5);
		}
		if(integer==2)
		{
	   		ellipse(myX + 25/2, myY + 25/2, 5, 5);
			ellipse(myX + 75/2, myY + 75/2, 5, 5);
		}
		if(integer==3)
		{
		    ellipse(myX + 25/2, myY + 25/2, 5, 5);
			ellipse(myX + 50/2, myY + 50/2, 5, 5);
			ellipse(myX + 75/2, myY + 75/2, 5, 5);
		}
		if(integer==4)
		{
			ellipse(myX + 25/2, myY + 25/2, 5, 5);
			ellipse(myX + 25/2, myY + 75/2, 5, 5);
			ellipse(myX + 75/2, myY + 25/2, 5, 5);
			ellipse(myX + 75/2, myY + 75/2, 5, 5);
		}
		if(integer==5)
		{
		    ellipse(myX + 25/2, myY + 25/2, 5, 5);
			ellipse(myX + 25/2, myY + 75/2, 5, 5);
			ellipse(myX + 75/2, myY + 25/2,5,5);
			ellipse(myX + 75/2, myY + 75/2,5,5);
			ellipse(myX + 50/2, myY + 50/2,5,5);
		}
		if(integer==6){
		    ellipse(myX + 25/2, myY + 25/2,5,5);
			ellipse(myX + 25/2, myY + 75/2,5,5);
			ellipse(myX + 75/2, myY + 25/2,5,5);
			ellipse(myX + 75/2, myY + 75/2,5,5);
			ellipse(myX + 25/2, myY + 50/2,5,5);
			ellipse(myX + 75/2, myY + 50/2,5,5);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
