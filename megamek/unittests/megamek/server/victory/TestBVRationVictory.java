package megamek.server.victory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(value = JUnit4.class)
public class TestBVRationVictory {

    @Test
    public void WhenBVRationVictory() {
        //arrange
        int ratio = 1;
        var BVRatioVictory = new BVRatioVictory(ratio);

        var game = GameMockUtils.createMockedGameWithCommanderVictory();

        //act
        var victoryResult = BVRatioVictory.victory(game,null);
        //assert
        assertTrue(victoryResult.victory);
    }
}
