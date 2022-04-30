package dev.pgm.events.team;

import java.util.ArrayList;
import java.util.List;

public class TeamRegistry {
  private List<TournamentTeam> teams;

  public TeamRegistry() {
    this.teams = new ArrayList<>();
  }

  public List<TournamentTeam> getTeams() {
    return teams;
  }

  public void setTeams(List<TournamentTeam> teams) {
    this.teams = teams;
  }

  public void addTeam(TournamentTeam team) {
    this.teams.add(team);
  }

  public TournamentTeam getTeam(String name) {
    for (TournamentTeam team : teams) if (team.getName().equalsIgnoreCase(name)) return team;

    return null;
  }
}
