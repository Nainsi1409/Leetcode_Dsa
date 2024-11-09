
public class StringASCIIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(byte i=-128; i<=127; i++)
		{
			System.out.println(i+"--->"+(char)i);
			if(i>=127)
			{
				break;
			}
		}
	}

}


	