class BankAccount:
    account_number=0
    amount=0
    type = ""

    def __init__(self, account_number, type):
        self.account_number = account_number
        self.type = type
        

    def get_account_number(self) :
        return self.account_number
    
    def get_type(self) :
        return self.type
    
    def get_amount(self) :
        return self.amount

    def add_amount(self, amount) :
        if (type == 'A'):
            self.add_amountA(amount)
        elif (type == 'B'):
            self.add_amountB(amount)
        else:
            self.amount += amount;
        print(f"Saldo actual:   {self.get_amount()}")
    
    def add_amountA(self, amount) :
        if (self.amount + amount <= 50000):
            self.amount += amount
        else:
            print("Límite de 50,000 para cuenta A alcanzado")
        
    
    def add_amountB(self, amount) :
        if (self.amount + amount <= 100000):
            self.amount += amount
        else:
            print("Límite de 100,000 para cuenta B alcanzado")
        
    
    def substract_amount(self, amount) :
        if (type == 'A'):
            self.substract_amountA(amount)
        elif (type == 'B'):
            self.substract_amountB(amount)
        elif((self.amount-amount) >= 10000):
            self.amount -= amount;
        else :
            print("Cantidad minima de 10,000 requerida para cuenta tipo C")
        print(f"Saldo actual:  {self.get_amount()}")
    
    def substract_amountA(self, amount) :
        if (self.amount - amount >= 1000):
            self.amount -= amount
        else:
            print("Cantidad minima de 1,000 requerida para cuenta tipo A")
        
    
    def substract_amountB(self, amount) :
        if (self.amount - amount >= 5000):
            self.amount -= amount
        else:
            print("Cantidad minima de 5,000 requerida para cuenta tipo B")
        
    