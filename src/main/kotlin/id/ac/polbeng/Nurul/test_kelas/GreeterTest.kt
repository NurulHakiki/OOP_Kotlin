package id.ac.polbeng.Nurul.test_kelas

/*
berikan nilai text dengan “Hi” kemudian panggillah method  greet dari
kelas Greeter dan masukkan nilainya dengan “Anton” dan “Budi”. Baris
selanjutnya  tambahkan nilai text dengan “Hello programmer” dan
panggil fungsi with_ret_val dengan  parameter String “Dono”.
 */
/*
fun main() {
    val greeter = Greeter()
    greeter.greet()
}*/

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}
