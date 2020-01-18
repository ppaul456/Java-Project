package javaclass0920;

import java.io.IOException;
import javax.swing.JOptionPane;

public class SsnCheckPractice {

    public static void main(String[] args) {
         
         boolean verify = true;
         try{
                String mID = JOptionPane.showInputDialog("請輸入身份證號");  //使用者輸入
                checkID(mID);    // 呼叫方法拋出例外
         }
        catch(MemberIDException e){           // 捕捉例外
            System.out.println("錯誤訊息:" + e.getMessage( ));     // 捕捉並顯示錯誤訊息
            e.contactWith( );
            verify = false;   //失敗
        }   
         if(verify)    // 成功或失敗
                System.out.println("驗證成功");
         else
             System.out.println("驗證失敗");
    }
    // 驗證身份證是否正確
    public static void checkID(String mID)throws MemberIDException{   
    // 方法簽章要大於等於方法內的Exception, 例外拋出去給後面處裡
            int b[ ] = new int [11];
            int sum = 0;  // 儲存身分證號的加總
            int county[ ] ={10,11,12,13,14,15,16,17,34,18,19,20,
                21,22,35,23,24,25,26,27,28,29,32,30,31,33};
            int firstLetter = mID.toUpperCase( ).charAt(0);   // 轉大寫之後取第一個
            int countno = county[firstLetter-65];  // 如第一個是A=65, 65-65=0 對應county[0]
            b[0] = countno/10;      // 商數第1個
            b[1] = countno%10;   // 餘數第2個
            
            for(int m=1; m<=9; m++)  // 之後的九位數
            {
                b[m+1] = Integer.parseInt( mID.substring(m, m+1));  // 轉型成Integer
                sum +=b[m]*(10-m);  
               }
            if((b[0]+sum+b[10])%10 != 0)       // 有例外要拋出自訂(throw new exception)
                    throw new MemberIDException(mID);     // 是Checked Exception, 上面就要throws
           
        }
}
class MemberIDException extends  Exception{             // 自訂Exception類別
        public MemberIDException(String mID){
              super("身份證號: "+mID+"不是正確的");         // mID帶進來
        }
        public void contactWith( ){
            JOptionPane.showMessageDialog(null, "你是不是偷渡?");   // 輸入輸出對話框(JOptionPane)
        }
}