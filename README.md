# 🍽️ EoEats AI Backend

**EoEats** is a powerful **restaurant management API** that streamlines menu handling, order processing, and kitchen integration. Designed for efficiency, it ensures a seamless experience for both restaurant owners and customers.

---

## 🚀 Key Features

### 📝 Menu Management

- 📌 **Add, modify, or remove menu items**
- 🏷️ **Manage dishes with descriptions, prices, and allergens**

### 🛒 Order Management

- 🍽️ **Customers can browse menus, customize orders, and view allergen details**
- 💳 **Secure payment processing**
- 🍳 **Orders are automatically sent to the kitchen for preparation**

### 🔥 Kitchen Integration

- ⏳ **Real-time order updates for efficient processing**
- ✅ **Ensures timely and accurate order fulfillment**

---

## 🔗 API Endpoints

The API is divided into two sections:

1. **CMS (Content Management System)** for restaurant owners  
2. **Customer-Facing API** for ordering  

### 👥 User Management

- **`POST /users`** → Create a new employee account  
- **`POST /login`** → Authenticate user and return role & restaurant configuration  

### 🍴 Restaurant Management

- **`PUT /restaurants/:id`** → Update restaurant details (email, image, name, phone, location)  
- **`POST/PUT/DELETE /categories`** → Manage categories  
- **`POST/PUT/DELETE /dishes`** → Manage dishes (including allergens)  
- **`POST/PUT/DELETE /extras`** → Manage dish extras  
- **`PUT /restaurants/:id/configuration`** → Update restaurant settings  
- **`PUT /dishes/:id/availability`** → Enable/disable a dish  
- **`GET /restaurants/:id`** → Retrieve restaurant information  
- **`GET /categories/:id/dishes`** → Retrieve dishes by category  
- **`GET /dishes/:id`** → Get dish details including allergens & extras  

### 🛎️ Order Management

- **`GET /orders`** → Retrieve restaurant orders  
- **`GET /orders/:id`** → Retrieve specific order details  
- **`DELETE /orders/:id`** → Remove an order  
- **`DELETE /orders/:id/items/:itemId`** → Remove an item/extra from an order  
- **`GET /tables/:id/summary`** → Get table order summary  
- **`DELETE /tables/:id`** → Clear orders from a table  

### 📲 Customer Ordering

- **`GET /restaurants/:id`** → Retrieve restaurant details via QR scan  
- **`GET /categories/:id/dishes`** → Retrieve dishes by category  
- **`GET /dishes/:id`** → Retrieve dish details (extras included)  
- **`POST /orders`** → Place a new order  

---

## 🛠️ Data Models

| **Model**       | **Attributes**                                                                       |
| -------------- | --------------------------------------------------------------------------------- |
| **User**       | `id`, `username`, `password`, `role`, `restaurant_id`                             |
| **Restaurant** | `id`, `name`, `email`, `image`, `phone`, `latitude`, `longitude`, `configuration` |
| **Category**   | `id`, `restaurant_id`, `name`                                                     |
| **Dish**       | `id`, `category_id`, `name`, `description`, `price`, `allergens`, `is_available`  |
| **Extra**      | `id`, `dish_id`, `name`, `price`                                                  |
| **Order**      | `id`, `restaurant_id`, `table_number`, `created_at`, `status`                     |
| **OrderItem**  | `id`, `order_id`, `dish_id`, `quantity`, `extras`                                 |

---

## 🏗️ Technologies Used

- **Backend:** Java 11+, Spring Boot ☕  
- **Database:** PostgreSQL 🐘  
- **ORM:** JPA & Hibernate 📦  

---

## ⚡ Additional Notes

- 🛠️ **Error Handling:** Informative and user-friendly error responses  
- 📌 **Best Practices:** Clean code principles & structured design patterns  

👨‍💻 Built with ❤️ to enhance restaurant operations!  

---

### 📜 License

This project is licensed under the **MIT License**.

![WhatsApp Image 2024-05-20 at 17 58 48](https://github.com/PabloProgramming/eoeats/assets/169392720/6b498d18-aad6-4aba-8a90-65ec5511f166)
