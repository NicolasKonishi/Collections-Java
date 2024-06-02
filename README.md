# Java Collections: Map, Set, e List

Este repositório é referente ao curso "Conhecendo collections em java" onde há explicações sobre as principais coleções do Java: `Map`, `Set` e `List`. 
Utilizei ele como anotações de estudo e prática com códigos.


## List

`List` é uma coleção ordenada que permite elementos duplicados. Ela mantém a ordem de inserção dos elementos e permite acessar os elementos por índice.

### Implementações Comuns
- `ArrayList`
- `LinkedList`

### Características
- Permite elementos duplicados.
- Mantém a ordem de inserção.
- Acesso aleatório eficiente (em `ArrayList`).

## Set

`Set` é uma coleção que não permite elementos duplicados. A ordem dos elementos não é garantida (a menos que você use uma implementação específica que mantenha a ordem).

### Implementações Comuns
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

### Características
- Não permite elementos duplicados.
- Pode ser desordenado (`HashSet`), ordenado (`TreeSet`), ou manter a ordem de inserção (`LinkedHashSet`).

## Map

`Map` é uma coleção de pares chave-valor. Cada chave deve ser única, mas os valores podem ser duplicados.

### Implementações Comuns
- `HashMap`
- `LinkedHashMap`
- `TreeMap`

### Características
- Associa chaves únicas a valores.
- Permite acesso rápido aos valores com base na chave.
- `LinkedHashMap` mantém a ordem de inserção.
- `TreeMap` mantém as chaves ordenadas.

