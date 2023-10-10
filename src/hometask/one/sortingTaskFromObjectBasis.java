package hometask.one;

public class sortingTaskFromObjectBasis {
	
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
		String[] words = text.split("\\s+");
		String temp;
		
		for (int i = 0;i < words.length; i++ ) {
			for (int j = i+1; j < words.length; j++ ) {
				words[i] = words[i].replaceAll("[^\\w]", "");
				words[j] = words[j].replaceAll("[^\\w]", "");
				if (words[j].compareTo(words[i])<0) {
					temp = words[i];
					words[i] = words[j];
					words[j]=temp;
				}
			}
			System.out.println(words[i]);
		}
	}
}
