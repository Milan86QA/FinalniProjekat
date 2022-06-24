package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage extends BasePage {

    WebDriver driver;
    WebDriverWait wdwait;

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement button;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadDownload;
    WebElement dynamicProperties;

    public WebElement getTextBox() {
        return textBox;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public WebElement getWebTables() {
        return webTables;
    }

    public WebElement getButton() {
        return button;
    }

    public WebElement getLinks() {
        return links;
    }

    public WebElement getBrokenLinksImages() {
        return brokenLinksImages;
    }

    public WebElement getUploadDownload() {
        return uploadDownload;
    }

    public WebElement getDynamicProperties() {
        return dynamicProperties;
    }

    WebElement practiceForm;

    public WebElement getPracticeForm() {
        return practiceForm;
    }

    WebElement browserWindows;
    WebElement alerts;
    WebElement frames;
    WebElement nestedFrames;
    WebElement modalDialogs;

    public WebElement getBrowserWindows() {
        return browserWindows;
    }

    public WebElement getAlerts() {
        return alerts;
    }

    public WebElement getFrames() {
        return frames;
    }

    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    public WebElement getModalDialogs() {
        return modalDialogs;
    }

    WebElement accordian;
    WebElement autoComplete;
    WebElement datePicker;
    WebElement slider;
    WebElement progressBar;
    WebElement tabs;
    WebElement toolTips;
    WebElement menu;
    WebElement selectMenu;

    public WebElement getAccordian() {
        return accordian;
    }

    public WebElement getAutoComplete() {
        return autoComplete;
    }

    public WebElement getDatePicker() {
        return datePicker;
    }

    public WebElement getSlider() {
        return slider;
    }

    public WebElement getProgressBar() {
        return progressBar;
    }

    public WebElement getTabs() {
        return tabs;
    }

    public WebElement getToolTips() {
        return toolTips;
    }

    public WebElement getMenu() {
        return menu;
    }

    public WebElement getSelectMenu() {
        return selectMenu;
    }

    WebElement sortable;
    WebElement selectable;
    WebElement resizable;
    WebElement droppable;
    WebElement dragable;

    public WebElement getSortable() {
        return sortable;
    }

    public WebElement getSelectable() {
        return selectable;
    }

    public WebElement getResizable() {
        return resizable;
    }

    public WebElement getDroppable() {
        return droppable;
    }

    public WebElement getDragable() {
        return dragable;
    }

    WebElement login;
    WebElement bookstore;
    WebElement profile;
    WebElement bookstoreAPI;

    public WebElement getLogin() {
        return login;
    }

    public WebElement getBookstore() {
        return bookstore;
    }

    public WebElement getProfile() {
        return profile;
    }

    public WebElement getBookstoreAPI() {
        return bookstoreAPI;
    }
}
