package com.example.harslundhorsemandshipback.mail.model;

public class AutoReply {

    public String autoReplySubjectField() {
        return "Auto-Svar: ";
    }

    public String buildAutoReply() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"da\">\n" +
                "<head>\n" +
                "    <style>\n" +
                "        body {\n" +
                "          font-family: Arial, Helvetica, sans-serif;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 20px auto;\n" +
                "            padding: 20px 30px;\n" +
                "            border: solid 2px #d3d3d3;\n" +
                "            border-radius: 10px;\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            color: #4c85bd;\n" +
                "            font-weight: 600;\n" +
                "        }\n" +
                "\n" +
                "        p {\n" +
                "            line-height: 1.6;\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Auto-svar: Tak for din e-mail</h1>\n" +
                "\n" +
                "        <p>Tak for din e-mail. Dette er en automatisk besked for at lade dig vide, at vi har modtaget din besked, og vi vender tilbage til dig så hurtigt som muligt.</p>\n" +
                "\n" +
                "        <p>Hvis du har nogen presserende spørgsmål, er du velkommen til at kontakte os på nummer +4560750216.</p>\n" +
                "\n" +
                "        <p>Bedste hilsner,<br>\n" +
                "        Pernille Harslund<br>\n" +
                "        Harslunds Horsemanship & Bodywork</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";
    }
}