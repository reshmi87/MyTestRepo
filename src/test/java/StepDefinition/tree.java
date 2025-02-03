package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Commons.ConfigReader;
import Commons.ExcelReader;
import Commons.LoggerLoad;
import PageFactory.Tree_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tree {

	private Tree_pf tpf;
	String pagetitle;
	boolean practicequestioncontent;
	
@Given("Tree - User is in the Home page after logging in using credentials from Excel {int}")
public void tree_user_is_in_the_home_page_after_logging_in_using_credentials_from_excel(Integer Rownum) throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ExcelReader read = new ExcelReader();
	String username = read.getusername(Rownum);
	String password = read.getpassword(Rownum);	
	tpf.homepage(username, password);
	pagetitle = tpf.checkpageTitle();
	assertEquals(pagetitle, "NumpyNinja", "Not on the Home page");
    LoggerLoad.info("Current page: "+pagetitle);
}

@Given("User is in the Tree page after logging in using credentials from Excel {int}")
public void user_is_in_the_tree_page_after_logging_in_using_credentials_from_excel(Integer Rownum) throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ExcelReader read = new ExcelReader();
	String username = read.getusername(Rownum);
	String password = read.getpassword(Rownum);	
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	assertEquals(pagetitle, "Tree", "Not on the Tree page");
    LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on Get Started button under the section Tree")
public void user_clicks_on_get_started_button_under_the_section_tree() {
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();  
}

@Then("User lands on the Tree page")
public void user_lands_on_the_tree_page() {
    assertEquals(pagetitle, "Tree", "Not on the Tree page");
    LoggerLoad.info("Current page: "+pagetitle);
    LoggerLoad.info("Hooks called to close the browser.....");
}

@Given("User is in the Tree page")
public void user_is_in_the_tree_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	assertEquals(pagetitle, "Tree", "Not on the Tree page");
    LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Overview of Trees")
public void user_clicks_on_the_hyperlink_overview_of_trees() {
	pagetitle = tpf.overviewoftrees(); 
}

@Then("User lands on the Overview of Trees page")
public void user_lands_on_the_overview_of_trees_page() {
	assertEquals(pagetitle, "Overview of Trees", "Not on the Overview of Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("User is in the Overview of Trees page")
public void user_is_in_the_overview_of_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle = tpf.overviewoftrees();
	assertEquals(pagetitle, "Overview of Trees", "Not on the Overview of Trees page");
	LoggerLoad.info("Current page: "+pagetitle);  
}


@When("Tree - User clicks on the Practice Questions from the side navigation bar")
public void tree_user_clicks_on_the_practice_questions_from_the_side_navigation_bar() {
    tpf.PracticeQuestion();  
}

@Then("Tree - User lands on the Practice Questions page and is able to view the content successfully")
public void tree_user_lands_on_the_practice_questions_page_and_is_able_to_view_the_content_successfully() {
	practicequestioncontent = tpf.PracticeQuestioncontentcheck();
    assertEquals(practicequestioncontent, true);
    }

@When("Tree - User clicks on the Try here>>> button")
public void tree_user_clicks_on_the_try_here_button() {
	pagetitle = tpf.tryhere();
    }

@Then("Tree - User lands on the Try Editor page.")
public void tree_user_lands_on_the_try_editor_page() {
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
    }

@Given("Tree - User is in Try Editor page	from Overview of Trees page")
public void tree_user_is_in_try_editor_page_from_overview_of_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle = tpf.overviewoftrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("Tree - User clicks on Run Button without entering the code")
public void tree_user_clicks_on_run_button_without_entering_the_code() {
   tpf.clickrun();
}

@Then("Tree - An Alert window with the error message is displayed.")
public void tree_an_alert_window_with_the_error_message_is_displayed() {
	String alertmessage = tpf.handlealert();
	LoggerLoad.info(alertmessage);
}

@When("Tree - User clicks on Run Button after entering a invalid python code.")
public void tree_user_clicks_on_run_button_after_entering_a_invalid_python_code() {
	tpf.entercode("abcd");
	tpf.clickrun();
}

@When("Tree - User clicks on Run Button after entering a valid python code.")
public void tree_user_clicks_on_run_button_after_entering_a_valid_python_code() throws InterruptedException {
	tpf.entercode("print(\"hello\")");
	tpf.clickrun();
}

@Then("Tree - Correct output is displayed in the console.")
public void tree_correct_output_is_displayed_in_the_console() {
	String output=tpf.getoutput();
	LoggerLoad.info(output);
	LoggerLoad.info("Hooks called to close the browser.....");
	}

@Given("User is in Tree page")
public void user_is_in_tree_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	assertEquals(pagetitle, "Tree", "Not on the Tree page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("Tree - User clicks on the hyperlink Terminologies.")
public void tree_user_clicks_on_the_hyperlink_terminologies() {
	pagetitle = tpf.terminologies();
}

@Then("Tree - User lands on the Terminologies page")
public void tree_user_lands_on_the_terminologies_page() {
	assertEquals(pagetitle, "Terminologies", "Not on the Terminologies page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page from Terminologies page")
public void tree_user_is_in_try_editor_page_from_terminologies_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.terminologies();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Types of Trees.")
public void user_clicks_on_the_hyperlink_types_of_trees() {
	pagetitle = tpf.typesoftrees();
}

@Then("User lands on the Types of Trees page")
public void user_lands_on_the_types_of_trees_page() {
	assertEquals(pagetitle, "Types of Trees", "Not on the Types of Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page from Types of Trees page")
public void tree_user_is_in_try_editor_page_from_types_of_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.typesoftrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}


@When("User clicks on the hyperlink Tree Traversals.")
public void user_clicks_on_the_hyperlink_tree_traversals() {
	pagetitle = tpf.treetraversals();
}

@Then("User lands on the Tree Traversals page")
public void user_lands_on_the_tree_traversals_page() {
	assertEquals(pagetitle, "Tree Traversals", "Not on the Tree Traversals page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Tree Traversals page")
public void tree_user_is_in_try_editor_page_from_tree_traversals_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.treetraversals();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("Tree - User clicks on the hyperlink Traversals-Illustration.")
public void tree_user_clicks_on_the_hyperlink_traversals_illustration() {
	pagetitle = tpf.traversalsillustration();
}

@Then("Tree - User lands on the Traversals-Illustration page")
public void tree_user_lands_on_the_traversals_illustration_page() {
	assertEquals(pagetitle, "Traversals-Illustration", "Not on the Traversals-Illustration page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Traversals-Illustration page")
public void tree_user_is_in_try_editor_page_from_traversals_illustration_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.traversalsillustration();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Binary Trees.")
public void user_clicks_on_the_hyperlink_binary_trees() {
	pagetitle=tpf.binarytrees();
}

@Then("User lands on the Binary Trees page")
public void user_lands_on_the_binary_trees_page() {
	assertEquals(pagetitle, "Binary Trees", "Not on the Binary Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Binary Trees page")
public void tree_user_is_in_try_editor_page_from_binary_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.binarytrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Types of Binary Trees.")
public void user_clicks_on_the_hyperlink_types_of_binary_trees() {
	pagetitle = tpf.typesofbinarytrees();
}

@Then("User lands on the Types of Binary Trees page")
public void user_lands_on_the_types_of_binary_trees_page() {
	assertEquals(pagetitle, "Types of Binary Trees", "Not on the Binary Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Types of Binary Trees page")
public void tree_user_is_in_try_editor_page_from_types_of_binary_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.binarytrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("Tree - User clicks on the hyperlink Implementation in Python.")
public void tree_user_clicks_on_the_hyperlink_implementation_in_python() {
	pagetitle = tpf.implementationinpython();
}

@Then("Tree - User lands on the Implementation in Python page")
public void tree_user_lands_on_the_implementation_in_python_page() {
	assertEquals(pagetitle, "Implementation in Python", "Not on the Implementation in Python page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Implementation in Python page")
public void tree_user_is_in_try_editor_page_from_implementation_in_python_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.implementationinpython();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink  Binary Tree Traversals.")
public void user_clicks_on_the_hyperlink_binary_tree_traversals() {
	pagetitle = tpf.binarytreetraversals();
}

@Then("User lands on the Binary Tree Traversals page")
public void user_lands_on_the_binary_tree_traversals_page() {
	assertEquals(pagetitle, "Binary Tree Traversals", "Not on the Binary Tree Traversals page");
	LoggerLoad.info("Current page: "+pagetitle);	
}

@Given("Tree - User is in Try Editor page	from Binary Tree Traversals page")
public void tree_user_is_in_try_editor_page_from_binary_tree_traversals_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.binarytreetraversals();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Implementation of Binary Trees.")
public void user_clicks_on_the_hyperlink_implementation_of_binary_trees() {
	pagetitle = tpf.implementationofbinarytrees();
}

@Then("User lands on the Implementation of Binary Trees page")
public void user_lands_on_the_implementation_of_binary_trees_page() {
	assertEquals(pagetitle, "Implementation of Binary Trees", "Not on the Implementation of Binary Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Implementation of Binary Trees page")
public void tree_user_is_in_try_editor_page_from_implementation_of_binary_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.implementationofbinarytrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Applications of Binary trees.")
public void user_clicks_on_the_hyperlink_applications_of_binary_trees() {
	pagetitle = tpf.applicationofbinarytrees();
}

@Then("User lands on the Applications of Binary trees page")
public void user_lands_on_the_applications_of_binary_trees_page() {
	assertEquals(pagetitle, "Applications of Binary trees", "Not on the Applications of Binary trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Applications of Binary trees page")
public void tree_user_is_in_try_editor_page_from_applications_of_binary_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.applicationofbinarytrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("User clicks on the hyperlink Binary Search Trees.")
public void user_clicks_on_the_hyperlink_binary_search_trees() {
	pagetitle = tpf.binarysearchtrees();
}

@Then("User lands on the Binary Search Trees page")
public void user_lands_on_the_binary_search_trees_page() {
	assertEquals(pagetitle, "Binary Search Trees", "Not on the Binary Search Trees page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	Binary Search Trees page")
public void tree_user_is_in_try_editor_page_binary_search_trees_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.binarysearchtrees();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@When("Tree - User clicks on the hyperlink Implementation Of BST.")
public void tree_user_clicks_on_the_hyperlink_implementation_of_bst() {
	pagetitle = tpf.implementationofbst();
}

@Then("Tree - User lands on the Implementation Of BST page")
public void tree_user_lands_on_the_implementation_of_bst_page() {
	assertEquals(pagetitle, "Implementation Of BST", "Not on the Implementation Of BST page");
	LoggerLoad.info("Current page: "+pagetitle);
}

@Given("Tree - User is in Try Editor page	from Implementation Of BST page")
public void tree_user_is_in_try_editor_page_from_implementation_of_bst_page() throws IOException {
	LoggerLoad.info("Launched browser from hooks !!");
	LoggerLoad.info("Signing in..");
	tpf=new Tree_pf();
	ConfigReader config = new ConfigReader();
	String username = config.getusername();
	String password = config.getpassword();
	tpf.homepage(username, password);
	LoggerLoad.info("Moving to Tree page..");
	pagetitle = tpf.Treepage();
	pagetitle=tpf.implementationofbst();
	pagetitle=tpf.tryhere();
	assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
	LoggerLoad.info("Current page: "+pagetitle);
}
}
