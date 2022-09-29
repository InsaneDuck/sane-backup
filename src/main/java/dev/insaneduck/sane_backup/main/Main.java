package dev.insaneduck.sane_backup.main;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import dev.insaneduck.sane_backup.view.MainGUI;

public class Main
{
    public static void main(String[] args)
    {
        FlatOneDarkIJTheme.setup();
        MainGUI mainGUI = new MainGUI();
    }
}
