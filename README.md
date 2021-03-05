# Cours-4.1-Suite_Fragments
Ajout de fragment et couches de navigation (backsatck)


Pour ajouter des fragments dans un meme frame layout avec le FragmentManager les un sur les autres on peut utiliser add() ou replace():

- add() ajoute les vues de fragments les uns sur les autres
- replace() remplace les vues des fragments, le precedent est rendu invisble et le nouveau affiche (mais pas detruit, quand il sera reaffiche c'est toujours la meme instance)


Pour indiquer au gestionnaire de navigation que notre fragment est une couche de navigation on utilise addToBackStack(String tag):

- Sans addToBackStack les fragments ne sont pass consideres comme des ecrans mais seulment comme le contenu de la vue frameLyout de l'activity donc si on appuie sur back on ferme l'activity 
- Avec addToBackStack les fragments son consideres comme des ecrans par le gestionnaire de navigation et donc sion appuie sur back il ferme seulement le dernier fragment affiche et repasse au precedant


ressources: slide 1.2 depuis le slide 16
https://drive.google.com/drive/folders/1MRqvBGEDtNtpDyKd8sulMJreFCz1JxgC?usp=sharing
