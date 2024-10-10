
package onlineshopping;

public class customer_id extends Onlineshopping{
    void customer_id(){}

String firstame;
String lastname;
int phone_no1;
int phone_no2;
String email_id;
String shippingaddress;
String billingaddress;

public String getfn(){
  return firstame;
}
public void setfn(String firstname){
 this.firstame= firstname;
}
public String getln(){
  return lastname;
}
public void setln(String lastname){
 this.lastname= lastname;
}
public int getphone_no1(){
  return phone_no1;
}
public void setphone_no1(int phone_no1){
 this.phone_no1= phone_no1;
}
public int getphone_no2(){
  return phone_no2;
}
public void setphone_no2(int phone_no2){
 this.phone_no2= phone_no2;
}
public String getid(){
  return email_id;
}
public void setemail_id(String email_id){
 this.email_id= email_id;
}
public String getsa(){
  return shippingaddress;
}
public void setsa(String shippingaddress){
 this.shippingaddress= shippingaddress;
}
public String getba(){
  return billingaddress;
}
public void setba(String billingaddress){
 this.billingaddress= billingaddress;
}
}

