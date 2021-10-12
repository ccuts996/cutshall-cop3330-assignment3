package ex42;

import java.util.LinkedList;

public class Names{

    public static final int COLUMN_SIZE = 10;
    private String FIRST_NAME = "";
    private String LAST_NAME = "";
    private int SALARY = 0;

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public int getSalary() {
        return SALARY;
    }

    public void setFirstName(String firstName) {
        FIRST_NAME = firstName;
    }

    public void setLastName(String lastName) {
        LAST_NAME = lastName;
    }

    public void setSalary(int sal) {
        SALARY = sal;
    }

    public Names(String parse) {
        LinkedList<String> parsed = parsePerson(parse);

        setFirstName(parsed.remove(0));
        setLastName(parsed.remove(0));
        setSalary(Integer.parseInt(parsed.remove(0)));

    }

    public Names(String FIRST_NAME, String LAST_NAME, int SALARY) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SALARY = SALARY;
    }

    private LinkedList<String> parsePerson(String parse) {
        char[] parseList = parse.toCharArray();
        LinkedList<String> parsed = new LinkedList<>();

        int offset = 0;

        for (int i = 0; i < parseList.length; i++) {

            if(parseList[i] == ',') {
                parsed.add(String.copyValueOf(parseList, offset, i-offset));
                offset = i+1;
            }
        }
        parsed.add(String.copyValueOf(parseList, offset, parseList.length-offset));
        return parsed;
    }


    public String toString () {
        return formatFirstName().append(formatLastName()).append(SALARY).append("\n").toString();
    }

    private StringBuilder formatFirstName() {
        StringBuilder fname = new StringBuilder(FIRST_NAME);
        while(fname.length() != COLUMN_SIZE) {
            fname.append(" ");
        }
        return fname;
    }

    private StringBuilder formatLastName() {
        StringBuilder lname = new StringBuilder(LAST_NAME);
        while(lname.length() != COLUMN_SIZE) {
            lname.append(" ");
        }
        return lname;
    }

    public static String getTable(LinkedList<Names> people) {
        StringBuilder output = new StringBuilder("Last      First     Salary\n" + "--------------------------\n");
        for (Names individual : people) {
            output.append(individual);
        }

        return output.toString();
    }
}
