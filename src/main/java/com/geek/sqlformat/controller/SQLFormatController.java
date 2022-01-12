package com.geek.sqlformat.controller;

import com.geek.sqlformat.utils.SqlFormatterUtils;
import com.geek.sqlformat.utils.StrFormatUtil;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class SQLFormatController {

    public TextArea sqlText;

    /**
     * 加逗号单引号
     *
     * @param actionEvent
     */
    public void addSingleQuoteComma(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addSingleQuoteComma(sqlText.getText()));
    }

    /**
     * 加双引号逗号
     *
     * @param actionEvent
     */
    public void addDoubleQuoteComma(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addDoubleQuoteComma(sqlText.getText()));
    }

    /**
     * 加逗号
     *
     * @param actionEvent
     */
    public void addComma(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addComma(sqlText.getText()));
    }

    /**
     * 加单引号
     *
     * @param actionEvent
     */
    public void addSingleQuote(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addSingleQuote(sqlText.getText()));
    }

    /**
     * 加双引号
     *
     * @param actionEvent
     */
    public void addDoubleQuote(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addDoubleQuote(sqlText.getText()));
    }

    /**
     * 加括号
     *
     * @param actionEvent
     */
    public void addBrackets(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.addBrackets(sqlText.getText()));
    }

    /**
     * 消除回车
     *
     * @param actionEvent
     */
    public void clearEnter(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.clearEnter(sqlText.getText()));
    }

    /**
     * 消除空格
     *
     * @param actionEvent
     */
    public void clearBlank(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.clearBlank(sqlText.getText()));
    }

    /**
     * 消除单引号
     *
     * @param actionEvent
     */
    public void clearSingleQuote(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.clearSingleQuote(sqlText.getText()));
    }

    /**
     * 消除双引号
     *
     * @param actionEvent
     */
    public void clearDoubleQuote(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.clearDoubleQuote(sqlText.getText()));
    }

    /**
     * 消除括号
     *
     * @param actionEvent
     */
    public void clearBrackets(ActionEvent actionEvent) {
        sqlText.setText(StrFormatUtil.clearBrackets(sqlText.getText()));
    }

    /**
     * 格式化SQL
     *
     * @param actionEvent
     */
    public void formatSQL(ActionEvent actionEvent) {
        sqlText.setText(SqlFormatterUtils.format(sqlText.getText()));
    }
}