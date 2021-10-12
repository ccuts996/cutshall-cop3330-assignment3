package ex42;

import junit.framework.TestCase;
import java.util.LinkedList;

public class App42Test extends TestCase{

    public void testCreateNames() {
            LinkedList<String> nameData = new LinkedList<>();
            nameData.add("abc,def,123");
            nameData.add("UHG,THJ,435345");

            LinkedList<Names> expected = new LinkedList<>();
            expected.add(new Names("abc", "def", 123));
            expected.add(new Names("UGH", "THJ", 435345));

            LinkedList<Names> actual = App42.createNames(nameData);

            boolean flag = true;
            for (int i = 0; i < expected.size(); i++) {
                if(!expected.get(i).getFirstName().contentEquals(actual.get(i).getFirstName()))
                    flag = false;
                if(!expected.get(i).getLastName().contentEquals(actual.get(i).getLastName()))
                    flag = false;
                if(expected.get(i).getSalary() != actual.get(i).getSalary())
                    flag = false;
            }

        assertTrue(flag);

        }
}

