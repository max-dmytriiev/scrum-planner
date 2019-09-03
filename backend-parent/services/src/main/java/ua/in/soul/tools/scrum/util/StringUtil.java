package ua.in.soul.tools.scrum.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {
    public String wrapAround(String name, String wrapper) {
        return String.format("%s%s%s", wrapper, name, wrapper);
    }
}
