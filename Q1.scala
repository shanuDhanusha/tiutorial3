case class Point(val1:Int,val2:Int){
    var x:Int = val1  // we get val1 and val2 for x and y varible
    var y:Int = val2

    //adding two points
    def add(poi:Point) = Point(poi.val1+val1,poi.val2 +val2);

    //move the point 
    def move(dx:Int,dy:Int) = Point(this.val1+dx , this.val2 + dy);

    //get the distance   
    def distance(poi:Point) = Point(poi.val1-val1,poi.val2-val2);

    //exchanging the points
    def invert() = Point(this.val2,this.val1); 
    
}
object qustion extends App{
    //create objects
    var poi1 =Point(20,2); // we dont need to use "new keytype" to create object for class
    var poi2 = Point(3,5);

    //call the functions in class
    println(poi1.add(poi2));
    println(poi2.move(2,10));
    println(poi2.distance(poi1));
    println(poi1.invert());
    
}