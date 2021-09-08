package com.redhat.developers.microsweeper.service;

import com.redhat.developers.microsweeper.model.Score;

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
    public Uni<Void> addScore(Score score) {
        return Score.persist(score);
    }

    @ReactiveTransactional
    public Uni<Long> clearScores() {
        return Score.deleteAll();
    }

}
