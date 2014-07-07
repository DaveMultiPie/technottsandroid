Tech Nottingham Android
================

Base Android project for Tech Nottingham July 7th Talk

#Suggested Tasks

At the moment the app gets the latest tweets with Hashtag #TechNott, parses it into a string and sends to the TweetDisplayFragment.java.
Inside TweetDisplayFragment.java the function 'tweetsUpdated' will let you know when tweets have been downloaded.

The JSON currently looks like this:
```
[
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 13:14:05 UTC 2014",
        "user": "@chriskey"
    },
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 12:24:54 UTC 2014",
        "user": "@MultiPie"
    },
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 11:38:09 UTC 2014",
        "user": "@MrAndrew"
    }
]
```




##Example JSON
Live JSON from http://multipie-dev.appspot.com/twitter_downloader
```
[
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 13:14:05 UTC 2014",
        "user": "@chriskey"
    },
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 12:24:54 UTC 2014",
        "user": "@MultiPie"
    },
    {
        "message": "RT @technottingham: Are you coming along to Tech Nottingham at @Antenna_UK tonight? #TechNott http://t.co/9Sp1fFsaXm http://t.co/7eVSRQpSYA",
        "created_at": "Mon Jul 07 11:38:09 UTC 2014",
        "user": "@MrAndrew"
    }
]
```



