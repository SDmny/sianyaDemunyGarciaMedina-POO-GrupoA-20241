class Bank:
    accounts = []
    def seeAccounts(self):
        numId=1
        bankIterator = Bank.accounts.iterator()
        print(f"Lista de cuentas")
        print(f"Numero de cuentaTipo de cuentaSaldo en cuenta")
        while (bankIterator.hasNext()):
            bank = bankIterator.next()
            print(numId+" - "+bank.getAccountNumber() +""+ bank.getType() +""+ bank.getAmount())
            numId = numId+1
        
        print("")
    
    def seeAccount(self, account):
        print(f"Numero de cuenta: "+account.getAccountNumber())
        print(f"Tipo de cuenta: "+account.getType())
        print(f"Saldo en cuenta: "+account.getAmount())
