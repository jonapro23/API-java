package Main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println(date);
        System.out.println(formatter.format(date));
        }
    }

