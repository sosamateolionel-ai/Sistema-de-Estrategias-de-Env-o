# Sistema de Estrategias de Envío

## Descripción

Este proyecto implementa un sistema de cálculo de costos de envío utilizando programación orientada a objetos en Java. Permite comparar distintas modalidades de transporte según el peso del paquete, la distancia recorrida y las tarifas correspondientes a cada estrategia.

## Funcionamiento

El programa utiliza una clase abstracta llamada `EstrategiaEnvio`, que contiene los datos comunes de todas las modalidades: nombre y tarifa base. También incluye el método `calcularCosto()`, que valida los datos ingresados antes de delegar el cálculo en la fórmula específica de cada modalidad.

Se implementan tres estrategias de envío:

* **Envío estándar:** calcula el costo según la tarifa base, el peso y la distancia.
* **Expreso aéreo:** aplica tarifas más elevadas y agrega un recargo del 25 % sobre el subtotal.
* **Transporte marítimo:** utiliza tarifas más económicas y aplica un descuento del 15 % cuando el peso supera los 1000 kg.

Si el peso o la distancia son negativos, el sistema muestra un mensaje de error y devuelve `-1`.

## Clases principales

### `EstrategiaEnvio`

Clase abstracta que define los atributos comunes, los métodos de acceso y la validación de los datos. Declara el método abstracto `calcular()`, que cada subclase implementa con su propia fórmula.

### `EnvioEstandar`

Calcula el costo sumando la tarifa base, $150 por kilogramo y $2 por kilómetro.

### `EnvioExpresoAereo`

Calcula el costo sumando la tarifa base, $400 por kilogramo y $8 por kilómetro. Luego aplica un recargo del 25 % sobre el subtotal.

### `EnvioMaritimo`

Calcula el costo sumando la tarifa base, $40 por kilogramo y $0,50 por kilómetro. Si la carga pesa más de 1000 kg, aplica un descuento del 15 %.

### `Main`

Crea una lista de estrategias de envío y prueba los cálculos con paquetes de 20 kg y cargas pesadas de 2000 kg. También verifica el comportamiento del sistema ante datos inválidos.

## Conceptos de programación utilizados

* **Abstracción:** la clase `EstrategiaEnvio` define una estructura común para las distintas modalidades.
* **Herencia:** las clases concretas heredan de `EstrategiaEnvio`.
* **Polimorfismo:** una lista de tipo `EstrategiaEnvio` permite trabajar con diferentes modalidades de transporte.
* **Sobrescritura de métodos:** cada subclase implementa su propia versión de `calcular()`.
* **Encapsulamiento:** se utilizan atributos protegidos, privados y métodos de acceso.
* **Colecciones:** se utiliza `ArrayList` para almacenar las estrategias.
* **Validación de datos:** se comprueba que el peso y la distancia no sean negativos.
* **Constantes:** se utiliza `static final` para definir las tarifas y los porcentajes de recargo o descuento.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="731" height="423" alt="image" src="https://github.com/user-attachments/assets/34f74e37-e2fb-4293-96f4-b1ca089612c0" />

## Objetivo del ejercicio

Aplicar abstracción, herencia y polimorfismo para desarrollar un sistema flexible de cálculo de costos de envío. El ejercicio también permite practicar la validación de datos y la implementación de diferentes fórmulas mediante métodos sobrescritos.
