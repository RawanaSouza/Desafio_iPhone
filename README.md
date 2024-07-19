# 🚀 POO - DESAFIO

## 📱 Modelagem e Diagramação de um Componente iPhone

Neste desafio, foi solicitada a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### 💡 Contexto

Este projeto se baseia no vídeo de lançamento do iPhone de 2007, especialmente nos minutos entre 00:15:00 e 00:55:00, onde as funcionalidades principais são demonstradas. A partir dessas informações, foi criado um diagrama UML para representar as classes e interfaces que implementam essas funcionalidades. Em seguida, foi feita a implementação das classes e interfaces em Java, organizadas em pacotes.

### 📔 Funcionalidades a Modelar

1. Reprodutor Musical
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. Aparelho Telefônico
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. Navegador na Internet
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## 📊 Diagrama UML
^
[![](https://mermaid.ink/img/pako:eNqNk89uwjAMxl8lygk0xgP0MAltlx2G0Jh2WXcwjWmtpUnlJmgD8e7zoCBa_nQ9Nc7vsx1_yUZn3qBOdGahrp8IcoYydTQrvEN1f_-gyAXkJWSoXrFib2Lw_BJrysBe4SYVMNrCv6HFpXeU-SvgFFaYg_H8_BdyGFJ30KrxWMid6ChO1J0KPgMeDFuxCmJ9FqyleEbeQdPsYB6YXK7K3WqoWrClXBI0hIslsm9ng4DOoNRQh6-1TXJIAn70zEj-3a87zeA3LYhnkJM7NhLZdmoY2jc89SuYLGDQbSGCpTUc0sjuybiEKIFck_zjUwHn9Q654V9noj3gyZh7yP7Zn-Y4vy63POmTHZ36B3vRtlPd2QXtc7NHedHiPk3Xdz3SMgxx28iz3aRO7qIOBZaY6kR-DfBXqlO3FQ7EmfmPy3QSOOJIs495oZMl2FpWsTIyrebN75HtL62VcKw?type=png)](https://mermaid.live/edit#pako:eNqNk89uwjAMxl8lygk0xgP0MAltlx2G0Jh2WXcwjWmtpUnlJmgD8e7zoCBa_nQ9Nc7vsx1_yUZn3qBOdGahrp8IcoYydTQrvEN1f_-gyAXkJWSoXrFib2Lw_BJrysBe4SYVMNrCv6HFpXeU-SvgFFaYg_H8_BdyGFJ30KrxWMid6ChO1J0KPgMeDFuxCmJ9FqyleEbeQdPsYB6YXK7K3WqoWrClXBI0hIslsm9ng4DOoNRQh6-1TXJIAn70zEj-3a87zeA3LYhnkJM7NhLZdmoY2jc89SuYLGDQbSGCpTUc0sjuybiEKIFck_zjUwHn9Q654V9noj3gyZh7yP7Zn-Y4vy63POmTHZ36B3vRtlPd2QXtc7NHedHiPk3Xdz3SMgxx28iz3aRO7qIOBZaY6kR-DfBXqlO3FQ7EmfmPy3QSOOJIs495oZMl2FpWsTIyrebN75HtL62VcKw)

## 💻 Estrutura do código

### Classe `Aparelho`

**Localização:** `loja/Aparelho.java`

**Descrição:** A classe `Aparelho` foi adicionada ao projeto para servir como ponto de entrada principal do aplicativo. Esta classe tem o método `main` que cria uma instância da classe `Iphone` e demonstra suas funcionalidades.

**Propósito:** O objetivo da classe `Aparelho` é simular o funcionamento do iPhone, mostrando como ele pode ser usado para tocar músicas, fazer chamadas telefônicas e navegar na internet. Isso é feito chamando os métodos implementados na classe `Iphone`.

---

### Classe `Iphone`

**Localização:** `smartphone/Iphone.java`

**Descrição:** Implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.

---

### Interface `ReprodutorMusical`

**Localização:** `smartphone/aplicativos/ReprodutorMusical.java`

**Métodos:** `tocar()`, `pausar()` e `selecionarMusica(String musica)`

---

### Interface `AparelhoTelefonico`

**Localização:** `smartphone/aplicativos/AparelhoTelefonico.java`

**Métodos:** `ligar(String numero)`, `atender()` e `iniciarCorreioVoz()`

---

### Interface `NavegadorInternet`

**Localização:** `smartphone/aplicativos/NavegadorInternet.java`

**Métodos:** `exibirPagina(String url)`, `adicionarNovaAba()` e `atualizarPagina()`

<br>

## 🔗 Links

[Vídeo Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

[Ferramenta UML Mermaid](https://mermaid.js.org/)

[DIO Java Básico Repositório](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)