/**
 * Matthew Montada. 2/2/21, Class for performing a swap between bits, Chapter 5 Question 7
 * @author Matthew Montada
 *
 */
public class questionSolution {
	/**
	Function for swapping the even and odd bits
	@param n
	@return swap
	*/
	public int swapBits(int n) {
		return (((n&0xaaaaaaaa)>>1) | ((n&0x55555555)<<1));
	}
	
	/**
	Main function where the swap will be printed
	@param args
	*/
	public static void main (String args[]) {
		questionSolution solution = new questionSolution();
		System.out.println(solution.swapBits(4));
	}
}
