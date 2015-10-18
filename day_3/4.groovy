class Point {
  double x, y

  def distanceFrom(Point anotherPoint) {
    return Math.sqrt(
      (x - anotherPoint.x).power(2) +
      (y - anotherPoint.y).power(2)
    )
  }
}


print "Enter X coordinate of first point: "
String first_x = System.console().readLine()
print "Enter Y coordinate of first point: "
String first_y = System.console().readLine()

first = new Point(
          x: Double.parseDouble(first_x),
          y: Double.parseDouble(first_y)
          )

print "Enter X coordinate of second point: "
String second_x = System.console().readLine()
print "Enter Y coordinate of second point: "
String second_y = System.console().readLine()

second = new Point(
          x: Double.parseDouble(second_x),
          y: Double.parseDouble(second_y)
          )

print "Enter X coordinate of third point: "
String third_x = System.console().readLine()
print "Enter Y coordinate of third point: "
String third_y = System.console().readLine()

third = new Point(
          x: Double.parseDouble(third_x),
          y: Double.parseDouble(third_y)
          )

Double first_and_second = first.distanceFrom(second)
Double second_and_third = second.distanceFrom(third)
Double first_and_third = first.distanceFrom(third)

if (first_and_second < second_and_third && first_and_second < first_and_third) {
  println "First and second points were closest"
} else if (second_and_third < first_and_second && second_and_third < first_and_third) {
  println "Second and third points were closest"
} else {
  println "First and third points were closest"
}
