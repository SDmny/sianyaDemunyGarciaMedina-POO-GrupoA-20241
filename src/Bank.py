from BankAccount import BankAccount
from Employee import Employee
class Bank:
    accounts = []
    
    def see_accounts():
        num_id=1
        print("\nLista de cuentas")
        print("Numero de cuenta    Tipo de cuenta       Saldo en cuenta")
        for account in Bank.accounts:
            print(f"{num_id} - Cuenta: {account.get_account_number()}     Tipo: {account.get_type()}      Monto: {account.get_amount()}")
            num_id = num_id+1
        print("")
    
    def see_account():
        print("Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)")
        aux = int(input())
        if(aux > 0):
            aux = aux -1
        print(f"Numero de cuenta: {Bank.accounts[aux]}")
        print(f"Tipo de cuenta: {Bank.accounts[aux]}")
        print(f"Saldo en cuenta: {Bank.accounts[aux]}")

    def set_type():
        type = input()
        if type != 'A' and type != 'B' and type != 'C':
            print("Tipo de cuenta no valido")
            print("tipo de cuenta: ")
            type = Bank.set_type()
        return type

    def set_number_account():
        number = int(input())
        if number<=0:
            print("Numero invalido")
            print("Numero de cuenta: ")
            number = Bank.set_number_account()
        return number
    
    def add_account():
        print("\nIngrese numero de empleado (Visible en opcion 4 - Ingrese 0 para cancelar): ")
        num_employee = int(input())-1
        if num_employee >= 0:
            print("Ingrese la informacion de la nueva cuenta")
            print("Numero de cuenta")
            account_number = Bank.set_number_account()
            print("Tipo de cuenta: ")
            type = Bank.set_type()
            account = BankAccount(account_number, type)
            Employee.employee_array[num_employee].get_accounts_array().append(account)
            Bank.accounts.append(account)
            print("Cuenta agregada")
        else:
            print("Operacion cancelada")


    def create_employee():
        print("Nombre: ")
        name = input()
        print("Apellido: ")
        lastName = input()
        print("Numero de cuenta: ")
        account = Bank.set_number_account()
        print("Tipo de cuenta: ")
        type = Bank.set_type()
        employee = Employee(name, lastName, account, type)
        Employee.employee_array.append(employee)
        Bank.accounts.append(account)
        print("Empleado agregado")
                
        

    def see_employees():
        num_id=1;
        print(f"\nLista de empleados")
        for employee in Employee.employee_array:
            if (len(employee.accounts_array) == 1): 
                print(f"{num_id}- Empleado: {employee.get_name()}Numero de cuenta: {employee.get_account().get_account_number()}Saldo: {employee.get_account().get_amount()}Tipo de cuenta: {employee.get_account().get_type()}")
            
            else :
                print(f"{num_id} - Empleado: {employee.get_name()}        Cantidad de cuentas: {len(employee.get_accounts_array())}")
            
            num_id = num_id+1
        
        print(f"")
    
    def see_employee(employee):
        print(f"\nNombre: {employee.get_name()}")
        print(f"Apellido: {employee.get_last_name()}")
        Bank.see_employee_acounts(employee)
    
    def see_employee_acounts(employee):
        for i in range(len(employee.accounts_array())):
            y = i+1
            print(f"Cuenta {y}")
            print(f"Numero de cuenta:   {employee.accounts_array[i].get_account_number()}")
            print(f"Tipo de cuenta:  {employee.accounts_array[i].get_type()}")
            print(f"Saldo en cuenta:  {employee.accounts_array[i].get_amount()}")
        
