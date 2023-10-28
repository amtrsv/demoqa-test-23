package tests;

import java.beans.PropertyEditor;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpath(){
        // <input type = "email" class =" inputtext login_form_input_box" name="email" id ="email" data-testid="email">
      ///****css
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");

        ////***xpath
        $x("//*[@data-testid='email]").setValue("1");

        // <input type = "email" class =" inputtext login_form_input_box" name="email" id ="email">
        ///****css
        $("[id=email]").setValue("1");
        $(by("id", "email")).setValue("1");
        $(byId("email")).setValue("1");
        $("email").setValue("1");

        ////***xpath
        $x("//*[@id='email]").setValue("1");

        // <input type = "email" class =" inputtext login_form_input_box" name="email">
        ///****css
        $("[name=email]").setValue("1");
        $(by("name", "email")).setValue("1");
        $(byName("email")).setValue("1");
        $("email").setValue("1");

        ////***xpath
        $x("//*[@anem='email]").setValue("1");

        // <input type = "email" class =" inputtext login_form_input_box">
        ////***css
        $("[class=inputtext][class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");

        /////***xpath
        $("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");


        //<div>Hello, qa.guru!</div>

        $(byText("Hello, qa.guru!"));
        $(withText("Hello, qa.guru!"));


    }
}
