
package webgallery;


public abstract class User {
    
    protected String name;
    protected int accountNumber;
    protected double accountMoney;

    public User(String name, int accountNumber, double accountMoney) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }
    
    
}
