/**
 * Class for performing a swap between bits
 * @author Matthew Montada
 *
 */
public class questionSolution {
	public int swapBits(int n) {
		return (((n&0xaaaaaaaa)>>1) | ((n&0x55555555)<<1));
	}
	
	public static void main (String args[]) {
		questionSolution solution = new questionSolution();
		System.out.println(solution.swapBits(4));
	}
}
