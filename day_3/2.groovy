print "Enter first number: "
String firstStr = System.console().readLine()
print "Enter second number: "
String secondStr = System.console().readLine()

Double first = Double.parseDouble(firstStr)
Double second = Double.parseDouble(secondStr)

println "1. Addition"
println "2. Subtraction"
println "3. Multiplication"
println "4. Division"
println ""
print "Enter the number of the operation to perform: "
String operationStr = System.console().readLine()

switch (operationStr) {
  case "1":
    println first + second
    break
  case "2":
    println first - second
    break
  case "3":
    println first * second
    break
  case "4":
    println first / second
    break
  default:
    println "Unrecognised option entered"
    break
}
