# Taco Loco Java Challenge

By default, TacoLoco runs on port 8080

![Homepage](https://user-images.githubusercontent.com/11738644/94362414-ba84a080-0080-11eb-901f-5bd10101246e.PNG)

If Check Menu is clicked, it returns the menu list in JSON data
format.
***
**About the App**

![Actuator](https://user-images.githubusercontent.com/11738644/94361994-daff2b80-007d-11eb-9299-879e0483da82.PNG)
***
/\* \-\-\-\--Reading list of taco types via REST API using GET\-\-\-\--
\*/

**/menu: Get the menu**

{\"menu\":{\"Chorizo Taco\":3.5,\"Chicken Taco\":3.0,\"Beef
Taco\":3.0,\"Veggie Taco\":2.5}}
***
To place and order, client tool Postman is used.

**/placeorder: Less than 4 tacos**

![NoDiscount](https://user-images.githubusercontent.com/11738644/94362036-26193e80-007e-11eb-9276-70302fe13ef4.PNG)

Here, the customer "Amol" has not order 4 or more tacos so the discount
is not applied.

**/placeorder: Equal or More than 4 tacos**

![Discount](https://user-images.githubusercontent.com/11738644/94362058-4e08a200-007e-11eb-8f11-c4387b496c9d.PNG)
Here, the customer "Amol" has order 4 tacos
so 20% discount is applied.

**/placeorder: Item Not on Taco Menu**

![ItemNotFound](https://user-images.githubusercontent.com/11738644/94362059-506afc00-007e-11eb-96a9-45a04cb4d82a.PNG)

Here, the customer "Amol" ordered Burger which was not on the menu so it
returns the timestamp, status, and message saying \"Item not found on
our Taco Menu\"
***
**TEST CASES**

Three test cases has been applied using JUnit testing framework inside **OrderControllerTest.class** which includes Test case without discount, Test case with applying discount, and Test case for non-existing Item.

