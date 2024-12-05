abstract class Account
{
    protected String owner;
    protected float balance;
    protected int accountNumber;

    private static int accountNumberGen = 1;

    public Account(String owner, float balance)
    {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumberGen++;
    }

    @Override
    public String toString()
    {
        return "Le compte n°" + this.accountNumber + " appatien à " + this.owner + ", et présente un solde de " + this.balance + " €";
    }


}