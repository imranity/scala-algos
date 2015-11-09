object Q3 {
  //selection sort
	def findmin(minSofar:Int, x:List[Int]):Int={
		if(x.length==0)
			minSofar
			else {
				val a=x.head
				val b=x.tail
				
				if(minSofar<a)
					findmin(minSofar,b)
				else
					findmin(a,b)
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
	def findmin(x:List[Int]):Int={
		findmin(x.head,x.tail)
	}
	def selectionSort(toSort:List[Int]):List[Int]=
		{
			if(toSort.length==0)
				toSort
			else{
				val min = findmin(toSort)
				val toSort2 = remove(min,toSort)
				min::selectionSort(toSort2)
			}
			}
	def main(args: Array[String]){
		
		print(selectionSort(List(5,4,3,2,16,2,-6)))
	}
	

}
