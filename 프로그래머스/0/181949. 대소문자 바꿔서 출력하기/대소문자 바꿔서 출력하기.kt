fun main(args: Array<String>) {
    val s1 = readLine()!!
    var result = ""
    for (i in s1) {
        if (i.isUpperCase()) {
            print(i.lowercaseChar())
        } else if (i.isLowerCase()) {
            print(i.uppercaseChar())
        }
    }
}