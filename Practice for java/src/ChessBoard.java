import acm.program.*;
import acm.graphics.*;
 
public class ChessBoard extends GraphicsProgram {
 
/** Runs the program */
   public void run() {
      double sqSize = (double) getHeight() / NROWS;
      for (int i = 0; i < NROWS; i++) {
         for (int j = 0; j < NCOLUMNS; j++) {
            double x = j * sqSize;
            double y = i * sqSize;
            GRect sq = new GRect(x, y, sqSize, sqSize);
            sq.setFilled((i + j) % 2 != 0);
            add(sq);
         }
      }
   }
 
/* Private constants */
   private static final int NROWS = 8;     /* Number of rows    */
   private static final int NCOLUMNS = 8;  /* Number of columns */
 
} 