@Tree
Feature: Testing the Tree Module in dsAlgo Portal

@positiveflow
Scenario Outline: Verify that the user is able to land in Tree page
Given Tree - User is in the Home page after logging in using credentials from Excel <Rownumber>
When User clicks on Get Started button under the section Tree
Then User lands on the Tree page
Examples:
|Rownumber|
|1|
|2|
|3|

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Overview of Trees page
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>
When User clicks on the hyperlink Overview of Trees
Then User lands on the Overview of Trees page
Examples:
|Rownumber|
|1|

@positiveflow
Scenario: Tree - Verify that the user is able to navigate to the Practice Questions page and view the content.	
Given User is in the Overview of Trees page	
When Tree - User clicks on the Practice Questions from the side navigation bar	
Then Tree - User lands on the Practice Questions page and is able to view the content successfully

@positiveflow
Scenario: Tree - Verify that the Try here>>> button is functional
Given User is in the Overview of Trees page
When Tree - User clicks on the Try here>>> button
Then Tree - User lands on the Try Editor page.

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Overview of Trees page	
Given Tree - User is in Try Editor page	from Overview of Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Overview of Trees page	
Given Tree - User is in Try Editor page	from Overview of Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Overview of Trees page	
Given Tree - User is in Try Editor page	from Overview of Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Tree - Verify that the user is able to navigate to the Terminologies page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When Tree - User clicks on the hyperlink Terminologies.	
Then Tree - User lands on the Terminologies page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Tree - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Terminologies page	
Given Tree - User is in Try Editor page from Terminologies page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Tree - Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Terminologies page	
Given Tree - User is in Try Editor page from Terminologies page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Tree - Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Terminologies page	
Given Tree - User is in Try Editor page from Terminologies page	
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Types of Trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Types of Trees.	
Then User lands on the Types of Trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Types of Trees page	
Given Tree - User is in Try Editor page from Types of Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Types of Trees page	
Given Tree - User is in Try Editor page from Types of Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Types of Trees page	
Given Tree - User is in Try Editor page from Types of Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Tree Traversals page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Tree Traversals.	
Then User lands on the Tree Traversals page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Tree Traversals page	
Given Tree - User is in Try Editor page	from Tree Traversals page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Tree Traversals page	
Given Tree - User is in Try Editor page	from Tree Traversals page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Tree Traversals page	
Given Tree - User is in Try Editor page	from Tree Traversals page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Tree - Verify that the user is able to navigate to the Traversals-Illustration page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When Tree - User clicks on the hyperlink Traversals-Illustration.	
Then Tree - User lands on the Traversals-Illustration page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Tree - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Traversals-Illustration page
Given Tree - User is in Try Editor page	from Traversals-Illustration page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Tree - Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Traversals-Illustration page	
Given Tree - User is in Try Editor page	from Traversals-Illustration page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Tree - Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Traversals-Illustration page	
Given Tree - User is in Try Editor page	from Traversals-Illustration page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Binary Trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Binary Trees.	
Then User lands on the Binary Trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Binary Trees page	
Given Tree - User is in Try Editor page	from Binary Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Binary Trees page	
Given Tree - User is in Try Editor page	from Binary Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Binary Trees page	
Given Tree - User is in Try Editor page	from Binary Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Types of Binary Trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Types of Binary Trees.	
Then User lands on the Types of Binary Trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Types of Binary Trees page	
Given Tree - User is in Try Editor page	from Types of Binary Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Types of Binary Trees page	
Given Tree - User is in Try Editor page	from Types of Binary Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Types of Binary Trees page	
Given Tree - User is in Try Editor page	from Types of Binary Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Tree - Verify that the user is able to navigate to the Implementation in Python page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When Tree - User clicks on the hyperlink Implementation in Python.	
Then Tree - User lands on the Implementation in Python page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Tree - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation in Python page
Given Tree - User is in Try Editor page	from Implementation in Python page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Tree - Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation in Python page	
Given Tree - User is in Try Editor page	from Implementation in Python page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Tree - Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation in Python page	
Given Tree - User is in Try Editor page	from Implementation in Python page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Binary Tree Traversals page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink  Binary Tree Traversals.	
Then User lands on the Binary Tree Traversals page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Binary Tree Traversals page	
Given Tree - User is in Try Editor page	from Binary Tree Traversals page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Binary Tree Traversals page	
Given Tree - User is in Try Editor page	from Binary Tree Traversals page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Binary Tree Traversals page	
Given Tree - User is in Try Editor page	from Binary Tree Traversals page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Implementation of Binary Trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Implementation of Binary Trees.	
Then User lands on the Implementation of Binary Trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation of Binary Trees page
Given Tree - User is in Try Editor page	from Implementation of Binary Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation of Binary Trees page	
Given Tree - User is in Try Editor page	from Implementation of Binary Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation of Binary Trees page	
Given Tree - User is in Try Editor page	from Implementation of Binary Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Applications of Binary trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Applications of Binary trees.	
Then User lands on the Applications of Binary trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Applications of Binary trees page
Given Tree - User is in Try Editor page	from Applications of Binary trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Applications of Binary trees page	
Given Tree - User is in Try Editor page	from Applications of Binary trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Applications of Binary trees page	
Given Tree - User is in Try Editor page	from Applications of Binary trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Verify that the user is able to navigate to the Binary Search Trees page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>	
When User clicks on the hyperlink Binary Search Trees.	
Then User lands on the Binary Search Trees page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Binary Search Trees page	
Given Tree - User is in Try Editor page	Binary Search Trees page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Binary Search Trees page	
Given Tree - User is in Try Editor page	Binary Search Trees page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Binary Search Trees page	
Given Tree - User is in Try Editor page	Binary Search Trees page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.

@positiveflow
Scenario Outline: Tree - Verify that the user is able to navigate to the Implementation Of BST page	
Given User is in the Tree page after logging in using credentials from Excel <Rownumber>
When Tree - User clicks on the hyperlink Implementation Of BST.	
Then Tree - User lands on the Implementation Of BST page
Examples:
|Rownumber|
|1|

@negativeflow
Scenario: Tree - Verify that the Try here button is functional and error message is displayed when user tries to Run without a python code in Try Editor from Implementation Of BST page
Given Tree - User is in Try Editor page	from Implementation Of BST page
When Tree - User clicks on Run Button without entering the code	
Then Tree - An Alert window with the error message is displayed.

@negativeflow
Scenario: Tree - Verify that the error message is displayed when user tries to Run with invalid python code in Try Editor from Implementation Of BST page	
Given Tree - User is in Try Editor page	from Implementation Of BST page
When Tree - User clicks on Run Button after entering a invalid python code.	
Then Tree - An Alert window with the error message is displayed.

@positiveflow
Scenario: Tree - Verify the proper output is displayed when user tries to Run with the valid python code in Try Editor from Implementation Of BST page	
Given Tree - User is in Try Editor page	from Implementation Of BST page
When Tree - User clicks on Run Button after entering a valid python code.	
Then Tree - Correct output is displayed in the console.