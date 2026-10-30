# PROMPTS: Grupo ____

**Integrantes:**

1. Eduardo Franco
2. Lucas Volpe
3. Edson Fernando

**Prova:** POO

**Usamos IA?** (x) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):**ChatGpt

> Quem não usou IA: troque "prompt" por "passo". Em cada bloco abaixo, descreva o que vocês fizeram naquele passo, na ordem em que aconteceu, e preencha os outros campos do mesmo jeito.

## Registro, na ordem

Copie o bloco abaixo para cada prompt. Escreva o prompt exatamente como foi enviado.

### Prompt 1

**O prompt (cópia exata):**

> leia o arquivo que eu te enviei e crie a arquitetura das classes em Java nos pacotes model e app. Monte a classe abstrata Veiculo, as subclasses Carro, Moto, CarroEletrico e a interface para a recarga, aplicando encapsulamento e as regras de cálculo do aluguel.

**O que a IA devolveu (uma ou duas linhas):** Devolveu a estrutura do projeto com os códigos, além da explicação de alguns termos

**O que fizemos com a resposta:** ( ) usamos como veio  (x) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):** Mudamos os "números mágicos" no meio dos cálculos e retiramos comentários desnecessários

### Prompt 2

**O prompt (cópia exata):**

> Alguns ajustes: Quero que as os numeros que estao no meio do codigo, passem a ser constantes; Retire os comentarios. Por fim, me mande tudo em um arquivo zip 

**O que a IA devolveu (uma ou duas linhas):** Devolveu um arquivo zip com as correções

**O que fizemos com a resposta:** ( ) usamos como veio  (x) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**Ele colocou constantes inclusive no main, alteramos isso mantendo apenas na 
model.

### Prompt 3

**O prompt (cópia exata):**

> nao precisa colocar constantes na classe main, apenas nos arquivos da model 

**O que a IA devolveu (uma ou duas linhas):** Devolveu um arquivo zip com as correções necessárias

**O que fizemos com a resposta:** (x) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

(continuem com quantos blocos precisarem)

## Como conferimos

Descrevam como vocês testaram o que ficou pronto. Colem aqui a saída do programa (POO) ou o resultado do roteiro (API) e digam se bateu com a tabela da prova. Se não bateu, digam o que fizeram.

## Simulação dos testes com IA

1. Carro – 3 dias
Status: 200 OK
Corpo:
{
  "modelo": "Onix",
  "dias": 3,
  "valorTotal": 495.00
}

2. Moto – 4 dias
Status: 200 OK
Corpo:
{
  "modelo": "Honda CG",
  "dias": 4,
  "valorTotal": 320.00
}

3. Moto – 5 dias
Status: 200 OK
Corpo:
{
  "modelo": "Yamaha",
  "dias": 5,
  "valorTotal": 340.00
}

4. Carro elétrico – 3 dias
Status: 200 OK
Corpo:
{
  "modelo": "Tesla Model 3",
  "dias": 3,
  "valorTotal": 705.00
}

5. Recarga elétrica
Status: 200 OK
Corpo:
{
  "custoRecarga": 24.00
}

6. Veículo inválido
Status: 400 Bad Request
Corpo:
{
  "erro": "Tipo de veículo não suportado"
}

## Onde a IA errou, ou onde nós erramos

Contem pelo menos um erro que apareceu durante a prova: o que era, como perceberam e como resolveram. Se não apareceu nenhum, expliquem como vocês têm certeza disso.

Ela acertou na arquitetura, mas não deixou um código totalmente limpo e fácil de entender, resolvemos isso indicando melhores padrões para ela.

## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:**Porque Veículos é uma classe abstrata, não podendo ser instanceada. Isso se aplica na vida real, pois nenhuma locadora aluga um Veículo, e sim, um carro ou moto, algo concreto.

**Pergunta 2:**O nome desse conceito é Polimorfismo, ele funciona porque todos os tipos (carro, moto, elétrico) herdam de Veiculo e adaptam o método de calcular aluguel para a sua própria regra.

**Pergunta 3:**Está em uma interface para garantir que apenas os veículos elétricos tenham essa função. Se estivesse na classe Veiculo, os carros normais e as motos teriam que herdar o cálculo de recarga.
