import java.util.Random;
import java.util.Scanner;

val getKeyboard = Scanner(System.`in`);
val randomize = Random();

fun main(args: Array<String>){
    println("Randomizer v1.0");
    do{
        showMenu("main");
        getAction("main", getKeyboard.nextInt());
        println("Enter 'Q' to Quit, anything else to continue.");
    } while (!getKeyboard.next().equals("q", true));
}

fun showMenu(context: String) = when(context){
    "main" -> println("Main Menu\nPlease select an item:\n1: Flip a coin\n2: Roll dice\n3: Pick a card");
    "coins", "dice", "cards" -> println("How many $context?");
    else -> println("This feature is currently unavailable");
}

fun getAction(context: String, position: Int) = when(context){
    "main" -> when(position){
        1 -> {
            var subcontext = "coins";
            showMenu(subcontext);
            doAction(subcontext, getKeyboard.nextInt());
        }
        2 -> {
            var subcontext = "dice";
            showMenu(subcontext);
            doAction(subcontext, getKeyboard.nextInt());
        }
        3 -> {
            var subcontext = "cards";
            showMenu(subcontext);
            doAction(subcontext, getKeyboard.nextInt());
        }
        else -> println("This feature is currently unavilable");
    }
    else -> println("This feature is currently unavilable");
}

fun doAction(context: String, num: Int) = when(context){
    "coins" -> {
        println("Results of coin tosses:")
        for (i in 1..num) println(if (randomize.nextBoolean()){"$i. Heads"} else {"$i. Tails"})
    }
    "dice" -> println("Do $num dice stuff"); // Int 1-6
    "cards" -> println("Do $num card stuff"); // 2D Array
    else -> println("This feature is currently unavilable");
}