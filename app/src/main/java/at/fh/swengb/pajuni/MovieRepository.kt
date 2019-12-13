package at.fh.swengb.pajuni

object MovieRepository {
    private val movies: List<Movie>

    init {
        val person1 = Person("Leonardo Dicaprio", "11.09.1974")
        val person2 = Person("Brad Pitt", "18.12.1963")
        val person3 = Person("Quentin Tarantino", "27.03.1963")
        val person4 = Person("Samuel L Jackson", "21.12.1943")
        val person5 = Person("Kurt Russel", "17.03.1951")
        val person6 = Person("Christoph Walz", "04.10.1956")
        val person7 = Person("Jamie Foxx", "13.12.1967")
        val person8 = Person("Diane Kruger", "15.08.1976")
        val person9 = Person("Uma Thurman","29.04.1970")
        val person10 = Person("David Carradine","08.12.1936")
        val person11 = Person("John Travolta","18.02.1956")
        val person12 = Person("Christopher Nolan","30.07.1970")
        val person13 = Person("Joseph Gordon-Levitt","17.02.1981")
        val person14 = Person("Heath Ledger","04.04.1979")
        val person15 = Person("Christian Bale","30.01.1974")
        val person16 = Person("Francis Ford Coppola","07.04.1939")
        val person17 = Person("Al Pacino","25.04.1940")
        val person18 = Person("Marlon Brando","03.04.1924")
        val person19 = Person("Marlon Brando","17.07.1943")
        val person20 = Person("Hugh Jackman","12.10.1968")
        val person21 = Person("Diane Keaton","05.01.1946")
        val person22 = Person("Edgar Wright","18.04.1974")
        val person23 = Person("Simon Pegg","14.02.1970")
        val person24 = Person("Nick Frost","28.03.1972")




        movies = listOf(
            Movie("1",
                "Once Upon a Time in Hollywood ",
                "2019",
                "A faded television actor and his stunt double strive to achieve fame and success in the film industry during the final years of Hollywood's Golden Age in 1969 Los Angeles.",
                MovieGenre.Comedy,
                person3,
                listOf( person1, person2 ),
                mutableListOf()
            ),
            Movie("2",
                "The Hateful Eight",
                "2015",
                "In the dead of a Wyoming winter, a bounty hunter and his prisoner find shelter in a cabin currently inhabited by a collection of nefarious characters.",
                MovieGenre.Drama,
                person3,
                listOf(person4, person5),
                mutableListOf()
            ) ,
            Movie("3",
                "Django Unchained",
                "2012",
                "With the help of a German bounty hunter, a freed slave sets out to rescue his wife from a brutal Mississippi plantation owner.",
                MovieGenre.Drama,
                person3,
                listOf(person7, person6, person1),
                mutableListOf()

            ) ,
            Movie("4",
                "Inglourious Basterds",
                "2007",
                "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.",
                MovieGenre.Action,
                person3,
                listOf(person2, person8),
                mutableListOf()

            ) ,
            Movie("5",
                "Kill Bill: Vol. 1",
                "2003",
                "After awakening from a four-year coma, a former assassin wreaks vengeance on the team of assassins who betrayed her.",
                MovieGenre.Action,
                person3,
                listOf(person9, person10),
                mutableListOf()
            ) ,
            Movie("6",
                "Kill Bill: Vol. 2",
                "2004",
                "The Bride continues her quest of vengeance against her former boss and lover Bill, the reclusive bouncer Budd, and the treacherous, one-eyed Elle.",
                MovieGenre.Action,
                person3,
                listOf(person9, person10),
                mutableListOf()
            ) ,
            Movie("7",
                "Pulp Fiction",
                "1994",
                "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                MovieGenre.Drama,
                person3,
                listOf( person4, person6, person11),
                mutableListOf()
            ) ,
            Movie("8",
                "Inception",
                "2010",
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                MovieGenre.Action,
                person12,
                listOf(person1, person13),
                mutableListOf()
            ) ,
            Movie("9",
                "The Dark Knight",
                "2008",
                "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
                MovieGenre.Action,
                person12,
                listOf(person15, person14),
                mutableListOf()
            ) ,
            Movie("10",
                "The Dark Knight Rises",
                "2012",
                "Eight years after the Joker's reign of anarchy, Batman, with the help of the enigmatic Catwoman, is forced from his exile to save Gotham City from the brutal guerrilla terrorist Bane.",
                MovieGenre.Action,
                person12,
                listOf(person15, person14),
                mutableListOf()
            ) ,
            Movie("11",
                "The Godfather",
                "1972",
                "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                MovieGenre.Drama,
                person16,
                listOf(person17, person18),
                mutableListOf()
            ) ,
            Movie("12",
                "The Godfather: Part II",
                "1974",
                "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.<",
                MovieGenre.Drama,
                person16,
                listOf(person17, person19),
                mutableListOf()
            ) ,
            Movie("13",
                "The Prestige",
                "2005",
                "After a tragic accident, two stage magicians engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other.",
                MovieGenre.Drama,
                person12,
                listOf(person15, person20),
                mutableListOf()
            ) ,
            Movie("14",
                "The Godfather: Part III",
                "1990",
                "In the midst of trying to legitimize his business dealings in New York City and Italy in 1979, aging Mafia Don Michael Corleone seeks to avow for his sins, while taking his nephew Vincent Mancini under his wing.",
                MovieGenre.Drama,
                person16,
                listOf(person17, person21),
                mutableListOf()
            ) ,
            Movie("15",
                "Shaun of the Dead",
                "2004",
                "A man's uneventful life is disrupted by the zombie apocalypse.",
                MovieGenre.Comedy,
                person22,
                listOf(person23, person24),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}