
package onlineshopping;

public class creditdebitcard extends Onlineshopping{
    void creditdebitcard(){}

int card_no;
String expiry_date;
String cardholdername;
int CVV_no;

public int getcn(){
  return card_no;
}
public void setcn(int card_no){
 this.card_no= card_no;
}

public String geted(){
  return expiry_date;
}
public void seted(String expiry_date){
 this.expiry_date= expiry_date;
}
public String getchn(){
  return cardholdername;
}
public void setchn(String cardholdername){
 this.cardholdername= cardholdername;
}

public int getcvv_no(){
  return CVV_no;
}
public void setcvv_no(int CVV_no){
 this.CVV_no= CVV_no;
}

}
