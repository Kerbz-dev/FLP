package logic;



import com.ferrari.finances.dk.rki.CreditRator;
import com.ferrari.finances.dk.rki.Rating;


public class GetKV {


   // private double udl�nsrente;
    private String cpr = "2802922003";
    



    
        public void getkreditvaerdighed() {
      //  String kv = new String();
        CreditRator.i().rate(cpr);
        if (CreditRator.i().rate(cpr) == Rating.A) {
        	System.out.println("Kreditv�rdighed er:");
            System.out.println(CreditRator.i().rate(cpr));
            
        } else {
            System.out.println("Kreditv�rdighed er ikke A");
            System.out.println("Kreditv�rdighed er:"); 
            System.out.println(CreditRator.i().rate(cpr));
        }
    //    kv = CreditRator.i().rate(cpr);
    /*    if () {
            System.out.println(CreditRator.i().rate(cpr));            
        }
*/
    
        
    
        
    }
    
}
 






