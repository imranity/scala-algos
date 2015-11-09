object Q8{
def main(args:Array[String])
	{
		val l=List(5,4,3,2,16,2,-6)
		val l2=List("cddf","ggg","eee","aaa","kkk","eee","bbb")
		val sort1=(a:String,b:String)=>{a<=b}
		val sort2=(a:String,b:String)=>{a>b}
		val sort3=(a:Int,b:Int)=>{!((a%2==0)&&(b%2==1))}
		 
		println(quickSort(l2,sort1))
		println(quickSort(l2,sort2))
		println(quickSort(l,sort3))
		
		//println(quickSort(l2))
		
	}
	
	
	def quickSort[T](x:List[T],sort:(T,T)=>Boolean):List[T]=
	{
			x match
			{
				case xh::xt => 
				{
					val (b,p,a)=partition(x,sort)
					quickSort(b,sort):::(p::quickSort(a,sort))
				}
				case _ => {x}
			}
	}
	
	
	def partition[T](x:List[T],sort:(T,T)=>Boolean)=
	{
		val pivot=x.head
		var before:List[T]=List()
		var after:List[T]=List()
		
		val fun=(i:T)=>
		{
			if(sort(i,pivot)) before=i::before
			else after=i::after
		}
		
		x.tail.foreach(fun)
		
		(before,pivot,after)
	}
	
	
	
}	

