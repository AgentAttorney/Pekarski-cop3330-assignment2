package Ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Pekarski
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    public boolean setFirstName(String FN) {
        if(FN.length() >= 2)
        {
            return true;
        }
        return false;
    }

    public boolean setLastName(String LN) {
        if(LN.length() >= 2)
        {
            return true;
        }
        return false;
    }

    public boolean setID(String ID) {
        Pattern id_pattern = Pattern.compile("\\w{2}-\\d{4}");
        Matcher match_pattern = id_pattern.matcher(ID);
        boolean Yes_ID = match_pattern.matches();
        return Yes_ID;
    }

    public boolean setZip(String Zip) {
        Pattern zip_pattern = Pattern.compile("\\d{5}");
        Matcher match_pattern = zip_pattern.matcher(Zip);
        boolean Yes_Zip = match_pattern.matches();
        return Yes_Zip;
    }

    public void ValidateInput(String FN, String LN, String ID, String Zip){
        boolean T_FN = setFirstName(FN);
        boolean T_LN = setLastName(LN);
        boolean T_ID = setID(ID);
        boolean T_Zip = setZip(Zip);

        String FN_Error = "FN must be at least 2 characters.\n";
        String LN_Error = "LN must be at least 2 characters.\n";
        String ID_Error = "IDs must be of the form: AA-1234.\n";
        String Zip_Error = "Zips must be 5 numbers.\n";
        String No_Error = "No Errors in Formatting.\n";
        String List_Errors = "";
        // Validate Input uses all the set Functions to print,
        // but it does no computation of its own
        if(!T_FN)
        {
            List_Errors = List_Errors + FN_Error;
        }
        if(!T_LN)
        {
            List_Errors = List_Errors + LN_Error;
        }
        if(!T_ID)
        {
            List_Errors = List_Errors + ID_Error;
        }
        if(!T_Zip)
        {
            List_Errors = List_Errors + Zip_Error;
        }
        if(T_FN && T_LN && T_ID && T_Zip)
        {
            List_Errors = List_Errors + No_Error;
        }
        System.out.print(List_Errors);
    }
}
