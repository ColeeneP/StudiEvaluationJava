CREATE DATABASE IF NOT EXISTS library;
\c library;

CREATE TABLE IF NOT EXISTS genre (
    nom VARCHAR(20) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS auteur (
    id INT NOT NULL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS editeur (
    id INT NOT NULL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS langue (
    nom VARCHAR(50) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS description (
    id INT NOT NULL PRIMARY KEY,
    titre VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS paragraphe (
    description_id int NOT NULL PRIMARY KEY,
    FOREIGN KEY (description_id) REFERENCES description(id),
    ordre INT NOT NULL,
    texte TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS livre (
    isbn VARCHAR(20) NOT NULL PRIMARY KEY,
    titre VARCHAR(100) NOT NULL,
    editeur_id INT NOT NULL,
    FOREIGN KEY (editeur_id) REFERENCES editeur(id),
    date_publication DATE NOT NULL,
    description_id INT NOT NULL,
    FOREIGN KEY (description_id) REFERENCES description(id),
    langue VARCHAR(50) NOT NULL,
    FOREIGN KEY (langue) REFERENCES langue(nom)
);

CREATE TABLE IF NOT EXISTS livre_genre (
    isbn VARCHAR(20) NOT NULL PRIMARY KEY,
    FOREIGN KEY(isbn) REFERENCES livre(isbn),
    nom VARCHAR(20) NOT NULL,
    FOREIGN KEY(nom) REFERENCES genre(nom)
);

CREATE TABLE IF NOT EXISTS livre_auteur (
    isbn VARCHAR(20) NOT NULL PRIMARY KEY,
    FOREIGN KEY(isbn) REFERENCES livre(isbn),
    auteur_id INT NOT NULL,
    FOREIGN KEY(auteur_id) REFERENCES auteur(id)
);

CREATE TABLE IF NOT EXISTS bibliotheque (
    nom VARCHAR(50) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS exemplaire (
    id INT NOT NULL PRIMARY KEY,
    isbn VARCHAR(20) NOT NULL,
    FOREIGN KEY (isbn) REFERENCES livre(isbn),
    bibliotheque VARCHAR(50) NOT NULL,
    FOREIGN KEY (bibliotheque) REFERENCES bibliotheque(nom)
);

CREATE TABLE IF NOT EXISTS utilisateur (
    id INT NOT NULL PRIMARY KEY,
    email VARCHAR(100) NOT NULL UNIQUE,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100),
    mdp VARCHAR(100) NOT NULL,
    sel VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS pret (
    id INT NOT NULL PRIMARY KEY,
    date_debut DATE NOT NULL,
    date_fin DATE NOT NULL,
    renouvele BOOLEAN NOT NULL,
    utilisateur_id INT NOT NULL,
    FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id),
    exemplaire_id INT NOT NULL,
    FOREIGN KEY (exemplaire_id) REFERENCES exemplaire(id)
);

INSERT INTO genre VALUES ('Policier'), ('Fantasy'), ('Fantastique'), ('Roman naturaliste');
INSERT INTO auteur (id, nom, prenom) VALUES (1, 'Robillard', 'Anne'), (2, 'Sapkowski', 'Andrzej'), (3, 'Zola', 'Emile');
INSERT INTO editeur (id, nom) VALUES (1, 'Michel Lafon'), (2, 'Bragelonne'), (3, 'LGF');
INSERT INTO langue VALUES ('fran??ais');
INSERT INTO bibliotheque VALUES ('Pontault-Combault');

INSERT INTO description VALUES (1, E'R??sum?? des Chevaliers d\'Emeraude TOME 1'), (2, 'R??sum?? du Sorcelleur TOME 1'), (3, 'R??sume de la B??te Humaine');
INSERT INTO paragraphe VALUES
(1, 1, E'L\'Empereur Noir, Amecareth, a lev?? ses arm??es monstrueuses pour envahir les royaumes du continent d\'Endikiev. Bient??t, la terre de Shola subit les attaques f??roces des sinistres dragons et des impitoyables hommes-insectes. Pourquoi les troupes d\'Amecareth reviennent-elles sur le continent apr??s des si??cles de paix pour mettre ?? feu et ?? sang le royaume glac?? de Shola ?'),
(2, 1, E'Geralt de Riv est un homme inqui??tant, un mutant devenu le parfait assassin gr??ce ?? la magie et ?? un long entra??nement. En ces temps obscurs, ogres, goules et vampires pullulent, et les magiciens sont des manipulateurs experts. Contre ces menaces, il faut un tueur ?? gages ?? la hauteur, et Geralt est plus qu\'un guerrier ou un mage. C\'est un sorceleur. Au cours de ses aventures, il rencontrera une magicienne capricieuse aux charmes v??n??neux, un troubadour paillard au grand coeur... et, au terme de sa qu??te, peut-??tre r??alisera-t-il son dernier voeu : retrouver son humanit?? perdue.'),
(3, 1, E'Un m??canicien de locomotive, tourment?? par une lourde h??r??dit??, et qui ne s\'entend vraiment qu\'avec sa machine... Une femme qui semble n??e pour faire le malheur de tous les hommes qui l\'approchent... Un juge p??tri de pr??jug??s, pr??t ?? renier la justice au profit de l\'int??r??t social ou politique... Tels sont les personnages de ce drame, un des plus sombres qu\'ait imagin??s le romancier des Rougon-Macquart.');

INSERT INTO livre VALUES ('2749906253', E'Les Chevaliers d\'Emeraude : Le feu dans le ciel', 1, '2007-03-08', 1, 'fran??ais'),
('1028111576', 'Le Sorceleur : Le dernier voeu', 2, '2019-01-16', 2, 'fran??ais'),
('2253005576', 'La B??te Humaine', 3, '1972-01-01', 3, 'fran??ais');

INSERT INTO exemplaire VALUES (1, '2749906253', 'Pontault-Combault'), (2, '2749906253', 'Pontault-Combault'), (3, '2749906253', 'Pontault-Combault'), (4, '1028111576', 'Pontault-Combault'), (5, '1028111576', 'Pontault-Combault'),
(6, '2253005576', 'Pontault-Combault'), (7, '2253005576', 'Pontault-Combault'), (8, '2253005576', 'Pontault-Combault'), (9, '2253005576', 'Pontault-Combault'), (10, '2253005576', 'Pontault-Combault');

INSERT INTO livre_genre VALUES ('2749906253', 'Fantastique'), ('1028111576', 'Fantastique'), ('2253005576', 'Roman naturaliste');
INSERT INTO livre_auteur VALUES ('2749906253', 1), ('1028111576', 2), ('2253005576', 3);