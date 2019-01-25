import java.util.Random;
import java.util.Scanner;

val getKeyboard = Scanner(System.`in`);
val randomize = Random();
fun main(args: Array<String>){
    var chooser:Int;

    println("Kotlin Randomizer 1.0");
    println(showMenu("main"));
    chooser = getKeyboard.nextInt();
    getAction("main", chooser);
    println("You chose $chooser");
}

fun showMenu(context: String) = when(context){
    "main" -> println("Main Menu\nPlease select an item:\n1: Flip a coin\n2: Roll dice\n3: Pick a card");
    else -> println("This feature is currently unavailable");
}

fun getAction(context: String, position: Int){
    println("You chose $position in $context");
}