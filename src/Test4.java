import java.util.Arrays;
import java.util.StringTokenizer;

public class Test4 {

	public static void main(String[] args)  {
		String s1="mah,kja,kjah,kkaaa";
		String [] str=s1.split(",");
		System.out.println(Arrays.toString(str));
 
		System.out.println(str[2]);
		
		StringTokenizer st = new StringTokenizer(s1, ",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
		

	}

}
