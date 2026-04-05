
# 🚀 Guia Rápido: Como usar e contribuir para o projeto BibliotecaUnifor

Este é um passo a passo simples para você baixar o código do nosso aplicativo, criar suas próprias telas e enviar suas alterações para o GitHub sem dor de cabeça!

## 1️⃣ Passo 1: Baixar o código para o seu computador (Clone)
Antes de começar a programar, você precisa trazer o projeto do GitHub para a sua máquina.
1. Crie uma pasta no seu computador onde você gosta de guardar seus projetos.
2. Abra o Terminal (ou Git Bash / PowerShell) dentro dessa pasta.
3. Digite o comando abaixo e aperte Enter:
```bash
git clone https://github.com/RenanRabelo1/BibliotecaUnifor.git
```
Isso vai criar uma pasta chamada `BibliotecaUnifor` com todos os arquivos do projeto.

## 2️⃣ Passo 2: Abrir no Android Studio
1. Abra o **Android Studio**.
2. Clique em **Open** (Abrir).
3. Procure a pasta `BibliotecaUnifor` que você acabou de clonar e selecione ela.
4. **Importante:** Espere a barra de carregamento lá embaixo terminar. O Android Studio precisa de alguns minutos para baixar as dependências e configurar o projeto (sincronização do Gradle) da primeira vez.

## 3️⃣ Passo 3: Criar sua nova Tela/Pasta
Para não bagunçarmos o código uns dos outros, vamos organizar nossas telas em pastas separadas. Já existe um arquivo para o mapa (`MapaPrincipal.kt`), então você deve criar o seu próprio espaço:

1. No menu lateral esquerdo (Project), abra o caminho: 
   `app` > `java` > `com.example.bibliotecaunifor`.
2. Clique com o **botão direito** em cima da pastinha `bibliotecaunifor`.
3. Vá em **New** > **Package** (Pacote/Pasta).
4. Digite o nome da sua feature (ex: `login`, `perfil`, `reservas`) e dê Enter. Isso criará uma pasta nova separada da `MapaPrincipal`.
5. Clique com o botão direito nessa sua **nova pasta** > **New** > **Kotlin Class/File**, escolha a opção **File**, dê um nome para sua tela (ex: `TelaPerfil`) e comece a programar seus Composables!

## 4️⃣ Passo 4: Como salvar e enviar pro GitHub (Commit & Push)
Terminou sua tela? É hora de mandar para o GitHub para juntar com o resto do aplicativo. Abra o terminal (pode ser o terminal integrado dentro do próprio Android Studio, na aba inferior) e siga o ritual:

**A. Verifique o que foi alterado:**
```bash
git status
```
*(Suas novas pastas e arquivos devem aparecer em vermelho).*

**B. Adicione os arquivos para serem salvos:**
```bash
git add .
```
*(O ponto no final significa "adicione todas as modificações". Se der `git status` de novo, elas estarão verdes).*

**C. Crie o pacote de salvamento (Commit):**
```bash
git commit -m "Criação da tela de Perfil e navegação básica"
```
*(Seja claro na mensagem do que você fez!)*

**D. Envie para o GitHub (Push):**
```bash
git push origin main
```
*(Isso vai empurrar seu código lá para a nuvem).*

## 💡 Dica de Ouro
Antes de começar a programar no dia, **sempre** puxe as atualizações que os outros fizeram para não trabalhar com código desatualizado. Para isso, use o comando:
```bash
git pull origin main
```
