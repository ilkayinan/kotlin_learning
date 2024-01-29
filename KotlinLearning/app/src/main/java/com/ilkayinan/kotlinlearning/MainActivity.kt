package com.ilkayinan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hello Kotlin")
        println(4*5)
        // degiskenler (var)
        var x = 5
        var y = 4
        println(x*y)
        var age = 35
        var result = age/7*5
        println(result)
        age =36
        println(age/6)
        //constants (val)
        val name ="ilkay"
        // defining tanımlama
        println("******** integer *********")
        var myInteger : Int = 30 // defining initialize
        //initialize tanımlama
        myInteger = 10
        myInteger = 23
        println(myInteger/2)

        //double or float
        println("******** double float *********")
        val pi = 3.14
        println(pi*2)

        val myFloat = 3.14f
        println(myFloat*2)

        var myAge :Double
        myAge = 23.0
        println(myAge/2)

        println("******** string *********")
        val myString = "ilkay inan"
        println(myString)
        val name1 = "ilkay"
        val surname = "inan"
        val fulname = name1 +" "+ surname
        println(fulname)
        var myString1 = "at"


        println(myString1.replaceFirstChar { "A" })

        println("******** boolean *********")

        var myBoolean : Boolean = true
        myBoolean = false
        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // &&  and
        // ||  or
        println(3<5)
        println(6<3)
        println(3==3)
        println(3!=5)

        println("******** conversion *********")
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)
        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger*2)

        println("******** collections *********")
        println("******** arrays diziler *********")

        val myArray = arrayOf("james","kirk","rob","lars")
        println(myArray[0])
        myArray[0] = "james heatfield"
        println(myArray[0])
        println(myArray)
        myArray.set(1,"kirk hammot")
        println(myArray[1])
        //myArray[4]="ilkay inan"
        //println(myArray[4])
        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        //println(numberArray[5])
        val myNewArray= doubleArrayOf(1.0,2.0,3.0)
        val mixedArray = arrayOf("ilkay",5)
        println(mixedArray[0])
        println(mixedArray[1])

        println("******** arrays list listeler *********")
        val myMusician = arrayListOf<String>("james","kirk")
        println(myMusician[0])
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        println(myArrayList[0])
        myArrayList.add(2)
        println(myArrayList[0])
        println(myArrayList[1])

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("ilkay")
        myMixedArrayList.add(2)
        myMixedArrayList.add(true)
        myMixedArrayList.add(12.025)
        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])
        println(myMixedArrayList[3])

        println("******** set *********")
        // bir değer bir kez kullanılabilir.
        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1 : ${myExampleArray[0]}")
        println("element 2 : ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)
        // For each
        mySet.forEach { println(it*3) }

        val myStringSet = HashSet<String>()
        myStringSet.add("ilkay")
        myStringSet.add("ilkay")
        myStringSet.forEach { println(it) }

        println("******** map key-value pairing *********")
        // key- value pairing, anahtar-değer eşleştirmesi
        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray = arrayOf(100,150)
        println("${fruitArray[0]} : ${caloriesArray[0]}")
        println("${fruitArray[1]} : ${caloriesArray[1]}")

        val calorieFruitMap = hashMapOf<String,Int>()
        calorieFruitMap.put("Apple",100)
        calorieFruitMap.put("Banana",150)
        println(calorieFruitMap["Apple"])
        val myHashMap = HashMap<String,String>()
        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])

        //Operators
        println("******** operators *********")

        var m=5
        println(m)
        m=m+1
        println(m)
        m++
        println(m)
        m--
        println(m)
        var n=7
        println(n > m)
        println(n>m && 1>2)
        println(n>m || 1>2)
        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)
        println(10%3) // kalan veya mod (remainder)

        // if controls
        println("******** if controls *********")

        val myNumberAge = 52
        if (myNumberAge<30){
            println("<30")
        } else if (myNumberAge>=30 && myNumberAge <40) {
            println("30-40")
        } else if (myNumberAge>=40 && myNumberAge <50){
            println("40-50")
        } else {
            println(">=50")
        }
        // switch and when
        println("******** switch controls *********")

        val day = 3
        var dayString = ""
        /*
        if (day == 1) {
            dayString = "Monday"
        } else if(day == 2){
            dayString = "Tuesday"
        }else if(day == 3){
            dayString = "Wednesday"
        }
        println(dayString)

         */

        when(day){
            1->dayString = "Monday"
            2->dayString = "Tuesday"
            3->dayString = "Wednesday"
            else->dayString = ""
        }
        println(dayString)

        println("******** loops *********")
        //loops
        //for loops
        println("******** for loops *********")
        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        var q : Double
        q = (myArrayofNumbers[0].toDouble()*3/5)
        println(q)

        for (number in myArrayofNumbers){
            val z = number/3*5
            println(z)
        }

        for(i in myArrayofNumbers.indices){
            val qz = myArrayofNumbers[i]/3*5
            println(qz)
        }

        for (b in 0..9){
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("ilkay")
        myStringArrayList.add("inan")
        myStringArrayList.add("aram")

        for(str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        // While loop
        println("******** whiel loops *********")
        var j = 0
        while(j<10){
            j=j+1
            println(j)
        }


    }
}