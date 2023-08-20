package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.net.URL;


public class Main {

    @FindBy(id="com.chad.financialrecord:id/fabMenu")
    MobileElement btnAdd;

    @FindBy(id="com.chad.financialrecord:id/btnExpense")
    MobileElement btnOutcome;

    @FindBy(id="com.chad.financialrecord:id/btnIncome")
    WebElement btnIncome;

    @FindBy(id="com.chad.financialrecord:id/tvDate")
    MobileElement date;

    @FindBy(id="android:id/button1")
    WebElement btnOK;

    @FindBy(id="com.chad.financialrecord:id/spCategory")
    WebElement btnCategory;

    @FindBy(xpath="/android.widget.LinearLayout[7]")
    WebElement categoryFood;

    @FindBy(xpath="/android.widget.LinearLayout[12]")
    WebElement categoryDeposit;

    @FindBy(id="com.chad.financialrecord:id/etAmount")
    WebElement amount;

    @FindBy(id="com.chad.financialrecord:id/etNote")
    WebElement note;

    @FindBy(id="com.chad.financialrecord:id/btSave")
    WebElement btnSave;

    @FindBy(id="com.chad.financialrecord:id/tvExpense")
    WebElement txtOutcome;
    @FindBy(id="com.chad.financialrecord:id/tvIncome")
    WebElement txtIncome;

    public void outcome(String amount, String note){
        btnAdd.click();
        btnOutcome.click();
        date.click();
        btnOK.click();
        btnCategory.click();
        categoryFood.click();
        this.amount.sendKeys(amount);
        this.note.sendKeys(note);
        btnSave.click();
    }

    public void income(String amount, String note){
        btnAdd.click();
        btnIncome.click();
        date.click();
        btnOK.click();
        btnCategory.click();
        categoryDeposit.click();
        this.amount.sendKeys(amount);
        this.note.sendKeys(note);
        btnSave.click();
    }

    public String outcomeTxt(){
        return txtOutcome.getText();
    }

    public String incomeTxt(){
        return txtIncome.getText();
    }
    public void test(String actual, String expected){
        if (actual.equalsIgnoreCase(expected)){
            System.out.println("Data Berhasil Ditambahkan");
        }
        else {
            System.out.println("Data Gagal Ditambahkan");
        }
    }

    public void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
