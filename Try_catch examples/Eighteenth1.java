package javaclass0920;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eighteenth1 {

    public static void main(String[] args) {
         //測試錯誤訊息 Unchecked Exception程式執行後抓錯 
        Scanner sc = new Scanner(System.in);
        int denominator, numerator, max;
        int array[ ] = { 1,2,3,4,5};
        
        try{ 
        System.out.println("請輸入分子");
        numerator = sc.nextInt( );
        System.out.println("請輸入分母");
        denominator = sc.nextInt( );
        System.out.println("除法結果為: " + (numerator/denominator));
        
        System.out.println(" 請輸入陣列最大值");
         max = sc.nextInt( );
         for(int m=0; m<max; m++)
         {
             System.out.printf("array[%d]=%d ", m, array[m]);
         }
           System.out.println( );}
        catch(InputMismatchException e){
               System.out.println(" 輸入的格式錯誤"+e.toString( ));  // 顯示錯誤訊息toString
                       }
        catch(ArithmeticException e){
               System.out.println(" 分母不能是0"+e.getMessage( ));  // 顯示錯誤訊息getMessage  
                       }
        catch(ArrayIndexOutOfBoundsException e){
               System.out.println(" 陣列超出索引值"+e.getMessage( ));  // 顯示錯誤訊息getMessage  
                       }
        // 抓錯的父類別要在最下面(RuntimeException)包含很多錯誤
        catch(RuntimeException e){
               System.out.println(" 很籠統的錯誤"+e.getMessage( ));  // 顯示錯誤訊息getMessage  
                       }
        finally{
             System.out.println("無論如何都會執行");
        }

    }

}
