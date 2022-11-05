# API-_Palindromos

## instalacion

La api se puede ejecutar de dos manera, corriendo el dockerfile o el jar

## Crear imagen docker

` docker build -t api .`


## Crear contenedor docker

` docker run -d -p 8080:8080 api `


## Uso de la aplicacion

Login - POST

  `http://127.0.0.1:8080/login`
  
### Body
`
 {
  "username":"anyUser",
  "password":"pass" (fija)
 } 
 ` 
 ### Response
 
`
 {
  "token":String
 } 
 ` 
 <br><br>
 ### Example
![image](https://user-images.githubusercontent.com/51394121/200145046-fbdbf69e-59c2-4ab5-9bcc-290e0cd71e47.png)


- Encontrar Palindromo
  
  `Authorization : Bearer Token`
  
  `http://127.0.0.1:8080/palindrome`
  
  ### Body
`
    {
       "palindrome":"anita lava la tina"
     }`
### Response

`{
'ava'
}`
