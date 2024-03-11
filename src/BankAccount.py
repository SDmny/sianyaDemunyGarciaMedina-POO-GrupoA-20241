from Employee import Employee
class BankAccount:
    __accountNumber=0
    __amount=0
    __type = ''

    def __init__(self, accountNumber, type):
        self.__accountNumber = accountNumber
        self.__type = type

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
        print("Saldo actual: " + self.getAmount())
    
    def addAmountA(self, amount) :
        if (self.amount + amount <= 50000):
            self.amount += amount
        else:
            print("Límite de 50,000 para cuenta A alcanzado")
        
    
    def addAmountB(self, amount) :
        if (self.amount + amount <= 100000):
            self.amount += amount
        else:
            print("Límite de 100,000 para cuenta B alcanzado")
        
    
    def substractAmount(self, amount) :
        if (type == 'A'):
            self.substractAmountA(amount)
        elif (type == 'B'):
            self.substractAmountB(amount)
        elif((self.amount-amount) >= 10000):
            self.amount -= amount;
        else :
            print("Cantidad minima de 10,000 requerida para cuenta tipo C")
        print("Saldo actual: " + self.getAmount())
    
    def substractAmountA(self, amount) :
        if (self.amount - amount >= 1000):
            self.amount -= amount
        else:
            print("Cantidad minima de 1,000 requerida para cuenta tipo A")
        
    
    def substractAmountB(self, amount) :
        if (self.amount - amount >= 5000):
            self.amount -= amount
        else:
            print("Cantidad minima de 5,000 requerida para cuenta tipo B")
        
    