/*to print 

*
**
***
****
***
**
*  for first loop is from 3 and second is from 4
                            */
public class Test1 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= j)
					System.out.print("*");

			}
			System.out.println();
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i <= j)
					System.out.print("*");

			}
			System.out.println();
		}

	}

}
