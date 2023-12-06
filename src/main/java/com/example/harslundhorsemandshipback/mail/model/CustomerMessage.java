package com.example.harslundhorsemandshipback.mail.model;

public class CustomerMessage {
    private String reply;
    private String subject;
    private String message;
    private String number;

    public String buildCustomerMessage() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"da\">\n" +
                "<head>\n" +
                "    <style>\n" +
                "        body {\n" +
                "          font-family: Arial, Helvetica, sans-serif;\n" +
                "          margin: 0;\n" +
                "          padding: 0;\n" +
                "        }\n" +
                "\n" +
                "        .container {\n" +
                "          max-width: 600px;\n" +
                "          margin: 0 auto;\n" +
                "          padding: 20px;\n" +
                "        }\n" +
                "        \n" +
                "        .container .item {\n" +
                "          margin-bottom: 20px;\n" +
                "        }\n" +
                "\n" +
                "        h4 {\n" +
                "          color: #4c85bd;\n" +
                "          font-weight: 600;\n" +
                "          display: inline;\n" +
                "        }\n" +
                "\n" +
                "        p {\n" +
                "          line-height: 2;\n" +
                "          display: inline;\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"item\">\n" +
                "          <h4>Emne: </h4> <span>" + this.subject + "</span>\n" +
                "        </div>\n" +
                "        \n" +
                "        <div class=\"item\">\n" +
                "          <h4>Email: </h4> <span>" + this.reply + "</span>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"item\">\n" +
                "          <h4>Telefon: </h4> <span>" + this.number + "</span>\n" +
                "        </div>\n" +
                "        \n" +
                "        <div class=\"item\">\n" +
                "          <h4>Besked: </h4> <p>" + this.message + "</p>\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n";
    }


    public void setReply(String reply) {
        this.reply = reply;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public void setNumber(String number) {
        this.number = number;
    }
}
