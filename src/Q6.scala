object Q6 {
	def bSort2 (x:List [Int],count:Int) : List [Int]=
	{
		if (count==x.length-1) {
		  x
		}
		
		else {
		 var y=dopass(x)
		 bSort2(y,count+1)
		}
	}
	
	def bSort(x:List[Int]) =
	{
		bSort2(x,0)
	}
	
	def dopass (x: List [Int]) : List [Int]=
	{
		if (x.length <2)
		{
		   x
		}
	
		else {
	 			val a=x.head
	 			val b =( x.tail).head
	 			val c= (x.tail).tail
	 		
	 		
	 			if (a<b) {
	 			a:: dopass(b::c)
	 			}
	 			else { 
	 			b::dopass(a::c) 
	 			}
			}	
	} 
 def main (args: Array [String])
	{
		var x= List(3,9,2,5,1,1)
		x=bSort(x)
		println(x)
	}
}