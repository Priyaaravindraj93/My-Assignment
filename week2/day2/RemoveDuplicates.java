package week2.day2;

public class RemoveDuplicates {

public static void main(String[] args) {
		
        String text = "We learn Java basics as part of java sessions in java week1";

        
        String[] words = text.split(" ");

        int count;

        
        for (int i = 0; i < words.length; i++) {
            count = 1; 

            if (words[i].equals("")) {
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
               
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = ""; // Replace duplicate with an empty string
                    count++;       // Increment duplicate count
                }
            }

            
            if (count > 1) {
                System.out.println("Duplicate word found: " + words[i]);
            }
        }

      
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.equals("")) {
                result.append(word).append(" ");
            } else {
                result.append(" "); // Add space for removed words
            }
        }

 
        System.out.println("Modified String: " + result.toString().trim());
    }

	}