#language: fr
  # ceci est une nouvelle regle de gestion qu'il ne faut pas oublier
  # retrait montant négatif


Fonctionnalité: Paiement avec une carte electron

  Scénario: Retrait d'argent accepté avec solde de compte suffisant et montant retiré inférieur au plafond
    Soit une carte electron avec un plafond de 3000
    Et que mon compte a un solde de 2000
    Quand je réalise un retrait de 500
    Alors la transaction est acceptée
    Et ma carte doit avoir un plafond de 2500
    Et mon compte doit avoir un solde de 1500

#  Scénario: Retrait d'argent refusé avec solde de compte insuffisant
#    Soit une carte electron
#    Et que mon compte a un solde de "500"
#    Quand je réalise un retrait de "1000"
#    Alors la transaction est refusée
#    Et mon compte doit avoir un solde de "500"
#
#  Scénario: Retrait d'argent refusé avec solde de compte suffisant et montant retiré supérieur au plafond
#    Soit une carte electron avec un plafond de 10
#    Et que mon compte a un solde de "500"
#    Quand je réalise un retrait de "20"
#    Alors la transaction est refusée
#    Et ma carte doit avoir un plafond de "10"
#    Et mon compte doit avoir un solde de "500"
#
#  Scénario: Retrait d'argent refusé avec solde de compte insuffisant et montant retiré supérieur au plafond
#    Soit une carte electron avec un plafond de 3000
#    Et que mon compte a un solde de "2000"
#    Quand je réalise un retrait de "5000"
#    Alors la transaction est refusée
#    Et ma carte doit avoir un plafond de "3000"
#    Et mon compte doit avoir un solde de "2000"
#
#  Scénario: Retrait d'argent refusé avec montant négatif
#    Quand je réalise un retrait de "-1"
#    Alors la transaction est refusée

