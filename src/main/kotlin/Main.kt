fun main(args: Array<String>) {

    var currentBalance  = 10000
    println("Welcome To virtual ATM Machine")
    println("Enter 1 for Check Balance")
    println("Enter 2 for Deposit Amount")
    println("Enter 3 for Withdraw Amount")
    println("Enter 4 for Exit ATM")

    val a= readln()
    val choice = a.toInt()

    when(choice){
        1->{
            println("Your current Balance is $currentBalance")
        }
        2->{
            println("How much money do you want to Deposit?")
            val b= readln()
            val amount = b.toInt()
            currentBalance += amount
            println("$amount Deposit Successfully")
            println("Now You have $currentBalance Balance")

        }
        3->{
            println("How much money do you want to Withdraw?")
            val c = readln()
            val withDraw = c.toInt()
            if (withDraw<currentBalance){
                currentBalance-= withDraw
                println("$withDraw WithDraw is Successfully")
                println("Now You have $currentBalance Balance")
            }else{
                println("You haven't sufficient Money!!!")
            }
        }
        4->{
            println("Thank You Visit Again!!")

        }
        else->{
            println("Please Choose Correct Option")
        }
    }



}