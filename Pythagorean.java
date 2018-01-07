import java.lang.Math;
public class Pythagorean{
	public double calculateHypotenuse(int legA, int legB){
		int legASq = legA*legA;
		int legBSq = legB*legB;
		int legCSq = legASq +legBSq;
		double squareRoot = Math.sqrt(legCSq);
		return squareRoot;
	}
}
