# Project 2 - Simple Tweet

SimpleTweet is an android app that allows a user to view their Twitter timeline and post a new tweet. The app utilizes [Twitter REST API](https://dev.twitter.com/rest/public).

Time spent: 30 hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **sign in to Twitter** using OAuth login
* [X] User can **view tweets from their home timeline**
    * [X] User is displayed the username, name, and body for each tweet
    * [X] User is displayed the [relative timestamp](https://gist.github.com/nesquena/f786232f5ef72f6e10a7) for each tweet "8m", "7h"
* [X] User can ***log out of the application** by tapping on a logout button
* [X] User can **compose and post a new tweet**
    * [X] User can click a “Compose” icon in the Action Bar on the top right
    * [X] User can then enter a new tweet and post this to Twitter
    * [X] User is taken back to home timeline with **new tweet visible** in timeline
    * [X] Newly created tweet should be manually inserted into the timeline and not rely on a full refresh
* [X] User can **see a counter that displays the total number of characters remaining for tweet** that also updates the count as the user types input on the Compose tweet page
* [X] User can **pull down to refresh tweets timeline**
* [X] User can **see embedded image media within a tweet** on list or detail view.

The following **optional** features are implemented:

* [X] User is using **"Twitter branded" colors and styles**
* [ ] User sees an **indeterminate progress indicator** when any background or network task is happening
* [ ] User can **select "reply" from home timeline to respond to a tweet**
    * [X] User that wrote the original tweet is **automatically "@" replied in compose**
* [ ] User can tap a tweet to **open a detailed tweet view**
    * [ ] User can **take favorite (and unfavorite) or retweet** actions on a tweet
* [ ] User can view more tweets as they scroll with infinite pagination
* [ ] Compose tweet functionality is built using modal overlay
* [X] User can **click a link within a tweet body** on tweet details view. The click will launch the web browser with relevant page opened.
* [ ] Replace all icon drawables and other static image assets with [vector drawables](http://guides.codepath.org/android/Drawables#vector-drawables) where appropriate.
* [ ] User can view following / followers list through any profile they view.
* [ ] Use the View Binding library to reduce view boilerplate.
* [ ] On the Twitter timeline, apply scrolling effects such as [hiding/showing the toolbar](http://guides.codepath.org/android/Using-the-App-ToolBar#reacting-to-scroll) by implementing [CoordinatorLayout](http://guides.codepath.org/android/Handling-Scrolls-with-CoordinatorLayout#responding-to-scroll-events).
* [ ] User can **open the twitter app offline and see last loaded tweets**. Persisted in SQLite tweets are refreshed on every application launch. While "live data" is displayed when app can get it from Twitter API, it is also saved for use in offline mode.

The following **additional** features are implemented:

* [X] List anything else that you can get done to improve the app functionality!
  Partial completion of view binding and vector drawable featuers.
## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/janemeenaghan/SimpleTweet/blob/a2072bdf7d08207eb9f780497bc192f96074802a/FINAL%20EZGIF%20PROJECT%202.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [ezgif](https://ezgif.com/video-to-gif/).

## Notes

Describe any challenges encountered while building the app.
Three teachers, Chris, Sisi, and Jason, all worked together and could not resolve a bug with my embedded images in the final step of the required features. Sisi told me he is familiar with the issue, that it has to do either Twitter API or Android, and that my code is correct. I was instructed by the teachers to let you know about this and consider this in grading.
## Open-source libraries used

* [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
* [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright 2022 Jane Meenaghan

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.