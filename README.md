# nahta-cycling
Names Are Hard Training App for Cycling

TrainerRoad and Kudo Coach are designed for racing. We are going to start off targeting Randonneuring and Touring. If you don't know what Randonneuring is: https://en.wikipedia.org/wiki/Randonneuring. We would also like to integrate Strava challenges. Really any sort of distance challenge. We are not sure how we would incorporate something like Wandrer, but if you have suggestions, please file an issue.

In the future we may do more with racing.

You might also want to be in control of your data. I also have no idea what TrainerRoad does with your data, so maybe this is better from a privacy perspective.

TR and KC also don't allow you to make modifications to the algorithms like you can with us. Please submit your training modifications and we will try to figure out a system for allowing others to select different training options.

If anyone feels strongly about using something other than the Apache license, then I'm happy to discuss. I feel like someone like Kudo Coach or TrainerRoad using the source is more important for actually having a piece of software people care about than making sure those companies are giving back to the community. We'll see how it goes. 

# Contributing

NAHTA Cycling uses Spring Boot, Spring Boot DevTools, Spring Web, and Apache Camel. By "use" right now we mean that is what we packaged when going to start.spring.io. Since we will be pulling information from Peloton, Garmin, Strava, and who knows what else, Camel seemed reasonable. Now, perhaps since it is simply a pull rather than moving the data around, then Camel isn't needed. I'm happy to pull Camel out in the future if you feel it isn't needed. Obviously, since we are using Spring, Spring Integration might be a better option. Issues and pull requests welcome.
