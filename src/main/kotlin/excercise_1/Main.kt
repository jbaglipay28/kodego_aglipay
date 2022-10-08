package excercise_1

import java.util.Date


fun main(){
        //Employment Form
            var position:String?=null
            var salary:String?=null
            var available_date= Date()

        //Personal Information
            var Firstname:String?=null
            var Lastname:String?=null
            var Middlename:String?=null
            var Birthdate:String?=null
            var Address:String?=null
            var City:String?=null
            var State:String?=null
            var Zipcode:String?=null
            var Homephone:String?=null
            var Cellphone:String?=null
            var Email:String?=null
        //Education
            var School:String?=null
            var School_Addres:String?=null
            var Year_Attended:Int?=null
            var Degree:String?=null
            var Major:String?=null

    print("Enter Your Age:\n")
    val age = readLine()?.toInt()



    if (age != null) {
        if ((age > 17) && (age < 101)) {

            println("Q1 . are you a US CITIZEN? YES/NO")
            var answer1 = readLine()?.toString()

            println("Q2 . HAVE YOU EVER CONVICTED OF A FELONY? YES/NO")
            var answer2 = readLine()?.toString()
            println("Q3 . IF SELECTED ARE YOU WILLING TO SUBMIT A DRUG TEST ? YES/NO ")
            var answer3 = readLine()?.toString()
            print("\n\t***EMPLOYMENT FORM***\t\n")

            println("Position you are applying : $position ")
            println("Desired Salary : $salary")
            println("Date available to work : $")
            println("NAME : $Firstname  $Middlename $Lastname")
            println("AGE : $age ")
            println("ADDRESS :  $Address")
            println("Birthdate : $Birthdate")
            println("CITY :  $City")
            println("STATE :  $State")
            println("ZIPCODE :  $Zipcode")
            println("HOMEPHONE :  $Homephone")
            println("CELLPHONE :  $Cellphone")
            println("Email :  $Email")
            println("SCHOOL : $School")
            println("SCHOOL LOCATION :  $School_Addres")
            println("SCHOOL YEAR :  $Year_Attended")
            println("DEGREE RECEIVED : $Degree")
            println("Major : $Major")
            println("US CITIZEN :  $answer1")
            println("CONVICTED TO A FELONY :  $answer2")
            println("Willing to submit a drug test:  $answer3")


        }else
            if (age < 18){
                println("We only accept employees from 18 years old and above.")
            }else if (age > 100)
                println("ARE YOU SURE YOU ARE STILL FIT TO WORK ? you're already more than 100 years old.")

    }



}
