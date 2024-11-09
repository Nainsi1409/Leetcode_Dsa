interface BoxVolume{
	double l=20;
	double FindBoxVolume(double b,double h);
}
class BoxVolumeImpl implements BoxVolume{
	@Override
	public double FindBoxVolume(double b,double h) {
		return l*b*h;
	}
}
public class Interface4VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BoxVolumeImpl bvi=new  BoxVolumeImpl();
		 double v=bvi.FindBoxVolume(40,50);
		 System.out.println("volume of box is= "+v);
	}

}
