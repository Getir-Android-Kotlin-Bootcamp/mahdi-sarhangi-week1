fun main() {
    // interface for running examples with input
    val examples = mapOf(
        9 to ::printCommands,
        10 to { printCalculator(5, 10, "add") },
        11 to ::printVariables,
        12 to ::printClassesAndObjectsAndInheritance,
        14 to ::printStrings,
        15 to ::printConditionalStatements,
        16 to ::printForLoops,
        17 to ::printWhileLoops,
        18 to ::printWhenExpression,
        19 to ::printRanges,
        20 to ::printCollections,
        21 to ::printNullSafety,
        22 to ::printTypeChecksAndSmartCasts,
        24 to ::printNamingConventions,
        25 to ::printTestMethodsAndTheirNames,
        26 to ::printPropertyNames,
        28 to ::printAnnotations,
        30 to { println("Sayfa 30 = ${methodWithLongArguments(1, 2, 3)}") },
        31 to { println("Sayfa 31 = ${singleExpressionFunction(5, 10)}") },
        33 to { val rectangle = Rectangle(); rectangle.width = 10; rectangle.height = 20; println("Sayfa 33 = ${rectangle.width}, ${rectangle.height}") },
        37 to { val user = User("John", 25); println("Sayfa 37 = $user") },
        38 to { printDefaultParameterValues() },
        39 to ::printListFilterShortForm,
        40 to ::printInCollection,
        41 to ::printInstanceChecks,
        42 to ::printReadOnlyList,
        43 to ::printReadOnlyMap,
        44 to ::printTraversingAMap,
        45 to ::printLazyProperty,
        46 to ::printExtensionFunction,
        47 to { My.init(); My.printSingleton() },
        48 to ::printAbstractClass,
        49 to ::printIfNotNullShorthand,
        50 to ::printIfNotNullAndElseShorthand,
        51 to ::printExceptionIfNull,
        52 to ::printAccessingFirstElementOfNullList,
        53 to ::printIfNotNullContinueAndRun,
        54 to ::printMapNullableValueIfNotNull,
        55 to { printTransformWhenValue(1) },
        56 to ::printTryCatch,
        58 to ::printIfExpressionAssignmentToAVariable,
        59 to ::printFillFunction,
        60 to ::printSingleLineMethods,
        61 to ::printCallingCoupleOfMethodsFromOneObject,
        62 to ::printApplyMethodInAnObject,
        // 63 to ::printFileInputStream,
        64 to { printGenericTypes(5) },
        65 to ::printAlsoFunction,
        66 to ::printTODO,
        67 to { printDefaultParameterAndNamedArguments() },
        68 to ::printInfixFunction,
        69 to ::printOperatorFunction,
        70 to { printFunctionWithVararg(1, 2, 3) },
        71 to ::printNullSafetyWithLet,
        73 to ::printWorkingWithNulls,
        74 to ::printClassesAndObjects,
        75 to ::printGenericClasses,
        76 to { printGenericFunctions(5) },
        77 to ::printInheritance,

        78 to ::printInheritanceWithParameterizedConstructor,
        79 to ::printPassingConstructorArgumentsToSuperclass,
        80 to { printWhenExpression2(1) },
        81 to { println("Sayfa 81 = ${printWhenExpressionWithReturn(1)}") },
        82 to ::printForLoop,
        83 to ::printWhileLoop,
        84 to ::printDoWhileLoop,
        85 to ::printRanges2,
        88 to ::printEqualityChecks,
        89 to ::printConditionalStatements2,
        90 to ::printCarDataClass,
        91 to { val product1 = Product("Apple", 5.0); val product2 = Product("Banana", 3.0); val product3 = product1 + product2; println("Sayfa 91 = $product3") },
    )

    // loop for getting input and running examples
    while (true) {
        print("Enter the page number (0 to exit): ")
        val page = readLine()?.toIntOrNull() ?: 0
        if (page == 0) break
        val example = examples[page]
        if (example != null) {
            example()
        } else {
            println("Example not found")
        }
    }

    
}

// 9. Sayfa - printCommands
fun printCommands() {
    print("Sayfa 9 = ")
    print("Hello, world!!")

    println("Sayfa 9 = Hello, line!")
}

// 10. Sayfa - functions
fun calculator(a: Int, b: Int, operation: String): Int {
    return when (operation) {
        "add" -> a + b
        "subtract" -> a - b
        "multiply" -> a * b
        "divide" -> a / b
        else -> throw IllegalArgumentException("Unknown operation")
    }
}

fun printCalculator(a : Int, b : Int, operation : String) = println("Sayfa 10 = ${calculator(a, b, operation)}")

// 11. Sayfa - variables
fun printVariables() {
    val a = 5
    var b: Int
    b = 20
    println("Sayfa 11 = a = $a, b = $b")
}

// 12. Sayfa - classes and objects and inheritance
open class Animal(val name: String, val age: Int) {
    fun printInfo() {
        println("Sayfa 12 = $name is $age years old")
    }
}

class Dog(name: String, age: Int, val breed: String) : Animal(name, age) {
    fun bark() {
        println("Sayfa 12 = Woof!")
    }
}

fun printClassesAndObjectsAndInheritance() {
    val dog = Dog("Buddy", 5, "Golden Retriever")
    dog.printInfo()
    dog.bark()
}

// 14. Sayfa - strings and methods
fun printStrings() {
    val name = "John"
    val age = 25
    println("Sayfa 14 = My name is $name and I am $age years old")

    val str = "Hello, world!"
    println("Sayfa 14 = ${str.substring(7, 12)}")
}

// 15. Sayfa - conditional statements
fun printConditionalStatements() {
    val a = 5
    val b = 10
    if (a > b) {
        println("Sayfa 15 = $a is greater than $b")
    } else {
        println("Sayfa 15 = $a is less than or equal to $b")
    }

    val min = if (a < b) a else b
    println("Sayfa 15 = min = $min")
}

// 16. Sayfa - for loops
fun printForLoops() {
    for (i in 1..5) {
        println("Sayfa 16 = $i")
    }

    for (i in 5 downTo 1) {
        println("Sayfa 16 = $i")
    }

    for (i in 1 until 5) {
        println("Sayfa 16 = $i")
    }

    // in list
    val list = listOf("a", "b", "c")
    for (s in list) {
        println("Sayfa 16 = $s")
    }

    // in indices
    for (i in list.indices) {
        println("Sayfa 16 = ${list[i]}")
    }

    // in withIndex
    for ((index, value) in list.withIndex()) {
        println("Sayfa 16 = $index: $value")
    }

    // in map
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    for ((key, value) in map) {
        println("Sayfa 16 = $key: $value")
    }
}

// 17. Sayfa - while loops
fun printWhileLoops() {
    var i = 1
    while (i <= 5) {
        println("Sayfa 17 = $i")
        i++
    }

    i = 5
    while (i >= 1) {
        println("Sayfa 17 = $i")
        i--
    }

    // do-while
    i = 1
    do {
        println("Sayfa 17 = $i")
        i++
    } while (i <= 5)

    // in list
    val list = listOf("a", "b", "c")
    i = 0
    while (i < list.size) {
        println("Sayfa 17 = ${list[i]}")
        i++
    }

    // in map
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val iterator = map.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        println("Sayfa 17 = ${entry.key}: ${entry.value}")
    }

    // in sequence
    val sequence = generateSequence(1) { it + 1 }
    val iterator2 = sequence.iterator()
    while (iterator2.hasNext()) {
        val value = iterator2.next()
        if (value > 5) break
        println("Sayfa 17 = $value")
    }
}

// 18. Sayfa - when expression
fun printWhenExpression() {
    val x = 5
    when (x) {
        1 -> println("Sayfa 18 = One")
        2 -> println("Sayfa 18 = Two")
        3, 4 -> println("Sayfa 18 = Three or Four")
        in 5..10 -> println("Sayfa 18 = Five to Ten")
        else -> println("Sayfa 18 = Something else")
    }

    val str = "abc"
    when (str) {
        "abc" -> println("Sayfa 18 = abc")
        "def" -> println("Sayfa 18 = def")
        else -> println("Sayfa 18 = Something else")
    }

    val obj: Any = "Hello, world!"
    when (obj) {
        is String -> println("Sayfa 18 = String")
        is Int -> println("Sayfa 18 = Int")
        else -> println("Sayfa 18 = Something else")
    }
}

// 19. Sayfa - ranges
fun printRanges() {
    val a = 5
    val b = 10
    if (a in 1..10) {
        println("Sayfa 19 = $a is in the range from 1 to 10")
    }

    if (b !in 1..10) {
        println("Sayfa 19 = $b is not in the range from 1 to 10")
    }

    for (i in 1..5) {
        println("Sayfa 19 = $i")
    }

    for (i in 5 downTo 1) {
        println("Sayfa 19 = $i")
    }

    for (i in 1 until 5) {
        println("Sayfa 19 = $i")
    }
}

// 20. Sayfa - collections
fun printCollections() {
    val list = listOf("a", "b", "c")
    println("Sayfa 20 = ${list.size}")
    println("Sayfa 20 = ${list.isEmpty()}")
    println("Sayfa 20 = ${list.contains("a")}")
    println("Sayfa 20 = ${list.indexOf("b")}")

    val mutableList = mutableListOf("a", "b", "c")
    mutableList.add("d")
    mutableList.removeAt(1)
    println("Sayfa 20 = $mutableList")

    val set = setOf("a", "b", "c")
    println("Sayfa 20 = ${set.size}")
    println("Sayfa 20 = ${set.isEmpty()}")
    println("Sayfa 20 = ${set.contains("a")}")

    val mutableSet = mutableSetOf("a", "b", "c")
    mutableSet.add("d")
    mutableSet.remove("b")
    println("Sayfa 20 = $mutableSet")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    println("Sayfa 20 = ${map.size}")
    println("Sayfa 20 = ${map.isEmpty()}")
    println("Sayfa 20 = ${map.contains(1)}")
    println("Sayfa 20 = ${map[2]}")

    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMap[4] = "d"
    mutableMap.remove(2)
    println("Sayfa 20 = $mutableMap")

    // filter
    val list2 = listOf(1, 2, 3, 4, 5)
    val filteredList = list2.filter { it % 2 == 0 }
    println("Sayfa 20 = $filteredList")

    // map
    val doubledList = list2.map { it * 2 }
    println("Sayfa 20 = $doubledList")

    // sort
    val sortedList = list2.sorted()
    println("Sayfa 20 = $sortedList")

    // groupBy
    val groupedList = list2.groupBy { if (it % 2 == 0) "even" else "odd" }
    println("Sayfa 20 = $groupedList")

    // forEach
    list2.forEach { println("Sayfa 20 = $it") }
}

// 21. Sayfa - null safety
fun printNullSafety() {
    var str: String? = "Hello, world!"
    str = null
    if (str != null) {
        println("Sayfa 21 = ${str.length}")
    } else {
        println("Sayfa 21 = str is null")
    }
}

// 22. Sayfa - type checks and smart casts
fun printTypeChecksAndSmartCasts() {
    val obj: Any = "Hello, world!"
    if (obj is String) {
        println("Sayfa 22 = ${obj.length}")
    }

    val str: Any = "Hello, world!"
    if (str !is String) {
        println("Sayfa 22 = str is not a string")
    } else {
        println("Sayfa 22 = str is a string")
    }

    val obj2: Any = "Hello, world!"
    if (obj2 is String && obj2.length > 5) {
        println("Sayfa 22 = $obj2")
    }
}

// 24. Sayfa - naming conventions
fun printNamingConventions() {
    // package name
    println("Sayfa 24 = my.demoIntellijIdeaRulezzz")
    // class name
    println("Sayfa 24 = Animal")
    // function name
    println("Sayfa 24 = printNamingConventions")
    // object name
    println("Sayfa 24 = NamingConventions")
    // variable name
    println("Sayfa 24 = namingConventions")
    // constant name
    println("Sayfa 24 = MAX_VALUE")
    // parameter name
    println("Sayfa 24 = name")
    // type parameter name
    println("Sayfa 24 = T")
    // method name
    println("Sayfa 24 = printNamingConventions")
}

// 25. Sayfa - test methods and their names
fun printTestMethodsAndTheirNames() {
    fun sum(a: Int, b: Int) = a + b
    println("Sayfa 25 = ${sum(5, 10)}")

    fun `sum of two numbers`(a: Int, b: Int) = a + b
    println("Sayfa 25 = ${`sum of two numbers`(5, 10)}")

}

// 26. Sayfa - property names
fun printPropertyNames() {
    // constant property
    val MAX_VALUE = 100
    println("Sayfa 26 = $MAX_VALUE")
    // variable property
    var value = 5
    println("Sayfa 26 = $value")
    // collection property
    val mutableCollection : MutableCollection<Int> = mutableListOf(1, 2, 3)
}

// 28. Sayfa - annotations
fun printAnnotations() {
    @Suppress("UNUSED_VARIABLE")
    val a = 5
    println("Sayfa 28 = $a")

    @Deprecated("This function is deprecated", ReplaceWith("printAnnotations()"))
    fun deprecatedFunction() {
        println("Sayfa 28 = This function is deprecated")
    }

    deprecatedFunction()
}

// 30. Sayfa - method with long arguments list
fun methodWithLongArguments(
    input1: Int,
    input2: Int,
    input3: Int,
) : Int {
    return input1 + input2 + input3
}

// 31. Sayfa - single expression function
fun singleExpressionFunction(a: Int, b: Int) = a + b

// 33. Sayfa - values with getter and setter
class Rectangle {
    var width = 0
        get() = field
        set(value) {
            field = value
        }

    var height = 0
        get() = field
        set(value) {
            field = value
        }
}

// 37. Sayfa - DTO class
data class User(
    val name: String,
    val age: Int,
)

// 38. Sayfa - default parameter values
fun printDefaultParameterValues(
    a: Int = 5,
    b: Int = 10
) {
    println("Sayfa 38 = $a, $b")
}

// 39. Sayfa - listFilter short form
fun printListFilterShortForm() {
    val list = listOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 == 0 }
    println("Sayfa 39 = $filteredList")
}

// 40. Sayfa - in collection
fun printInCollection() {
    val list = listOf(1, 2, 3, 4, 5)
    if (2 in list) {
        println("Sayfa 40 = 2 is in the list")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    if (1 in map) {
        println("Sayfa 40 = 1 is a key in the map")
    }
}

// 41. Sayfa - instance checks
fun printInstanceChecks() {
    val obj: Any = "Hello, world!"
    when (obj) {
        is String -> println("Sayfa 41 = String")
        is Int -> println("Sayfa 41 = Int")
        else -> println("Sayfa 41 = Something else")
    }
}

// 42. Sayfa - read-only list
fun printReadOnlyList() {
    val list = listOf("a", "b", "c")
    println("Sayfa 42 = ${list.size}")
    println("Sayfa 42 = ${list.isEmpty()}")
    println("Sayfa 42 = ${list.contains("a")}")
    println("Sayfa 42 = ${list.indexOf("b")}")
}

// 43. Sayfa - read-only map
fun printReadOnlyMap() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    println("Sayfa 43 = ${map.size}")
    println("Sayfa 43 = ${map.isEmpty()}")
    println("Sayfa 43 = ${map.contains(1)}")
    println("Sayfa 43 = ${map[2]}")
}

// 44. Sayfa - traversing a map
fun printTraversingAMap() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    for ((key, value) in map) {
        println("Sayfa 44 = $key: $value")
    }
}

// 45. Sayfa - lazy property
fun printLazyProperty() {
    val lazyValue: String by lazy {
        println("Sayfa 45 = Computed!")
        "Hello"
    }
    println("Sayfa 45 = $lazyValue")
    println("Sayfa 45 = $lazyValue")
}

// 46. Sayfa - extension function
fun String.printExtensionFunction() {
    println("Sayfa 46 = $this")
}

fun printExtensionFunction() {
    "Hello, world!".printExtensionFunction()
}

// 47. Sayfa - Singleton
object My {
    fun init() {
        println("Sayfa 47 = Initialized")
    }

    fun printSingleton() {
        println("Sayfa 47 = Singleton")
    }
}

// 48. Sayfa - abstract class
abstract class Shape {
    abstract fun draw()
}

class Circle : Shape() {
    override fun draw() {
        println("Sayfa 48 = Circle")
    }
}

fun printAbstractClass() {
    val circle = Circle()
    circle.draw()
}

// 49. Sayfa - if not null shorthand
fun printIfNotNullShorthand() {
    val str: String? = "Hello, world!"
    println("Sayfa 49 = ${str?.length}")
}

// 50. Sayfa - if not null and else shorthand
fun printIfNotNullAndElseShorthand() {
    val str: String? = null
    println("Sayfa 50 = ${str?.length ?: "str is null"}")

    // run
    val str2: String? = "Hello, world!"
    println("Sayfa 50 = ${str2?.run { length } ?: "str is null"}")
}

// 51. Sayfa - exception if null
fun printExceptionIfNull() {
    val str: String? = null
    println("Sayfa 51 = ${str ?: throw IllegalArgumentException("str is null")}")
}

// 52. Sayfa - accessing first element of null list
fun printAccessingFirstElementOfNullList() {
    val list: List<String>? = null
    println("Sayfa 52 = ${list?.firstOrNull()}")
}

// 53. Sayfa - if not null continue and run
fun printIfNotNullContinueAndRun() {
    val list = listOf("a", "b", "c")
    
    list?.let {
        it.forEach {
            println("Sayfa 53 = $it")
        }
    }
}

// 54. Sayfa - map nullable value if not null
fun printMapNullableValueIfNotNull() {
    val str: String? = "Hello, world!"
    val length = str?.let { it.length } ?: "str is null"
    println("Sayfa 54 = $length")
}

// 55. Sayfa - transform when value
fun printTransformWhenValue(x: Int) {
    val str = when (x) {
        1 -> "One"
        2 -> "Two"
        else -> throw IllegalArgumentException("Unknown value")
    }
    println("Sayfa 55 = $str")
}

// 56. Sayfa - try catch
fun printTryCatch() {
    try {
        val str: String? = null
        println("Sayfa 56 = ${str!!.length}")
    } catch (e: NullPointerException) {
        println("Sayfa 56 = str is null")
    }
}

// 58. Sayfa - if expression assignmet to a variable
fun printIfExpressionAssignmentToAVariable() {
    val a = 5
    val b = 10
    val max = if (a > b) a else b
    println("Sayfa 58 = $max")

    val min = if (a < b) {
        println("Sayfa 58 = a is less than b")
        a
    } else {
        println("Sayfa 58 = a is greater than or equal to b")
        b
    }
}

// 59. Sayfa - fill(-1) function
fun printFillFunction() {
    val list = IntArray(5).apply { fill(-1) }
    println("Sayfa 59 = $list")
}

// 60. Sayfa - single line methods
fun printSingleLineMethods() = println("Sayfa 60 = Hello, world!")

// 61. Sayfa - calling couple of methods from one object
class MyClass {
    fun method1() {
        println("Sayfa 61 = Method 1")
    }

    fun method2() {
        println("Sayfa 61 = Method 2")
    }
}

fun printCallingCoupleOfMethodsFromOneObject() {
    val myClass = MyClass()
    with(myClass) {
        method1()
        method2()
    }
}

// 62. Sayfa - apply method in an object
class Human {
    var name: String = ""
    var age: Int = 0
}

fun printApplyMethodInAnObject() {
    val person = Human().apply {
        name = "John"
        age = 25
    }
    println("Sayfa 62 = ${person.name}, ${person.age}")
}


// 63. Sayfa - file input stream
//fun printFileInputStream() {
//    val stream = Files.newInputStream(Paths.get("file.txt"))
//    stream.buffered.use {
//        val reader = BufferedReader(InputStreamReader(it))
//        println("Sayfa 63 = ${reader.readLine()}")
//    }
//}

// 64. Sayfa - generic types
inline fun <T> printGenericTypes(value: T) {
    println("Sayfa 64 = $value")
}

// 65. Sayfa - also function
fun printAlsoFunction() {
    val list = mutableListOf("a", "b", "c")
    list.add("d")
    list.removeAt(1)
    list.also {
        println("Sayfa 65 = $it")
    }
}

// 66. Sayfa - TODO
fun printTODO() : Int = TODO("Implement this function")

// 67. Sayfa - default parameter and named arguments
fun printDefaultParameterAndNamedArguments(a: Int = 5, b: Int = 10) {
    println("Sayfa 67 = $a, $b")
}

// 68. Sayfa - infix function
infix fun Int.add(b: Int) = this + b

fun printInfixFunction() {
    val sum = 5 add 10
    println("Sayfa 68 = $sum")
}

// 69. Sayfa - operator function
operator fun Int.times(str: String) = str.repeat(this)

fun printOperatorFunction() {
    val str = 5 * "Hello, "
    println("Sayfa 69 = $str")
}

// 70. Sayfa - function with vararg
fun printFunctionWithVararg(vararg values: Int) {
    for (value in values) {
        println("Sayfa 70 = $value")
    }
}

// 71. Sayfa - null safety with let
fun printNullSafetyWithLet() {
    val str: String? = "Hello, world!"
    str?.let {
        println("Sayfa 71 = ${it.length}")
    }
}

// 73. Sayfa - working with nulls
fun printWorkingWithNulls() {
    val str: String? = "Hello, world!"
    val length = str?.length ?: 0
    println("Sayfa 73 = $length")
}

// 74. Sayfa - classes and objects +  companion object
class MyClass2 {
    companion object {
        fun create(): MyClass2 = MyClass2()
    }
}

fun printClassesAndObjects() {
    val myClass = MyClass2.create()
    println("Sayfa 74 = $myClass")
}

// 75. Sayfa - generic classes
class Box<T>(t: T) {
    var value = t

    fun printValue() {
        println("Sayfa 75 = $value")
    }
}

fun printGenericClasses() {
    val box = Box("Hello, world!")
    box.printValue()
}

// 76. Sayfa - generic functions
fun <T> printGenericFunctions(value: T) {
    println("Sayfa 76 = $value")
}

// 77. Sayfa - inheritance
open class Base {
    open fun print() {
        println("Sayfa 77 = Base")
    }
}

class Derived : Base() {
    override fun print() {
        println("Sayfa 77 = Derived")
    }
}

fun printInheritance() {
    val base = Base()
    base.print()

    val derived = Derived()
    derived.print()
}

// 78. Sayfa - inheritance with parameterized constructor
open class Base2(val value: Int) {
    open fun print() {
        println("Sayfa 78 = Base: $value")
    }
}

class Derived2(value: Int) : Base2(value) {
    override fun print() {
        println("Sayfa 78 = Derived: $value")
    }
}

fun printInheritanceWithParameterizedConstructor() {
    val base = Base2(5)
    base.print()

    val derived = Derived2(10)
    derived.print()
}

// 79. Sayfa - passing constructor arguments to superclass
open class Base3(val value: Int) {
    open fun print() {
        println("Sayfa 79 = Base: $value")
    }
}

class Derived3(value: Int) : Base3(value) {
    override fun print() {
        println("Sayfa 79 = Derived: $value")
    }
}

fun printPassingConstructorArgumentsToSuperclass() {
    val base = Base3(5)
    base.print()

    val derived = Derived3(10)
    derived.print()
}

// 80. Sayfa - when experssion
fun printWhenExpression2(x: Int) {
    val str = when (x) {
        1 -> "One"
        2 -> "Two"
        else -> "Unknown"
    }
    println("Sayfa 80 = $str")
}

// 81. Sayfa - when expression with return
fun printWhenExpressionWithReturn(x: Int): String {
    return when (x) {
        1 -> "One"
        2 -> "Two"
        else -> "Unknown"
    }
}

// 82. Sayfa - for loop
fun printForLoop() {
    for (i in 1..5) {
        println("Sayfa 82 = $i")
    }

    // list
    val list = listOf("a", "b", "c")
    for (s in list) {
        println("Sayfa 82 = $s")
    }
}

// 83. Sayfa - while loop
fun printWhileLoop() {
    var i = 1
    while (i <= 5) {
        println("Sayfa 83 = $i")
        i++
    }

    // list
    val list = listOf("a", "b", "c")
    var index = 0
    while (index < list.size) {
        println("Sayfa 83 = ${list[index]}")
        index++
    }
}

// 84. Sayfa - do-while loop
fun printDoWhileLoop() {
    var i = 1
    do {
        println("Sayfa 84 = $i")
        i++
    } while (i <= 5)
}

// 85. Sayfa - ranges
fun printRanges2() {
    for (i in 1..5) {
        println("Sayfa 85 = $i")
    }

    for (i in 5 downTo 1) {
        println("Sayfa 85 = $i")
    }

    for (i in 1 until 5) {
        println("Sayfa 85 = $i")
    }
}

// 88. Sayfa - equality checks
fun printEqualityChecks() {
    val a = 5
    val b = 5
    println("Sayfa 88 = ${a == b}")

    val str1 = "Hello"
    val str2 = "Hello"
    println("Sayfa 88 = ${str1 == str2}")

    val list1 = listOf("a", "b", "c")
    val list2 = listOf("a", "b", "c")
    println("Sayfa 88 = ${list1 == list2}")

    // ===
    val list3 = list1
    println("Sayfa 88 = ${list1 === list3}")
}

// 89. Sayfa - conditional statements
fun printConditionalStatements2() {
    val a = 5
    val b = 10
    if (a > b) {
        println("Sayfa 89 = $a is greater than $b")
    } else {
        println("Sayfa 89 = $a is less than or equal to $b")
    }

    val max = if (a > b) a else b
    println("Sayfa 89 = max = $max")
}

// 90. Sayfa - car data class
data class Car(
    val brand: String,
    val model: String,
    val year: Int,
)

fun printCarDataClass() {
    val car = Car("Toyota", "Corolla", 2020)
    println("Sayfa 90 = $car")
}

// 91. Sayfa - product data class with methods operators
data class Product(
    val name: String,
    val price: Double,
) {
    operator fun plus(other: Product) = Product(name + other.name, price + other.price)
}




