class Bank
{
double amount;
Bank(double amount)
{
this.amount=amount;
}
void withdrawalAmount(double money)
{
if(money<=amount){
System.out.println("withdrawn successfully");
amount -=money;
}
else
System.out.println("insuffient balance");
}
void depositAmount(double cash)
{
amount +=cash;
System.out.println("total amount:"+amount);
}
}
class BankAmount
{
public static void main(String[] args)
{
Bank b=new Bank(10000);
b.withdrawalAmount(2000);
b.depositAmount(5000);
}
}