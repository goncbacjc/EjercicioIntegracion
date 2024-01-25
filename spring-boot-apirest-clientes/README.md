<h1 align="center">Clientes Api RestFull</h1>

## Tabla de contenidos
* [Información General](#general-info)
* [Tecnologías](#technologies)
* [Configuración](#setup)

## Información general
Este servicio está destinado al manejo de Usuarios, Roles, Permisos y Creación de Clientes con sus telefonos.
	
## Tecnologías
El proyecto está creado con:
* Java 10
* Spring Boot 2.0.0
* Spring Security
* Maven library
* H2
* JWT
## Configuración y Ejecución
Para correr el proyecto se necesita tener instalados todos los servicios pertinentes.

POST Token
```
curl --location 'http://localhost:8080/oauth/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Basic cG9zdG1hbjoxMjM0NQ==' \
--header 'Cookie: JSESSIONID=18E3D90B255B9CE871B486348F59D7D5' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=12345' \
--data-urlencode 'grant_type=password'
```
POST Clientes
```
curl --location 'http://localhost:8080/api/clientes' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDYwNDIxMTEsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiIsIlJPTEVfVVNFUiJdLCJqdGkiOiIyZDY3Yjc1ZS0wZmY0LTQ3OTUtODQwOS02Y2IzOTg4YWY2NGQiLCJjbGllbnRfaWQiOiJwb3N0bWFuIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19.m5WGT3KP5A_5JhtT6waAIAU4mgRWteZ9FP9KQ-pbhWP7HamBVUfAMenTswQrSQbeehuWbPYLqC-l3zz-USCn1Rau_fJDVKYfu0p1QhSDqa7MUgIlD3CJCv42x_DX9HTTeVC-v7mOeHYiqchrG-eKgWzMA6NLe3unxpKkMA7NTYhuyciZuwe8TYJON9U9I_5cE669zbSOBdtJrI_2Ee0uiC5k-gkyouDOn6HpYq0JsisWH08oBUKcKC-B9mk24_bLK8tlO4R2pnpazmQ3Ds18WzqIvR2Sc79WLSzjlVOkFqzz3UvvjsBFee1kEgha1RMtmGGn7AIfR-pOSP9UYY1soQ' \
--header 'Cookie: JSESSIONID=18E3D90B255B9CE871B486348F59D7D5' \
--data-raw '{
    "nombre": "Juan",
    "email": "gass@gmail.com",
    "password" : "asdasd12A3",
    "phones": [
        {
            "number" : "153901411",
            "city_code" : "351",
            "country_code" : "+549"
        },
        {
            "number" : "1234567",
            "city_code" : "1",
            "country_code" : "+57"
        }
    ]
    
}'
```
GET Clientes
```
curl --location 'http://localhost:8080/api/clientes' \
--header 'Cookie: JSESSIONID=18E3D90B255B9CE871B486348F59D7D5' \
--data ''
```