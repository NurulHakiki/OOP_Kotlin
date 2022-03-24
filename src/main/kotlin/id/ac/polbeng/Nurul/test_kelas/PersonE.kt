package id.ac.polbeng.Nurul.test_kelas
//Konstruktor tambahan dapat didefinisikan lebih daeri 1
class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName:String) {
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo() {
        println("Name : ${firstName} ${lastName}")
        println("age : ${age}")
    }
}

fun main() {
    val Nurul = PersonE("Nanda", "Syalalala")
    Nurul.cetakInfo()
    println()
    val Hakiki = PersonE("Dina", "Tralalalala", 25)
    Hakiki.cetakInfo()
}

/*
Keyword this merujuk pada konstruktor kelas saat ini yang bersesuaian. Pada contoh
diatas this(_firstName, _lastName) merujuk pada konstruktor yang berwarna kuning dan akan
memanggilnya terlebih dahulu sebelum kode didalam konstruktor yang berwarna hijau
dieksekusi.
 */