package ua.dborisenko.astergazer.domain.block;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DbDelBlockTest {

    private BlockTestUtil blockTestUtil = new BlockTestUtil();
    
    @Test
    public void translateTest() {
        String caption = "caption";
        String[] parameters = { "family", "key" };
        String expectedResult = Block.COMMAND_PREFIX + caption + "),DBdel(family/key)\n";
        DbDelBlock block = new DbDelBlock();
        blockTestUtil.setBlockParameters(block, caption, parameters);

        assertThat(block.translate(), is(expectedResult));
    }
}
