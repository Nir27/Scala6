import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

    val alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 

    def encryption(): Unit = { 
        
        print("Shift By: ")

        val shift = (alph.size + readInt() ) % alph.size  
         
        val Text1 =readLine("Message: ").toUpperCase() 

        val Text2 = Text1.map( (c: Char) => { 
 
            val x = alph.indexOf(c)

            if (x == -1){
                c
            }
            else{
                alph((x + shift) % alph.size)
                } 
        });
 
        println("Message :"+Text2);

    } 

    def decryption(): Unit = { 
        
        print("Shift By: ")

        val shift = (alph.size - readInt() ) % alph.size  
         
        val Text1 =readLine("Message: ").toUpperCase() 

        val Text2 = Text1.map( (c: Char) => { 
 
            val x = alph.indexOf(c)

            if (x == -1){
                c
            }
            else{
                alph((x + shift) % alph.size)
                } 
        });
 
        println("Message :"+Text2);

    } 

    def main(args: Array[String]) :Unit={

        println("  1  Encryption \n  2  Decryption ")
        
        print("Enter option:")
        val x: Int = readInt();
        x match
            case 1 => encryption();
            case 2 => decryption(); 
            case _ => println("Invalid entry")

    }
}