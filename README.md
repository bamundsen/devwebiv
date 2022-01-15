# Desenvolvimento Web IV
Atividade I para a matéria de Desenvolvimento Web IV do aluno Bruno de Oliveira Pereira

## 1 - Spring Tool Suite
1. É um ambiente de desenvolvimento web fundamentado na IDE do Eclipse, a fim de realizar programação em Java agregado às tecnologias Spring.
2. Versão STS 4.13.0
3. - [ ] **Instalação da Ferramenta**
      - [ ] Vá ao site de [downloads do spring tools](https://spring.io/tools) e baixe a versão para Línux.
      - [ ] No terminal, abra o diretório onde o arquivo está.
      - [ ] Execute "sudo <nome do arquivo> /opt" para mover o arquivo parao diretóorio onde será descompactado.
      - [ ] Mova-se para o diretório opt com "mv /opt" e descompacte o arquivo com "sudo tar zxvf <nome do arquivo>.
      - [ ] Mova-se para o diretório que foi criado com "mv sts-4.13.0.RELEASE".
      - [ ] Para abrir a IDE use o comando "sudo ./SpringToolSuite4".
4. Configurado para Ubuntu.
            
# 2 - Java Development Kit
1. É uma linguagem de programação orientada a objetos. Hoje é correto afirmar que Java é mais do que só uma linguagem de programação, pois é uma tecnologia generalizada.
2. Versão JDK 11.0.13   
3. - [ ] **Instalação da Ferramenta**
      - [ ] No terminal, insira o comando "sudo apt install openjdk-11-jdk" e o execute.
      - [ ] Ao final do download e instalação, o JDK estará pronto para ser utilizado.
4. Configurado para Ubuntu.

## 3 - MySQL
1. É um sistema gerenciador de bancos de dados que utiliza a linguagem SQL.
2. Versão MySQL 14.14 Distrib 5.7.36
3. - [ ] **Instalação da Ferramenta**
      - [ ] Vá ao site de [downloads do MySQL para Ubuntu](https://dev.mysql.com/downloads/mysql/5.7.html) e baixe a versão **Linux - Generic (glibc 2.12) (x86, 64-bit), TAR**.
      - [ ] No terminal, execute o comando "sudo apt install mysql-server".
      - [ ] Após a instalação estar concluída, para criar usuários acesse o MySQL via terminal executando o comando "sudo mysql".
      - [ ] No MySQL execute o comando SQL "CREATE USER 'usuario'@'localhost' IDENTIFIED BY 'senha';".
      - [ ] Caso deseje conceder os privilégios de administrador ao usuário, execute o comando "GRANT ALL PRIVILEGIES ON *.* TO 'usuario'@'localhost' WITH GRANT OPTION;"     
      - [ ] O MySQL eestá pronto para uso.
4. Configurado para Ubuntu.
            
## 4- Git
1. É um sistema de controle de versṍes de códigos (softwares) e também de registro de histórico de edições em arquivos gerais.
2. Versão Git 2.17.1
3. - [ ] **Instalação da Ferramenta**
      - [ ] No terminal, execute o comando "sudo apt install git".
      - [ ] Após o término, a aplicação estará instalada e pronta para o uso.
4. Configurado para Ubuntu.
      
## 5 - Node.js
1. É um software capaz de executar comandos JavaScript sem a necessidade de haver um navegador web.
2. Versão Node.js 8.10.0
3. - [ ] **Instalação da Ferramenta**
      - [ ] Caso não possui a ferramenta de transferência de dados "curl", instale-a com "sudo apt install curl" no terminal.
      - [ ] No terminal, execute o comando do curl "curl -sl https://deb.nodesource.com/setup_14.x | sudo -E bash -".
      - [ ] Após o término, execute o comando "sudo apt-get install -y node.js"
      - [ ] Ao fim do download e instalação estará pronto para o uso..
4. Configurado para Ubuntu.
      
## 6 - Postman
1. É um "API Client" no qual se pode criar e gerenciar solicitações HTTP e HTTPs, a fim de testar APIs.
2. Versão Postman 9.8.3
3. - [ ] **Instalação da Ferramenta**
      - [ ] Abra o aplicativo nativo do Ubuntu "Ubuntu Software".
      - [ ] Na pesquisa digite o nome do aplicativo "Postman".
      - [ ] Selecione o aplicativo e clique em "Install".
      - [ ] Com o aplicativo instalado, execute-o e crie uma conta (ou pule este passo).
      - [ ] Após os passos, o aplicativo estará pronto para o uso.
4. Configurado para Ubuntu.
      
      
## 7 - Httpie
1. É um cliente capaz de mandar requisições HTTP via terminal, a fim de testar, depurar e interagir com servidores HTTP.
2. Versão Httpie 0.9.8
3. - [ ] **Instalação da Ferramenta**
      - [ ] No terminal, execute o comando "sudo get-apt install httpie".
      - [ ] Após o download e instalação a aplicação estará pronta para o uso.
4. Configurado para Ubuntu.
          
