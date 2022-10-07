package excercise_1
  //Employment Form
    var position= ""
    var salary=""
    var available_date=""
//Personal Information
        var Firstname=""
        var Lastname=""
        var Middlename=""
        var Birthdate=""
        var Address=""
        var City=""
        var State=""
        var Zipcode=""
        var Homephone=""
        var Cellphone=""
        var Email=""
//Education
        var School=""
        var School_Addres=""
        var Year_Attended=""
        var Degree=""
        var Major=""



fun Main(){
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
