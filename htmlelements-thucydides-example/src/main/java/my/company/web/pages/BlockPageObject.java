package my.company.web.pages;

import com.google.common.base.Predicate;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:14 PM
 */
public class BlockPageObject extends PageObject {

    public BlockPageObject(final WebDriver driver) {
        super(driver, new Predicate<PageObject>() {
            @Override
            public boolean apply(PageObject pageObject) {
                PageFactory.initElements(new HtmlElementDecorator(driver), pageObject);
                return true;
            }
        });
    }
}
