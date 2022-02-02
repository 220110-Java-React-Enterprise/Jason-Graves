import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String input1 = scnr.nextLine();
        String input2 = scnr.nextLine();
        boolean isomorphic = true;
        Character[] input1array = new Character[input1.length()];
        Character[] input2array = new Character[input2.length()];
        ArrayList<Optimus> goesToArray = new ArrayList<>();
        Optimus[] tempOArray = new Optimus[input1array.length];
        if (input1.length() != input2.length())
            isomorphic = false;

    if(isomorphic == true){
        for(int i=0;i<input1.length();i++){
            input1array[i] = input1.charAt(i);
            input2array[i] = input2.charAt(i);
            tempOArray[i] = new Optimus(input1.charAt(i),input2.charAt(i));
            goesToArray.add(tempOArray[i]);
                goesToArray.get(i).setStart(input1.charAt(i));
                goesToArray.get(i).setEnd(input2.charAt(i));
        }
        for(int i=0;i<input1.length();i++){
            for(int j=i+1;j<input1.length();j++)
                if(i!=j && goesToArray.get(i).getStart().equals(goesToArray.get(j).getStart()) == true)
                    if (goesToArray.get(i).getEnd().equals(goesToArray.get(j).getEnd()) == false )
                        isomorphic = false;
        }
    }
        System.out.println(isomorphic);
    return isomorphic;
    }
}
