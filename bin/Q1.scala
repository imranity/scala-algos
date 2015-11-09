object Q1{
	def main(args: Array[String]){
		print(getMin(List(1,2,3,-3)))
	}
	def getMin(x:List[Int]):Int={
		var min = x.head  //suppose the head is the smallest number
		var fund = (i:Int)=>{if(i<min) min=i}//compare and if it's smaller than give his value to min
		x.tail.foreach(fund)
		min
	}

}