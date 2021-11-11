# REST API

@Author: Héctor Antonio Santana Beneyto

email: hec_san_ben_@hotmail.com

## How to

#### If you want to execute the program.
Run `java -jar .\build\libs\dog-cue-0.0.1-SNAPSHOT.jar`

#### If you want to run the tests.
Run `./gradlew test` or go to `DogCueApplicationTests.java` and run DogCueApplicationTests class. This will run all the tests.

## Notes

#### POST/UPDATE
You need **Postman** in order to make POST requests or some other program.

If you want to **save** a new user, simple open new tab in Postam, chose POST option and run the JSON on http://localhost:8080/customers This will create a new user.

Example:
`{
    "email": "my_email@gmail.com",
    "postal_address": "Oslo",
    "sms": "I am looking for a national dog event."
}`

If you want to **update** users contact preferences you just need to send a POST request to the id of that user.

Example:
`{
    "id": 5,
	"email": "my_email@gmail.com",
    "postal_address": "Oslo",
    "sms": "I am looking for a national dog event."
}`

This will update the data from the user with the id 5.

#### GET

Send a GET request to http://localhost:8080/customers This will list all the users in the database.


## Video
https://user-images.githubusercontent.com/32430243/141358491-db75588d-86ea-4d66-883a-bd16c07237aa.mp4



