package in.aishu.sparkpracticecourse

//import practice.CheckNum
//import java.util.Date

class User(var name : String, var age: Int){
  def this(){
    this("Tom",32)
  }
  def this(name:String){
    this(name,32)
  }

};
object demo {
  def main(args: Array[String]) {
    var user1 = new User("max", 28);
    var user2 = new User();
    var user3 = new User("max");
    println(user3.name, user3.age);

//    println( mylist + 10);

//    for (i <- 1 to 10) {
//      println(i+" is the value of i");
//    }
//    var x = 10;
//    if (x==20) {
//    println("x value is 20")
//    };
//    else {
//      println("x value is not 20")
//    };
//    do {
//      println("x value is" + x)
//      x+=1;
//    }while (x<10) ;


  }
}


