package id.ac.polbeng.Nurul.test_kelas

class PersonC (var firstName: String, var lastName:String, var age: Int){}

fun main() {
    val Nurul = PersonC("Nurul", "Hakiki", 20)
    println("Name : ${Nurul.firstName} ${Nurul.lastName}")
    println("Age : ${Nurul.age}")
}

/*
supaya lebih ringkas dari kedua progra, diatas, dapat dilakukan
deklaraso dan inisialisasi propersty dapat dilakykan hanya \
didalam parameter konstruktor utama.
 */