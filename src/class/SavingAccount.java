public class SavingAccount extends Account
{
    private float interestRate;

    public SavingAccount(String owner, float balance)
    {
        super(owner, balance);
        this.interestRate = 4;
    }

    public String toString()
    {
        return "Le compte épargne n°" + this.accountNumber + " appatient à " + this.owner + ", et présente un solde de " + this.balance + " €";
    }
}