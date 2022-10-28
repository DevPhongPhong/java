import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String Add0(int i) {
        if (i < 10)
            return "00" + i;
        else if (i < 100)
            return "0" + i;
        else
            return "" + i;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String _name = sc.nextLine();
            String _class = sc.nextLine();
            String _dob = sc.nextLine();
            if (_dob.charAt(1) == '/')
                _dob = "0" + _dob;
            if (_dob.charAt(4) == '/')
                _dob = _dob.substring(0, 3) + "0" + _dob.substring(3);
            String _gpa = sc.nextLine();
            if (_gpa.length() > 4)
                _gpa = _gpa.substring(0, 4);
            else if (_gpa.length() == 1)
                _gpa += ".00";
            while (_gpa.length() < 4)
                _gpa += '0';
            String s = "B20DCCN" + Add0(i) + " ";
            s += _name + " ";
            s += _class + " ";
            s += _dob + " ";
            s += _gpa;
            System.out.println(s);
        }
    }
}