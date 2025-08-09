first run BankAppMain → The menu appears.

You choose an option:

1.Create Account → BankAppMain calls BankManager.createAccount()

BankManager decides whether to create a RegularAccount or PremiumAccount.

User details are stored.

2.Deposit Money → BankAppMain calls BankManager.deposit()

BankManager finds the account and calls its deposit() method.

3.Withdraw Money → BankAppMain calls BankManager.withdraw()

BankManager finds the account and calls its withdraw() method.

4.Check Balance → BankAppMain calls BankManager.displayBalance()

BankManager finds the account and calls getBalance() to show it.

RegularAccount or PremiumAccount contains the logic for deposit/withdraw.

5.TransactionUtils helps with shared transaction working.

