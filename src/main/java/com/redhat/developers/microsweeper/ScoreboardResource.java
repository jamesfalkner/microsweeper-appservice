package com.redhat.developers.microsweeper;

import com.redhat.developers.microsweeper.model.Score;
import com.redhat.developers.microsweeper.service.ScoreboardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/scoreboard")
public class ScoreboardResource {

    @Inject
    ScoreboardService scoreboardService;

    final Logger logger = LoggerFactory.getLogger(getClass());

    @GET
    public Uni<List<Score>> getScoreboard() {
        return scoreboardService.getScoreboard();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Void> addScore(Score score) throws Exception {
        return scoreboardService.addScore(score);
    }

    @DELETE
    public Uni<Long> clearAll() {
        return scoreboardService.clearScores();
    }

}
