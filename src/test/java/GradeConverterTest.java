import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter; // Khai báo biến converter

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter(); // Khởi tạo trước mỗi test
    }

    @Test
    public void convert() {
        String expected = "A";
        String actual = converter.convert(100); // Gọi đúng cú pháp
        assertEquals(expected, actual); // So sánh kết quả mong đợi và thực tế
    }
}
