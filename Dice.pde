Die dood;
void setup()
{
	noLoop();
	size(400,400);
}
void draw()
{
	background(0);
	int totes=0;
	for(int y=0; y<400; y+=50){
		for(int x=0; x<400; x+=50){	
			dood=new Die(x,y);
			dood.show();
			totes+=dood.integer;
}
}
fill(255,0,0);
textSize(20);
textAlign(CENTER,CENTER);
text(totes, 200,195);
}
void mousePressed()
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
	void roll()
	{
		integer=(int)(Math.random()*6)+1;
	}
	void show()
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
