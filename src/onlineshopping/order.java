
package onlineshopping;

public class order extends Onlineshopping {
 
void order(){}

int transaction_no;
String shippingmethod;
String paymentmethod;
String billingaddress;
String shippingaddress;

public int getno(){
  return transaction_no;
}
public void setno(int transaction_no){
 this.transaction_no= transaction_no;
}

public String getsm(){
  return shippingmethod;
}
public void setsm(String shippingmethod){
 this.shippingmethod= shippingmethod;
}

public String getpm(){
  return paymentmethod;
}
public void setpm(String paymentmethod){
 this.paymentmethod= paymentmethod;
}

public String getba(){
  return billingaddress;
}
public void setba(String billingaddress){
 this.billingaddress= billingaddress;
}

public String getsa(){
  return shippingaddress;
}
public void setsa(String shippingaddress){
 this.shippingaddress= shippingaddress;
}
}

