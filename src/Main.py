from Employee import Employee
from Bank import Bank
print(f"Menu ------------------------------------")
print(f"1 - Crear empleado2 - Crear cuenta3 - Ver empleado4 - Ver lista de empleados5 - Ver cuenta6 - Ver lista de cuentas7 - Realizar operación0 - SalirElegir: ")
action = int(input())

# Forma correcta
"""
q. Se crea el objeto y luego se usa
employe = Employee(0)
employee.create()
"""

# Forma incorrecta
"""
Usar los métodos directamente de la clase
Employee.create() 
"""

while True:
    if action == 1: 
        # empleado = Employee()
        #Employee.createEmployee()
        print(f"Ingrese numero de empleado (Visible en opcion 4 - Ingrese 0 para cancelar): ")
        numEmployee = input()-1
        if numEmployee >= 0:
            print(f"Ingrese la informacion de la nueva cuenta")
            print(f"Numero de cuenta")
            accountNumber = self.setNumberAccount()
            print(f"Tipo de cuenta: ")
            type = self.setType()
            account = BankAccount(accountNumber, type)
            employee = Employee("nombre0", "apellido0", account)
            employee.employeeArray.append(account)
            Bank.accounts.append(account)
            print(f"Cuenta agregada")
        else:
            print(f"Operacion cancelada")

    elif action == 2: 
        Employee.addAccount()

    elif action == 3: 
        print(f"Ingrese numero de empleado (Visible en opción 4 - Ingrese 0 para cancelar)")
        aux = int(input())
        if(aux > 0):
            Employee.seeEmployee(Employee.employeeArray.get(aux-1))
        
    elif action == 4: 
        Employee.seeEmployees()
    
    elif action == 5:
        print(f"Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)")
        aux = int(input())
        if(aux > 0):
            Bank.seeAccount(Bank.accounts.get(aux-1))
        
    elif action == 6:
        Bank.seeAccounts()
    elif action == 7: 
        print(f"Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)")
        aux = int(input())
        aux = aux -1
        if(aux >= 0):
            print(f"Seleccione operación a realizar1 - Deposito2 - Retiro")
            aux2 = int(input())
            if(aux2 == 1):
                print(f"Ingrese cantidad a depositar: ")
                amount = float(input())
                Bank.accounts.get(aux).addAmount(amount)
            elif(aux2 == 2):
                print(f"Ingrese cantidad a retirar: ")
                amount = float(input())
                Bank.accounts.get(aux).substractAmount(amount)
            else:
                print(f"Operación inexistente")
        else:
            print(f"Operación cancelada")
    else:
        break
    
    print(f"Menu ------------------------------------")
    print(f"1 - Crear empleado2 - Crear cuenta3 - Ver empleado4 - Ver lista de empleados5 - Ver cuenta6 - Ver lista de cuentas7 - Realizar operación0 - SalirElegir: ")
    action = int(input())
    