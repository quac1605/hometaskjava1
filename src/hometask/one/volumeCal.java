package hometask.one;

public class volumeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diameterEarth = 7600;
		double diameterSun = 86500; 
		
		// Calculate radius
		double radiusEarth;
		radiusEarth = diameterEarth/2;
		double radiusSun;
		radiusSun= diameterSun/2;
		
		//Calculate Volume
		double volEarth = (4.0/3.0)*Math.PI * Math.pow(radiusEarth, 3);
		double volSun = (4.0/3.0)*Math.PI * Math.pow(radiusSun, 3);
		
		//Calculate Ratio
		double ratio = volSun/volEarth; 
		// Print out result in Console
		System.out.println("The volume of the Earth is " + Math.floor(volEarth) +" cubic miles");
		System.out.println("The volumeod the Sun is " + Math.floor(volSun) +" cubic miles");
		System.out.println("The  ratio of the volume of the Sun to the volume of the Earth is " + Math.floor(ratio));
		
		
	}
}
