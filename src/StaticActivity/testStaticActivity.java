package StaticActivity;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class testStaticActivity {
    @BeforeEach
    public void setUp(){
        staticActivity static1 = new staticActivity();
        staticActivity static2 = new staticActivity();

    }
    @Test
    public void testInstanceCount(){
        Assert.assertEquals(2, staticActivity.getInstanceCount());
    }



}
