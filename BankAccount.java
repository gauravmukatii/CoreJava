public class BankAccount {

    private int id;
    private long AccountNum;
    private String name;
    private double balance;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setAccountNum(long AccountNum){
        this.AccountNum = AccountNum;
    }

    public long getAccountNum() {
        return AccountNum;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
}
