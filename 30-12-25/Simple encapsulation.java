class Account {
    private double balance = 5000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount > 0)
            balance = amount;
    }
}
