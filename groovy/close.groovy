
println 'Замыкания:\nПростое'
def clos1 = { println 'Hello world' }
clos1()
println  'с аргументами'
def clos2 = { args1, args2 -> println args1 + args2 }
clos2(1, 2)
clos2('a', 'b')
clos2('a', 1)

println 'Замыкание внутри метода'

def method1(book) {
    def prefix = 'The title of the book is:'
    return { println prefix + book }
}

def clos3 = method1('Groovy')
clos3()

public class Employee {

    def salary
    public double calculateRaise(c) {
        return c(salary)
    }

}

Employee employee1 = new Employee(salary:1000)
def raise1 = { salary -> (salary * 1.5) }
assert employee1.calculateRaise(raise1) == 1500

Employee employee2 = new Employee(salary:500)
def raise2 = { salary -> (salary + 300) }
assert employee2.calculateRaise(raise2) == 800

println employee1.calculateRaise({ salary -> salary - 100 })
