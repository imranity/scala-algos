object 	Q7 {

   def main(args : Array[String]) {

       val list1 = 5 :: 2 :: 3 :: 1 :: 0 :: -1 :: 2 :: Nil

       val revMatcher = (x : Int, y : Int) => x >= y

       val revSortedList = insertionSort(list1, revMatcher)

       println("revSortedList = " + revSortedList.mkString(", "))
   }

   def insertionSort(values : List[Int], matcher : (Int, Int) => Boolean) : List[int] = 
     {

      def iSort(values : List[Int]) : List[int] = {

          val result = values match {

             case List() => List()

             case value :: valuesTail => insert(value, iSort(valuesTail))
        }

         result
      }

       def insert(value : Int, values : List[Int]) : List[Int] = 
         {

           val result = values match {

               // if list is empty return new list with single element in it
               case List() => List(value)

               // otherwise insert into list in order, recursively
               case x :: xTail =>
                   if (matcher(value, x)) {
                       value :: values
                   }
                   else {
                       x :: insert(value, xTail)
                   }
           }
          
           result
       }

      iSort(values)
   }
}