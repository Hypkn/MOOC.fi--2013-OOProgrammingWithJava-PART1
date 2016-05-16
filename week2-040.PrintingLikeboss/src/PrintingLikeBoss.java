public class PrintingLikeBoss {

  

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
    
    
      // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        
        while(i < amount) {
            System.out.print("*");
            i+=1;
            
        }
        System.out.println("\r");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        
        while(i < amount) {
            System.out.print(" ");
            i+=1;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while(i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            
            
            i+=1;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
       
      
        
        while(i <= height){
             printWhitespaces(height - i);
             printStars(i + (i-1));
             
            
            
            
             
                 
           
            i+=1;
        }
        printWhitespaces(height - 2 );
         printStars(3);
       printWhitespaces(height - 2);
        printStars(3);
        
    }
    
}
