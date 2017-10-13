package cap2;

public class MovieTestDrive {

	public static void main(String[] args) {
		Movie HarryPotterAndGloryOfFire = new Movie();
		HarryPotterAndGloryOfFire.title = "Harry Potter and the Glory Of Fire";
		HarryPotterAndGloryOfFire.genre = "Suspense/Fantasia";
		HarryPotterAndGloryOfFire.setRating(3);
		HarryPotterAndGloryOfFire.playIt();

		Movie Life = new Movie();
		Life.title = "Life";
		Life.genre = "Terror";
		Life.setRating(3);
		Life.playIt();

		Movie HarryPotterAndTheDeathlyHallowsPtOne = new Movie();
		HarryPotterAndTheDeathlyHallowsPtOne.title = "Harry Potter and the Deathly Hallows Part One";
		HarryPotterAndTheDeathlyHallowsPtOne.genre = "Suspense/Fantasia";
		HarryPotterAndTheDeathlyHallowsPtOne.setRating(4);
		HarryPotterAndTheDeathlyHallowsPtOne.playIt();

	}

}
