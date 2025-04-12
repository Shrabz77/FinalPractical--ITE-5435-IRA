# 🛫 Husky Air Reservation System

A Spring Boot + MongoDB-based flight reservation system built for the ITE5435 Final Practical Exam. This app supports flight booking via a web form (Thymeleaf) and REST API (Postman), backed by a NoSQL database.

---

## 📁 Project Structure

src/ ├── main/ │ ├── java/ │ │ └── com.example.ShrabaniSagareekaITE5435FinalExamA/ │ │ ├── controller/ │ │ ├── model/ │ │ ├── repository/ │ │ └── service/ │ └── resources/ │ ├── templates/ (Thymeleaf HTML) │ └── static/ (CSS, JS) └── test/

yaml
Copy
Edit

---

## 🧪 Technologies Used

- ✅ Spring Boot 3.4.4
- ✅ Spring MVC
- ✅ Spring REST
- ✅ Jackson (JSON serialization)
- ✅ MongoDB (via Spring Data MongoDB)
- ✅ Thymeleaf
- ✅ Postman (for REST API testing)
- ✅ HTML5 + CSS (for frontend)

---

## 🚀 Features

- Add flight reservations through a web form
- REST API support for GET, POST, PUT (JSON data)
- Auto serialization with Jackson
- Data stored in MongoDB under `huskyairdb > reservations`

---

## 🌐 How to Run

1. ✅ Start MongoDB locally (`localhost:27017`)
2. ✅ Open project in Eclipse or IntelliJ
3. ✅ Run `ShrabaniSagareekaIte5435FinalExamApplication.java`
4. ✅ Visit:  
http://localhost:8080/reservation-form

yaml
Copy
Edit
5. ✅ Submit a reservation form or test API via Postman

---

## 🔁 REST API Endpoints (JSON)

| Method | Endpoint                        | Description         |
|--------|----------------------------------|---------------------|
| `GET`  | `/api/reservations`             | Get all reservations |
| `GET`  | `/api/reservations/{id}`        | Get reservation by ID |
| `POST` | `/api/reservations`             | Create new reservation |
| `PUT`  | `/api/reservations/{id}`        | Update reservation |

---

## 🔎 Sample POST Request Body (JSON)

```json
{
"flightNumber": "HA123",
"seatNumber": "13A",
"customer": {
 "firstName": "Emma",
 "lastName": "Stone",
 "email": "emma@gmail.com"
},
"payment": {
 "cardNumber": "345678123456",
 "expiry": "12/25",
 "amount": 456.98
}
}
