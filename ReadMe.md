## Create automated scripts to test e-commerce Web app Daraz place order as a user

1. write automation script to automate the below scenarios

## Registration

>*_Feature_*: Registration Module

**Scenario Outine:** John goes to the site and does registration

> **_Given_** John on home page after opening open site   
> **_And_** Jogn click Signup/Login button to go Login in page  
> **_And_** John clicks register and goes registration page  
> **_When_** John decides to registration with email  
> **_And_** John enters <sheetName> and <rowNum> to exact values  
> **_Then_** Successfully registered  
> **_Examples_**  
> |sheetname|rowNum|   
> |sheet1   |0     |

> *_Feature_*: Login Module
**Scenario:** John opens the site and Login   
> **_Given_** John on homepage after opening open site  
> **_And_** John clicks SIGNUP/lOGIN button from the Nav bar    
> **_When_** John enters "email" and "password" to input fields   
> **_Then_** John successfully Login

> *Scenario*: Login with valid credentials 
> 
> **_Given_** refresh page  
> **_When_** give valid "email" and "password"  
> **_Then_** successfully login  

2. Please include any third party test reporting tools(Ex. Extent Report, Allure report) in your automation project.
3. Please use Excel/csv file as external test data provider and your automation script have the ability to read and
   write data from excel/csv for above scenario(Ex. Billing/shipping address and all the quoted value in scenario step
   can be read from excel as test data)

### Using automation framework is a must:

You can feel free to choose the framework with page object modal design pattern, that suits you best, along with the
Java or other programming language as you preferred.

