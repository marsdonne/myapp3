package myapp2

class MyDomain {

    String name
    Date birthday
    Integer gender
    String addr

    Integer age

    static transients = ['age']

    static constraints = {
        name(blank: false)
        birthday(nullable: false, validator: { it < new Date() })
        gender(nullable: false, range: 0..1)
        addr(blank: false)
    }

    def afterLoad() {
        age = (new Date() - birthday) / 365 as int
    }
}
