package tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

    @Test
    public void _should_return_Hello_TDD_BootCamp() throws Exception {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertThat(actual, is("Hello TDD BootCamp!"));
    }

}
