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
    private Triangle Ablock2;
    
    private Square AblockGoal;
    private Square AblockGoal2;
    
    
    
    private Circle SoccerBall;
    
    private Person Player;
    private Person Player2;
    
    private Square FieldDG;
    private Square FieldDG2;
    private Square FieldDG3;
    private Square FieldDG4;
    
    
    private Square FieldLG;
    private Square FieldLG2;
    private Square FieldLG3;
    private Square FieldLG4;
    
    private Square Field2;
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
        Ablock2= new Triangle();
        AblockGoal= new Square();
        AblockGoal2= new Square(); 
       
        
       SoccerBall= new Circle();
        
       Player= new Person();
       Player2= new Person();
       
       FieldDG= new Square();
       FieldDG2= new Square();
       FieldDG3= new Square();
       FieldDG4= new Square();
       
       FieldLG= new Square();
       FieldLG2= new Square();
       FieldLG3= new Square();
       FieldLG4= new Square();
        
        
        
        drawn = false;
    }

    /**
     * Draw this picture.FieldDG= new Square();
     */
    public void draw()
    {
        if(!drawn) {
            
            FieldDG.changeColor("green");
            FieldDG.moveHorizontal(-310);
            FieldDG.moveVertical(100);
            FieldDG.changeSize(80);
            FieldDG.makeVisible();
            
            FieldDG2.changeColor("green");
            FieldDG2.moveHorizontal(-310);
            FieldDG2.moveVertical(20);
            FieldDG2.changeSize(80);
            FieldDG2.makeVisible();
            
            FieldDG3.changeColor("green");
            FieldDG3.moveHorizontal(-310);
            FieldDG3.moveVertical(-60);
            FieldDG3.changeSize(80);
            FieldDG3.makeVisible();
            
            FieldDG4.changeColor("green");
            FieldDG4.moveHorizontal(-310);
            FieldDG4.moveVertical(-140);
            FieldDG4.changeSize(80);
            FieldDG4.makeVisible();
            
            FieldLG.changeColor("light green");
            FieldLG.moveHorizontal(-230);
            FieldLG.moveVertical(100);
            FieldLG.changeSize(80);
            FieldLG.makeVisible();
            
            FieldLG2.changeColor("light green");
            FieldLG2.moveHorizontal(-230);
            FieldLG2.moveVertical(20);
            FieldLG2.changeSize(80);
            FieldLG2.makeVisible();
            
            FieldLG3.changeColor("light green");
            FieldLG3.moveHorizontal(-230);
            FieldLG3.moveVertical(-60);
            FieldLG3.changeSize(80);
            FieldLG3.makeVisible();
            
            FieldLG4.changeColor("light green");
            FieldLG4.moveHorizontal(-230);
            FieldLG4.moveVertical(-140);
            FieldLG4.changeSize(80);
            FieldLG4.makeVisible();
          
          
          
          
          
            
            
            FblockOne.changeColor("black");
            FblockOne.moveHorizontal(-280);
            FblockOne.moveVertical(60);
            FblockOne.changeSize(40);
            FblockOne.makeVisible();
            
            FblockOne2.changeColor("black");
            FblockOne2.moveHorizontal(-280);
            FblockOne2.moveVertical(20);
            FblockOne2.changeSize(40);
            FblockOne2.makeVisible();
            
            FblockOne3.changeColor("black");
            FblockOne3.moveHorizontal(-280);
            FblockOne3.moveVertical(-20);
            FblockOne3.changeSize(40);
            FblockOne3.makeVisible();
            
            FblockOne4.changeColor("black");
            FblockOne4.moveHorizontal(-280);
            FblockOne4.moveVertical(-60);
            FblockOne4.changeSize(40);
            FblockOne4.makeVisible();
            
            FblockOne5.changeColor("black");
            FblockOne5.moveHorizontal(-240);
            FblockOne5.moveVertical(-60);
            FblockOne5.changeSize(40);
            FblockOne5.makeVisible();
            
            FblockOne6.changeColor("black");
            FblockOne6.moveHorizontal(-200);
            FblockOne6.moveVertical(-60);
            FblockOne6.changeSize(40);
            FblockOne6.makeVisible();
            
            FblockOne7.changeColor("black");
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
            
            
            FblockTwo.changeColor("black");
            FblockTwo.moveHorizontal(-100);
            FblockTwo.moveVertical(60);
            FblockTwo.changeSize(40);
            FblockTwo.makeVisible();
            
            FblockTwo2.changeColor("black");
            FblockTwo2.moveHorizontal(-100);
            FblockTwo2.moveVertical(20);
            FblockTwo2.changeSize(40);
            FblockTwo2.makeVisible();
            
            FblockTwo3.changeColor("black");
            FblockTwo3.moveHorizontal(-100);
            FblockTwo3.moveVertical(-20);
            FblockTwo3.changeSize(40);
            FblockTwo3.makeVisible();
            
            FblockTwo4.changeColor("black");
            FblockTwo4.moveHorizontal(-100);
            FblockTwo4.moveVertical(-60);
            FblockTwo4.changeSize(40);
            FblockTwo4.makeVisible();
            
            FblockTwo5.changeColor("black");
            FblockTwo5.moveHorizontal(-60);
            FblockTwo5.moveVertical(-60);
            FblockTwo5.changeSize(40);
            FblockTwo5.makeVisible();
            
            FblockTwo6.changeColor("black");
            FblockTwo6.moveHorizontal(-20);
            FblockTwo6.moveVertical(-60);
            FblockTwo6.changeSize(40);
            FblockTwo6.makeVisible();
            
            FblockTwo7.changeColor("black");
            FblockTwo7.moveHorizontal(-60);
            FblockTwo7.moveVertical(00);
            FblockTwo7.changeSize(40);
            FblockTwo7.makeVisible();
            
               
            Ablock.changeSize(140, 146);
            Ablock.moveHorizontal(160);
            Ablock.moveVertical(-60);
            Ablock.changeColor("black");
            Ablock.makeVisible();
            
            Ablock2.changeColor("white");
            Ablock2.changeSize(40,40);
            Ablock2.moveHorizontal(160);
            Ablock2.moveVertical(-10);
            Ablock2.makeVisible();
            
            AblockGoal.changeColor("white");
            AblockGoal.moveHorizontal(60);
            AblockGoal.moveVertical(80);
            AblockGoal.changeSize(20);
            AblockGoal.makeVisible();
            
            AblockGoal2.changeColor("white");
            AblockGoal2.moveHorizontal(40);
            AblockGoal2.moveVertical(80);
            AblockGoal2.changeSize(20);
            AblockGoal2.makeVisible();
            
            SoccerBall.changeColor("yellow");
            SoccerBall.moveHorizontal(-190);
            SoccerBall.moveVertical(160);
            SoccerBall.changeSize(20);
            SoccerBall.makeVisible();
            
            
            Player.changeColor("red");
            Player.moveHorizontal(200);
            Player.moveVertical(-100);
            Player.makeVisible();
            Player.slowMoveVertical(150);
            Player.slowMoveHorizontal(-88);

            
            Player2.changeColor("red");
            Player2.moveHorizontal(-280);
            Player2.moveVertical(-100);
            Player2.makeVisible();
            Player2.slowMoveVertical(150);
            Player2.slowMoveHorizontal(60);
            
            
            
            // player 2 passing the ball and 
            //player 1 shooting 
            SoccerBall.slowMoveHorizontal(320);
            Player.slowMoveVertical(-5);
            SoccerBall.slowMoveVertical(-50);
            
            // players running to eachother
            Player.slowMoveHorizontal(-180);
            Player2.slowMoveHorizontal(130);
            
            //players jumping
            Player.slowMoveVertical(10);
            Player2.slowMoveVertical(10);
            
            Player.slowMoveVertical(-10);
            Player2.slowMoveVertical(-10);
            
            
            Player.slowMoveVertical(10);
            Player2.slowMoveVertical(10);
            
            Player.slowMoveVertical(-10);
            Player2.slowMoveVertical(-10);
            
            Player.slowMoveVertical(10);
            Player2.slowMoveVertical(10);
            
            Player.slowMoveVertical(-10);
            Player2.slowMoveVertical(-10);
            
            
        
            
            
            
        
               
            
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
        Player.changeColor("Black");
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
        Player.changeColor("white");        
    }
}
