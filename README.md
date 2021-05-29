# Bob's Kitchen

Kamran Hussain, William Le, Kevin Choi

Team Name: 417 Expectation Failed

Last Updated: 5/28/2021

Intro to Programming Java

Ed Taylor

Production Release, 5/24/21

Version 1.0.0

Dependency on the Resources Folder

Program Purpose:
Bob’s Kitchen is a game where players try to guess what Bob’s secret recipes are
by seeing an image of his dishes then recreating them. When they recreate the dish
they will be scored on how they did and be given part of the 9 digit code to his
secret vault. When players enter the vault they have beaten the game.

How to Play:
Select a level then choose the dish you are trying to make. Then select your
ingredients to make the dish. After picking your ingredients, you can make sure
you selected the right ingredients before submitting for grading. Once the dish is
graded, you’ll get a score on how accurate it is compared to the secret recipe and 3
digits of Bob’s vault code. You can use the passcode to unlock Bob’s vault and find
the treasure inside and become a culinary master!

Version History:
v0.0.1 - GUI was introduced for the Sandwich Level. The home page acts as a
directory for levels.
v0.0.3 - User selected deactivates when the page is reloaded. The Sandwich
Condiments window is completed and multi-line JLabels are now implemented.
v0.0.4 - Sandwich Scorer is introduced. Inputs are not functional.
v0.0.5 - Sandwich level is now functional. Scorer inputs are implemented.
v0.0.6 - GUI for the Sandwich level is finalized, Images are pending. Drop down
menus are functional with updating images. Scorer is connected to GUI inputs.
v0.0.7 - Home window is completely reformatted, Scorer is expanded to all levels.
CardLayout is experimented further for the single frame program.
v0.0.8 - Pizza Level is completed and connected to the scorer. Sandwich Level is
completely implemented. Easter eggs have been planted. The Visual score window
is now active. Scorer includes pizza grader for level 2. All images are now cropped
properly for formatting.
v0.0.9 - Cake and Pho levels are added. GUI is cleaned and scorer is connected to
those new levels
v1.0.0 - Documentation was added throughout the code.

Target User Profile:
This game is intended for high school students who are interested in cooking and
food. It is a fun game for those who really enjoy or are interested in food!

Feature List:
● A clean and easy to use home page with a help window.
● Confirmations before playing each level/dish
● Clearly labeled options for user choices and inputs
● User options are simple and easy to select
● Submit page provides a summary of the user selected options
● Scorer can grade every dish.

Class List: Main, Home, Help, SandwichStart, SandwichVeggies, SandwichMeat,
Sandwich condiments, SandwichFinish, PizzaStyle, PizzaDough, PizzaToppings,
PizzaFinish,PhoStyle,PhoStock, PhoMeat,PhoNoodles, PhoToppings,
PhoFinish,Scorer,ScoreWindow,Bob’sVault,Gameover

Team Responsibility:
Kevin Choi - Made all the images needed to run the program. Made a label for
each image (if needed) and found images appropriate for the program to run
smoothly. Research color and themes for the program. Designed and implemented
the game engine. Helped With the Presentation. Coded the Scorer and Main class.

Kamran Hussain - Implemented throughout the program, specifically the graphics
in the sandwich level. Took the sketches from Will and put them into coded classes
primarily graphics. Began work on developing the game engine with Kevin and
Will, scoring system is implemented when the user inputs are sent to the scorer.
Working on adapting code to one frame with refreshing panels. Helped with the
Presentation. Edited the video.

William Le: Listed Fields, Methods, and Constructors in each class via comments.
Drew out by hand and made a UML Diagram for the program including arrows
that show hierarchy and class paths. I came up with the idea of a cooking game
including the game engine (how the game works), the various dishes that we will
soon have, and I drew out some sketches on what the game should look like.
Helped with the game engine. Scoring system is now applicable on the gui and
scorer is now applicable to all levels of the game. Helped with connecting the gui
and scoring system for the pho classes.

Known Bugs/Workarounds:
-Single Frame implementation is not fully implemented
-Redoing a level in a single run adds the previous score to the new score
-Colors are not optimized for Mac users, so visibility of buttons may not be clear.
-Formatting may be off on Mac.
-Those with low resolution displays may have trouble viewing all content in proper
format
-The Pho toppings summary does not display all the selected toppings

Key Learnings:
-Learned how to implement graphics spanning multiple types of input fields across
multiple fields.
-Learned how to use Github for fast file transfers and collaboration
-Learned how to create images based off written request

Credit List:
Referenced the uml diagram from the final project, and applied what we learned
about class hierarchies and “depends on” relationships between the class to draw
out the class paths.
Oracle Java Documentation API

Sources:
http://clipart-library.com/cake-cartoon.html
https://www.cleanpng.com/png-milk-blue-cheese-gouda-cheese-cheddar-cheese-chees-381324
/preview.html
https://www.istockphoto.com/photos/sliced-avocado
https://depositphotos.com/vector-images/bacon-cartoon.html
https://www.cleanpng.com/free/baguette.html
https://www.pinterest.com/pin/812970170231002023/
http://clipart-library.com/clip-art/cheese-clipart-transparent-25.htm
https://www.vectorstock.com/royalty-free-vectors/cream-cheese-cartoon-vectors
http://clipart-library.com/clipart/1806175.htm
https://depositphotos.com/74417171/stock-illustration-garlic-bread.html
https://www.pngarts.com/explore/96264
https://www.deviantart.com/gooseworx/art/Honey-Mustard-632611051
https://www.istockphoto.com/vector/thousand-island-salad-dressing-icon-on-transparent-backgr
ound-gm1283974614-381248303
https://www.vectorstock.com/royalty-free-vector/cartoon-ketchup-bottle-red-tomato-sauce-vector
-20789689
https://www.yourleanlifestyle.com/menu/southwest-salad-2/
https://www.cleanpng.com/png-mayonnaise-clip-art-portable-network-graphics-jar-6614589/prev
iew.html
https://www.frije.com/recipes/93613
https://pngimg.com/image/43995
https://stickerapp.com/custom-stickers/cartoons/new-york-pizza-sticker
http://www.clker.com/clipart-239600.html
https://stock.adobe.com/search?k=%22pancake+cartoon%22
https://nerdydadfoods.com/collections/herbs-pestos/products/basil-pesto
https://www.amazon.com/Chau-Q-Nguyen-What-The/dp/B00PGG9RWK
http://clipart-library.com/cheese-pizza-cartoon.html
https://www.google.com/url?sa=i&url=https%3A%2F%2Ffrankandsal.com%2Fproducts%2Fshar
p-provolone-cheese-imported-from-italy-1-pound&psig=AOvVaw2qJMDs_Gi1jePYb6JI7l2g&ust
=1621359336513000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLif_Kyg0fACFQAAAAAd
AAAAABAD
https://www.google.com/url?sa=i&url=http%3A%2F%2Fshutterstock.puzzlepix.hu%2Fkereses%
3Fsort%3Dpopular%26page%3D12%26query%3Dramen&psig=AOvVaw1BJ4gxRHECu3WaQ
WPfFGka&ust=1621359382930000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMCjk8Wg
0fACFQAAAAAdAAAAABAD
https://www.shutterstock.com/search/sandwich+cartoon
http://clipart-library.com/cartoon-star.html
https://www.istockphoto.com/photos/sweet-bread
https://www.istockphoto.com/photos/tomato-slice
http://clipart-library.com/clipart/1685216.htm
https://www.pinterest.com/pin/567735096748967614/
https://www.123rf.com/photo_3146999_cartoon-food-illustration-of-a-slice-of-white-bread.html
http://www.clipartsuggest.com/sausage-cliparts/
http://clipart-library.com/clipart/1883768.html
http://clipart-library.com/olive-cliparts.html
http://clipart-library.com/picture-of-pepperoni.html
http://clipart-library.com/clip-art/transparent-onion-19.htm
http://clipart-library.com/peppers-cliparts.html
https://piarapizza.com/menu/thin-crust-pizzas/
https://www.palermovillainc.com/trade/our-specialty-great-crusts/
https://www.google.com/url?sa=i&url=https%3A%2F%2Fdrpizza.mx%2Fmenu-2%2F&psig=AOv
Vaw2cJq44lmBrTyCna3g-x7GN&ust=1621361369519000&source=images&cd=vfe&ved=0CAIQ
jRxqFwoTCLDp3fan0fACFQAAAAAdAAAAABAD
https://ezvietnamesecuisine.com/
https://www.google.com/url?sa=i&url=https%3A%2F%2Fnamnam.net%2Frecipes%2Fchicken-p
ho-by-namnam%2F&psig=AOvVaw3RB4OwLFKz76eiTr01RJxL&ust=1621617805125000&sour
ce=images&cd=vfe&ved=0CAIQjRxqFwoTCPDhypzj2PACFQAAAAAdAAAAABAD
https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pho24.com.vn%2Fen%2Fproduct
_feature%2Fpho-tai%2F&psig=AOvVaw2-9UbJOfKRbu9w77V4Fxme&ust=1621618077253000
&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIj91p_k2PACFQAAAAAdAAAAABAJ
https://www.cleanpng.com/png-cauliflower-broccoli-cabbage-solyanka-brussels-spr-639885/prev
iew.html
https://www.alibaba.com/product-detail/Good-Price-New-Coming-Thin-Vermicelli_50045106219.
html
http://nosetotailapp.com/meat-cuts/beef/rolled-brisket
https://www.rawfeedingmiami.com/products/beef-tendons
https://www.pngjoy.com/fullpng/d1t1s2h4s3k2n0/
https://www.eatthismuch.com/recipe/nutrition/slow-cooker-cuban-salsa-chicken,1017590/
https://www.bonappetit.com/recipe/crispy-salt-and-pepper-chicken-skin
https://www.gardenersworld.com/how-to/grow-plants/how-to-grow-basil/
https://download-png.netlify.app/vegetable/onion-cartoon-empanada/
https://www.cor.ca/view/291/cilantro.html
https://www.bbcgoodfood.com/recipes/collection/beansprout-recipes
https://healthyboybrand.trustpass.alibaba.com/product/50038903843-231505425/Healthy_Boy/
Brand_Chili_Oil.html
https://www.cleanpng.com/png-hoisin-sauce-cuisine-of-hawaii-japanese-cuisine-te-3614343
