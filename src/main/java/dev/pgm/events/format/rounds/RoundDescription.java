package dev.pgm.events.format.rounds;

import net.md_5.bungee.api.chat.BaseComponent;

public interface RoundDescription {

  /**
   * The main round info, also contains hover information for scores in match, time and stuff like
   * that
   */
  BaseComponent roundInfo();

  /** Small bit of info of current state of the round */
  String roundStatus();
}
