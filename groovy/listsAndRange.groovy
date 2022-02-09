def alst = []

alst += [1, 2, 3]
alst << 4 << 5
alst.add(8)
println alst.size
println 'доступ к элементам списка'
assert alst[0] == 1
assert alst.get(0) == 1
assert alst.getAt(0) == 1
assert alst[-1] == 8
println 'изменение элементов списка'
alst.putAt(0, 100)
println alst[1]
assert alst.set(1, 2)
println alst
println 'Обход элементов списка'
alst.each { println "$it" }
println 'Обход элементов списка вместе с их индексами'
alst.eachWithIndex { it, index -> println item: "$it", index: "$index" }
println 'Уделение элементов'
alst -= 1 //удалить по индексу
alst.minus([-1, 4])
alst -= 4
println alst

def range = 1..10
range = 'a'..'c'

println 'исключение последнего элемента из диапазона'
range = 1..<8

println 'Метод each'

(1..5).each { println it }

println 'Секционирование'

assert [*1..4] == [1, 2, 3, 4]
assert [1, *2..4] == [1, 2, 3, 4]
