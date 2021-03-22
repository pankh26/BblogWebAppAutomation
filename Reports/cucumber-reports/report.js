$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("favoriteArticles.feature");
formatter.feature({
  "line": 1,
  "name": "Verify presence and functionality of Favorite Article icon",
  "description": "Number of scenarios: 5",
  "id": "verify-presence-and-functionality-of-favorite-article-icon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify presence of favorite icon for articles on Global Feed screen",
  "description": "",
  "id": "verify-presence-and-functionality-of-favorite-article-icon;verify-presence-of-favorite-icon-for-articles-on-global-feed-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigates to login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Global Feed tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should see favorite icon for article",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 5088171965,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 336824072,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2373363844,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_clicks_on_global_feed_tab()"
});
formatter.result({
  "duration": 649740013,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_should_see_favorite_icon()"
});
formatter.result({
  "duration": 668813712,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify empty screen message on Favorited Articles tab",
  "description": "",
  "id": "verify-presence-and-functionality-of-favorite-article-icon;verify-empty-screen-message-on-favorited-articles-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User navigates to login page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User lands on Your Feed screen",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks on username displayed on top",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Favorited Articles tab",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should see \"No articles are here... yet.\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 4596028774,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 283444188,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2370079046,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_lands_on_your_feed_screen()"
});
formatter.result({
  "duration": 1448474987,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_username()"
});
formatter.result({
  "duration": 2074999603,
  "status": "passed"
});
formatter.match({
  "location": "UserProfileSteps.user_clicks_on_favorited_articles_tab()"
});
formatter.result({
  "duration": 279869993,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No articles are here... yet.",
      "offset": 17
    }
  ],
  "location": "UserProfileSteps.user_should_see_text(String)"
});
formatter.result({
  "duration": 2129422266,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify favorite article icon without signing into the app",
  "description": "",
  "id": "verify-presence-and-functionality-of-favorite-article-icon;verify-favorite-article-icon-without-signing-into-the-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks on Home tab",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User lands on Global Feed screen",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should not see favorite icon for article",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 5138575611,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_home_tab()"
});
formatter.result({
  "duration": 159626942,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_lands_on_global_feed_screen()"
});
formatter.result({
  "duration": 20024003,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_should_not_see_favorite_icon()"
});
formatter.result({
  "duration": 45219803871,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify favorite icon displayed for own article post on My Articles tab",
  "description": "",
  "id": "verify-presence-and-functionality-of-favorite-article-icon;verify-favorite-icon-displayed-for-own-article-post-on-my-articles-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User navigates to login page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User lands on Your Feed screen",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks on New post button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters values in input boxes",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Publish Article button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User clicks on username displayed on top",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User clicks on My Articles tab",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User should see favorite icon for article",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 4185889375,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 223225865,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2335376551,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_lands_on_your_feed_screen()"
});
formatter.result({
  "duration": 857850867,
  "status": "passed"
});
formatter.match({
  "location": "CreatePostSteps.userClicksOnNewPostButton()"
});
formatter.result({
  "duration": 76462154,
  "status": "passed"
});
formatter.match({
  "location": "CreatePostSteps.userEntersValuesInInputBoxes()"
});
formatter.result({
  "duration": 714723359,
  "status": "passed"
});
formatter.match({
  "location": "CreatePostSteps.userClicksOnPublishArticleButton()"
});
formatter.result({
  "duration": 78349144,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_username()"
});
formatter.result({
  "duration": 2067928003,
  "status": "passed"
});
formatter.match({
  "location": "UserProfileSteps.user_clicks_on_my_articles_tab()"
});
formatter.result({
  "duration": 1069892032,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_should_see_favorite_icon()"
});
formatter.result({
  "duration": 244500560,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify number of Unfavorite Post icon displayed on article details page",
  "description": "",
  "id": "verify-presence-and-functionality-of-favorite-article-icon;verify-number-of-unfavorite-post-icon-displayed-on-article-details-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "User navigates to login page",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User clicks on Global Feed tab",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User clicks on favorite icon for any article",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User clicks on the same article",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User should see Unfavorite Post icon on two places on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 3923083450,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 142323580,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2336730346,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_clicks_on_global_feed_tab()"
});
formatter.result({
  "duration": 643708663,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_clicks_on_favorite_icon()"
});
formatter.result({
  "duration": 378802834,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_clicks_on_article()"
});
formatter.result({
  "duration": 104085119,
  "status": "passed"
});
formatter.match({
  "location": "FeedPageSteps.user_should_see_unfavorite_post_button()"
});
formatter.result({
  "duration": 713342601,
  "status": "passed"
});
});