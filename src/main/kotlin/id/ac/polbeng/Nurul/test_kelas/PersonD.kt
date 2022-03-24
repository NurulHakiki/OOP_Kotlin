package id.ac.polbeng.Nurul.test_kelas

/*
Konstruktor tambahan (secondary constructor) didefenisikan didalam tubuh kelas. Jika property
kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di
inisialisasi didalam konstruktor tambahan atau blok inisialisasi. Konstruktor tambahan
memerlukan keyword constructor untuk mendefenisikannya. Selain itu konstruktor tambahan
boleh tidak memiliki tubuh kelas dalam pendefenisiannya.
 */
class PersonD {
    var firstaName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age:Int) {
        firstaName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val Nurul = PersonD("Nurul", "Hakiki", 20)
    println("Name : ${Nurul.firstaName} ${Nurul.lastName}")
    println("Age : ${Nurul.age}")
}