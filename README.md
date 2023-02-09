# Zootopia

# Una reserva natural nos ha pedido un sistema de gestión para el control de su fauna.



## Requisítos:

Un vista principal con un formulario de acceso a la zona de administración (El sistema será gestionado solo por un usuario administrador)
Si un usuario intenta loggearse y no utiliza la palabra clave correcta para acceder al sistema este deberá tener un feedback del sistema
Una vez loggeado el administrador visualizará el dashboard en el cual se debe reflejar la cantidad total de especies que hay actualmente en la reserva
El sistema deberá permitir añadir un nuevo ejemplar
Suprimir un ejemplar
Editar un ejemplar
Se deberá poder visualizar una lista de los ejemplares
La lista deberá tener paginación
Los ejemplares se podrán filtrar según la familía a la que pertenece o bien al país de origen.


## Familias mínimas requeridas:

Félidos(León, Tigre, Leopardo, etc...)
Cánidos (Zorro,Lobos,Chacales, etc...)
Reptiles (Cocodrilos,Serpientes,Iguanas, etc...)
Mustelids (Nútria,Comadrejas,Tejones, etc...)
Leporidae (Conejos y Liebres)


## Para el registro de cada ejemplar se deberá introducir los siguientes datos:

Nombre
Tipo
Familia a la que pertece
Género
Fecha de ingreso
Imagen (extra)


## Extra:

Cada ejemplar tendrá su foto


PD: El sistema de loggeo no utilizará spring security sino que se solicitará la palabra clave almacenada en la tabla users y se comprobará si coincide con la palabra clave almacenada en la store de Vue.


# Tecnologías:

Frontend: Vue, SCSS - Opcional: Framework de CSS.
Backend: JAVA.
Bases de datos: MySQL
No se pueden usar otras librerias o frameworks que los espicificados.# <p align="center"> 


## Versión Mobile




## 📁 Acceso al proyecto

![captura_de_pantalla_2023-02-09_a_las_22 07 08_720](https://user-images.githubusercontent.com/116892294/217942035-4e7d7712-e62e-4647-8477-80c12ac7c86d.png)

![formanimals_720](https://user-images.githubusercontent.com/116892294/217943660-6bdab640-db64-43a2-85e1-3153869f0064.png)

![image__1__720](https://user-images.githubusercontent.com/116892294/217944015-278770b8-33a4-4403-b34c-b4f5372ce723.png)

![UserFlow](https://user-images.githubusercontent.com/116892294/217943442-b114ef69-23b8-40e1-9c6c-9517975ccb9b.png)


https://github.com/CarenSalles/Zootopia.git

https://www.figma.com/file/QPucIOrJsRuk8X5rF78o1W/Untitled?node-id=0%3A1&t=rQ3YXe86VWkB83Gz-0

## :heavy_check_mark: Herramientas utilizadas:
- Figma
- Jira
- HTML5 (metodología BEM)
- SASS (SCSS)
- JS
- VUE3
- Vite
- Pinia
- Java
- Maven
- Apache
- Tomcat
- Xamp
- MsQL
- Workbench
- Postman
- Spring-Boot


## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur) + [Vue Plugin (Volar)](https://marketplace.visualstudio.com/items?itemName=Vue.vscode-vue-plugin).

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

```sh
npm install
```




# frontend

This template should help get you started developing with Vue 3 in Vite.

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and disable Vetur) + [TypeScript Vue Plugin (Volar)](https://marketplace.visualstudio.com/items?itemName=Vue.vscode-typescript-vue-plugin).

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

```sh
npm install
```

### Compile and Hot-Reload for Development

```sh
npm run dev
```

### Compile and Minify for Production

```sh
npm run build
```

### Run Unit Tests with [Vitest](https://vitest.dev/)

```sh
npm run test:unit
```
# backend

```sh
mvn clean package

```sh
https://start.spring.io/
```
  
 ### Autores

- Carol Vilchez https://github.com/Carol21d
- Caren Salles https://github.com/CarenSalles
- Enol Igareta https://github.com/EnolCode
- Raúl Martinez https://github.com/RaulMartinezF5
- Gabriel Mendéz https://github.com/GabriMF
