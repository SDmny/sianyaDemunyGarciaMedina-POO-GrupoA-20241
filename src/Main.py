from Bank import Bank
print("Menu ------------------------------------")
print("1 - Crear empleado\n2 - Crear cuenta\n3 - Ver empleado\n4 - Ver lista de empleados\n5 - Ver cuenta\n6 - Ver lista de cuentas\n7 - Realizar operación\n0 - Salir\nElegir: ")
action = int(input())


while True:
    if action == 1: 
        Bank.create_employee()

    elif action == 2: 
        Bank.add_account()

    elif action == 3: 
        print("Ingrese numero de empleado (Visible en opción 4 - Ingrese 0 para cancelar)")
        aux = int(input())
        if(aux > 0):
            aux = aux -1
            Bank.see_employee(Bank.employee_array[aux])
        
    elif action == 4: 
        Bank.see_employees()
    
    elif action == 5: 
        Bank.see_account()
        
    elif action == 6:
        Bank.see_accounts()
    elif action == 7: 
        print("Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)")
        aux = int(input())
        aux = aux -1
        if(aux >= 0):
            print("Seleccione operación a realizar1 - Deposito2 - Retiro")
            aux2 = int(input())
            if(aux2 == 1):
                print("Ingrese cantidad a depositar: ")
                amount = float(input())
                Bank.accounts[aux].add_amount(amount)
            elif(aux2 == 2):
                print("Ingrese cantidad a retirar: ")
                amount = float(input())
                Bank.accounts[aux].substract_amount(amount)
            else:
                print("Operación inexistente")
        else:
            print("Operación cancelada")
    else:
        break
    
    print("\nMenu ------------------------------------")
    print("1 - Crear empleado\n2 - Crear cuenta\n3 - Ver empleado\n4 - Ver lista de empleados\n5 - Ver cuenta\n6 - Ver lista de cuentas\n7 - Realizar operación\n0 - Salir\nElegir: ")
    action = int(input())
    