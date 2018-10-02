package steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class StepImplementation {

    private WebDriver driver = new HtmlUnitDriver();

    @Step("各URLはティーポットのメッセージを返す <table>")
    public void stepWithTable(Table table) {
        for (TableRow row : table.getTableRows()) {
            String site = row.getCell("Site");
            String url = row.getCell("URL");
            String message = row.getCell("Message");
            driver.get(url);
            Assertions.assertThat(driver.getPageSource()).contains(message).as(site);
        }
    }
}
