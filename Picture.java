/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Oscar Pinto
 * @version 2016.02.29
 */
public class Picture
{
    private Square FblockOne;
    private Square FblockOne2;
    private Square FblockOne3;
    private Square FblockOne4;
    private Square FblockOne5;
    private Square FblockOne6;
    private Square FblockOne7;
    
    
    private Square Iblock;
    private Square Iblock2;
    private Square Iblock3;
    private Square Iblock4;
    
    private Square FblockTwo;
    private Square FblockTwo2;
    private Square FblockTwo3;
    private Square FblockTwo4;
    private Square FblockTwo5;
    private Square FblockTwo6;
    private Square FblockTwo7;
    
    
    private Triangle Ablock;
    private Circle SoccerBall;
    private Person Person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
         FblockOne = new Square();
         FblockOne2 = new Square();
         FblockOne3 = new Square();
         FblockOne4 = new Square();
         FblockOne5 = new Square();
         FblockOne6 = new Square();
         FblockOne7 = new Square();
        Square FblockOne8= new Square();
    
         Iblock= new Square();
         Iblock2= new Square();
         Iblock3= new Square();
         Iblock4= new Square();
        
        FblockTwo = new Square();
        FblockTwo2 = new Square();
        FblockTwo3 = new Square();
        FblockTwo4 = new Square();
        FblockTwo5 = new Square();
        FblockTwo6 = new Square();
        FblockTwo7 = new Square();
        
        Ablock= new Triangle();
        Triangle Ablock2= new Triangle();
        Triangle Ablock3= new Triangle();
        Triangle Ablock4= new Triangle();
        Triangle Ablock5= new Triangle();
        
       SoccerBall= new Circle();
        
        Person= new Person();
        
        
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            FblockOne.changeColor("red");
            FblockOne.moveHorizontal(-280);
            FblockOne.moveVertical(60);
            FblockOne.changeSize(40);
            FblockOne.makeVisible();
            
            FblockOne2.changeColor("red");
            FblockOne2.moveHorizontal(-280);
            FblockOne2.moveVertical(20);
            FblockOne2.changeSize(40);
            FblockOne2.makeVisible();
            
            FblockOne3.changeColor("red");
            FblockOne3.moveHorizontal(-280);
            FblockOne3.moveVertical(-20);
            FblockOne3.changeSize(40);
            FblockOne3.makeVisible();
            
            FblockOne4.changeColor("red");
            FblockOne4.moveHorizontal(-280);
            FblockOne4.moveVertical(-60);
            FblockOne4.changeSize(40);
            FblockOne4.makeVisible();
            
            FblockOne5.changeColor("red");
            FblockOne5.moveHorizontal(-240);
            FblockOne5.moveVertical(-60);
            FblockOne5.changeSize(40);
            FblockOne5.makeVisible();
            
            FblockOne6.changeColor("red");
            FblockOne6.moveHorizontal(-200);
            FblockOne6.moveVertical(-60);
            FblockOne6.changeSize(40);
            FblockOne6.makeVisible();
            
            FblockOne7.changeColor("red");
            FblockOne7.moveHorizontal(-240);
            FblockOne7.moveVertical(00);
            FblockOne7.changeSize(40);
            FblockOne7.makeVisible();
            
            Iblock.changeColor("black");
            Iblock.moveHorizontal(-150);
            Iblock.moveVertical(60);
            Iblock.changeSize(40);
            Iblock.makeVisible();
           
           
            Iblock2.changeColor("black");
            Iblock2.moveHorizontal(-150);
            Iblock2.moveVertical(20);
            Iblock2.changeSize(40);
            Iblock2.makeVisible();
            
            Iblock3.changeColor("black");
            Iblock3.moveHorizontal(-150);
            Iblock3.moveVertical(-20);
            Iblock3.changeSize(40);
            Iblock3.makeVisible();
            
            
            Iblock4.changeColor("black");
            Iblock4.moveHorizontal(-150);
            Iblock4.moveVertical(-60);
            Iblock4.changeSize(40);
            Iblock4.makeVisible();
            
            
            FblockTwo.changeColor("blue");
            FblockTwo.moveHorizontal(-100);
            FblockTwo.moveVertical(60);
            FblockTwo.changeSize(40);
            FblockTwo.makeVisible();
            
            FblockTwo2.changeColor("blue");
            FblockTwo2.moveHorizontal(-100);
            FblockTwo2.moveVertical(20);
            FblockTwo2.changeSize(40);
            FblockTwo2.makeVisible();
            
            FblockTwo3.changeColor("blue");
            FblockTwo3.moveHorizontal(-100);
            FblockTwo3.moveVertical(-20);
            FblockTwo3.changeSize(40);
            FblockTwo3.makeVisible();
            
            FblockTwo4.changeColor("blue");
            FblockTwo4.moveHorizontal(-100);
            FblockTwo4.moveVertical(-60);
            FblockTwo4.changeSize(40);
            FblockTwo4.makeVisible();
            
            FblockTwo5.changeColor("blue");
            FblockTwo5.moveHorizontal(-60);
            FblockTwo5.moveVertical(-60);
            FblockTwo5.changeSize(40);
            FblockTwo5.makeVisible();
            
            FblockTwo6.changeColor("blue");
            FblockTwo6.moveHorizontal(-20);
            FblockTwo6.moveVertical(-60);
            FblockTwo6.changeSize(40);
            FblockTwo6.makeVisible();
            
            FblockTwo7.changeColor("blue");
            FblockTwo7.moveHorizontal(-60);
            FblockTwo7.moveVertical(00);
            FblockTwo7.changeSize(40);
            FblockTwo7.makeVisible();
            
    
            Ablock.changeSize(60, 100);
            Ablock.moveHorizontal(150);
            Ablock.moveVertical(20);
            Ablock.makeVisible();
    
            SoccerBall.changeColor("yellow");
            SoccerBall.moveHorizontal(180);
            SoccerBall.moveVertical(20);
            SoccerBall.changeSize(30);
            SoccerBall.makeVisible();
            
            Person.changeColor("green");
            Person.moveHorizontal(400);
            Person.moveVertical(10);
            Person.makeVisible();
                        
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        FblockOne.changeColor("black");
        FblockTwo.changeColor("white");
        Iblock.changeColor("black");
        Ablock.changeColor("black");
        SoccerBall.changeColor("black");
        Person.changeColor("Black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        FblockOne.changeColor("red");
        FblockTwo.changeColor("black");
        Iblock.changeColor("green");
        Ablock.changeColor("yellow");
        SoccerBall.changeColor("blue");
        Person.changeColor("white");        
    }
}
