package dev.insaneduck.sane_backup.modal;

import lombok.Data;

import java.io.IOException;
import java.util.List;

@Data
public class Pacman
{
    boolean install(Package aPackage) throws IOException
    {
        Runtime.getRuntime().exec("pacman -S "+aPackage.getName());
        return false;
    }

    boolean install(List<Package> packageList)
    {
        return false;
    }
}
