object Q5{
  //selectionSort(list,fun2) might give an decreasing sort
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
	def selectionSortfun1(toSort:List[Int]):List[Int]=
		{
			if(toSort.length==0)
				toSort
			else{
				val min = findmin(toSort)
				val toSort2 = remove(min,toSort)
				min::selectionSortfun1(toSort2)
			}
			}
//selectionSort(list,fun2) might give an increasing sort
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
	def remove2(el:Int, x:List[Int]):List[Int]=
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
					a::remove2(el,b)
			}
	}
	def findmax(x:List[Int]):Int={
		findmax(x.head,x.tail)
	}
	def selectionSortfun2(toSort:List[Int]):List[Int]=
		{
			if(toSort.length==0)
				toSort
			else{
				val max = findmax(toSort)
				val toSort2 = remove2(max,toSort)
				max::selectionSortfun2(toSort2)
			}
			}
	def main(args: Array[String]){
		
	  	println("increasing selection sort is:")
		println(selectionSortfun1(List(5,4,3,2,16,2,-6)))
		println("decreasing selection sort is:")
		println(selectionSortfun2(List(5,4,3,2,16,2,-6)))
	}

}