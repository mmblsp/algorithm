#!/usr/bin/env groovy

String print_element(BigDecimal element) {
    fmt = "${'*'*8}"
    result = "${fmt}\t${element}\t${fmt}"
    print("${result}\n")
    return result
}

list1 = []; list2 = []; list3 = []

for (element in 0..9) {
    list1 += element
    list2 += element + 1
    list3 += (list1[element] + list2[element]) / 2
}

list3.each {
    println it
}

assert list3.any { it > 1 } // по крайней мере один удовлетворяет
assert list3.every { it > 0 } //Все элементы удовлетворяют условию
list3.collect { it -> print_element(it) }
list4 = list3.findAll { it > 5 }
print("${list3}\n")
print("${list4}\n")
println 'end'
