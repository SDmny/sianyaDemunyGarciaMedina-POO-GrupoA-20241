from BankAccount import BankAccount
class Employee:

    employee_array = []

    name = ""
    last_name = ""
    account = 0
    accounts_array = []

    def __init__(self, name, last_name, account_number, type):
        self.name = name
        self.last_name = last_name
        self.account = BankAccount(account_number, type)
        self.accounts_array.append(self.account)
    
    def get_name(self):
        return self.name
    
    def get_last_name(self):
        return self.last_name

    def get_account(self):
        return self.account
    
    def get_accounts_array(self):
        return self.accounts_array
    

