from Bank import Bank
from BankAccount import BankAccount
class Employee:

    employeeArray = []

    __name = ""
    __lastName = ""
    __account = 0
    __accountsArray = []

    def __init__(self, name, lastName, accountNumber, type):
        self.__name = name
        self.__lastName = lastName
        self.__account = BankAccount(accountNumber, type)
        Employee.accountsArray.append(self.account)
        Bank.accounts.append(self.account)


    def get_name(self):
        return self.__name
    
    def set_name(self, name):
        self.__name = name
        
    def get_lastName(self):
        return self.__lastName

    def get_account(self):
        return self.__account


    def setType(self):
        type = input()
        if type != 'A' and type != 'B' and type != 'C':
            print("Tipo de cuenta no valido")
            print("tipo de cuenta: ")
            self.setType()
        return self.type

    def setNumberAccount(self):
        number = input()
        if number<=0:
            print("Numero invalido")
            print("Numero de cuenta: ")
            number = self.setNumberAccount()
        return number
    
    def addAccount(self):
        print("Ingrese numero de empleado (Visible en opcion 4 - Ingrese 0 para cancelar): ")
        numEmployee = input()-1
        if numEmployee >= 0:
            print("Ingrese la informacion de la nueva cuenta")
            print("Numero de cuenta")
            accountNumber = self.setNumberAccount()
            print("Tipo de cuenta: ")
            type = self.setType()
            account = BankAccount(accountNumber, type)
            Employee.employeeArray.append(account)
            Bank.accounts.append(account)
            print("Cuenta agregada")
        else:
            print("Operacion cancelada")


    def createEmployee(self):
        print("Usuario con cuenta: 1 - Sí / 2 - No")
        aux = input()
        if aux==2:
            print("Nombre: ")
            name = input()
            print("Apellido: ")
            lastName = input()
            employee = Employee(name, lastName)
            Employee.employeeArray.append(employee)
            print("Empleado agregado")
            self.seeEmployee(Employee.employeeArray.get(Employee.employeeArray.size()-1))
        
        elif (aux == 1):
            self.createEmployeeAndAcount()
            self.seeEmployee(Employee.employeeArray.get(Employee.employeeArray.size()-1))
        
        else:
            print("Opcion inexistente")
        
    
    def createEmployeeAndAcount(self):
        print("Nombre: ")
        name = input()
        print("Apellido: ")
        lastName = input()
        print("Numero de cuenta: ")
        account = self.setNumberAccount()
        print("Tipo de cuenta: ")
        type = self.setType()
        employee = Employee(name, lastName, account, type)
        Employee.employeeArray.append(employee)
        print("Empleado agregado")
        

    def seeEmployees(self):
        numId=1;
        employeeIterator = Employee.employeeArray.iterator()
        print("Lista de empleados")
        while (employeeIterator.hasNext()):
            employee = employeeIterator.next()
            if (employee.accountsArray.size() == 1): 
                print(numId+" - Empleado: "+employee.getName()+"Numero de cuenta: "+employee.getAccount().getAccountNumber()+"Saldo: "+employee.getAccount().getAmount()+"Tipo de cuenta: "+employee.getAccount().getType())
            else :
                print(numId+" - Empleado: "+employee.getName()+"Cantidad de cuentas: "+employee.accountsArray.size())
            numId = numId+1
        print("")
    
    def seeEmployee(self, employee):
        print("Nombre: "+employee.getName())
        print("Apellido: "+employee.getLastName())
        self.seeEmployeeAcounts(employee)
    
    def seeEmployeeAcounts(self, employee):
        for i in employee.accountsArray.size():
            print("Cuenta " + (i+1))
            print("Numero de cuenta: " + employee.accountsArray.get(i).getAccountNumber())
            print("Tipo de cuenta: "+ employee.accountsArray.get(i).getType())
            print("Saldo en cuenta: "+ employee.accountsArray.get(i).getAmount())
        
    
    def show_data(self):
        print(f"Tu nombre es: {self.name} y edad: {self.lastName}")



employee = Employee("Eder", "raro")
employee.show_data()
