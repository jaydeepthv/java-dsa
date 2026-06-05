public class Main{
    
    static void rightTriangle(int row , int col){
        if(row == 0) return;
        if(row > col){
            
            rightTriangle(row , col+1);
            System.out.print("* ");
            
        }else{
            
             rightTriangle(row-1, 0);
             System.out.println();
            
        }
    }
    
     static void InvertedRightTriangle(int row , int col){
        if(row == 0) return;
        if(row > col){
            
            System.out.print("* ");
            InvertedRightTriangle(row , col+1);
            
        }else{
        
             System.out.println();
             InvertedRightTriangle(row-1, 0);
            
        }
    }
    
   public static void main (String args[]){
            rightTriangle(7 , 0);
            System.out.println();
            InvertedRightTriangle(6,0);

   }
}
