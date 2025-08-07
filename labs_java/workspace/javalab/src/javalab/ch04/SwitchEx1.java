package javalab.ch04;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		int ranking = 1 ;
		String medalColor ;
		
		if (ranking == 1) {
			medalColor = "G";
		}
		else if (ranking == 2) {
			medalColor = "S";
		}
		else if (ranking == 3) {
			medalColor = "B";
		}
		else {
			medalColor = "A";
		}

		System.out.println("Your ranking is"+ranking
				+". Your medalcolor is "+ medalColor + ".");
		
		// switch
		// Starting with Java 7, you can be used strings in conditions.
		// Starting with Java 14, you can escape conditional statements without break.
		switch(ranking) {
			case 1 : medalColor = "G" ; 
				break ;
			case 2 : medalColor = "S"; 
				break ;
			case 3 : medalColor = "B"; 
				break ;
			default : medalColor = "A";
		}
		
		System.out.println("Your ranking is"+ranking
				+". Your medalcolor is "+ medalColor + ".");
		
//		
		String[] medals = {"", "G", "S", "B", "A"};
		System.out.println(medals[1]); // using array index
		System.out.println(medals[ranking]);
		System.out.println(medals[(ranking > 3)? 4 : ranking]);
		
		
		
		
		
		
		
		
		
		
		
//		
		// skip the break
		// but.. it have problem. Redundancy is high...
		String medal = "Gold";
		switch(medal) {
		case "Gold" -> System.out.println("Your medal is Gold.") ; 
		case "Silver" -> System.out.println("Your medal is Silver.") ; 
		case "Bronze" -> System.out.println("Your medal is Bronze.") ; 
		default -> System.out.println("You can't get medal.");
	}
		
//		
		// skip the break
		// Redundancy is low.
		// it called "표현식"
		
		medal = "Gold";
		String message = switch(medal) {
							case "Gold" -> "your medal is Gold.";
							case "Silver" -> "your medal is Silver.";
							case "Bronze" -> "your medal is Bronze.";
							default -> "you can't get medal.";
						};
		
		System.out.println(message);
		
		
//		
		
		int month = 7;
		int day = switch(month) {
					case 2 -> 28 ;
					case 4, 6, 9, 11 -> 30 ;
					case 1, 3, 5, 7, 10, 12 -> 31 ;
					default -> {if (month < 1 || month > 12) {
									System.out.println("This is Wonrg month.");
									}
								else {
									System.out.println("Unknown error. Sorry.");
									}
							yield 0 ; // "yield" mean "return 0" in escape the switch
								}
					}; // end default
		System.out.println(month+"month's day is " + day +".");
		
		
		
		
		
	}

}
