package javaclass0920;

import java.io.File;
import java.io.IOException;

public class Eighteenth2 {

    public static void main(String[] args) {
          // Checked Exception 程式執行中抓錯(測試錯誤訊息)
        File pcfile= new File("hello.txt");
        try{
            pcfile.createNewFile( );            // 建立檔案
                    System.out.println("檔案是否存在:" + pcfile.exists( ));
                    pcfile.delete( );             // 刪除檔案
                     System.out.println("檔案是否存在:" + pcfile.exists( ));
        }
        catch(IOException e){
           
    }
        finally{
             System.out.println("無論如何都會執行");
        }
}
}
