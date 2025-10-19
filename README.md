🏘️ RealEstateProject Backend
🌟 Overview

This is the backend of a comprehensive real estate management system built using Spring Boot, Hibernate/JPA, and MySQL. It provides REST APIs for managing rental properties including PG/Hostel, Flats, and Commercial spaces.

This backend supports full CRUD operations, nested property details, amenities, images, and advanced data fetching.

It includes DTO mapping, service layer abstraction, cascading relationships, and a structured repository pattern, making it ideal for a real estate portal or internal property management system.

-------------------------------------------------------------------------------------------------------------

🚀 Features

🏠 Property Management

  * Create, Read, Update, Delete rental properties.

  * Supports multiple property categories:

      1. PG/Hostel (RentPGDetails) 🛏️

      2. Flat/Apartments (RentFlatDetails) 🏢

      3. Commercial Spaces (RentCommercialDetails) 🏬

  * Each property includes:

      1. Title, description, features, verified status ✅

      2. Bedrooms 🛏️, bathrooms 🛁, area 📐, price 💰, and address 📍

✨ Amenities Management

  * Properties and PG details can have multiple amenities 🏋️‍♂️🧺🍽️

  * Many-to-Many relationship between Property/PGDetails and Amenity

  * Amenities are returned as [{id, name}] in API responses

🖼️ Images

  * Multiple images per property

  * Each image stores URL and can be extended with metadata

👨‍💼 Agent Management

  * Each property is linked to an agent (User entity)

  * Agent details included in property responses:

    1. Name, Company, Phone, Email

💵 Price & 📏 Area

  * Price supports amount, currency, and period (monthly, yearly)

  * Area supports size and unit (SQFT, SQM, etc.)

🔄 Nested DTO Mapping

  * Property response includes nested details for PG, Flat, and Commercial categories

  * Amenity IDs are mapped to full details in DTOs

  * Ensures clean separation of Entity vs DTO

🌐 Cascading & Relationships

  * RentProperty is the parent entity

  * RentPGDetails, RentFlatDetails, and RentCommercialDetails mapped with @OneToOne

  * Amenities managed via @ManyToMany with @JoinTable

  *Cascade operations ensure saving/deleting parent propagates to children

🛠️ Technology Stack

  * Backend Framework: Spring Boot 3.x ⚡
  
  * Database: MySQL / MariaDB 🗄️
  
  * ORM: Hibernate / JPA 🐘
  
  * Build Tool: Maven 📦
  
  * Java Version: 17+ ☕
  
  * JSON Processing: Jackson 📝
  
  * Dependency Injection: Spring 💉
  
  * Version Control: Git/GitHub 🐙

    

--------------------------------------------------------------------------------------------------------------

📂 Project Structure

    src/main/java/com/example/RealEstateProject/
│
├── controller/        # REST controllers for property endpoints 🖥️
├── dto/               # Data Transfer Objects 📦
│   └── RentDTO/
├── enumClass/         # Enumerations for Property Types, Rent Period, Area Units 📌
├── mapper/            # Entity <-> DTO mapping 🔄
├── model/             # JPA Entities 🏗️
├── repo/              # Spring Data JPA Repositories 📚
├── service/           # Service Interfaces & Implementations ⚙️
└── RealEstateProjectApplication.java  # Spring Boot main class 🚀


---------------------------------------------------------------------------------------------------------------


⚡ APIs
  
Property APIs

  * GET /api/properties – Fetch all properties

  *  GET /api/properties/{id} – Fetch property by ID

  *  POST /api/properties – Create new property

  *  PUT /api/properties/{id} – Update property

  *  DELETE /api/properties/{id} – Delete property

Amenities APIs

  * GET /api/amenities – Fetch all amenities

  * GET /api/amenities/{id} – Fetch amenity by ID

Category-Specific Details

  * PG, Flat, and Commercial property details are nested in property DTO

  * Amenities are mapped automatically



------------------------------------------------------------------------------------------------------------------

💡 Sample JSON Request for PG Property

{
  "title": "Premium PG for Girls",
  "propertyType": "PG",
  "category": "PG_HOSTEL",
  "agent": {
    "id": 2,
    "fullName": "Rahul Sharma",
    "email": "rahul.sharma@example.com",
    "phone": "+91-9876543210",
    "companyName": "SafeStay Properties"
  },
  "price": {
    "amount": 12000,
    "currency": "INR",
    "type": "PER_MONTH"
  },
  "area": {
    "size": 1200,
    "unit": "SQFT"
  },
  "bedrooms": 3,
  "bathrooms": 2,
  "address": {
    "house_no": "45B",
    "street": "MG Road",
    "locality": "Sector 14",
    "city": "Gurgaon",
    "state": "Haryana",
    "country": "India",
    "pincode": "122001"
  },
  "verified": true,
  "featuresSummary": "Furnished rooms with WiFi and meals included",
  "images": [
    { "url": "https://example.com/image1.jpg" },
    { "url": "https://example.com/image2.jpg" }
  ],
  "amenities": [
    { "id": 1 },
    { "id": 3 }
  ],
  "tags": ["wifi", "meals", "furnished"],
  "pgDetails": {
    "forBoysOrGirls": "Girls",
    "availableFor": "Students",
    "sharingType": "2BHK",
    "pgType": "Hostel",
    "pgServices": "Meals, Laundry, WiFi",
    "furnishingStatus": "Furnished",
    "totalCapacity": 10,
    "bedrooms": 5,
    "amenities": [
      { "id": 11 },
      { "id": 12 },
      { "id": 13 }
    ]
  }
}


--------------------------------------------------------------------------------------------------------------


📝 Notes

  * All PG/Flat/Commercial details are stored in one-to-one relationship with RentProperty
  
  * Amenities use many-to-many relationships with @JoinTable
  
  * The backend is fully functional for fetching, creating, updating, and deleting properties
  
  * Designed for scalable real estate platforms

💾 Database Schema

   * rent_property
  
   * rent_pg_details
  
   * rent_flat_details
  
   * rent_commercial_details
  
   * amenity
  
   * rent_pg_amenities (join table)
  
   * rent_flat_amenities (join table)
  
   * images
  
   * categories
  
   * users



🔗 GitHub

You can clone this repo and run the backend locally:

1. git clone https://github.com/yourusername/RealEstateProject.git
2. cd RealEstateProject
3. mvn clean install
4. mvn spring-boot:run

-------------------------------------------------------------------------------------------------------------



🎯 Conclusion
This backend is production-ready, fully supports nested property details, amenities, images, and agent information. It is modular and extensible for future frontend integration.






