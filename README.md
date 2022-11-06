# API-_Palindromos

## instalacion

La api se puede ejecutar de dos manera, corriendo el dockerfile o el jar

## Crear imagen docker

` docker build -t api .`


## Crear contenedor docker

` docker run -d -p 8080:8080 api `


## Uso de la aplicacion

### Login - POST

  `http://127.0.0.1:8080/login`
  
### Body
`
 {
  "username":"anyUser",
  "password":"pass"
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


### Encontrar Palindromo - POST
  
  `Authorization : Bearer Token`
  
  `http://127.0.0.1:8080/palindrome`
  
### Body
`
    {
       "palindrome":"anita lava la tina"
     }`
### Response

`{
"palindrome":"ava"
}`

 ### Example
![image](https://user-images.githubusercontent.com/51394121/200148246-5a4a47e8-8d5e-43ad-8bc2-a7094ecb40e7.png)
