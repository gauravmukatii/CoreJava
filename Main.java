public class Main {
    public static void main(String... args){
        System.out.println("testing these project");

        BankAccount bankAccount = new BankAccount();

        bankAccount.setName("Gaurav");
        bankAccount.setId(002);
        bankAccount.setAccountNum(50002545);
        bankAccount.setBalance(500155.00);

        System.out.println(bankAccount.getAccountNum() + " | " + bankAccount.getName() + " | " + bankAccount.getBalance());

        Child child = new Child();
        child.m1();
        child.m1();
        super.m1();
    }
}
