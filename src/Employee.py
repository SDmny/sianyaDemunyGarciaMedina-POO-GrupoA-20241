from Bank import Bank
from BankAccount import BankAccount
class Employee:

    __name = ""
    __lastName = ""
    __account = 0
    

    def __init__(self, name, lastName, accountNumber, type):
        self.__name = name
        self.__lastName = lastName
        self.__account = BankAccount(accountNumber, type)
        accountsArray = []
        accountsArray.append(self.account)
        Bank.accounts.append(self.account)
        Bank.employeeArray = []


    def get_name(self):
        return self.__name
    
    def set_name(self, name):
        self.__name = name
        
    def get_lastName(self):
        return self.__lastName

    def get_account(self):
        return self.__account
    

