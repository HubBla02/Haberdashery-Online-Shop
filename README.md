Hi! This is my 2nd project (which I have written myself). It's a simple shop online, when you can get some haberdashery items (default types: a handbag, a belt and a wallet) for "eurosponges".
It has such features as:

a) Client panel:

1. Main menu  (localhost:8080) - all of the items are there (every has a name, a price and a picture). You can add items to the cart (check point no.2) by pressing "add to cart" button. On the top right corner you will see the amount of items that have been added to the cart and the full price of the contents

2. Cart - you will see all the items you chose (and the amount of every single product) and the price of the items (just like in a regular online shop). Here you can press + to add another item of each type, - to remove, or press X to remove ALL of the items of that one kind.

3. Summary - you will again see all the items you chose and the full cost of everything. Here you can provide your personal data and finalize your order (finalized orders are saved to OrderRepository (check point b2)).

b) Admin panel

1. Add item - here you can add item by providing name, price and image (optional). It will be added to the main page and the ItemRepository.
You need to go to /admin to use this option.

2. Displaying all orders - the view to the OrderRepository, where you see all the orders done.
You need to go to /admin/showorders to use this option.

Pssst... I have also created a simple /error page, you can simply check there or simply go to /anythingbesideslinksabove to check it out!

TECHNOLOGIES I HAVE USED:
Backend: Java 17, Spring Boot 3.1.0 (with Maven)
Frontend: HTML + CSS
Database: H2 (which you can simply check on /h2-console, login and password are in the .yml)
Also: JPA


