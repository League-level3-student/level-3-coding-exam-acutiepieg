import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		int pope = 0;
		int edward = 0;
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).startsWith("P") == true) {
				pope ++;
			}
			else if(votes.get(i).startsWith("p") == true) {
				pope ++;
			}
			else if(votes.get(i).startsWith("E") == true) {
				edward ++;
			}
			if(votes.get(i).startsWith("e") == true) {
				edward ++;
			}
		}
		if(pope == edward) {
			return "TIE";
		}
		else if(pope > edward) {
			return "pope francis";
		}
		
		return "edward snowden";
	}

}
