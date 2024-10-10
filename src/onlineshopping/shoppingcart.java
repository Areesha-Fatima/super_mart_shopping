
package onlineshopping;

public class shoppingcart extends Onlineshopping {
void sc(){}

String product_id;
String productname;
String product_size;
int product_quantity;
String removeoption;

public String getid(){
  return product_id;
}
public void setid(String product_id){
 this.product_id= product_id;
}
public String getpn(){
  return productname;
}
public void setpn(String productname){
 this.productname= productname;
}
public String getps(){
  return product_size;
}

public void setps(String product_size){
 this.product_size= product_size;
}

public int getpq(){
  return product_quantity;
}

public void setpq(int product_quantity){
 this.product_quantity= product_quantity;
 }

public String getro(){
  return removeoption;
}

public void setro(String removeoption){
 this.removeoption= removeoption;
}
}

