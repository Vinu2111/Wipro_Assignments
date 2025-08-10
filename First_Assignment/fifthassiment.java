package wiprofirst.allasiment;

import java.util.LinkedList;

public class fifthassiment {

	public static void main(String[] args) {
		LinkedList<String> recentapps = new LinkedList<String>();
		
		addrecentapps(recentapps,"snap");
		addrecentapps(recentapps,"facebook");
		addrecentapps(recentapps,"instagram");
		addrecentapps(recentapps,"facebook");
		System.out.println("all recent apps :" + recentapps);
		
	}

	public static void addrecentapps(LinkedList<String> allrecentapps, String app) {
		// TODO Auto-generated method stub

		
		if(allrecentapps.contains(app)){
			int index = allrecentapps.indexOf(app);
			allrecentapps.remove(index);
			
		}
		allrecentapps.addFirst(app);
		
	}
}
