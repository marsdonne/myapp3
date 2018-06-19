package myapp2

class MyDomain {

    String name
    Date birthday
    Integer gender
    String addr

    static constraints = {
        name(blank: false)
        birthday(nullable: false, validator: { it < new Date() })
        gender(nullable: false, range: 0..1)
        addr(blank: false)
    }
}
