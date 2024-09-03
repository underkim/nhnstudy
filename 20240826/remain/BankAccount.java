package remain;
public class BankAccount
{
    private int accountNo;
    private String ownerName;
    
    public int getAccountNo()
    {
        return this.accountNo;
    }

    public BankAccount setAccountNo(int accountNo)
    {
        this.accountNo = accountNo;
        return this;
    }
}

class Test
{

    public static void main(String [] args)
    {
        
        BankAccount account1 = new BankAccount();
        account1.setAccountNo(1);
        System.out.println(account1.getAccountNo());
    }
}