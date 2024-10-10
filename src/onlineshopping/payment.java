
package onlineshopping;

public class payment extends Onlineshopping {
    void payment(){}

int total_amount;
int salestax;

public int gettm(){
  return total_amount;
}
public void settm(int total_amount){
 this.total_amount= total_amount;
}

public int getst(){
  return salestax;
}
public void setst(int salestax){
 this.salestax= salestax;
}
}

