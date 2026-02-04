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

  void paintLogo() {
    // Draws the logo row by row. The code inside each curly braces below represent each row of the logo. 
    int y = 0;
    { 
      paintGrid(0, y, bg);
      paintGrid(1, y, fg1);
      paintLineX(2, gridRows - 2, fg0);
      paintGrid(gridRows - 2, y, fg1);
      paintGrid(gridRows - 1, y, bg);
    } 
    y++;
    {
      paintGrid(0, y, fg1);
      paintGrid(1, y, fg0);
      paintLineX(2, gridRows - 2, bg);
      paintGrid(gridRows - 2, y, fg0);
      paintGrid(gridRows - 1, y, fg1);
    }
    y++;
    {
      paintGrid(0, y, fg0);
      paintLineX(1, gridRows - 1, bg);
      paintGrid(gridRows - 1, y, fg0);
    }
    y++;
    {
      paintGrid(0, y, fg0);
      paintLineX(1, gridRows - 1, bg);
      paintGrid(gridRows - 1, y, fg0);
    }
    y++;
    {
      paintGrid(0, y, fg0);
      paintLineX(1, 5, bg);
      paintGrid(5, y, fg0);
      paintLineX(6, 11, bg);
      paintGrid(11, y, fg0);
      paintLineX(6, 11, bg);
      paintGrid(gridRows-  1, y, fg0);
    }
  }
}
