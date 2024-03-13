from Bank import Bank
class BankAccount:
    accountNumber=0
    amount=0
    type = ''

    def __init__(self, accountNumber, type):
        self.accountNumber = accountNumber
        self.type = type
        

    def getAccountNumber(self) :
        return self.accountNumber
    
    def getType(self) :
        return self.type
    
    def getAmount(self) :
        return self.amount

    def addAmount(self, amount) :
        if (type == 'A'):
            self.addAmountA(amount)
        elif (type == 'B'):
            self.addAmountB(amount)
        else:
            self.amount += amount;
        print(f"Saldo actual: " + self.getAmount())
    
    def addAmountA(self, amount) :
        if (self.amount + amount <= 50000):
            self.amount += amount
        else:
            print(f"Límite de 50,000 para cuenta A alcanzado")
        
    
    def addAmountB(self, amount) :
        if (self.amount + amount <= 100000):
            self.amount += amount
        else:
            print(f"Límite de 100,000 para cuenta B alcanzado")
        
    
    def substractAmount(self, amount) :
        if (type == 'A'):
            self.substractAmountA(amount)
        elif (type == 'B'):
            self.substractAmountB(amount)
        elif((self.amount-amount) >= 10000):
            self.amount -= amount;
        else :
            print(f"Cantidad minima de 10,000 requerida para cuenta tipo C")
        print(f"Saldo actual: " + self.getAmount())
    
    def substractAmountA(self, amount) :
        if (self.amount - amount >= 1000):
            self.amount -= amount
        else:
            print(f"Cantidad minima de 1,000 requerida para cuenta tipo A")
        
    
    def substractAmountB(self, amount) :
        if (self.amount - amount >= 5000):
            self.amount -= amount
        else:
            print(f"Cantidad minima de 5,000 requerida para cuenta tipo B")
        
    