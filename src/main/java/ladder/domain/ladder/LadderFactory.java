package ladder.domain.ladder;

import ladder.domain.Ladder;

public abstract class LadderFactory {
    public abstract Ladder createLadder(int height, int intervalCount);
}
