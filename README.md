# README - Cliente e Servidor TCP em Java

## Descrição

Este projeto contém a implementação de um cliente e um servidor TCP simples em Java. O cliente se conecta ao servidor, envia uma mensagem e recebe uma resposta. O servidor aguarda conexões de clientes, recebe mensagens e responde transformando-as em letras maiúsculas.

## Estrutura do Projeto

O projeto é composto por dois arquivos principais:

1. **ClienteTCP.java**: Implementa a lógica do cliente TCP.
2. **ServerTCP.java**: Implementa a lógica do servidor TCP.

## Dependências

- **Java Development Kit (JDK)**: Certifique-se de ter o JDK instalado para compilar e executar os programas.

## Instruções para Compilação e Execução

### Compilação

1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório onde os arquivos estão localizados.
3. Compile os arquivos usando o seguinte comando:

   ```bash
   javac ClienteTCP.java ServerTCP.java
   ```

### Execução

#### Executando o Servidor

1. No terminal, execute o servidor primeiro para que ele possa aceitar conexões de clientes:

   ```bash
   java ServerTCP
   ```

   O servidor aguardará conexões na porta 12345.

#### Executando o Cliente

2. Em um novo terminal, execute o cliente:

   ```bash
   java ClienteTCP
   ```

   O cliente se conectará ao servidor, enviará a mensagem "ping" e imprimirá a resposta recebida do servidor.

## Funcionamento

### ClienteTCP

- O cliente se conecta ao servidor na `localhost` (127.0.0.1) na porta `12345`.
- Envia a mensagem "ping" para o servidor.
- Recebe a resposta do servidor e a imprime no console.

### ServerTCP

- O servidor escuta na porta `12345` por conexões de clientes.
- Quando um cliente se conecta, o servidor lê a mensagem recebida.
- Responde ao cliente convertendo a mensagem recebida para letras maiúsculas.

## Considerações Finais

- O cliente e o servidor estão configurados para se comunicarem na mesma máquina (localhost). Para conectar clientes de diferentes máquinas, altere a variável `IP` no código do cliente para o endereço IP do servidor.
- O servidor está projetado para aceitar múltiplas conexões, mas atualmente não fecha o socket após responder, o que significa que ele pode continuar ouvindo para novos clientes.
- Para encerrar o servidor, você pode usar `Ctrl + C` no terminal.
