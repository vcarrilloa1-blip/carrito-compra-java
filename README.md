# Carrito de Compra - Java

## Descripcion
Aplicacion web de carrito de compras desarrollada con Java y Spring Boot.
Permite consultar productos, agregar  al carrito y eliminar.

## Tecnologia
- Java 21
- Spring Boots
- Mvn
- MySQL
- HTML, CSS y JavaScript
- Spring Data JPA

## Requisitos
- Java 21
- MySQL
- Maven Wrapper incluido en el proyecto

## Configuracion
1. Crear la base de datos MySQL `cc`.
2. Importar el scriptSQL de la base de datos.
3. Configurar las credenciales mediante las variables de entorno:
   - `DB_USERNAME`
   - `DB_PASSWORD

## Ejecucion
Desde la carpeta del proyecto, ejecutar:

```bash
export DB_USERNAME=carrito_app
export DB_PASSWORD='TU_CONTRASEÑA'
./mvnw spring-boot:runn

