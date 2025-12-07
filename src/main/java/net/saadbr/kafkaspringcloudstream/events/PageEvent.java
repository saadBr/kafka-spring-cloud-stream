package net.saadbr.kafkaspringcloudstream.events;

import java.util.Date;

/**
 * @author saade
 **/
public record PageEvent(String name, String user, Date date, long duration ) {
}
