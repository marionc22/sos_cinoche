DROP TABLE IF EXISTS movie;


CREATE TABLE `movie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) UNIQUE NOT NULL,
  `director` VARCHAR(100),
  `description` VARCHAR(500) NOT NULL,
  `image` VARCHAR(500),
   PRIMARY KEY (`id`));

     
INSERT INTO `movie` (`title`, `director`, `description`, `image`) VALUES  ('Avignon',  "Provence-Alpes-Côte d'Azur", 'https://www.travelrealfrance.com/wp-content/uploads/2022/03/avignon-guided-tour.webp', 'https://avignon-tourisme.com/');
INSERT INTO `movie` (`title`, `director`, `description`, `image`) VALUES ('Saint-Malo', 'Bretagne', 'https://www.tourismebretagne.com/app/uploads/crt-bretagne/2018/11/thumbs/saint-malo-antoine2k-fotolia-5-1920x960-crop-1615917159.jpg','https://www.saint-malo-tourisme.com/');

CREATE TABLE `watched`(
  `id`INT NOT NULL AUTO_INCREMENT,
  `movie_title`VARCHAR(100) NOT NULL,
  `user_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT fk_movie_watched    
        FOREIGN KEY (movie_title)             
        REFERENCES movie(`title`));

  CREATE TABLE `toWatch`(
  `id`INT NOT NULL AUTO_INCREMENT,
  `movie_title`VARCHAR(100) NOT NULL,
  `user_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT fk_movie_toWatch     
        FOREIGN KEY (movie_title)             
        REFERENCES movie(`title`));

