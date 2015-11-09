object Q4 {
	def findmax(maxSofar:Int, x:List[Int]):Int={
		if(x.length==0)
			maxSofar
			else {
				val a=x.head
				val b=x.tail
				
				if(maxSofar>a)
					findmax(maxSofar,b)
				else
					findmax(a,b)
			}
					
	}
	def remove(el:Int, x:List[Int]):List[Int]=
	{
		if (x.length==0)
			x
			else
			{ 
				val a=x.head 
				val b=x.tail
				
				
				if(a==el)
					b
				
				else
					a::remove(el,b)
			}
	}
	def findmax(x:List[Int]):Int={
		findmax(x.head,x.tail)
	}
	def selectionSort(toSort:List[Int]):List[Int]=
		{
			if(toSort.length==0)
				toSort
			else{
				val max = findmax(toSort)
				val toSort2 = remove(max,toSort)
				max::selectionSort(toSort2)
			}
			}
	def main(args: Array[String]){
		
		print(selectionSort(List(5,4,3,2,16,2,-6)))
	}
	

}
