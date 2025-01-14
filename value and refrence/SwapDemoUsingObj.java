
class Int
{
	private int data;
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	public String toString()
	{
		return " "+data;
	}
}
class SwapDemoUsingObj
{
	public static void swap(Int oba, Int obb)
	{
		int tmp;
		tmp=oba.getData();
		oba.setData(obb.getData());
		obb.setData(tmp);
	}
	public static void main(String[]args)
	{
		int x=10, y=20;

		Int obx = new Int();
		obx.setData(x);

		Int oby = new Int();
		oby.setData(y);

		System.out.println("\n Before Interchange x="+obx+"\t y="+oby);
		swap(obx,oby);
		System.out.println("\n After Interchange x="+obx+"\t y="+oby);
	}
}