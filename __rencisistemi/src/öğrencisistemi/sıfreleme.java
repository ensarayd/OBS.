package öğrencisistemi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.*;

public class sıfreleme {


public static void main(String[] args)
{
     Scanner scan = new Scanner(System.in);
     System.out.println("parola gırınız");
     String parola = scan.nextLine();
     
    
    try{
        MessageDigest messageDigestNesnesi = MessageDigest.getInstance("MD5");
        messageDigestNesnesi.update(parola.getBytes());
        byte messageDigestDizisi[] = messageDigestNesnesi.digest();
        StringBuffer sb16 = new StringBuffer();
        StringBuffer sb32 = new StringBuffer();
        for (int i = 0; i < messageDigestDizisi.length; i++) {
        sb32.append(Integer.toString((messageDigestDizisi[i] & 0xff) + 0x100, 32));
 }
 
 System.out.println("Parolanın Şifrelenmiş Hali:(32) " + sb32.toString());
   
    } catch(NoSuchAlgorithmException ex) {
            
        System.err.println(ex);


}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}