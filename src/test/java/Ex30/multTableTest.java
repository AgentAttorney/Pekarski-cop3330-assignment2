package Ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class multTableTest {

    @Test
    void setValues() {
        multTable OneTwelve = new multTable();
        String un_concat_answer = OneTwelve.setValues();
        assertEquals("123456789101112\n" +
                "24681012141618202224\n" +
                "369121518212427303336\n" +
                "4812162024283236404448\n" +
                "51015202530354045505560\n" +
                "61218243036424854606672\n" +
                "71421283542495663707784\n" +
                "81624324048566472808896\n" +
                "918273645546372819099108\n" +
                "102030405060708090100110120\n" +
                "112233445566778899110121132\n" +
                "1224364860728496108120132144\n",un_concat_answer);
    }
}