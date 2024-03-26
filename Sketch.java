import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    // Window size
    size(1200, 600);
  }

  public void setup() {
    // Background colour
    background(124, 162, 191);
  }

  public void draw() {
    // Sections
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  public void draw_section_outlines(){
    // Section outlines
    stroke(0);
    noFill();

    // Bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // Section 1
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 303 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 2
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 303 + intRow;
        intY = 303 + intColumn;

        if (intRow % 20 == 0){
          fill(255);
        }
        else{
          fill(0);
        }

        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 3
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 603 + intRow;
        intY = 303 + intColumn;

        if (intColumn % 20 == 0){
          fill(0);
        }
        else{
          fill(255);
        }

        noStroke();
        rect(intX, intY, 5, 5);
    }
  }
}

  // Section 4
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 903 + intRow;
        intY = 303 + intColumn;

        if (intRow % 20 == 0 && (intColumn+10) % 20 == 0){
          fill(255);
        }
        else{
          fill(0);
        }

        noStroke();
        rect(intX, intY, 5, 5);
    }
  }
}

  // Section 5
  public void draw_section5(){
    int intX = 0;
    int intY = 0;
    int intCounter = 300;

    for(int intRow = 10; intRow < 300; intRow += 10){
      intCounter -= 10;

      for(int intColumn = 290; intColumn >= intCounter; intColumn -= 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 6
  public void draw_section6(){
    int intX = 0;
    int intY = 0;
    int intCounter = 300;

    for(int intRow = 290; intRow >= 0; intRow -= 10){
      intCounter -= 10;

      for(int intColumn = 290; intColumn >= intCounter; intColumn -= 10){
        intX = 303 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 7
  public void draw_section7(){
    int intX = 0;
    int intY = 0;
    int intCounter = 0;

    for(int intRow = 290; intRow >= 0; intRow -= 10){
      intCounter += 10;

      for(int intColumn = 0; intColumn < intCounter; intColumn += 10){
        intX = 603 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  // Section 8
  public void draw_section8(){
    int intX = 0;
    int intY = 0;
    int intCounter = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      intCounter += 10;

      for(int intColumn = 0; intColumn < intCounter; intColumn += 10){
        intX = 903 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
}