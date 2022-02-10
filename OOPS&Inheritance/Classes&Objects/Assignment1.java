class Box{
	int Width,Depth,Height;
	Box(int Width,int Depth,int Height){
		this.Width=Width;
		this.Depth=Depth;
		this.Height=Height;
	}
	double Volume() {
		return Width*Depth*Height;
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		Box a=new Box(2,2,2);
		System.out.print("Volume of the box: "+a.Volume());
	}

}
