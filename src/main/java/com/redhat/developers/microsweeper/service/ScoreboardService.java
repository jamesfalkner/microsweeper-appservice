package com.redhat.developers.microsweeper.service;

import com.redhat.developers.microsweeper.model.Score;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ScoreboardService  {

    public Uni<List<Score>> getScoreboard() {
        return Score.listAll();
    }

    @ReactiveTransactional
    @Timed(description = "How log to add a score", value = "scoreboard-timer")
    public Uni<Void> addScore(Score score) {
        Timer timer = Metrics.globalRegistry.timer("example.prime.number.test");
        return timer.record(() -> {
            return Score.persist(score);
        });
    }

    @ReactiveTransactional
    public Uni<Long> clearScores() {
        return Score.deleteAll();
    }

}
