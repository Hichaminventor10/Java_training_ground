package src.chapter01_fundamentals.examples;

import java.io.* ;


public class Main {

    public static void main(String[] args)
    throws  IOException{


        System.out.println("============");

        try (InputStream input = new FileInputStream("test.txt")){
            readData( input); // transmet le flux a la methode

           int result = square(5);
            System.out.println(result);


        }

        }



    public static void readData(InputStream input)
    throws IOException{ // on peut transmettre une exceptions
        int data;
        while ((data = input.read()) !=  -1) {
            System.out.print((char) data);

        }
    }
    public static int square(int number){
        return number * number ;
    }
}

