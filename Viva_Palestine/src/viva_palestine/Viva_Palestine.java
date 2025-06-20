/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva_palestine;

/**
 *
 * @author Minh Triet
 */
public class Viva_Palestine {
   public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        int width = 60;
        int height = 18;
        int triangleWidth = width / 3;
        double centerY = (height - 1) / 2.0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double upperY = centerY * x / triangleWidth;
                double lowerY = (height - 1) - (centerY * x / triangleWidth);
                boolean inTriangle = (x <= triangleWidth) && (y >= upperY) && (y <= lowerY);

                if (inTriangle) {
                    System.out.print(RED + "*" + RESET);
                } else if (y < height / 3) {
                    // Không tô màu, giữ nguyên mặc định (dải đen)
                    System.out.print("*");
                } else if (y < 2 * height / 3) {
                    System.out.print(WHITE + "*" + RESET);
                } else {
                    System.out.print(GREEN + "*" + RESET);
                }
            }
            System.out.println();
        }
    }
}

    

