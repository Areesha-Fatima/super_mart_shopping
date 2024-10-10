package onlineshopping;
import  java.util.Scanner;
public class Onlineshopping {
    public static void main(String[] args) {
        Scanner iu = new Scanner(System.in);
        System.out.println("**********WELCOME TO ONLINE SHOPPING**********");
        System.out.println();
    viewcategories vs = new viewcategories();
    clothes c= new clothes();
    footware f= new footware();
    System.out.println("**********CLOTHES**********");
    vs.forwomen();
    c.forwomen();
    System.out.println();
    vs.formen();
    c.formen();
    System.out.println();
    vs.forkids();
    c.forkids();
    System.out.println();
    
    System.out.println("**********FOOTWARE**********");
    vs.forwomen();
    f.forwomen();
    System.out.println();
    vs.formen();
    f.formen();
    System.out.println();
    vs.forkids();
    f.forkids();
    
    System.out.println();
    
    System.out.println("************ACCESSORIES************");
accessories a= new accessories();
  a.forwomen();
  System.out.println();   
  vs.formen();
  a.formen();
  System.out.println();
  
  System.out.println("************MAKEUP************");
  makeup m = new makeup();
  m.display();
  
 
  System.out.println(); 
  
  
  System.out.println(); 
  guestuser g= new guestuser();
  System.out.println("GUEST USER");
     System.out.println();
     
     System.out.println("---LOGIN YOUR ID---");
     System.out.println("Register user detail");
    registereduser r =new registereduser();
    String name;
    int phone_no;
    String email_id;
    String address;
    String city;
    String country;
    System.out.println("FULL NAME : ");
    name =iu.next();
    System.out.println("PHONE_NO : ");
    phone_no =iu.nextInt();
    System.out.println("EMAIL_ID : ");
    email_id =iu.next();
    System.out.println("ADDRESS : ");
    address =iu.next();
    System.out.println("CITY : ");
    city =iu.next();
    System.out.println("COUNTRY : ");
    country =iu.next();
    
  System.out.println(); 
  System.out.println("---SHOPPING CART---");
  System.out.println("   Select Your Products");
  shoppingcart s= new shoppingcart();
  s.setid("4057");
  s.setpn("SHIRT");  
  s.setps("L");  
  s.setpq(2); 
  s.setro("NO");   
  System.out.println("PRODUCT_ID : "+s.getid());  
  System.out.println("PRODUCT NAME : "+s.getpn());   
  System.out.println("PRODUCT SIZE : "+s.getps());  
  System.out.println("PRODUCT QUANTITY : "+s.getpq());  
  System.out.println("REMOVE OPTION(YES /NO ) : "+s.getro());
   
  System.out.println(); 
  System.out.println("---ORDER PLAN---");
  order o= new order();
  o.setno(2380);
  o.setsm("PLANE/SHIP");  
  o.setpm("DEBIT/CREDIT CARD");  
  o.setba(address); 
  o.setsa(address);   
  System.out.println("TRANSACTION_NO : "+o.getno());  
  System.out.println("SHIPPING METHOD : "+o.getsm());   
  System.out.println("PAYMENT METHOD : "+o.getpm());  
  System.out.println("BILLING ADDRESS : "+o.getba());  
  System.out.println("SHIPPING ADDRESS : "+o.getsa());  
    
   
  System.out.println();
  System.out.println("---PRODUCT _ ID _ SHIRT---");
  product_id_shirt p= new  product_id_shirt();
  p.setid("1256");
  p.setsc("YELLOW");  
  p.setss("LARGE");  
  p.setq(2); 
  System.out.println("PRODUCT_ID : "+p.getid());   
  System.out.println("SHIRT COLOR : "+p.getsc());  
  System.out.println("SHIRT SIZE : "+p.getss());  
  System.out.println("SHIRT QUANITY : "+p.getq());  
    
  System.out.println(); 
  System.out.println("---PRODUCT _ ID _ JEANS---");
  product_id_jeans j= new product_id_jeans();
  j.setid("1256");
  j.setc("BLUE");  
  j.setw("31 - 33");  
  j.setq(2); 
  System.out.println("PRODUCT_ID : "+j.getid());   
  System.out.println("JEANS COLOR : "+j.getc());  
  System.out.println("JEANS WAIST : "+j.getw());  
  System.out.println("QUANTITY : "+j.getq());  
  
  System.out.println(); 
  System.out.println("---CUSTOMER ID---");
  System.out.println("Customer detail here ;");
  customer_id cd= new customer_id();
  cd.setfn(name);  
  cd.setphone_no1(phone_no);  
  cd.setphone_no2(phone_no); 
  cd.setemail_id(email_id);   
  cd.setsa(address);  
  cd.setba(address);    
  System.out.println(" NAME : "+cd.getfn());   
  System.out.println("PHONE_NO1 : "+cd.getphone_no1());  
  System.out.println("PHONE_NO2 : "+cd.getphone_no2());  
  System.out.println("EMAIL_ID : "+cd.getid());  
  System.out.println("SHIPPING ADDRESS : "+cd.getsa());  
  System.out.println("BILLING ADDRESS "+cd.getba());   
    
  System.out.println(); 
  System.out.println("---CASH ON DELIVERY---");
  cashondelivery cod= new cashondelivery();
  cod.setct(8000);
  cod.setcod("YES/NO");  
  System.out.println("CASH TENDERED : "+cod.getct());  
  System.out.println("CASH ON DELIVERY : "+cod.getcod());   
    
  System.out.println(); 
  System.out.println("---CREDIT / DEBIT CARD---");
  creditdebitcard cdc= new creditdebitcard();
  cdc.setcn(45326789);
  cdc.seted("5/4/2022"); 
  cdc.setchn(name);
  cdc.setcvv_no(34890);  
  System.out.println("CARD NO : "+cdc.getcn());  
  System.out.println("EXPIRY DATE : "+cdc.geted());
  System.out.println("CARD HOLDER NAME : "+cdc.getchn());  
  System.out.println("CARD VERIFICATION VALUE : "+cdc.getcvv_no());
    System.out.println(); 
  System.out.println("---YOUR BILL RECIPT --");
  payment p1= new payment();
  p1.settm(8000);
  p1.setst(1000);  
  System.out.println("TOTAL AMOUNT : "+p1.gettm());  
  System.out.println("SALES TAX : "+p1.getst()); 
  System.out.println(); 
  System.out.println("       THANK YOU FOR SHOPPING       ");
  System.out.println("       HOPE TO SEE YOU AGAIN      ");
  
    }
    
}

    