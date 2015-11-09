object Q2{
  def main(args: Array[String]){
		print(getMin(List(1,2,3,99)))
	}
	def getMin(x:List[Int]):Int={
		var max = x.head
		var fund = (i:Int)=>{if(i>max) max=i}//the same as Q1
		x.tail.foreach(fund)
		max
	}
}
