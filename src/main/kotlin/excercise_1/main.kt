package excercise_1

var Fname = "Michael"
var Lname = "Jackson"
var Mname = "A."
var Add = "Lucky Chinatown"
var City = "Manila"
var State:String? = null
var Zcode:String? = null
var Hphone:String? = null
var Cphone = "09123456726"
var Email= "mjJACKSTONE@gmail.com"
var School = "KodeGo"
var ScAdd = "Taguig"
var year = "2022"



fun main(){
    print("Enter Your Age:\n")
    val age = readLine()?.toDouble()



    if (age != null) {
        if ((age > 17) && (age < 101)) {
            println("Q1 . are you a US CITIZEN? YES/NO")
            var SSid1 = readLine()?.toString()
            println("Q2 . HAVE YOU EVER CONVICTED OF A FELONY? YES/NO")
            var q2 = readLine()?.toString()
            println("Q3 . IF SELECTED ARE YOU WILLING TO SUBMIT A DRUG TEST ? YES/NO \n\n")
            var q3 = readLine()?.toString()
            print("\t***EMPLOYMENT FORM*** \n")
            println("NAME : $Fname  $Mname $Lname")
            println("AGE : $age ")
            println("ADDRESS :  $Add")
            println("CITY :  $City")
            println("STATE :  $State")
            println("ZIPCODE :  $Zcode")
            println("HOMEPHONE :  $Hphone")
            println("CELLPHONE :  $Cphone")
            println("Email :  $Email")
            println("SCHOOL : $School")
            println("SCHOOL LOCATION :  $ScAdd")
            println("SCHOOL YEAR :  $year")
            println("US CITIZEN :  $SSid1")
            println("CONVICTED TO A FELONY :  $q2")
            println("Willing to submit a drug test:  $q3")

        }else
            if (age < 18){
                println("NOT IN LEGAL AGE")
            }else if (age > 100)
                println("YOU ARE MORE THAN 100 YEARS OLD")

    }



}
