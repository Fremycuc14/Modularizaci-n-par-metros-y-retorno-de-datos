Funcion resultado <- Suma (operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	resultado <- operandoUno + operandoDos
	
FinFuncion

Funcion resultado <- Resta (operandoUno, operandoDos)
	
	Definir resultado Como Real

	resultado <- operandoUno - operandoDos
	
FinFuncion

Funcion resultado <- multiplicacion (operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	resultado <- operandoUno * operandoDos
	
FinFuncion

Funcion resultado <- division (operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	resultado <- operandoUno / operandoDos
	
FinFuncion

Algoritmo calculadora
	
	Definir operacion Como Entero
	Definir numeroUno, numeroDos, res Como Real
	Leer operacion
	Leer numeroUno
	Leer numeroDos
	
	Segun operacion Hacer
		1: res <- Suma(numeroUno, numeroDos)
		2: res <- Resta(numeroUno, numeroDos)
		3: res <- multiplicacion(numeroUno, numeroDos)
		4: res <- division(numeroUno, numeroDos)
	FinSegun
	Escribir "El resultado de la operación es ", res
FinAlgoritmo