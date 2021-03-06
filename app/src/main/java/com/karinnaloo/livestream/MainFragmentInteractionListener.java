package com.karinnaloo.livestream;

/**
 * All activities used with MainActivity implement this interface
 * for communication.
 */
public interface MainFragmentInteractionListener {
    public void onFragmentEvent(MainFragment.EVENT event);
}
