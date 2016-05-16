
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.width = width;
        this.height = height;
        this.density = density;
        this.starsInLastPrint = 0;

    }

    public void printLine() {
        // for(int i = 0; i < this.height; i++){
        Random random = new Random();
        double db = 0.0;
        for (int i = 0; i < this.width; i++) {

            db = random.nextDouble();
            if (db < density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {

                System.out.print(" ");

            }

        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {

            printLine();

        }

    }
             // Random random = new Random();
    //    double probability = random.nextDouble();
    //   if(probability > this.density){
    //       System.out.println("");

         //   }else {
    //     starsInLastPrint+=1;
    //    System.out.print("*");
    public int starsInLastPrint() {
        int starsNumber = this.starsInLastPrint;
        this.starsInLastPrint = 0;

        return starsNumber;
    }
}
