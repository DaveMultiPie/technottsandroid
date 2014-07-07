Tech Nottingham Android
================

Base Android project for Tech Nottingham July 7th Talk.

This repository holds the beginnings of an app to download all #TechNott tweets, and display a random tweet & user. This app is for handing out prizes at the end of the talk!

#Suggested Tasks

At the moment the app gets the latest tweets with Hashtag #TechNott, parses it into a string and sends to the TweetDisplayFragment.java.

Inside TweetDisplayFragment.java the function 'tweetsUpdated' will let you know when tweets have been downloaded.

The JSON currently looks like this:
```
[
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": 1404735894000,
        "user": "@MultiPie"
    },
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": 1404731397000,
        "user": "@Antenna_UK"
    },
    {
        "message": "Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": 1404730615000,
        "user": "@technottingham"
    }
]
```

"created_at" is a timestamp, the time in **milliseconds** since 1970.

You will need to parse this JSON String, save it for later and display one of the random tweets when a button is pressed.

1. Parse the JSONString passed into 'TweetDisplayFragment'. (JSONArray object maybe?)
2. Create a 'Tweet' model to save this data? Have an array of these for later
3. Add a button to the UI and when the button is pressed pick a random tweet
4. When button is pressed, update another element in the UI to display the randomly chosen tweet

##Bonus tasks

1. Refresh button? The tweets are only downloaded at the beginning of the app at the moment.
2. Filter out multiple tweets from the same user
3. Make it pretty

Direct JSON Download link:
http://multipie-dev.appspot.com/twitter_downloader


