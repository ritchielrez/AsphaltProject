import org.code.neighborhood.*;

public class AsepriteLogo extends PainterPlus {
  // All the colors needed for the logo
  String bg = "white";
  String fg0 = "#655561";
  String fg1 = "#6c6a76";
  String blue = "#7d929e";

  public AsepriteLogo(int gridRows, int gridCols) {
    super(gridRows, gridCols);
  }

  // Paints a white line except the first and the last pixels use the color `fg0`.
  void paintWhiteLine(int y) {
    paintGrid(0, y, fg0);
    paintLineX(1, gridCols - 1, bg);
    paintGrid(gridCols - 1, y, fg0);
  }
  
  void paintLogo() {
    // Draws the logo row by row. The code inside each curly braces below represent each row of the logo. 
    int y = 0;
    { 
      paintGrid(0, y, bg);
      paintGrid(1, y, fg1);
      paintLineX(2, gridCols - 2, fg0);
      paintGrid(gridCols - 2, y, fg1);
      paintGrid(gridCols - 1, y, bg);
    } 
    y++;
    {
      paintGrid(0, y, fg1);
      paintGrid(1, y, fg0);
      paintLineX(2, gridCols - 2, bg);
      paintGrid(gridCols - 2, y, fg0);
      paintGrid(gridCols - 1, y, fg1);
    }
    for(int i = 1; i <= 2; i++) {
      paintWhiteLine(++y);  
    }
    for (int i = 1; i <= 5; i++) {
      y++;
      paintGrid(0, y, fg0);
      paintLineX(1, 5, bg);
      paintGrid(5, y, fg0);
      paintLineX(6, 10, bg);
      paintGrid(10, y, fg0);
      paintLineX(11, gridCols - 1, bg);
      paintGrid(gridCols - 1, y, fg0);
    }
    for(int i = 1; i <= 3; i++) {
      paintWhiteLine(++y);  
    }
    y++;
    {
      paintGrid(0, y, fg0);
      paintGrid(1, y, blue);
      paintLineX(2, gridCols - 2, bg);
      paintGrid(gridCols - 2, y, blue);
      paintGrid(gridCols - 1, y, fg0);
    }
    y++;
    {
      paintGrid(0, y, fg0);
      paintLineX(1, gridCols - 1, blue);
      paintGrid(gridCols - 1, y, fg0); 
    }
    y++;
    { 
      paintGrid(0, y, fg1);
      paintGrid(1, y, fg0);
      paintLineX(2, gridCols - 2, blue);
      paintGrid(gridCols - 2, y, fg0);
      paintGrid(gridCols - 1, y, fg1);
    }
    y++;
    { 
      paintGrid(0, y, bg);
      paintGrid(1, y, fg1);
      paintLineX(2, gridCols - 2, fg0);
      paintGrid(gridCols - 2, y, fg1);
      paintGrid(gridCols - 1, y, bg);
    } 
  }
}
