package dev.pgm.events.format.events;

import dev.pgm.events.format.TournamentFormat;
import dev.pgm.events.team.TournamentTeam;
import java.util.Optional;
import org.bukkit.event.HandlerList;
import tc.oc.pgm.api.match.Match;

public class TournamentRoundFinishedEvent extends TournamentEvent {

  private static final HandlerList handlers = new HandlerList();
  private final Match match;
  private final Optional<TournamentTeam> winningTeam;
  private final Optional<TournamentTeam> losingTeam;

  public TournamentRoundFinishedEvent(
      Match match,
      TournamentFormat tournamentFormat,
      Optional<TournamentTeam> winningTeam,
      Optional<TournamentTeam> losingTeam) {
    super(tournamentFormat);
    this.match = match;
    this.winningTeam = winningTeam;
    this.losingTeam = losingTeam;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public Match getMatch() {
    return match;
  }

  public Optional<TournamentTeam> winningTeam() {
    return winningTeam;
  }

  public Optional<TournamentTeam> getLosingTeam() {
    return losingTeam;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}
