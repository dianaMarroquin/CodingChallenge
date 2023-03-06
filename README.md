# CodingChallenge

curl --location --request GET 'http://localhost:8080/Get/' \
--header 'Content-Type: application/json' \
--data '{
    "calendars": [
        {
            "name": "Kyle",
            "meetings": [
                "1:30PM",
                "2:30PM",
                "6:00PM"
            ]
        },
        {
            "name": "Paul",
            "meetings": [
                "7:00AM",
                "9:00AM",
                "1:30PM",
                "3:00PM",
                "3:30PM"
            ]
        },
        {
            "name": "Alex",
            "meetings": [
                "8:00AM",
                "9:30AM",
                "12:30PM",
                "3:00PM"
            ]
        },
        {
            "name": "Luis",
            "meetings": [
                "9:00AM",
                "12:30PM",
                "1:30PM",
                "3:30PM"
            ]
        },
        {
            "name": "Jairo",
            "meetings": [
                "8:00AM",
                "9:00AM",
                "6:00PM"
            ]
        },
        {
            "name": "Sonya",
            "meetings": [
                "8:00AM",
                "12:30PM",
                "1:30PM",
                "3:30PM"
            ]
        }
    ]
}'
