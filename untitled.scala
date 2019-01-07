class Yatharth
{
	def meth():Unit = {
		println("Yatharth");
	}
}

object Yatharth
{
	def meth():Unit = {
		println("Shubham");
	}
}


object Person
{
	def main(args:String):Unit=
	{	
		Yatharth.meth();
		var obj = new Yatharth();
		obj.meth();
	}
}