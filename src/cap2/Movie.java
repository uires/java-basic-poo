package cap2;

public class Movie {
	public String title;
	public String genre;
	public int rating;
	public int contador;

	public void setRating(int RatingAtt) {
		if ((RatingAtt <= 5) && (RatingAtt > 0)) {
			this.rating = RatingAtt;
			if (rating >= 3) {
				contador += 1;
			}
		} else {
			if (RatingAtt > 5) {
				System.err.println("Rating maior que [5] ");
			}
			if (RatingAtt < 0) {
				System.err.println("Rating menor que [0]");
			}
		}
	}

	void playIt() {
		System.out.println("O filme está sendo executado, " + title);
		System.out.println("Com rating de : " + rating);
	}

}
