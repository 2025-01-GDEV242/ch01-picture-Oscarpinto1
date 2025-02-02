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
    private Person Player3;
    private Person Player4;
    
    private Square FieldDG;
    private Square FieldDG2;
    private Square FieldDG3;
    private Square FieldDG4;
    
    
    private Square FieldLG;
    private Square FieldLG2;
    private Square FieldLG3;
    private Square FieldLG4;
    
     private Square FieldDG5;
    private Square FieldDG6;
    private Square FieldDG7;
    private Square FieldDG8;
    
    private Square FieldLG5;
    private Square FieldLG6;
    private Square FieldLG7;
    private Square FieldLG8;
    
    private Square FieldDG9;
    private Square FieldDG10;
    private Square FieldDG11;
    private Square FieldDG12;

    
    private Square FieldLG9;
    private Square FieldLG10;
    private Square FieldLG11;
    private Square FieldLG12;
    
    
    // bottom strip
    private Square FieldStrip;
    private Square FieldStrip2;
    private Square FieldStrip3;
    private Square FieldStrip4;
    private Square FieldStrip5;
    private Square FieldStrip6;
    
    // top strip
    private Square FieldStrip7;
    private Square FieldStrip8;
    private Square FieldStrip9;
    private Square FieldStrip10;
    private Square FieldStrip11;
    private Square FieldStrip12;
    
    // side strip
    private Square FieldStrip13;
    private Square FieldStrip14;
    private Square FieldStrip15;
    private Square FieldStrip16;
    
    //mid strip
    private Square FieldStrip17;
    private Square FieldStrip18;
    private Square FieldStrip19;
    private Square FieldStrip20;
    
    
    private Square FieldStrip21;
    private Square FieldStrip22;
    private Square FieldStrip23;
    private Square FieldStrip24;
    
    private Square FieldStrip25;
    private Square FieldStrip26;
    private Square FieldStrip27;
    private Square FieldStrip28;
    
    private Circle FieldCenterCircle1;
    private Circle FieldCenterCircle2;
    
    
    

    
    
    
    

    
    
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
       Player3= new Person();
       Player4= new Person();
       
       FieldDG= new Square();
       FieldDG2= new Square();
       FieldDG3= new Square();
       FieldDG4= new Square();
       
       FieldLG= new Square();
       FieldLG2= new Square();
       FieldLG3= new Square();
       FieldLG4= new Square();
       
       FieldDG5= new Square();
       FieldDG6= new Square();
       FieldDG7= new Square();
       FieldDG8= new Square();
       
       FieldLG5= new Square();
       FieldLG6= new Square();
       FieldLG7= new Square();
       FieldLG8= new Square();
       
       FieldDG9= new Square();
       FieldDG10= new Square();
       FieldDG11= new Square();
       FieldDG12= new Square();
       
       FieldLG9= new Square();
       FieldLG10= new Square();
       FieldLG11= new Square();
       FieldLG12= new Square();
       
       
       
       
      FieldStrip= new Square();
      FieldStrip2=new Square();
      FieldStrip3=new Square ();
      FieldStrip4= new Square();
      FieldStrip5= new Square();
      FieldStrip6=new Square();
      
      FieldStrip7= new Square();
      FieldStrip8= new Square();
      FieldStrip9= new Square();
      FieldStrip10= new Square();
      FieldStrip11= new Square();
      FieldStrip12= new Square();
      
      FieldStrip13= new Square();
      FieldStrip14= new Square();
      FieldStrip15= new Square();
      FieldStrip16= new Square();
      
      FieldStrip17= new Square();
      FieldStrip18= new Square();
      FieldStrip19= new Square();
      FieldStrip20= new Square();
      
      FieldStrip21= new Square();
      FieldStrip22= new Square();
      FieldStrip23= new Square();
      FieldStrip24= new Square();
      
      FieldStrip25= new Square();
      FieldStrip26= new Square();
      FieldStrip27= new Square();
      FieldStrip28= new Square();
      
      FieldCenterCircle1=new Circle();
      FieldCenterCircle2=new Circle();
      
       
       
       
        
        
        
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
          
            FieldDG5.changeColor("green");
            FieldDG5.moveHorizontal(-150);
            FieldDG5.moveVertical(100);
            FieldDG5.changeSize(80);
            FieldDG5.makeVisible();
            
            FieldDG6.changeColor("green");
            FieldDG6.moveHorizontal(-150);
            FieldDG6.moveVertical(20);
            FieldDG6.changeSize(80);
            FieldDG6.makeVisible();
            
            FieldDG7.changeColor("green");
            FieldDG7.moveHorizontal(-150);
            FieldDG7.moveVertical(-60);
            FieldDG7.changeSize(80);
            FieldDG7.makeVisible();
            
            FieldDG8.changeColor("green");
            FieldDG8.moveHorizontal(-150);
            FieldDG8.moveVertical(-140);
            FieldDG8.changeSize(80);
            FieldDG8.makeVisible();
            
            FieldLG5.changeColor("light green");
            FieldLG5.moveHorizontal(-70);
            FieldLG5.moveVertical(100);
            FieldLG5.changeSize(80);
            FieldLG5.makeVisible();
            
            FieldLG6.changeColor("light green");
            FieldLG6.moveHorizontal(-70);
            FieldLG6.moveVertical(20);
            FieldLG6.changeSize(80);
            FieldLG6.makeVisible();
            
            FieldLG7.changeColor("light green");
            FieldLG7.moveHorizontal(-70);
            FieldLG7.moveVertical(-60);
            FieldLG7.changeSize(80);
            FieldLG7.makeVisible();
            
            FieldLG8.changeColor("light green");
            FieldLG8.moveHorizontal(-70);
            FieldLG8.moveVertical(-140);
            FieldLG8.changeSize(80);
            FieldLG8.makeVisible();
            
            FieldDG9.changeColor("green");
            FieldDG9.moveHorizontal(10);
            FieldDG9.moveVertical(100);
            FieldDG9.changeSize(80);
            FieldDG9.makeVisible();
            
            FieldDG10.changeColor("green");
            FieldDG10.moveHorizontal(10);
            FieldDG10.moveVertical(20);
            FieldDG10.changeSize(80);
            FieldDG10.makeVisible();
            
            FieldDG11.changeColor("green");
            FieldDG11.moveHorizontal(10);
            FieldDG11.moveVertical(-60);
            FieldDG11.changeSize(80);
            FieldDG11.makeVisible();
            
            FieldDG12.changeColor("green");
            FieldDG12.moveHorizontal(10);
            FieldDG12.moveVertical(-140);
            FieldDG12.changeSize(80);
            FieldDG12.makeVisible();
            
            FieldLG9.changeColor("light green");
            FieldLG9.moveHorizontal(90);
            FieldLG9.moveVertical(100);
            FieldLG9.changeSize(80);
            FieldLG9.makeVisible();
            
            FieldLG10.changeColor("light green");
            FieldLG10.moveHorizontal(90);
            FieldLG10.moveVertical(20);
            FieldLG10.changeSize(80);
            FieldLG10.makeVisible();
            
            FieldLG11.changeColor("light green");
            FieldLG11.moveHorizontal(90);
            FieldLG11.moveVertical(-60);
            FieldLG11.changeSize(80);
            FieldLG11.makeVisible();
            
            FieldLG12.changeColor("light green");
            FieldLG12.moveHorizontal(90);
            FieldLG12.moveVertical(-140);
            FieldLG12.changeSize(80);
            FieldLG12.makeVisible();
            
                
            FieldStrip.changeColor("white");
            FieldStrip.moveHorizontal(-310);
            FieldStrip.moveVertical(170);
            FieldStrip.changeSize(80);
            FieldStrip.makeVisible();
            
            FieldStrip2.changeColor("white");
            FieldStrip2.moveHorizontal(-230);
            FieldStrip2.moveVertical(170);
            FieldStrip2.changeSize(80);
            FieldStrip2.makeVisible();
            
            FieldStrip3.changeColor("white");
            FieldStrip3.moveHorizontal(-150);
            FieldStrip3.moveVertical(170);
            FieldStrip3.changeSize(80);
            FieldStrip3.makeVisible();
            
            FieldStrip4.changeColor("white");
            FieldStrip4.moveHorizontal(-70);
            FieldStrip4.moveVertical(170);
            FieldStrip4.changeSize(80);
            FieldStrip4.makeVisible();
            
            FieldStrip5.changeColor("white");
            FieldStrip5.moveHorizontal(10);
            FieldStrip5.moveVertical(170);
            FieldStrip5.changeSize(80);
            FieldStrip5.makeVisible();
            
            FieldStrip6.changeColor("white");
            FieldStrip6.moveHorizontal(90);
            FieldStrip6.moveVertical(170);
            FieldStrip6.changeSize(80);
            FieldStrip6.makeVisible();
            
            FieldStrip7.changeColor("white");
            FieldStrip7.moveHorizontal(-310);
            FieldStrip7.moveVertical(-190);
            FieldStrip7.changeSize(80);
            FieldStrip7.makeVisible();
            
            FieldStrip8.changeColor("white");
            FieldStrip8.moveHorizontal(-230);
            FieldStrip8.moveVertical(-190);
            FieldStrip8.changeSize(80);
            FieldStrip8.makeVisible();

            FieldStrip9.changeColor("white");
            FieldStrip9.moveHorizontal(-150);
            FieldStrip9.moveVertical(-190);
            FieldStrip9.changeSize(80);
            FieldStrip9.makeVisible();
            
            FieldStrip10.changeColor("white");
            FieldStrip10.moveHorizontal(-70);
            FieldStrip10.moveVertical(-190);
            FieldStrip10.changeSize(80);
            FieldStrip10.makeVisible();
            
            FieldStrip11.changeColor("white");
            FieldStrip11.moveHorizontal(10);
            FieldStrip11.moveVertical(-190);
            FieldStrip11.changeSize(80);
            FieldStrip11.makeVisible();
            
            FieldStrip12.changeColor("white");
            FieldStrip12.moveHorizontal(90);
            FieldStrip12.moveVertical(-190);
            FieldStrip12.changeSize(80);
            FieldStrip12.makeVisible();
            
            FieldStrip13.changeColor("white");
            FieldStrip13.moveHorizontal(-380);
            FieldStrip13.moveVertical(100);
            FieldStrip13.changeSize(80);
            FieldStrip13.makeVisible();
            
            FieldStrip14.changeColor("white");
            FieldStrip14.moveHorizontal(-380);
            FieldStrip14.moveVertical(20);
            FieldStrip14.changeSize(80);
            FieldStrip14.makeVisible();
            
            FieldStrip15.changeColor("white");
            FieldStrip15.moveHorizontal(-380);
            FieldStrip15.moveVertical(-60);
            FieldStrip15.changeSize(80);
            FieldStrip15.makeVisible();
            
            FieldStrip16.changeColor("white");
            FieldStrip16.moveHorizontal(-380);
            FieldStrip16.moveVertical(-140);
            FieldStrip16.changeSize(80);
            FieldStrip16.makeVisible();
            
            FieldStrip17.changeColor("white");
            FieldStrip17.moveHorizontal(-70);
            FieldStrip17.moveVertical(-110);
            FieldStrip17.changeSize(10);
            FieldStrip17.makeVisible();
            
            FieldStrip18.changeColor("white");
            FieldStrip18.moveHorizontal(-70);
            FieldStrip18.moveVertical(-100);
            FieldStrip18.changeSize(10);
            FieldStrip18.makeVisible();
            
            FieldStrip19.changeColor("white");
            FieldStrip19.moveHorizontal(-70);
            FieldStrip19.moveVertical(-90);
            FieldStrip19.changeSize(10);
            FieldStrip19.makeVisible();
            
            FieldStrip20.changeColor("white");
            FieldStrip20.moveHorizontal(-70);
            FieldStrip20.moveVertical(-80);
            FieldStrip20.changeSize(10);
            FieldStrip20.makeVisible();
            
            FieldStrip21.changeColor("white");
            FieldStrip21.moveHorizontal(-70);
            FieldStrip21.moveVertical(-70);
            FieldStrip21.changeSize(10);
            FieldStrip21.makeVisible();
            
            FieldStrip22.changeColor("white");
            FieldStrip22.moveHorizontal(-70);
            FieldStrip22.moveVertical(100);
            FieldStrip22.changeSize(10);
            FieldStrip22.makeVisible();
            
            FieldStrip23.changeColor("white");
            FieldStrip23.moveHorizontal(-70);
            FieldStrip23.moveVertical(110);
            FieldStrip23.changeSize(10);
            FieldStrip23.makeVisible();
            
            FieldStrip24.changeColor("white");
            FieldStrip24.moveHorizontal(-70);
            FieldStrip24.moveVertical(120);
            FieldStrip24.changeSize(10);
            FieldStrip24.makeVisible();
            
            FieldStrip25.changeColor("white");
            FieldStrip25.moveHorizontal(-70);
            FieldStrip25.moveVertical(130);
            FieldStrip25.changeSize(10);
            FieldStrip25.makeVisible();
            
            
            FieldStrip26.changeColor("white");
            FieldStrip26.moveHorizontal(-70);
            FieldStrip26.moveVertical(140);
            FieldStrip26.changeSize(10);
            FieldStrip26.makeVisible();
            
            FieldStrip27.changeColor("white");
            FieldStrip27.moveHorizontal(-70);
            FieldStrip27.moveVertical(150);
            FieldStrip27.changeSize(10);
            FieldStrip27.makeVisible();
            
            FieldStrip28.changeColor("white");
            FieldStrip28.moveHorizontal(-70);
            FieldStrip28.moveVertical(160);
            FieldStrip28.changeSize(10);
            FieldStrip28.makeVisible();
            
            FieldCenterCircle1.changeColor("white");
            FieldCenterCircle1.moveHorizontal(-60);
            FieldCenterCircle1.moveVertical(-10);
            FieldCenterCircle1.changeSize(150);
            FieldCenterCircle1.makeVisible();
            
            FieldCenterCircle2.changeColor("green");
            FieldCenterCircle2.moveHorizontal(-55);
            FieldCenterCircle2.moveVertical(-05);
            FieldCenterCircle2.changeSize(140);
            FieldCenterCircle2.makeVisible();
            
            
            
            
            
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
            
            Ablock2.changeColor("green");
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
            
            Player3.changeColor("blue");
            Player3.moveHorizontal(200);
            Player3.moveVertical(-100);
            Player3.makeVisible();
            
            Player.changeColor("red");
            Player.moveHorizontal(200);
            Player.moveVertical(-100);
            Player.makeVisible();
            Player.slowMoveVertical(150);
            Player3.slowMoveVertical(140);
            Player.slowMoveHorizontal(-88);
            Player3.slowMoveHorizontal(-75);
            
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
            
            Player3.slowMoveVertical(90);
            
            
            
            
        
            
            
            
        
               
            
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
