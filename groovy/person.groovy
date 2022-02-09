class Person {

    String firstName
    String lastName
    def getName() {
        "${firstName} ${lastName}"
    }

    static void main(args) {
        def person = new Person()
        person.firstName = 'Bashar'
        person.lastName = 'Abdul'
        assert person.firstName == 'Bashar'
        assert person.name == 'Bashar Abdul'
    }

}

def per = new Person()
per.firstName = 'Anatoly'
per.lastName = 'Zhuchkov'
println per.name
