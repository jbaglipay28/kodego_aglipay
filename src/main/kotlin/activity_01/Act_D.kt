package activity_01

import mu.KotlinLogging
import java.util.logging.Logger

private val logger = KotlinLogging.logger{}
fun main() {



    logger.info { "INPUT 1st MONETARY VALUE " }
    var cash1 = readln().toIntOrNull()
    if (cash1 == null) {

        logger.info { "invalid input " }
        cash1 = readln().toIntOrNull()
    }else  if (cash1 != null){
           logger.info { "INPUT 2nd MONETARY VALUE " }
           var cash2= readln().toIntOrNull()

           if( cash2 == null) {
               logger.info { "invalid input " }
           } else if (cash2!=null){
               logger.info { "INPUT 3rd MONETARY VALUE " }
               var cash3= readln().toIntOrNull()
               if (cash3==null){
                   logger.info { "invalid input " }
               }else if (cash3!=null){
                   logger.info { "INPUT 4th MONETARY VALUE " }
                   var cash4= readln().toIntOrNull()
                   if (cash4 == null){
                       logger.info { "invalid input " }
                   }
                   else if (cash4 != null ) {
                       logger.info { "INPUT 5th MONETARY VALUE " }
                       var cash5= readln().toIntOrNull()
                       if (cash5==null){
                           logger.info { "invalid input " }
                       }else if (cash5!=null){
                           var total = cash1.toInt() + cash2.toInt() + cash3.toInt() + cash4.toInt() + cash5.toInt()
                            logger.info { "Total of the 5 monetary value :$total" }
                            var divisor:String?=null
                            logger.info { "Divide the value by how many? : " }
                            divisor = readln().toString()
                            var newDivisor = divisor.toFloat()
                            logger.info { "RESULT : ${total/newDivisor} " }
                       }
                   }
              }
           }
        }
}































