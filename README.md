# **Mi Proyecto**
# **Roger Mateo Cipagauta Labrador**
## Ing.Sistemas

## Ejercicio Base:
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación quenecesita un Gerente de un consecionario, que desea calcular el promedio de ventas duante 3 (tres) meses de determinado grupo de Vendedores. Como información básica de cada Vendedor se debe registrar el Id y su nombre.

## Aclaraciones
- Se supondrá que la aplicación solo se requiere para calcular el promedio de Ventas en el periodo de 3 meses 
- Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia
en el almacenamiento de los datos.
- No se realiza validación, ni se verifica calidad en los datos ingresados

## Analisis de Ejercicio
- Historia de Usuario
![Texto alternativo](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/Historiausuario%20.jpg?raw=true)


## Caso De uso
- Descripcion Casos de uso
![Texto alternativo](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/poo1.png?raw=true)

## Diagrama de flujo
![Texto alternativo](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/Imagenes/Diagrama%20de%20flujo.png)
##  pseudocódigo

INICIO
- Caracteres: ID[10] Nombre[10]
- Entero: Ventames1 Ventames2 Vnetames3 NumeroVendedores
- Imprimir: ‘Digite el número de estudiantes:’
- Asignar: numeroVendedores
- Para i=0 hasta numeroVendedores- 1, 1
- Mostrar: ‘Ingrese el ID del Vendedor’
- leer: ID
- Mostrar: ‘ingrese el Nombre del Vendedore:’
- Leer: Nombre
- Mostrar: ‘Ingrese el valor de ventas del mes 1:’
- Leer: VentasMes1
- Mostrar: ‘Ingrese el valor de ventas del mes 2’
- Leer: VentasMes2
- Mostrar: ‘Ingrese el valor de ventas del mes 3’
- Leer: VentasMes3
- ID [i] <- identificacion
- nombres [i] <- nombre
- VentasMes1 [i] <- Mes1 
- VentasMes1 [i] <- Mes2
- VentasMes1 [i] <- Mes3

finPara
- Para i=0 hasta numeroVendedores -1, 1
- promedioVentas <-
- promedio +(( VentasMes1 [i]+ VentasMes2[i]+ VentasMes3[i])/3)numeroVendedores

finPara
- Imprimir: ‘El promedio de ventas del concesionario es:$’ + promedioVentas

FIN
