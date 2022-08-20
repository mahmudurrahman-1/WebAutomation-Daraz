## Create automated scripts to test e-commerce Web app Daraz place order as a user

1. write automation script to automate the below scenarios

## Registration

>*_Feature_*: Registration Module

**Scenario Outine:** Registration with valid inputs

> **_Given:_** goto registration page  
> **_When:_** enter "sheetName" and "rowNum"  
> **_Then:_** Successfully registered  
> **_Examples_**  
> |sheetname|rowNum|   
> |sheet1   |0     |

> *_Feature_*: Login Module  

**Background:** Login with invalid credentials
> **_Given_** goto daraz website and click SIGNUP/lOGIN button from the navigation
> **_When_** give "email" and "password" to login
> **_Then_** show incorrect result

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

