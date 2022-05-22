# Censo-Demografico
# eleicoes

### de: Gabriel Hiro Furukawa👨‍💻

# 📑 **ALGORITMO**

  inicio

      enquanto existe habitantes sem registro faça
        exibir("Digite o sexo| Feminino( 0 ) | Masculino ( 1 )| Outros ( 2 ) | aqui: ");

        ler sexo[i];

        escolha sexo[i];
          caso 0 faça;
            cont_femi++;
          fimcaso;
          caso 1 faça;
            cont_masc++;
          fimcaso;
          caso 2 faça;
            cont_outros++;
          fimcaso;

        exibir("digite a idade: ");
        ler idade[i];

        media_idade_g += idade[i];

        se sexo[i] = 1 faça
          media_idade_m += idade[i];
        fimse;

        se idade >= 18 e <=35 faça
          cont_idade_18a35++;
        fimse;

        exibir("Digite a altura: ");
        ler altura[i];

        se sexo [i] = 0 faça
          media_alt_f += altura[i];
        fimse
    fimenquanto

    result_idade_g = media_idade_g / total_g;//Calculo Idade media do Grupo

    result_alt_f = media_alt_f / cont_femi;//Calculo Altura media Feminina

    result_idade_m = media_idade_m / cont_masc;//Calculo idade media Masculina

    escreva( 	
      média da idade do grupo:
      média da altura das mulheres:
      média da idade dos homens:
      quantidade de pessoas que identificaram como outros:
      percentual de pessoas com idade entre 18 e 35 anos (inclusive):
      )
  fim
		
# ⛏ **FLUXOGRAMA**

![fluxograma](https://github.com/GabrielHiro/Censo-Demografico/blob/e002ab20feaafb2a1cc3c465d11c06ed4d410394/censo_demografico_fluxograma.svg)

#### 📑Licença MIT
#### 🕑Última atualização 14/05/2022
