package dev.insaneduck.sane_backup.modal;

import lombok.Data;

import java.net.URL;
@Data
public class CustomScripts
{
    private String name;
    private URL sourceURL;
    private String fileType;
    private String desktopEntry;
    private String setupScript;
    private String installLocation;

    //todo method to serialise to json
    //todo form with entries to create a script
}
