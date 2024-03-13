from Bank import Bank
print(f"Menu ------------------------------------")
print(f"1 - Crear empleado2 - Crear cuenta3 - Ver empleado4 - Ver lista de empleados5 - Ver cuenta6 - Ver lista de cuentas7 - Realizar operación0 - SalirElegir: ")
action = int(input())


while True:
    if action == 1: 
        Bank.createEmployee()

    elif action == 2: 
        Bank.addAccount()

    elif action == 3: 
        print(f"Ingrese numero de empleado (Visible en opción 4 - Ingrese 0 para cancelar)")
        aux = int(input())
        if(aux > 0):
            Bank.seeEmployee(Bank.employeeArray.get(aux-1))
        
    elif action == 4: 
        Bank.seeEmployees()
    
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
    