package at.fh.swengb.pajuni

class Movie(val id: String, val title: String,
            val release: String, val plot: String,
            val genre: MovieGenre, val director: Person,
            val actors: List<Person>, val reviews: MutableList<Review>) {

    fun ratingsAverage (): Double{
        return reviews.map { it.reviewValue}.average()
    }

    override fun toString(): String {
        return "Movie(id='$id', title='$title', release='$release', plot='$plot', genre=$genre, director=$director, actors=$actors, reviews=$reviews)"
    }


}