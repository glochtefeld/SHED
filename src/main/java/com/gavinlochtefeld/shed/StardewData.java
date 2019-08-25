package com.gavinlochtefeld.shed;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class StardewData {

    private static final List<Integer> TAKEN_ID = Arrays.asList(35, 36, 4, 831125, 2481135, 34, 45, 53, 639373, 101, 233104,
            611439, 191393, 502261, 502969, 463391, 611173, 611173, 2123243, 92, 3910674, 3910974, 3900074, 691039,
            50, 51, 584059, 18, 19, 21, 2119820, 56, 2123343, 2120303, 528052, 529952, 67, 5, 47, 2346097, 2346096,
            2346095, 2346094, 2111194, 2111294, 3333094, 2346093, 2346092, 2346091, 2146991, 55, 63, 992553, 900553,
            992253, 65, 66, 690006, 68, 69, 70, 71, 72, 73, 74, 75, 76, 706, 707, 1590166, 897405, 91, 93, 102,
            2118991, 2128292, 901756, 100162, 39, 423502, 11, 12, 15, 917409, 471942, 195019, 195012, 2, 8, 26,
            384883, 384882, 404798, 371652, 95, 94, 44, 46, 100, 38, 7, 57, 571102, 40, 96, 97, 911526, 195099,
            195013, 6, 9, 25, 33, 10, 503180, 13, 20, 288847, 29, 43, 733330, 739330, 711130, 1848481, 0, 112, 418172,
            60367, 4081148, 9581348, 520702, 2794460, 27, 14, 52, 54, 181928, 318560, 611944, 3910975, 3910979, 558291,
            558292, 1, 3, 16, 17, 58, 3102768);
    private static final HashSet<Integer> TAKEN = new HashSet<>(TAKEN_ID);

    // Context menu attributes
    private static final ObservableList<String> weathers = FXCollections.observableArrayList("rainy", "sunny");
    private static final ObservableList<String> genders = FXCollections.observableArrayList("male", "female");
    private static final ObservableList<String> pets = FXCollections.observableArrayList("cat","dog");
    private static final ObservableList<String> hearts = FXCollections.observableArrayList("1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12");
    private static final ObservableList<String> days = FXCollections.observableArrayList(
            "1", "2", "3", "4",
            "5", "6", "7", "8",
            "9","10", "11", "12",
            "13", "14", "15", "16",
            "17", "18", "19", "20",
            "21", "22", "23", "24",
            "25", "26", "27", "28");
    private static final ObservableList<String> npcNames = FXCollections.observableArrayList(
            "Alex",
            "Elliot",
            "Harvey",
            "Sam",
            "Shane",
            "Abigail",
            "Emily",
            "Haley",
            "Leah",
            "Maru",
            "Penny",
            "Caroline",
            "Clint",
            "Demetrius",
            "Dwarf",
            "Evelyn",
            "George",
            "Gus",
            "Jas",
            "Jodi",
            "Kent",
            "Krobus",
            "Lewis",
            "Linus",
            "Marnie",
            "Pam",
            "Pierre",
            "Robin",
            "Sandy",
            "Vincent",
            "Willy",
            "Wizard",
            "Gil",
            "Governer",
            "Grandpa",
            "Gunther",
            "Henchman",
            "Marlon",
            "Morris",
            "Mr. Qi"
    );

    private static final HashMap<String,Integer> itemIDMap;
    static {
        itemIDMap = new HashMap<>();
        itemIDMap.put("Weeds", 0);
        itemIDMap.put("Stone", 2);
        itemIDMap.put("Wild Horseradish", 16);
        itemIDMap.put("Daffodil", 18);
        itemIDMap.put("Leek", 20);
        itemIDMap.put("Dandelion", 22);
        itemIDMap.put("Parsnip", 24);
        itemIDMap.put("Lumber", 30);
        itemIDMap.put("Emerald", 60);
        itemIDMap.put("Aquamarine", 62);
        itemIDMap.put("Ruby", 64);
        itemIDMap.put("Amethyst", 66);
        itemIDMap.put("Topaz", 68);
        itemIDMap.put("Jade", 70);
        itemIDMap.put("Diamond", 72);
        itemIDMap.put("Prismatic Shard", 74);
        itemIDMap.put("Cave Carrot", 78);
        itemIDMap.put("Secret Note", 79);
        itemIDMap.put("Quartz", 80);
        itemIDMap.put("Fire Quartz", 82);
        itemIDMap.put("Frozen Tear", 84);
        itemIDMap.put("Earth Crystal", 86);
        itemIDMap.put("Coconut", 88);
        itemIDMap.put("Cactus Fruit", 90);
        itemIDMap.put("Sap", 92);
        itemIDMap.put("Torch", 93);
        itemIDMap.put("Spirit Torch", 94);
        itemIDMap.put("Dwarf Scroll I", 96);
        itemIDMap.put("Dwarf Scroll II", 97);
        itemIDMap.put("Dwarf Scroll III", 98);
        itemIDMap.put("Dwarf Scroll IV", 99);
        itemIDMap.put("Chipped Amphora", 100);
        itemIDMap.put("Arrowhead", 101);
        itemIDMap.put("Lost Book", 102);
        itemIDMap.put("Ancient Doll", 103);
        itemIDMap.put("Elvish Jewelry", 104);
        itemIDMap.put("Chewing Stick", 105);
        itemIDMap.put("Ornamental Fan", 106);
        itemIDMap.put("Dinosaur Egg", 107);
        itemIDMap.put("Rare Disc", 108);
        itemIDMap.put("Ancient Sword", 109);
        itemIDMap.put("Rusty Spoon", 110);
        itemIDMap.put("Rusty Spur", 111);
        itemIDMap.put("Rusty Cog", 112);
        itemIDMap.put("Chicken Statue", 113);
        itemIDMap.put("Ancient Seed", 114);
        itemIDMap.put("Prehistoric Tool", 115);
        itemIDMap.put("Dried Starfish", 116);
        itemIDMap.put("Anchor", 117);
        itemIDMap.put("Glass Shards", 118);
        itemIDMap.put("Bone Flute", 119);
        itemIDMap.put("Prehistoric Handaxe", 120);
        itemIDMap.put("Dwarvish Helm", 121);
        itemIDMap.put("Dwarf Gadget", 122);
        itemIDMap.put("Ancient Drum", 123);
        itemIDMap.put("Golden Mask", 124);
        itemIDMap.put("Golden Relic", 125);
        itemIDMap.put("Strange Doll Green", 126);
        itemIDMap.put("Strange Doll Yellow", 127);
        itemIDMap.put("Pufferfish", 128);
        itemIDMap.put("Anchovy", 129);
        itemIDMap.put("Tuna", 130);
        itemIDMap.put("Sardine", 131);
        itemIDMap.put("Bream", 132);
        itemIDMap.put("Largemouth Bass", 136);
        itemIDMap.put("Smallmouth Bass", 137);
        itemIDMap.put("Rainbow Trout", 138);
        itemIDMap.put("Salmon", 139);
        itemIDMap.put("Walleye", 140);
        itemIDMap.put("Perch", 141);
        itemIDMap.put("Carp", 142);
        itemIDMap.put("Catfish", 143);
        itemIDMap.put("Pike", 144);
        itemIDMap.put("Sunfish", 145);
        itemIDMap.put("Red Mullet", 146);
        itemIDMap.put("Herring", 147);
        itemIDMap.put("Eel", 148);
        itemIDMap.put("Octopus", 149);
        itemIDMap.put("Red Snapper", 150);
        itemIDMap.put("Squid", 151);
        itemIDMap.put("Seaweed", 152);
        itemIDMap.put("Green Algae", 153);
        itemIDMap.put("Sea Cucumber", 154);
        itemIDMap.put("Super Cucumber", 155);
        itemIDMap.put("Ghostfish", 156);
        itemIDMap.put("White Algae", 157);
        itemIDMap.put("Stonefish", 158);
        itemIDMap.put("Crimsonfish", 159);
        itemIDMap.put("Angler", 160);
        itemIDMap.put("Ice Pip", 161);
        itemIDMap.put("Lava Eel", 162);
        itemIDMap.put("Legend Fish", 163);
        itemIDMap.put("Sandfish", 164);
        itemIDMap.put("Scorpion Carp", 165);
        itemIDMap.put("Treasure Chest", 166);
        itemIDMap.put("Joja Cola", 167);
        itemIDMap.put("Trash", 168);
        itemIDMap.put("Driftwood", 169);
        itemIDMap.put("Broken Glasses", 170);
        itemIDMap.put("Broken CD", 171);
        itemIDMap.put("Soggy Newspaper", 172);
        itemIDMap.put("Large White Egg", 174);
        itemIDMap.put("White Egg", 176);
        itemIDMap.put("Hay", 178);
        itemIDMap.put("Brown Egg", 180);
        itemIDMap.put("Large Brown Egg", 182);
        itemIDMap.put("Milk", 184);
        itemIDMap.put("Large Milk", 186);
        itemIDMap.put("Green Bean", 188);
        itemIDMap.put("Cauliflower", 190);
        itemIDMap.put("Potato", 192);
        itemIDMap.put("Fried Egg", 194);
        itemIDMap.put("Omelet", 195);
        itemIDMap.put("Salad", 196);
        itemIDMap.put("Cheese Cauliflower", 197);
        itemIDMap.put("Baked Fish", 198);
        itemIDMap.put("Parsnip Soup", 199);
        itemIDMap.put("Vegetable Medley", 200);
        itemIDMap.put("Complete Breakfast", 201);
        itemIDMap.put("Fried Calamari", 202);
        itemIDMap.put("Strange Bun", 203);
        itemIDMap.put("Lucky Lunch", 204);
        itemIDMap.put("Fried Mushroom", 205);
        itemIDMap.put("Pizza", 206);
        itemIDMap.put("Bean Hotpot", 207);
        itemIDMap.put("Glazed Yams", 208);
        itemIDMap.put("Carp Surprise", 209);
        itemIDMap.put("Hashbrowns", 210);
        itemIDMap.put("Pancakes", 211);
        itemIDMap.put("Salmon Dinner", 212);
        itemIDMap.put("Fish Taco", 213);
        itemIDMap.put("Crispy Bass", 214);
        itemIDMap.put("Pepper Poppers", 215);
        itemIDMap.put("Bread", 216);
        itemIDMap.put("Tom Kha Soup", 218);
        itemIDMap.put("Trout Soup", 219);
        itemIDMap.put("Chocolate Cake", 220);
        itemIDMap.put("Pink Cake", 221);
        itemIDMap.put("Rhubarb Pie", 222);
        itemIDMap.put("Cookie", 223);
        itemIDMap.put("Spaghetti", 224);
        itemIDMap.put("Fried Eel", 225);
        itemIDMap.put("Spicy Eel", 226);
        itemIDMap.put("Sashimi", 227);
        itemIDMap.put("Maki Roll", 228);
        itemIDMap.put("Tortilla", 229);
        itemIDMap.put("Red Plate", 230);
        itemIDMap.put("Eggplant Parmesan", 231);
        itemIDMap.put("Rice Pudding", 232);
        itemIDMap.put("Ice Cream", 233);
        itemIDMap.put("Blueberry Tart", 234);
        itemIDMap.put("Autumn's Bounty", 235);
        itemIDMap.put("Pumpkin Soup", 236);
        itemIDMap.put("Super Meal", 237);
        itemIDMap.put("Cranberry Sauce", 238);
        itemIDMap.put("Stuffing", 239);
        itemIDMap.put("Farmer's Lunch", 240);
        itemIDMap.put("Survival Burger", 241);
        itemIDMap.put("Dish O' The Sea", 242);
        itemIDMap.put("Miner's Treat", 243);
        itemIDMap.put("Roots Platter", 244);
        itemIDMap.put("Sugar", 245);
        itemIDMap.put("Wheat Flour", 246);
        itemIDMap.put("Oil", 247);
        itemIDMap.put("Garlic", 248);
        itemIDMap.put("Kale", 250);
        itemIDMap.put("Rhubarb", 252);
        itemIDMap.put("Melon", 254);
        itemIDMap.put("Tomato", 256);
        itemIDMap.put("Morel", 257);
        itemIDMap.put("Blueberry", 258);
        itemIDMap.put("Fiddlehead Fern", 259);
        itemIDMap.put("Hot Pepper", 260);
        itemIDMap.put("Wheat", 262);
        itemIDMap.put("Radish", 264);
        itemIDMap.put("Red Cabbage", 266);
        itemIDMap.put("Starfruit", 268);
        itemIDMap.put("Corn", 270);
        itemIDMap.put("Eggplant", 272);
        itemIDMap.put("Artichoke", 274);
        itemIDMap.put("Pumpkin", 276);
        itemIDMap.put("Bok Choy", 278);
        itemIDMap.put("Yam", 280);
        itemIDMap.put("Chanterelle", 281);
        itemIDMap.put("Cranberries", 282);
        itemIDMap.put("Holly", 283);
        itemIDMap.put("Beet", 284);
        itemIDMap.put("Cherry Bomb", 286);
        itemIDMap.put("Bomb", 287);
        itemIDMap.put("Mega Bomb", 288);
        itemIDMap.put("Twig", 294);
        itemIDMap.put("Salmonberry", 296);
        itemIDMap.put("Grass Starter", 297);
        itemIDMap.put("Hardwood Fence", 298);
        itemIDMap.put("Amaranth Seeds", 299);
        itemIDMap.put("Amaranth", 300);
        itemIDMap.put("Grape Starter", 301);
        itemIDMap.put("Hops Starter", 302);
        itemIDMap.put("Pale Ale", 303);
        itemIDMap.put("Hops", 304);
        itemIDMap.put("Void Egg", 305);
        itemIDMap.put("Mayonnaise", 306);
        itemIDMap.put("Duck Mayonnaise", 307);
        itemIDMap.put("Void Mayonnaise", 308);
        itemIDMap.put("Acorn", 309);
        itemIDMap.put("Maple Seed", 310);
        itemIDMap.put("Pine Cone", 311);
        itemIDMap.put("Wood Fence", 322);
        itemIDMap.put("Stone Fence", 323);
        itemIDMap.put("Iron Fence", 324);
        itemIDMap.put("Gate", 325);
        itemIDMap.put("Dwarvish Translation Guide", 326);
        itemIDMap.put("Wood Floor", 328);
        itemIDMap.put("Stone Floor", 329);
        itemIDMap.put("Clay", 330);
        itemIDMap.put("Weathered Floor", 331);
        itemIDMap.put("Crystal Floor", 333);
        itemIDMap.put("Copper Bar", 334);
        itemIDMap.put("Iron Bar", 335);
        itemIDMap.put("Gold Bar", 336);
        itemIDMap.put("Iridium Bar", 337);
        itemIDMap.put("Refined Quartz", 338);
        itemIDMap.put("Honey", 340);
        itemIDMap.put("Tea Set", 341);
        itemIDMap.put("Pickles", 342);
        itemIDMap.put("Jelly", 344);
        itemIDMap.put("Beer", 346);
        itemIDMap.put("Rare Seed", 347);
        itemIDMap.put("Wine", 348);
        itemIDMap.put("Energy Tonic", 349);
        itemIDMap.put("Juice", 350);
        itemIDMap.put("Muscle Remedy", 351);
        itemIDMap.put("Basic Fertilizer", 368);
        itemIDMap.put("Quality Fertilizer", 369);
        itemIDMap.put("Basic Retaining Soil", 370);
        itemIDMap.put("Quality Retaining Soil", 371);
        itemIDMap.put("Clam", 372);
        itemIDMap.put("Golden Pumpkin", 373);
        itemIDMap.put("Poppy", 376);
        itemIDMap.put("Copper Ore", 378);
        itemIDMap.put("Iron Ore", 380);
        itemIDMap.put("Coal", 382);
        itemIDMap.put("Gold Ore", 384);
        itemIDMap.put("Iridium Ore", 386);
        itemIDMap.put("Wood", 388);
        itemIDMap.put("Nautilus Shell", 392);
        itemIDMap.put("Coral", 393);
        itemIDMap.put("Rainbow Shell", 394);
        itemIDMap.put("Coffee", 395);
        itemIDMap.put("Spice Berry", 396);
        itemIDMap.put("Sea Urchin", 397);
        itemIDMap.put("Grape", 398);
        itemIDMap.put("Spring Onion", 399);
        itemIDMap.put("Strawberry", 400);
        itemIDMap.put("Straw Floor", 401);
        itemIDMap.put("Sweet Pea", 402);
        itemIDMap.put("Field Snack", 403);
        itemIDMap.put("Common Mushroom", 404);
        itemIDMap.put("Wood Path", 405);
        itemIDMap.put("Wild Plum", 406);
        itemIDMap.put("Gravel Path", 407);
        itemIDMap.put("Hazelnut", 408);
        itemIDMap.put("Crystal Path", 409);
        itemIDMap.put("Blackberry", 410);
        itemIDMap.put("Cobblestone Path", 411);
        itemIDMap.put("Winter Root", 412);
        itemIDMap.put("Blue Slime Egg", 413);
        itemIDMap.put("Crystal Fruit", 414);
        itemIDMap.put("Stepping Stone Path", 415);
        itemIDMap.put("Snow Yam", 416);
        itemIDMap.put("Sweet Gem Berry", 417);
        itemIDMap.put("Crocus", 418);
        itemIDMap.put("Vinegar", 419);
        itemIDMap.put("Red Mushroom", 420);
        itemIDMap.put("Sunflower", 421);
        itemIDMap.put("Purple Mushroom", 422);
        itemIDMap.put("Rice", 423);
        itemIDMap.put("Cheese", 424);
        itemIDMap.put("Fairy Seeds", 425);
        itemIDMap.put("Goat Cheese", 426);
        itemIDMap.put("Tulip Bulb", 427);
        itemIDMap.put("Cloth", 428);
        itemIDMap.put("Jazz Seeds", 429);
        itemIDMap.put("Truffle", 430);
        itemIDMap.put("Sunflower Seeds", 431);
        itemIDMap.put("Truffle Oil", 432);
        itemIDMap.put("Coffee Bean", 433);
        itemIDMap.put("Stardrop", 434);
        itemIDMap.put("Goat Milk", 436);
        itemIDMap.put("Red Slime Egg", 437);
        itemIDMap.put("L. Goat Milk", 438);
        itemIDMap.put("Purple Slime Egg", 439);
        itemIDMap.put("Wool", 440);
        itemIDMap.put("Explosive Ammo", 441);
        itemIDMap.put("Duck Egg", 442);
        itemIDMap.put("Duck Feather", 444);
        itemIDMap.put("Rabbit's Foot", 446);
        itemIDMap.put("Stone Base", 449);
        itemIDMap.put("Poppy Seeds", 453);
        itemIDMap.put("Ancient Fruit", 454);
        itemIDMap.put("Spangle Seeds", 455);
        itemIDMap.put("Algae Soup", 456);
        itemIDMap.put("Pale Broth", 457);
        itemIDMap.put("Bouquet", 458);
        itemIDMap.put("Mead", 459);
        itemIDMap.put("Mermaid's Pendant", 460);
        itemIDMap.put("Decorative Pot", 461);
        itemIDMap.put("Drum Block", 463);
        itemIDMap.put("Flute Block", 464);
        itemIDMap.put("Speed-Gro", 465);
        itemIDMap.put("Deluxe Speed-Gro", 466);
        itemIDMap.put("Parsnip Seeds", 472);
        itemIDMap.put("Bean Starter", 473);
        itemIDMap.put("Cauliflower Seeds", 474);
        itemIDMap.put("Potato Seeds", 475);
        itemIDMap.put("Garlic Seeds", 476);
        itemIDMap.put("Kale Seeds", 477);
        itemIDMap.put("Rhubarb Seeds", 478);
        itemIDMap.put("Melon Seeds", 479);
        itemIDMap.put("Tomato Seeds", 480);
        itemIDMap.put("Blueberry Seeds", 481);
        itemIDMap.put("Pepper Seeds", 482);
        itemIDMap.put("Wheat Seeds", 483);
        itemIDMap.put("Radish Seeds", 484);
        itemIDMap.put("Red Cabbage Seeds", 485);
        itemIDMap.put("Starfruit Seeds", 486);
        itemIDMap.put("Corn Seeds", 487);
        itemIDMap.put("Eggplant Seeds", 488);
        itemIDMap.put("Artichoke Seeds", 489);
        itemIDMap.put("Pumpkin Seeds", 490);
        itemIDMap.put("Bok Choy Seeds", 491);
        itemIDMap.put("Yam Seeds", 492);
        itemIDMap.put("Cranberry Seeds", 493);
        itemIDMap.put("Beet Seeds", 494);
        itemIDMap.put("Spring Seeds", 495);
        itemIDMap.put("Summer Seeds", 496);
        itemIDMap.put("Fall Seeds", 497);
        itemIDMap.put("Winter Seeds", 498);
        itemIDMap.put("Ancient Seeds", 499);
        itemIDMap.put("Small Glow Ring", 516);
        itemIDMap.put("Glow Ring", 517);
        itemIDMap.put("Small Magnet Ring", 518);
        itemIDMap.put("Magnet Ring", 519);
        itemIDMap.put("Slime Charmer Ring", 520);
        itemIDMap.put("Warrior Ring", 521);
        itemIDMap.put("Vampire Ring", 522);
        itemIDMap.put("Savage Ring", 523);
        itemIDMap.put("Ring of Yoba", 524);
        itemIDMap.put("Sturdy Ring", 525);
        itemIDMap.put("Burglar's Ring", 526);
        itemIDMap.put("Iridium Band", 527);
        itemIDMap.put("Jukebox Ring", 528);
        itemIDMap.put("Amethyst Ring", 529);
        itemIDMap.put("Topaz Ring", 530);
        itemIDMap.put("Aquamarine Ring", 531);
        itemIDMap.put("Jade Ring", 532);
        itemIDMap.put("Emerald Ring", 533);
        itemIDMap.put("Ruby Ring", 534);
        itemIDMap.put("Geode", 535);
        itemIDMap.put("Frozen Geode", 536);
        itemIDMap.put("Magma Geode", 537);
        itemIDMap.put("Alamite", 538);
        itemIDMap.put("Bixite", 539);
        itemIDMap.put("Baryte", 540);
        itemIDMap.put("Aerinite", 541);
        itemIDMap.put("Calcite", 542);
        itemIDMap.put("Dolomite", 543);
        itemIDMap.put("Esperite", 544);
        itemIDMap.put("Fluorapatite", 545);
        itemIDMap.put("Geminite", 546);
        itemIDMap.put("Helvite", 547);
        itemIDMap.put("Jamborite", 548);
        itemIDMap.put("Jagoite", 549);
        itemIDMap.put("Kyanite", 550);
        itemIDMap.put("Lunarite", 551);
        itemIDMap.put("Malachite", 552);
        itemIDMap.put("Neptunite", 553);
        itemIDMap.put("Lemon Stone", 554);
        itemIDMap.put("Nekoite", 555);
        itemIDMap.put("Orpiment", 556);
        itemIDMap.put("Petrified Slime", 557);
        itemIDMap.put("Thunder Egg", 558);
        itemIDMap.put("Pyrite", 559);
        itemIDMap.put("Ocean Stone", 560);
        itemIDMap.put("Ghost Crystal", 561);
        itemIDMap.put("Tigerseye", 562);
        itemIDMap.put("Jasper", 563);
        itemIDMap.put("Opal", 564);
        itemIDMap.put("Fire Opal", 565);
        itemIDMap.put("Celestine", 566);
        itemIDMap.put("Marble", 567);
        itemIDMap.put("Sandstone", 568);
        itemIDMap.put("Granite", 569);
        itemIDMap.put("Basalt", 570);
        itemIDMap.put("Limestone", 571);
        itemIDMap.put("Soapstone", 572);
        itemIDMap.put("Hematite", 573);
        itemIDMap.put("Mudstone", 574);
        itemIDMap.put("Obsidian", 575);
        itemIDMap.put("Slate", 576);
        itemIDMap.put("Fairy Stone", 577);
        itemIDMap.put("Star Shards", 578);
        itemIDMap.put("Prehistoric Scapula", 579);
        itemIDMap.put("Prehistoric Tibia", 580);
        itemIDMap.put("Prehistoric Skull", 581);
        itemIDMap.put("Skeletal Hand", 582);
        itemIDMap.put("Prehistoric Rib", 583);
        itemIDMap.put("Prehistoric Vertebra", 584);
        itemIDMap.put("Skeletal Tail", 585);
        itemIDMap.put("Nautilus Fossil", 586);
        itemIDMap.put("Amphibian Fossil", 587);
        itemIDMap.put("Palm Fossil", 588);
        itemIDMap.put("Trilobite", 589);
        itemIDMap.put("Artifact Spot", 590);
        itemIDMap.put("Tulip", 591);
        itemIDMap.put("Summer Spangle", 593);
        itemIDMap.put("Fairy Rose", 595);
        itemIDMap.put("Blue Jazz", 597);
        itemIDMap.put("Sprinkler", 599);
        itemIDMap.put("Plum Pudding", 604);
        itemIDMap.put("Artichoke Dip", 605);
        itemIDMap.put("Stir Fry", 606);
        itemIDMap.put("Roasted Hazelnuts", 607);
        itemIDMap.put("Pumpkin Pie", 608);
        itemIDMap.put("Radish Salad", 609);
        itemIDMap.put("Fruit Salad", 610);
        itemIDMap.put("Blackberry Cobbler", 611);
        itemIDMap.put("Cranberry Candy", 612);
        itemIDMap.put("Apple", 613);
        itemIDMap.put("Bruschetta", 618);
        itemIDMap.put("Quality Sprinkler", 621);
        itemIDMap.put("Cherry Sapling", 628);
        itemIDMap.put("Apricot Sapling", 629);
        itemIDMap.put("Orange Sapling", 630);
        itemIDMap.put("Peach Sapling", 631);
        itemIDMap.put("Pomegranate Sapling", 632);
        itemIDMap.put("Apple Sapling", 633);
        itemIDMap.put("Apricot", 634);
        itemIDMap.put("Orange", 635);
        itemIDMap.put("Peach", 636);
        itemIDMap.put("Pomegranate", 637);
        itemIDMap.put("Cherry", 638);
        itemIDMap.put("Iridium Sprinkler", 645);
        itemIDMap.put("Coleslaw", 648);
        itemIDMap.put("Fiddlehead Risotto", 649);
        itemIDMap.put("Poppyseed Muffin", 651);
        itemIDMap.put("Green Slime Egg", 680);
        itemIDMap.put("Rain Totem", 681);
        itemIDMap.put("Mutant Carp", 682);
        itemIDMap.put("Bug Meat", 684);
        itemIDMap.put("Bait", 685);
        itemIDMap.put("Spinner", 686);
        itemIDMap.put("Dressed Spinner", 687);
        itemIDMap.put("Warp Totem Farm", 688);
        itemIDMap.put("Warp Totem Mountains", 689);
        itemIDMap.put("Warp Totem Beach", 690);
        itemIDMap.put("Barbed Hook", 691);
        itemIDMap.put("Lead Bobber", 692);
        itemIDMap.put("Treasure Hunter", 693);
        itemIDMap.put("Trap Bobber", 694);
        itemIDMap.put("Cork Bobber", 695);
        itemIDMap.put("Sturgeon", 698);
        itemIDMap.put("Tiger Trout", 699);
        itemIDMap.put("Bullhead", 700);
        itemIDMap.put("Tilapia", 701);
        itemIDMap.put("Chub", 702);
        itemIDMap.put("Magnet", 703);
        itemIDMap.put("Dorado", 704);
        itemIDMap.put("Albacore", 705);
        itemIDMap.put("Shad", 706);
        itemIDMap.put("Lingcod", 707);
        itemIDMap.put("Halibut", 708);
        itemIDMap.put("Hardwood", 709);
        itemIDMap.put("Crab Pot", 710);
        itemIDMap.put("Lobster", 715);
        itemIDMap.put("Crayfish", 716);
        itemIDMap.put("Crab", 717);
        itemIDMap.put("Cockle", 718);
        itemIDMap.put("Mussel", 719);
        itemIDMap.put("Shrimp", 720);
        itemIDMap.put("Snail", 721);
        itemIDMap.put("Periwinkle", 722);
        itemIDMap.put("Oyster", 723);
        itemIDMap.put("Maple Syrup", 724);
        itemIDMap.put("Oak Resin", 725);
        itemIDMap.put("Pine Tar", 726);
        itemIDMap.put("Chowder", 727);
        itemIDMap.put("Fish Stew", 728);
        itemIDMap.put("Escargot", 729);
        itemIDMap.put("Lobster Bisque", 730);
        itemIDMap.put("Maple Bar", 731);
        itemIDMap.put("Crab Cakes", 732);
        itemIDMap.put("Woodskip", 734);
        itemIDMap.put("Strawberry Seeds", 745);
        itemIDMap.put("Jack-O-Lantern", 746);
        itemIDMap.put("Rotten Plant", 747);
        itemIDMap.put("Omni Geode", 749);
        itemIDMap.put("Slime", 766);
        itemIDMap.put("Bat Wing", 767);
        itemIDMap.put("Solar Essence", 768);
        itemIDMap.put("Void Essence", 769);
        itemIDMap.put("Mixed Seeds", 770);
        itemIDMap.put("Fiber", 771);
        itemIDMap.put("Oil of Garlic", 772);
        itemIDMap.put("Life Elixir", 773);
        itemIDMap.put("Wild Bait", 774);
        itemIDMap.put("Glacierfish", 775);
        itemIDMap.put("Battery Pack", 787);
        itemIDMap.put("Lost Axe", 788);
        itemIDMap.put("Lucky Purple Shorts", 789);
        itemIDMap.put("Berry Basket", 790);
        itemIDMap.put("Void Salmon", 795);
        itemIDMap.put("Slimejack", 796);
        itemIDMap.put("Pearl", 797);
        itemIDMap.put("Midnight Squid", 798);
        itemIDMap.put("Spook Fish", 799);
        itemIDMap.put("Blobfish", 800);
        itemIDMap.put("Wedding Ring", 801);
        itemIDMap.put("Cactus Seeds", 802);
        itemIDMap.put("Iridium Milk", 803);
    }

    public static boolean isFreeID(int id) {
        if (TAKEN.contains(id))
            return false;
        return true;
    }

    public static HashSet<Integer> getIDs() {
        return TAKEN;
    }

    public static ObservableList<String> getWeathers() {
        return weathers;
    }

    public static ObservableList<String> getNpcNames() {
        return npcNames;
    }

    public static ObservableList<String> getGenders() {
        return genders;
    }

    public static ObservableList<String> getPets() {
        return pets;
    }

    public static ObservableList<String> getHearts() {
        return hearts;
    }

    public static ObservableList<String> getDates() {
        return days;
    }

    public static HashMap<String, Integer> getItemIDMap() {
        return itemIDMap;
    }

    public static ObservableList<String> getItemNames() {
        List<String> tempNames = new ArrayList<>(itemIDMap.keySet());
        return FXCollections.observableList(tempNames);
    }

    public void addCustomNPC(String name) {
        npcNames.add(name);
    }

    public void addCustomID(int id) {
        TAKEN.add(id);
    }

    public void addItemID(String name, int id){
        itemIDMap.put(name,id);
    }


}
