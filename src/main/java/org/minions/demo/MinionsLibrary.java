package org.minions.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MinionsLibrary {

    private Map<String,String> map = new HashMap<>();

    public MinionsLibrary(){
        map.put("one-eyed-minion","──────────▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄<br/>" +
                "────────█═════════════════█<br/>" +
                "──────█═════════════════════█<br/>" +
                "─────█════════▄▄▄▄▄▄▄════════█<br/>" +
                "────█════════█████████════════█<br/>" +
                "────█═══════██▀─────▀██═══════█<br/>" +
                "───███████████──█▀█──███████████<br/>" +
                "───███████████──▀▀▀──███████████<br/>" +
                "────█═══════▀█▄─────▄█▀═══════█<br/>" +
                "────█═════════▀█████▀═════════█<br/>" +
                "────█═════════════════════════█<br/>" +
                "────█══════▀▄▄▄▄▄▄▄▄▄▀════════█<br/>" +
                "───▐▓▓▌═════════════════════▐▓▓▌<br/>" +
                "───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌<br/>" +
                "───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█<br/>" +
                "──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█<br/>" +
                "─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄<br/>" +
                "─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████<br/>" +
                "─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████<br/>" +
                "──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀<br/>" +
                "─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌<br/>" +
                "──────────▐▓▓▓▓▌──▐▓▓▓▓▌<br/>" +
                "─────────▄████▀────▀████▄<br/>" +
                "─────────▀▀▀▀────────▀▀▀▀");
        map.put("two-eyed-minion","──────────▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄<br/>" +
                "────────█═════════════════█<br/>" +
                "──────█═════════════════════█<br/>" +
                "─────█═══▄▄▄▄▄▄▄═══▄▄▄▄▄▄▄═══█<br/>" +
                "────█═══█████████═█████████═══█<br/>" +
                "────█══██▀────▀█████▀────▀██══█<br/>" +
                "───██████──█▀█──███──█▀█──██████<br/>" +
                "───██████──▀▀▀──███──▀▀▀──██████<br/>" +
                "────█══▀█▄────▄██─██▄────▄█▀══█<br/>" +
                "────█════▀█████▀───▀█████▀════█<br/>" +
                "────█═════════════════════════█<br/>" +
                "────█══════▀▄▄▄▄▄▄▄▄▄▄▄═══════█<br/>" +
                "───▐▓▓▌═════════════════════▐▓▓▌<br/>" +
                "───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌<br/>" +
                "───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█<br/>" +
                "──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█<br/>" +
                "─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄<br/>" +
                "─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████<br/>" +
                "─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████<br/>" +
                "──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀<br/>" +
                "─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌<br/>" +
                "──────────▐▓▓▓▓▌──▐▓▓▓▓▌<br/>" +
                "─────────▄████▀────▀████▄<br/>" +
                "─────────▀▀▀▀────────▀▀▀▀");
        map.put("sad-minion","──────────▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄<br/>" +
                "────────█═════════════════█<br/>" +
                "──────█═════════════════════█<br/>" +
                "─────█═══▄▄▄▄▄▄▄═══▄▄▄▄▄▄▄═══█<br/>" +
                "────█═══█████████═█████████═══█<br/>" +
                "────█══██▀────▀█████▀────▀██══█<br/>" +
                "───██████──█▀█──███──█▀█──██████<br/>" +
                "───██████──▀▀▀──███──▀▀▀──██████<br/>" +
                "────█══▀█▄────▄██─██▄────▄█▀══█<br/>" +
                "────█════▀█████▀───▀█████▀════█<br/>" +
                "────█═════════════════════════█<br/>" +
                "────█═════════▄▀▀▀▄═══════════█<br/>" +
                "───▐▓▓▌══════▀═════▀════════▐▓▓▌<br/>" +
                "───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌<br/>" +
                "───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█<br/>" +
                "──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█<br/>" +
                "─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄<br/>" +
                "─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████<br/>" +
                "─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████<br/>" +
                "──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀<br/>" +
                "─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌<br/>" +
                "──────────▐▓▓▓▓▌──▐▓▓▓▓▌<br/>" +
                "─────────▄████▀────▀████▄<br/>" +
                "─────────▀▀▀▀────────▀▀▀▀");
        map.put("happy-minion","────────────▀▄───█───▄▀<br/>" +
                "───────────▄▄▄█▄▄█▄▄█▄▄▄<br/>" +
                "────────▄▀▀═════════════▀▀▄<br/>" +
                "───────█═══════════════════█<br/>" +
                "──────█═════════════════════█<br/>" +
                "─────█═══▄▄▄▄▄▄▄═══▄▄▄▄▄▄▄═══█<br/>" +
                "────█═══█████████═█████████═══█<br/>" +
                "────█══██▀────▀█████▀────▀██══█<br/>" +
                "───██████─█▀█───███─█▀█───██████<br/>" +
                "───██████─▀▀▀───███─▀▀▀───██████<br/>" +
                "────█══▀█▄────▄██─██▄────▄█▀══█<br/>" +
                "────█════▀█████▀───▀█████▀════█<br/>" +
                "────█═════════════════════════█<br/>" +
                "────█═════════════════════════█<br/>" +
                "────█═══════█▀█▀█▀█▀█▀█═══════█<br/>" +
                "────█═══════▀▄───────▄▀═══════█<br/>" +
                "───▐▓▓▌═══════▀▄█▄█▄▀═══════▐▓▓▌<br/>" +
                "───▐▐▓▓▌▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▐▓▓▌▌<br/>" +
                "───█══▐▓▄▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▄▓▌══█<br/>" +
                "──█══▌═▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌═▐══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▄▄▄▄▄▄▄▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▐██▀██▌▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█═▐▓▓▓▓▓▓▓▀▀▀▀▀▓▓▓▓▓▓▓▌═█══█<br/>" +
                "──█══█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█══█<br/>" +
                "─▄█══█▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌█══█▄<br/>" +
                "─█████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─█████<br/>" +
                "─██████▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌─██████<br/>" +
                "──▀█▀█──▐▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▌───█▀█▀<br/>" +
                "─────────▐▓▓▓▓▓▓▌▐▓▓▓▓▓▓▌<br/>" +
                "──────────▐▓▓▓▓▌──▐▓▓▓▓▌<br/>" +
                "─────────▄████▀────▀████▄<br/>" +
                "─────────▀▀▀▀────────▀▀▀▀");
    }

    public String getMinion(String name){
        return map.get(name);
    }
}
