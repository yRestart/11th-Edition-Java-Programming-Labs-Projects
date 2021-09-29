import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

/**
 * This class will take in three cards as input and will output the
 * recommended action.  Valid inputs are the numbers 2 through 9, then
 * the letters J, Q, K, and A to signify the Jack, Queen, King, and Ace
 * of any suit respectively.
 * 
 * @author jcovey
 *
 */
public class BaseStrategyApp {

	public static void main(String[] args) {
		
		String cards[] = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
		
		String hardhands = "";
		String softhands = "";
		String splithands = "";
		
		// grading program, runs through all possibilities
		for (int i = 0; i < cards.length; i++) {
			for (int j = i; j < cards.length; j++) {
				for (int k = 0; k < cards.length; k++) {
					String dCard = cards[i];
					String pCard1 = cards[j];
					String pCard2 = cards[k];
					
					int pCard1Value = ComputeCardValue(pCard1);
					int pCard2Value = ComputeCardValue(pCard2);
					int dCardValue = ComputeCardValue(dCard);
					
					String result = CalculateMove(dCard, pCard1, pCard2);
					
					if (pCard1.equals(pCard2)) {
						splithands = splithands + result;
					} else if (pCard1.equals("A") || pCard2.equals("A")) {
						softhands = softhands + result;
					} else {
						hardhands = hardhands + result;
					}
				}
			}
		}
		
		// compares against the known solution
		System.out.println("Soft hands correct: " + MD5(softhands).equals("b88ed4ea7ca560cff036c1f6bbd3ca6a"));
		System.out.println("Hard hands correct: " + MD5(hardhands).equals("46c00cee902607019486e1c64bc407a6"));
		System.out.println("Split hands correct: " + MD5(splithands).equals("324a60c5a34229625229ebb4ad5e525d"));
		System.out.println();
		
		// Let's examine 10 hands
		Random shuffler = new Random();
		System.out.println("Ten Random Hands");
		System.out.println("****************");
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			
			// Get random input values
			String dCard = cards[shuffler.nextInt(cards.length)];
			String pCard1 = cards[shuffler.nextInt(cards.length)];
			String pCard2 = cards[shuffler.nextInt(cards.length)];
			
			// Output the cards dealt
			System.out.printf("Your hand: %s %s with Dealer showing: %s\n", pCard1, pCard2, dCard);
			
			// Calculate move and output result
			String output = CalculateMove(dCard, pCard1, pCard2);
			System.out.println("Your move: " + output);
			System.out.println();
			
		}
	}

	private static String CalculateMove(String dCard, String pCard1, String pCard2) {
		
		// Default return value
		String output = "!"; // ! means invalid output
		
		
		// Set up some variables to hold the actual numerical values of the
		// cards and of the hand.  Sometimes we will want to use the actual
		// names of the cards but other times it will be more useful to use
		// their values.
		int pCard1Value = ComputeCardValue(pCard1);
		int pCard2Value = ComputeCardValue(pCard2);
		int dCardValue = ComputeCardValue(dCard);
		int cardsum = pCard1Value + pCard2Value;
		
		// For output use the strings in the table: H, D, S, H/SU, SP
		// ************ BEGIN WRITING YOU CODE HERE ******************* //
		
		
		// Always hit if 8
		if(cardsum <= 8)
			output = "H";
		
		// Player card value = 9
		if(cardsum == 9)
		{
			switch (dCardValue) {
			case 2:
				output = "H";
				break;
			case 3: case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;

			default:
				output = "H"; 
				break;
			}
		}
		
		// Player card value 10
		
		if(cardsum == 10) {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				output = "D";
				break;
			case 10:
				output = "H";
				break;
			default:
				output = "H";
			}
		}
		
		// Player card value of 11
		
		if(cardsum == 11) {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
				output = "D";
				break;
			default:
				output = "H";
				break;
			}
		}
		
		// Player card value of 12
		
		if(cardsum == 12) {
			switch(dCardValue) {
			case 2: case 3:
				output = "H";
				break;
			case 4: case 5: case 6:
				output = "S";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		
		// Player card value of 13 or 14
		
		if(cardsum == 13 || cardsum == 14) {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6:
				output = "S";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		
		// Player card value of 15
		
		if(cardsum == 15) {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6:
				output = "S";
				break;
			case 7: case 8: case 9:
				output = "H";
				break;
			case 10:
				output = "H/SU";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of 16
		if(cardsum == 16) {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6:
				output = "S";
				break;
			case 7: case 8:
				output = "H";
				break;
			case 9: case 10:
				output = "H/SU";
				break;
			default:
				output = "H/SU";
				break;
			}
		}
		// Player card value of 17+
		if(cardsum >= 17) {
			output = "S";
		}
		
		// Player card value of Ace 8 to 10
		if(pCard1 == "A" && pCard2 == "8" )
			output = "S";
		if(pCard1 == "8" && pCard2 == "A" )
			output = "S";
		
		// A 9 combinations
		if(pCard1 == "A" && pCard2 == "9" )
			output = "S";
		if(pCard1 == "9" && pCard2 == "A" )
			output = "S";
		
		// A 10 combinations
		if(pCard1 == "A" && pCard2 == "10" )
			output = "S";
		if(pCard1 == "10" && pCard2 == "A" )
			output = "S";
		
		// Player card value of A 7
		if(pCard1 == "A" && pCard2 == "7") {
			switch(dCardValue) {
			case 2:
				output = "S";
				break;
			case 3: case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8:
				output = "S";
				break;
			case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		if(pCard1 == "7" && pCard2 == "A") {
			switch(dCardValue) {
			case 2:
				output = "S";
				break;
			case 3: case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8:
				output = "S";
				break;
			case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of A 6
		if(pCard1 == "A" && pCard2 == "6") {
			switch(dCardValue) {
			case 2:
				output = "H";
				break;
			case 3: case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		if(pCard1 == "6" && pCard2 == "A") {
			switch(dCardValue) {
			case 2:
				output = "H";
				break;
			case 3: case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of A 5, A 4
		if(pCard1 == "A" && pCard2 == "5" || pCard1 == "A" && pCard2 == "4") {
			switch(dCardValue) {
			case 2: case 3:
				output = "H";
				break;
			case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		if(pCard1 == "5" && pCard2 == "A" || pCard1 == "4" && pCard2 == "A") {
			switch(dCardValue) {
			case 2: case 3:
				output = "H";
				break;
			case 4: case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of A 3, A 2
		if(pCard1 == "A" && pCard2 == "3" || pCard1 == "A" && pCard2 == "2") {
			switch(dCardValue) {
			case 2: case 3: case 4:
				output = "H";
				break;
			case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		if(pCard1 == "3" && pCard2 == "A" || pCard1 == "2" && pCard2 == "A") {
			switch(dCardValue) {
			case 2: case 3: case 4:
				output = "H";
				break;
			case 5: case 6:
				output = "D";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		
		// Player card value of A-A, 8-8
		if(pCard1 == "A" && pCard2 == "A" || pCard1 == "8" && pCard2 == "8")
			output = "SP";
		
		// Player card value of 10-10
		if(pCard1 == "10" && pCard2 == "10")
			output = "S";
		
		// Player card value of 9-9
		if(pCard1 == "9" && pCard2 == "9") {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6:
				output = "SP";
				break;
			case 7:
				output = "S";
				break;
			case 8: case 9:
				output = "SP";
				break;
			case 10:
				output = "S";
				break;
			default:
				output = "S";
				break;
			}
		}
		
		// Player card value of 7-7
		if(pCard1 == "7" && pCard2 == "7") {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6: case 7:
				output = "SP";
				break;
			case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		
		// Player card value of 6-6
		if(pCard1 == "6" && pCard2 == "6") {
			switch(dCardValue) {
			case 2:
				output = "H";
				break;
			case 3: case 4: case 5: case 6:
				output = "SP";
				break;
			case 7: case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of 5-5
		if(pCard1 == "5" && pCard2 == "5") {
			switch(dCardValue) {
			case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				output = "D";
				break;
			case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		// Player card value of 4-4
		if(pCard1 == "4" && pCard2 == "4")
			output = "H";
		
		// Player card value of 3-3, 2-2
		if(pCard1 == "3" && pCard2 == "3" || pCard1 == "2" && pCard2 == "2") {
			switch(dCardValue) {
			case 2: case 3:
				output = "H";
				break;
			case 4: case 5: case 6: case 7:
				output = "SP";
				break;
			case 8: case 9: case 10:
				output = "H";
				break;
			default:
				output = "H";
				break;
			}
		}
		
			
		
		
			
		
		

		
		


			
		
		
	
		// ************ END WRITING YOU CODE HERE   ******************* //
		
		// Return the output
		return output;
	}

	/**
	 * This method computes the numerical value of a card
	 * that is dealt.
	 * 
	 * @param card The string representation of the card
	 * @return The numerical value of the card
	 */
	public static int ComputeCardValue(String card) {
		if (card.equalsIgnoreCase("A")) {
			return 11;
		} else if (card.equalsIgnoreCase("K")
				|| card.equalsIgnoreCase("Q")
				|| card.equalsIgnoreCase("J")) {
			return 10;
		} else {
			return Integer.parseInt(card);
		}
	}
	
	/**
	 * This method generates an MD5 hash.
	 * 
	 * @param md5 the string to transform
	 * @return the md5 hash
	 */
	public static String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes(Charset.forName("UTF-8")));
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
		}
}
