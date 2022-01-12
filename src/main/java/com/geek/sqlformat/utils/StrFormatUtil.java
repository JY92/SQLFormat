package com.geek.sqlformat.utils;

public class StrFormatUtil {

    /**
     * 加单引号逗号
     *
     * @param text
     * @return
     */
    public static String addSingleQuoteComma(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = text.split("\n");
            for (int i = 0; i < split.length - 1; i++) {
                if (split[i] != "") {
                    stringBuffer.append("'").append(split[i]).append("',\n");
                }
            }
            if (split[split.length - 1] != "") {
                stringBuffer.append("'").append(split[split.length - 1]).append("'");
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 加双引号逗号
     *
     * @param text
     * @return
     */
    public static String addDoubleQuoteComma(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = text.split("\n");
            for (int i = 0; i < split.length - 1; i++) {
                if (split[i] != "") {
                    stringBuffer.append("\"").append(split[i]).append("\",\n");
                }
            }
            if (split[split.length - 1] != "") {
                stringBuffer.append("\"").append(split[split.length - 1]).append("\"");
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 加逗号
     *
     * @param text
     * @return
     */
    public static String addComma(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = text.split("\n");
            for (int i = 0; i < split.length - 1; i++) {
                if (split[i] != "") {
                    stringBuffer.append(split[i]).append(",\n");
                }
            }
            if (split[split.length - 1] != "") {
                stringBuffer.append(split[split.length - 1]);
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 加单引号
     *
     * @param text
     * @return
     */
    public static String addSingleQuote(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = text.split("\n");
            for (int i = 0; i < split.length - 1; i++) {
                stringBuffer.append("'").append(split[i]).append("'\n");
            }
            if (split[split.length - 1] != "") {
                stringBuffer.append("'").append(split[split.length - 1]).append("'");
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 加双引号
     *
     * @param text
     * @return
     */
    public static String addDoubleQuote(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String[] split = text.split("\n");
            for (int i = 0; i < split.length - 1; i++) {
                stringBuffer.append("\"").append(split[i]).append("\"\n");
            }
            if (split[split.length - 1] != "") {
                stringBuffer.append("\"").append(split[split.length - 1]).append("\"");
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 加括号
     *
     * @param text
     * @return
     */
    public static String addBrackets(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("(").append(text).append(")");
            return stringBuffer.toString();
        }
    }

    /**
     * 消除空格
     *
     * @param text
     * @return
     */
    public static String clearBlank(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            return text.replace(" ", "");
        }
    }

    /**
     * 消除单引号
     *
     * @param text
     * @return
     */
    public static String clearSingleQuote(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            return text.replace("'", "");
        }
    }

    /**
     * 消除双引号
     *
     * @param text
     * @return
     */
    public static String clearDoubleQuote(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            return text.replace("\"", "");
        }
    }

    /**
     * 消除括号
     *
     * @param text
     * @return
     */
    public static String clearBrackets(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            return text.replace("(", "").replace(")", "");
        }
    }

    /**
     * 消除回车
     *
     * @param text
     * @return
     */
    public static String clearEnter(String text) {
        if (text == null || text.equals("")) {
            return "";
        } else {
            return text.replace("\n", "");
        }
    }
}
