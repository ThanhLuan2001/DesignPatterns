package com.example.designpattern.CreationalPatterns._1_singleton

fun main() {
   //Singleton là một mẫu thiết kế (design pattern) trong lập trình,
    // được sử dụng để đảm bảo rằng một lớp chỉ có duy nhất một thể hiện (instance)
    // và cung cấp một điểm truy cập toàn cục đến thể hiện đó.
    // Điều này đảm bảo rằng chỉ có một đối tượng của lớp được tạo ra
    // và cung cấp một cách để truy cập nó từ mọi nơi trong chương trình.

    val eager1: EagerInitialization = EagerInitialization.getInstance()
    eager1.name1 = "EagerInitialization1"
    println(eager1.name1)// in ra kết quả EagerInitialization1

    val eager2: EagerInitialization = EagerInitialization.getInstance()
    println(eager2.name1) // tuy tạo đối tượng mới nhưng kết quả vẫn là EagerInitialization1

    println("-----------------------------------------------------")

    val lazy1 : LazyInitialization = LazyInitialization.getInstance()
    lazy1.name2 = "LazyInitialization1"
    println(lazy1.name2) // in ra kết quả LazyInitialization1

    val lazy2 : LazyInitialization = LazyInitialization.getInstance()
    lazy2.name2 = "LazyInitialization2"
    println(lazy2.name2) //tạo đối tượng mới và in ra kết quả LazyInitialization2
    println(lazy1.name2) // lúc này giá trị in ra không còn là LazyInitialization1 nữa mà đã bị LazyInitialization2 thay thế

    println("-----------------------------------------------------")

    val threadsafe1 : ThreadSafe = ThreadSafe.getInstance()
    threadsafe1.name3 = "ThreadSafe1"
    println(threadsafe1.name3) // in ra kết quả ThreadSafe1

    val threadsafe2 : ThreadSafe = ThreadSafe.getInstance()
    threadsafe2.name3 = "ThreadSafe2"
    println(threadsafe2.name3) //tạo đối tượng mới và in ra kết quả ThreadSafe2
    println(threadsafe1.name3) // lúc này giá trị in ra không còn là ThreadSafe1 nữa mà đã bị ThreadSafe2 thay thế

    println("-----------------------------------------------------")

    val doubleCheck1 : DoubleCheckLocking = DoubleCheckLocking.getInstance()
    doubleCheck1.name4 = "DoubleCheckLocking1"
    println(doubleCheck1.name4) // in ra kết quả DoubleCheckLocking1

    val doubleCheck2 : DoubleCheckLocking = DoubleCheckLocking.getInstance()
    doubleCheck2.name4 = "DoubleCheckLocking2"
    println(doubleCheck2.name4) //tạo đối tượng mới và in ra kết quả DoubleCheckLocking2
    println(doubleCheck1.name4) // lúc này giá trị in ra không còn là DoubleCheckLocking1 nữa mà đã bị DoubleCheckLocking2 thay thế

}