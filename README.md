# INF3036 - Soutien Algorithmique et Programmation
## Allocation dynamic
## Structure de données
## Complexité algorithmique
## Récursivité
## Listes chainées
[Présentation](https://raw.githubusercontent.com/GeVa2072/INF3036/master/chap_1_listes_chainees_fonction_de_base.pdf)
### Structure d'une liste chainées.
### Les opérations sur les listes chainées.
## Les Arbres
[Présentation](https://github.com/GeVa2072/INF3036/raw/master/INF2031_ARBRES.pdf)
### Arbre bianaire
https://fr.wikipedia.org/wiki/Rotation_d%27un_arbre_binaire_de_recherche

# Projet 
Je vous propose la réalisation d'une application de gestion de client en C.

Dans une premiére partie, nous allons définir ce que représente un client (nom, prénom, ...) afin de créer une structure qui permettra sont stockage. 
Ensuite nous allons construire une liste chainée qui contiendra nos clients et ajouter quelque fonction de base (ajout dans la liste, retrait de la liste, déplacement ...)
Cette liste ne permettrant pas facilement la recherche, nous allons ajouter des arbres bianires de recherche sur différent élémeent, comme le nom par exemple. 


# Exercice JAVA 
https://projecteuler.net/problem=18

https://projecteuler.net/problem=67


https://fr.wikipedia.org/wiki/Jeu_de_la_vie

## Une version plus simple du jeu de la vie

Le jeu se déroule dans une ligne (une seule dimension).

On représente une cellule vivante par un X et une cellule morte par un espace " " 

A chaque étape, l'état d'une cellule est déterminée par l'état de ses 2 voisines. 

Si elle est entourée de cellules vivantes elle meure, si il n'y a aucune cellule autour elle ne change pas d'état, sinon elle nait. 

Un exemple de test serait de démarrer le programme avec la chaine de texte "   X     "

L'état suivant serait donc : 

"  XXX    "

Puis :

" XX XX   "

"XXXXXXX  "

"X     XX "

L'étape d'après consiste à ajouter un nombre binaire sur 8 bits définissant le pattern. 


Exemple : 

Soit la régle 90, représenter en binaire "01011010"

Chaque cellule représente un nombre avec ses voisines sur 3 bits donc entre 0 et 7. 

Exemple : 

" X " => en binbaire 010 => soit 2 

En prenant le 2ème bit de la régle "01011**0**10" on obtient 0, la cellule meure. 

Les combinaissons pour la régle 90 sont donc :

"   " => 0 => La cellule est morte au tour suivant. "0101101**0**"

"  X" => 1 => La cellule est vivante au tour suivant. "010110**1**0"

" X " => 2 => La cellule est morte au tour suivant. "01011**0**10"

" XX" => 3 => La cellule est vivante au tour suivant. "0101**1**010"

"X  " => 4 => La cellule est vivante au tour suivant. "010**1**1010"

"X X" => 5 => La cellule est morte au tour suivant. "01**0**11010"

"XX " => 6 => La cellule est vivante au tour suivant. "0**1**011010"

"XXX" => 7 => La cellule est morte au tour suivant. "**0**1011010"







