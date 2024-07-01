import jdk.jfr.DataAmount

enum class TypeAccount {
    DebitAccount,
    creditAccount,
    checkingAccount
}
class BankAccount(var typeAccount:String)



fun main() {
    var  list:List<TypeAccount> = listOf(TypeAccount.checkingAccount,TypeAccount.creditAccount,TypeAccount.DebitAccount)
    var list2:MutableList<BankAccount>
    println("welcome to your bank account Syetem")
    println("please chose a account type from this list $list type 1 to choose ${list.get(0)} type 2 to choose ${list.get(1) } type 3 to choose ${list.get(2)} ")
    var AccountType:String=""
    while (AccountType==""){
        println("please choose the option 1,2,3")
        var userChoice:Int=(1..5).random()
        while (userChoice==4 || userChoice<1||userChoice>3){
            println("invalid choice please try again")
            userChoice=(1..5).random()
        }
        when(userChoice){
            1-> AccountType=TypeAccount.DebitAccount.toString()
            2->AccountType=TypeAccount.creditAccount.toString()
            3->AccountType=TypeAccount.checkingAccount.toString()
        }
    }
    println(AccountType)
    var accountBlance:Int=(0..10000).random()
    println("the accountBlance is $accountBlance")
    val Money:Int=(0..10000).random()
    var output:Int=0
    fun WithDraw(amount: Int):Int{
       accountBlance-=amount
        println("the amount money you have withDraw is $amount your new account blance is:$accountBlance")
        return amount
    }
    println( WithDraw(output))
    fun debitWithdraw (amount:Int):Int{
        if (accountBlance==0){
            println("you cannot withdraw soory")
            return accountBlance

        }else if (amount>accountBlance){
            println("you cannot withdraw soory")
            return accountBlance
        }
        return WithDraw(amount)
    }
    println(debitWithdraw(output))
    fun Deposit(amount:Int):Int{
        accountBlance+=amount
        return amount

    }
    println(Deposit(output))

    fun CreditDeposit(amount:Int):Int{
        if (accountBlance==0) {
            println("you don't need to desposit anything")
            return accountBlance
        }else if (accountBlance + amount>0){
            println("deposit failed")
            return 0
        }else if (amount==-accountBlance){
            accountBlance=0
            println("you have paid this account")
            return amount
        }else
            return Deposit(amount)
    }




    }












