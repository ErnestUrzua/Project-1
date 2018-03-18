
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author Ernest Urzua
 *
 */
//Main class
public class NFAtoDFA {

    String[][] states = {
        {"q1 ", "q1,q2 ", "lambda "},
        {"q3 ", "lambda ", "q3 "},
        {"lambda ", "q4 ", "lambda "},
        {"q4 ", "q4 ", "lambda "},};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NFAtoDFA nfa = new NFAtoDFA();
        //Loading of input
        //Loading();
        //read user input from text file
        nfa.ReadInput();

    }

    /**
     * Method to read input from a textfile
     *
     *
     */
    public void ReadInput() {
        String[] input = new String[10]; //variable to hold user input
        int i = 0;
        String line = null;
        try {

            PrintStream out = new PrintStream(new FileOutputStream("Input2.txt", true));

            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader("Input2.txt");

            // wrap FileReader in BufferedReader.
            BufferedReader br = new BufferedReader(fileReader);

            System.out.print("Reading input");
            System.out.println();
            //Loading();
            while ((line = br.readLine()) != null) {
                //System.out.println(line);                

                //add the input text to the states array
                input[i] = line;
                i++;

            }
            System.out.print(Arrays.toString(input));
            System.out.println();
            System.out.println();

            System.out.print("Transistion table for NFA\n");
            //Loop that prints out players name and round
            for (int j = 0; j < states.length; j++) {
                System.out.println(states[j][0] + states[j][1]);
            }
            // System.out.print(Arrays.deepToString(states));
            System.out.println();

            //send input to machine to see if it is accepted or not
            States(input);
        } catch (IOException e) {
        }
    }

    /**
     * Method to take input array and see if it is an accepted input
     *
     * @param array
     *
     */
    public void States(String array[]) {
        int i = 0;
        int k = 0;
        boolean accept = true; //flag to keep track if input is valid
        System.out.println("Reading in machine input");
        //Loading();

        //Loop that prints out states name 
        while (array[i] != null) {
            System.out.print(array[i]);
            i++;
        }
        Loading();

        //check whether input is accepted by NFA
        while (array[k] != null) {
            
                if (array[k] == states[0][0]);
                
                    System.out.println(array[k] + " Input accepted");
                k++;
            }

            accept = false;
            System.out.println("Input not accepted");
        }

    

    /**
     *
     */
    public static void Loading() {
        int time = 100;

        try {
            //1000 milliseconds is one second.
            Thread.sleep(time);
            System.out.print(".");
            Thread.sleep(time);
            System.out.print(".");
            Thread.sleep(time);
            System.out.print(" .");
            Thread.sleep(time);
            System.out.print("  .");
            Thread.sleep(time);
            System.out.print("    .");
            Thread.sleep(time);
            System.out.print("       .");
            Thread.sleep(time);
            System.out.print("              .");
            Thread.sleep(time);
            System.out.print("              .");
            Thread.sleep(time);
            System.out.print("        .");
            Thread.sleep(time);
            System.out.print("     .");
            Thread.sleep(time);
            System.out.print("   .");
            Thread.sleep(time);
            System.out.print("  .");
            Thread.sleep(time);
            System.out.print(" .");
            Thread.sleep(time);
            System.out.print(" .\n");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
