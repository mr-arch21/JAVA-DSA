package OOPS;

public class two {
    public static void main(String args[]){
        BankAccount myacc=new BankAccount();
        myacc.username="aryan";
        myacc.setPassword("abcdef");

    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
