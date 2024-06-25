Creare una classe Skill con i seguenti attributi:

name: String
damage: int (positivo)
mana: int (positivo)
Creare una classe astratta Character con i seguenti attributi:

name: String
lifePoints: int
manaPoints: int
skills: Skill[] (inizializzata con una dimensione massima fissa)
Scrivere il costruttore che setta name, lifePoints e manaPoints, con l'array skills inizializzato vuoto.
Vogliamo inoltre un getter per ogni attributo e un setter per lifePoints e manaPoints.
Scrivere inoltre i seguenti metodi:

addSkill(Skill s): prende in input una Skill e la aggiunge all'array di skill del personaggio.
getSkill(int i): ritorna l’i-esima skill dell'array skills.
isAlive(): ritorna true o false se il personaggio è vivo (ha un numero di lifePoints maggiore di 0).
La classe astratta espone infine il seguente metodo astratto:

attack(Character pg, Skill s)
Creare una classe Warrior sottoclasse di Character che espone in più il seguente attributo:

strenght: int
Scrivere un costruttore che inizializzi anche questo attributo, con rispettivi setter e getter.
Eseguire poi l’override del metodo attack nel quale il valore di lifePoints del Character attaccato
viene diminuito in base al danno della Skill s a cui si somma il valore strenght
dell’oggetto Warrior (sempre se il mana è sufficiente per attaccare).

Creare una classe Wizard sottoclasse di Character che espone un attributo aggiuntivo:

abilityPower: int
Scrivere un costruttore che inizializzi anche questo attributo, con rispettivi setter e getter.
Eseguire poi l’override del metodo attack nel quale il valore di lifePoints del Character attaccato viene diminuito
in base al danno della Skill s a cui si moltiplica il valore abilityPower dell’oggetto Wizard,
dividendo il risultato finale per 2 (sempre se il mana è sufficiente per attaccare).
Scrivere una classe Main nel quale testiamo il nostro programma. Svolgere i seguenti passaggi:

Creare quattro oggetti di tipo Skill.
Creare un Warrior e un Wizard.
Assegnare due Skill al Warrior e due Skill al Wizard.
Eseguire due attacchi a testa.
Stampare se i due personaggi sono vivi.
Stampare il nome completo di ogni persona.
Stampare il nome completo di ogni persona escludendo le lettere maiuscole.
Stampare il nome completo di ogni persona sostituendo le lettere maiuscole con il carattere *.