package hometask.one;

public class objectBasis {
	public static void main(String[] args)
	{
	String text = "To be or not to be, that is the question;"
	+"Whether `tis nobler in the mind to suffer"
	+" the slings and arrows of outrageous fortune,"
	+" or to take arms against a sea of troubles,"
	+" and by opposing end them?";
	int spaces = 0,
	vowels = 0,
	letters = 0;
	//YOUR CODE HERE
	
	for (char c: text.toCharArray() ) {
		
		switch (c) {
		case ' ':
			spaces = spaces +1;
			letters= letters-1;
			break;
		case 'a':
			vowels= vowels +1;
			letters= letters+1;
			break;
		case 'e':
			vowels= vowels +1;
			letters= letters+1;
			break;
		case 'i':
			vowels= vowels +1;
			letters= letters+1;
			break;
		case 'o':
			vowels= vowels +1;
			letters= letters+1;
			break;
		case 'u':
			vowels= vowels +1;
			letters= letters+1;
			break;
		case ',': 
			letters= letters-1;
			break;
		case '`': 
			letters= letters-1;
			break;
		case ';': 
			letters= letters-1;
			break;
		case '?': 
			letters= letters-1;
			break;
		default:
			letters= letters+1;
		}
	}
	System.out.println("The text contained vowels: " + vowels + "\n" + " consonants :" + (letters - vowels) + "\n"+ "spaces: " + spaces);
	}
}
