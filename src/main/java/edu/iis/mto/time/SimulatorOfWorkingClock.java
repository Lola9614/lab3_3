package edu.iis.mto.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class SimulatorOfWorkingClock extends Clock {

    private final Instant WHEN_STARTED = Instant.now();
    private final ZoneId DEFAULT_TZONE = ZoneId.systemDefault();
    private long count = 0;


    @Override
    public ZoneId getZone() {
        return DEFAULT_TZONE;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return Clock.fixed(WHEN_STARTED, zone);
    }

    @Override
    public Instant instant() {
        return nextInstant();
    }

    private Instant nextInstant() {
        return WHEN_STARTED.plusSeconds(count);
    }

    public void setCount(long count) {
        this.count = count;
    }
}