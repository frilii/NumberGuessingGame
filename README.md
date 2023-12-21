# Number Guessing Game (Jogo de Adivinhação de Números)

## Visão Geral

Este é um simples Jogo de Adivinhação de Números implementado em Bash. O jogo gera um número aleatório entre 0 e 99, e o objetivo do jogador é adivinhar o número correto. O jogo fornece feedback após cada tentativa, indicando se o número adivinhado é muito baixo, muito alto ou correto. O jogo continua até que o jogador adivinhe corretamente o número.

## Instruções

1. **Executar o Programa:**
    - Clone o repositório: `git clone https://github.com/seu-usuario/nome-do-repositorio.git`
    - Navegue até o diretório do jogo: `cd nome-do-repositorio`
    - Execute o script Bash: `bash number_guessing_game.sh`

2. **Início do Jogo:**
    - Ao executar o script, um número aleatório entre 0 e 99 é gerado.

3. **Adivinhação:**
    - Insira sua suposição quando solicitado.
    - O script fornecerá feedback, indicando se o número adivinhado é muito baixo, muito alto ou correto.

4. **Vencendo o Jogo:**
    - Continue adivinhando até identificar corretamente o número gerado aleatoriamente.
    - Após uma suposição correta, o script parabenizará você, e o jogo será encerrado.

5. **Encerramento do Jogo:**
    - O jogo será encerrado automaticamente após uma suposição bem-sucedida.
    - Você também pode encerrar o jogo manualmente a qualquer momento pressionando `Ctrl+C`.

## Recursos

- **Geração de Número Aleatório:**
    - O jogo utiliza a função `$RANDOM` para gerar um número aleatório entre 0 e 99.

- **Feedback:**
    - Fornece feedback em cada suposição, ajudando o jogador a ajustar suas suposições subsequentes.

- **Looping:**
    - O jogo é implementado usando um loop `while`, que continua até que o número correto seja adivinhado.

## Exemplo de Uso

```bash
$ bash number_guessing_game.sh
Adivinhe um número entre 0 e 99:
50
Muito baixo!

Adivinhe um número entre 0 e 99:
75
Muito alto!

Adivinhe um número entre 0 e 99:
63
Muito alto!

Adivinhe um número entre 0 e 99:
57
Parabéns, você acertou!
