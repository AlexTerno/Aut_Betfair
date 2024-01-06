package course;

 public class Draw {
    public static void main(String[] args) {
      //  System.out.println("Param 1:" + args[0] + "\nParam 2:" + args[1]);
      //  drawFullShape(args[0], args[1]);
//        drawFullShape(3,4);
      //  System.out.println("Draw same size shape");
      //  drawFullShape(3);
      //  System.out.println("Draw same size  as string");
       // drawFullShape(args[0]);


        System.out.println("Draw shape outline");
        drawShapeOutline(rows: 5, cols: 7, symbol: '*' );

        System.out.println("Draw shape Corners");
        drawShapeCorners( rows: 6, cols:9, symbol: '*' );

    }


    public static void drawFullShape(int n, int m) {
        // implement method
        for (int i = 0; i < n; i++) {
            drawFullLine(m);
        }
    }

    public static void drawFullLine(int m) {
        for (int j = 0; j < m; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
//Metoda prin care se va afisa conturul formei

     public static void drawShapeOutline(int rows, int cols, char symbol) {
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(i == 0 || i == rows -1 || j == 0 || j == cols -1) {
                    System.out.print (symbol + "");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }

     //Metoda prin care se afiseaza colturile unei forme

     public static void drawShapeCorners(int rows, int cols, char symbol){
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if((i == 0 && j == 0) || (i == 0 && j == cols -1) || (i == rows -1 && j == 0) || (i == rows -1 && j == cols -1)){
                    System.out.print(symbol + "");
                }else{
                    System.out.print(" ");
                }
            }
        }
     }
    public static void drawFullShape(int n) {
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(String n) {
        drawFullShape(Integer.parseInt(n));
    }

}
