# Test S3 and EC2 🚀

Projeto de estudo prático focado na integração de uma API **Spring Boot** com os serviços de infraestrutura da **AWS (S3 e EC2)**.

## 📌 Objetivo
O objetivo deste projeto foi configurar um ambiente real de nuvem para:
1. Hospedar uma aplicação Java em uma instância **EC2 (Amazon Linux 2023)**.
2. Realizar o upload de arquivos de forma segura para o **Amazon S3** utilizando o AWS SDK v2.
3. Configurar permissões via **IAM Roles**, eliminando a necessidade de chaves de acesso (`credentials`) expostas no código.

## 🛠️ Tecnologias
- **Java 17**
- **Spring Boot 3**
- **AWS SDK for Java v2** (S3 Client)
- **Amazon EC2** (Servidor)
- **Amazon S3** (Storage)
- **Maven** (Build Tool)

## ⚙️ Funcionalidades
- [x] Upload de arquivos via `POST /upload`.
- [x] Integração nativa com S3 utilizando perfis de instância (IAM).
- [x] Deploy automatizado via Git no ambiente Linux.

## ☁️ AWS

### 1. Inicialização da API no EC2
Abaixo, o registro da aplicação rodando com sucesso dentro do servidor da AWS, pronta para receber requisições na porta `8080`.

<img width="1092" height="343" alt="Teste AWS" src="https://github.com/user-attachments/assets/81878ae6-0347-4b6f-ab31-197079b8f845" />


### 2. Confirmação de Armazenamento no S3
Após o envio de um arquivo de teste pelo terminal local, validamos a presença do objeto diretamente no bucket através da AWS CLI.

<img width="856" height="416" alt="Arquivo criado" src="https://github.com/user-attachments/assets/08259e2c-181b-4a29-913f-5a24ab37f866" />

## ▶️ Como executar no ambiente local
git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)

cd Test_S3_and_EC2

./mvnw spring-boot:run

### 3. Como testar o Upload (EC2)
Com a API rodando no servidor, utilize o comando curl no seu terminal (Windows ou Linux):
curl -F "file=@nome_do_arquivo.txt" [http://18.222.255.11:8080/upload](http://18.222.255.11:8080/upload)
