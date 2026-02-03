# **Mi Proyecto**

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-active-success.svg)

</div>

# **Roger Mateo Cipagauta Labrador**
## Ing. Sistemas

---

## 📋 Ejercicio Base

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un Gerente de un concesionario, que desea calcular el promedio de ventas durante 3 (tres) meses de determinado grupo de Vendedores. Como información básica de cada Vendedor se debe registrar el Id y su nombre.

---

## ⚠️ Aclaraciones

- Se supondrá que la aplicación solo se requiere para calcular el promedio de Ventas en el periodo de 3 meses 
- Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos
- No se realiza validación, ni se verifica calidad en los datos ingresados

---

## 🧠 Análisis de Ejercicio

### Historia de Usuario

![Historia de Usuario](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/Imagenes/Historiausuario%20.jpg)

---

## 📊 Caso De Uso

### Descripción Casos de uso

![Diagrama de Casos de Uso](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/Imagenes/CasodeUso.png)

---

## 🔄 Diagrama de Flujo

![Diagrama de Flujo](https://github.com/RogerCipa7/Rogerpoo1.github.io/blob/main/Imagenes/Diagrama%20de%20flujo.png)

---

## 🧮 Pseudocódigo

```
INICIO
  - Caracteres: ID[10] Nombre[10]
  - Entero: VentaMes1 VentaMes2 VentaMes3 NumeroVendedores
  - Imprimir: 'Digite el número de vendedores:'
  - Asignar: numeroVendedores
  - Para i=0 hasta numeroVendedores-1, 1
    - Mostrar: 'Ingrese el ID del Vendedor'
    - Leer: ID
    - Mostrar: 'Ingrese el Nombre del Vendedor:'
    - Leer: Nombre
    - Mostrar: 'Ingrese el valor de ventas del mes 1:'
    - Leer: VentasMes1
    - Mostrar: 'Ingrese el valor de ventas del mes 2'
    - Leer: VentasMes2
    - Mostrar: 'Ingrese el valor de ventas del mes 3'
    - Leer: VentasMes3
    - ID[i] <- identificacion
    - nombres[i] <- nombre
    - VentasMes1[i] <- Mes1 
    - VentasMes2[i] <- Mes2
    - VentasMes3[i] <- Mes3
  finPara
  - Para i=0 hasta numeroVendedores-1, 1
    - promedioVentas <- promedio + ((VentasMes1[i] + VentasMes2[i] + VentasMes3[i])/3) / numeroVendedores
  finPara
  - Imprimir: 'El promedio de ventas del concesionario es: $' + promedioVentas
FIN
```

---

## 🚀 Instalación y Uso

### Requisitos
- Java JDK 8 o superior
- IDE de Java (Eclipse, IntelliJ IDEA, NetBeans)

### Ejecutar el proyecto
```bash
# Clonar el repositorio
git clone https://github.com/RogerCipa7/Rogerpoo1.github.io.git

# Compilar
javac PromedioVentas.java

# Ejecutar
java PromedioVentas
```

---

## 📚 Conceptos Aplicados

Este proyecto demuestra:
- ✅ Estructuras repetitivas (`for`)
- ✅ Manejo de arreglos
- ✅ Operaciones aritméticas (cálculo de promedios)
- ✅ Lógica de programación estructurada
- ✅ Análisis y diseño de software

---

## 🔮 Mejoras Futuras

- [ ] Implementar persistencia de datos (base de datos)
- [ ] Agregar validación de entrada
- [ ] Desarrollar interfaz gráfica (GUI)
- [ ] Generar reportes por vendedor
- [ ] Permitir períodos configurables

---

<div align="center">

**Desarrollado como ejercicio académico de Programación Orientada a Objetos**

[![GitHub](https://img.shields.io/badge/GitHub-RogerCipa7-181717?style=flat&logo=github)](https://github.com/RogerCipa7)

</div>
