# Application Calcul IMC

## Description

Calcul IMC est une application Android développée en Kotlin dans le cadre d'un travail pratique en développement mobile.

L'application permet de calculer l'Indice de Masse Corporelle (IMC) à partir du poids et de la taille de l'utilisateur, puis d'afficher la catégorie correspondante.

## Objectifs

- Saisir le poids et la taille de l'utilisateur.
- Calculer automatiquement l'IMC.
- Afficher le résultat avec deux chiffres après la virgule.
- Identifier la catégorie correspondant à l'IMC.
- Vérifier la validité des données saisies.
- Afficher un message d'erreur en cas de saisie incorrecte.
- Permettre d'effacer les données avec le bouton Effacer.

## Technologies utilisées

- Kotlin
- Android Studio
- XML
- Android SDK
- Git et GitHub

## Fonctionnement

La formule utilisée est :

IMC = Poids (kg) / Taille² (m)

### Catégories de l'IMC

| IMC | Catégorie |
|---|---|
| < 18,5 | Insuffisance pondérale |
| 18,5 – < 25 | Corpulence normale |
| 25 – < 30 | Surpoids |
| 30 – < 35 | Obésité modérée |
| 35 – < 40 | Obésité sévère |
| ≥ 40 | Obésité morbide |

La catégorie est affichée avec une couleur adaptée au résultat.

## Validation des données

L'application vérifie que :

- les deux champs sont remplis ;
- les valeurs saisies sont valides ;
- le poids et la taille sont strictement positifs.

En cas d'erreur, un message est affiché à l'utilisateur.

## Tests réalisés

- 70 kg / 1,75 m → IMC ≈ 22,86 → Corpulence normale
- 50 kg / 1,75 m → IMC ≈ 16,33 → Insuffisance pondérale
- 85 kg / 1,70 m → IMC ≈ 29,41 → Surpoids
- 100 kg / 1,70 m → IMC ≈ 34,60 → Obésité modérée
- Champ vide → Message d'erreur
- Taille égale à 0 → Message d'erreur

## Fichiers principaux

- MainActivity.kt : contient la logique de calcul et la gestion des événements.
- activity_main.xml : contient l'interface graphique de l'application.
- strings.xml : contient les textes utilisés dans l'application.

## Difficultés rencontrées

Les principales difficultés rencontrées concernent la création de l'interface Android, la gestion des événements des boutons, la validation des données saisies et l'affichage dynamique de la catégorie de l'IMC.

Ce TP m'a permis de mieux comprendre le développement d'interfaces Android avec XML et la programmation en Kotlin.

## Réalisé par

Mouna Bettouhami

Étudiante en Licence Développement des Systèmes Informatiques

ISET de Djerba
