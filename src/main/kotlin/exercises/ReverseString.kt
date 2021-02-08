package exercises

import java.lang.StringBuilder

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {

    var sbPhrase = StringBuilder()
    var j = str.length - 1

    while (j >= 0) {
        sbPhrase.append(str[j])
        j--
    }
    return sbPhrase.toString()
}