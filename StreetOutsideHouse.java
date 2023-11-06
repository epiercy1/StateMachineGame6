import java.util.ArrayList;

public class StreetOutsideHouse extends State {
	private Model model;
	
	public StreetOutsideHouse(Model model) {
		this.model = model;
		
		String getDescription = "You start the game on the street outside your house. School starts in 20 minutes. Do you want to go to school today? Type 1 for yes. Type 2 for no.";
		State getOptions;
		processChoice(choice) ;
	}
}
