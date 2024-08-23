# Utilizando o Docker

- Clonar o repositorio git
- Construir o projeto:
```
./mvnw clean package
```
- Construir a imagem:
```
./mvnw spring-boot:build-image
```
- Executar o container:
```
docker run --name service-de-lugares -p 8080:8080 -d service-de-lugares:0.0.1-SNAPSHOT
```

Acessar a API em [localhost:8080](http://localhost:8080)