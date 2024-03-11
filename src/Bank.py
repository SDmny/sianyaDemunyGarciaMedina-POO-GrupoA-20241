class Bank:
    accounts = []
    def seeAccounts(self):
        numId=1
        bankIterator = Bank.accounts.iterator()
        print("Lista de cuentas")
        print("Numero de cuentaTipo de cuentaSaldo en cuenta")
        while (bankIterator.hasNext()):
            bank = bankIterator.next()
            print(numId+" - "+bank.getAccountNumber() +""+ bank.getType() +""+ bank.getAmount())
            numId = numId+1
        
        print("")
    
    def seeAccount(self, account):
        print("Numero de cuenta: "+account.getAccountNumber())
        print("Tipo de cuenta: "+account.getType())
        print("Saldo en cuenta: "+account.getAmount())
