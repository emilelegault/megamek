package megamek.server.victory;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(value = JUnit4.class)
public class TestBVDestroyedVictory {

    @Test
    public void WhenBvNotDestroyedDestroyedthenVitoryIsGenerated()
    {
        int destroyedPercent= 0 ;
        var BVRatioVictory = new BVDestroyedVictory(destroyedPercent);

        var game = GameMockUtils.createMockedGameWithCommanderVictory();

        //act
        var victoryResult = BVRatioVictory.victory(game,null);
        //assert
        assertFalse(victoryResult.victory);
    }
}
