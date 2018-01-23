package fr.esiea.inf3036;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MaximumPathTest {

    @Test
    public void pathSimple() throws Exception {
        MaximumPath maximumPath = new MaximumPath("3 7 4 2 4 6 8 5 9 3");

        assertThat(maximumPath.getPath()).isEqualTo("3 7 4 9");
    }
}
