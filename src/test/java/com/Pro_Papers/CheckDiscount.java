package com.Pro_Papers;

import com.PageClient.Lending;
import com.vipwriters.WebDriverSettings;

public class CheckDiscount extends WebDriverSettings {

    public void disciount () throws Exception {

        driver.get(ProPapers_ProdUrl);
        Lending.Order_Now(driver).click();

    }





}
