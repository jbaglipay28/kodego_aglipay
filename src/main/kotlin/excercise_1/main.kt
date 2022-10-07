package excercise_1
var pos = "Mobile App Developer"
var sal = "30,000-40,000 PHP"
var date = "07-10-"
var Fname = "Michael"
var Lname = "Jackson"
var Mname = "A."
var Birthdate = "09-29-1958"
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
var deg = "Computer Engineering"
var maj:String?= null



fun main(){
    print("Enter Your Age:\n")
    val age = readLine()?.toInt()



    if (age != null) {
        if ((age > 17) && (age < 101)) {

            println("Q1 . are you a US CITIZEN? YES/NO")
            var SSid1 = readLine()?.toString()
            println("Q2 . HAVE YOU EVER CONVICTED OF A FELONY? YES/NO")
            var q2 = readLine()?.toString()
            println("Q3 . IF SELECTED ARE YOU WILLING TO SUBMIT A DRUG TEST ? YES/NO ")
            var q3 = readLine()?.toString()
            print("\n\n\t***EMPLOYMENT FORM*** \n")

            println("Position you are applying : $pos ")
            println("Desired Salary : $sal")
            println("Date available to work : $date")
            println("NAME : $Fname  $Mname $Lname")
            println("AGE : $age ")
            println("ADDRESS :  $Add")
            println("Birthdate : $Birthdate")
            println("CITY :  $City")
            println("STATE :  $State")
            println("ZIPCODE :  $Zcode")
            println("HOMEPHONE :  $Hphone")
            println("CELLPHONE :  $Cphone")
            println("Email :  $Email")
            println("SCHOOL : $School")
            println("SCHOOL LOCATION :  $ScAdd")
            println("SCHOOL YEAR :  $year")
            println("DEGREE RECEIVED : $deg")
            println("Major : $maj")
            println("US CITIZEN :  $SSid1")
            println("CONVICTED TO A FELONY :  $q2")
            println("Willing to submit a drug test:  $q3")


        }else
            if (age < 18){
                println("We only accept employees from 18 years old and above.")
            }else if (age > 100)
                println("ARE YOU SURE YOU ARE STILL FIT TO WORK ? you're already more than 100 years old.")

    }



}
