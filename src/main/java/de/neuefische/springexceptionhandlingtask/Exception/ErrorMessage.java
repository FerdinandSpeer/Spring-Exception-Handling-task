package de.neuefische.springexceptionhandlingtask.Exception;

import java.time.Instant;

public record ErrorMessage(String message,
                           Instant timestamp) {
}
