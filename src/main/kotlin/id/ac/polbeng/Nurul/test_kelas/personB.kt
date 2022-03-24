package id.ac.polbeng.Nurul.test_kelas

class personB(_firstName: String, _lastName:String, _age:Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main() {
    val Nurul = personB("Nurul", "Hakiki", 20)
    println("Name : ${Nurul.firstName} ${Nurul.lastName}")
    println("Age : ${Nurul.age}")
}

/*
unruk meringkaskan kode program kelas maka kita dapat menggabungkan proses deklarasi dan
menginisialisasi sebuah variabel pada blok inisialisasi kedalam saru statement
 */