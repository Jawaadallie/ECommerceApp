### System Architecture
```mermaid
classDiagram
    class CUSTOMER {
        -String customerID
        -String name
        -String email
        -String phone
    }
    class ORDER {
        -String orderId
        -String orderType
        -double totalAmount
        -double subTotal
    }
    class ORDERITEM {
        -String orderId
        -int quantity
        -double priceAtPurchase
        -String product
    }
    class PRODUCT {
        -String productId
        -String productName
        -String description
        -double currentPrice
    }
    class SHIPMENT {
        -String shipmentId
        -String address
        -String deliveryDate
        -String status
    }
    class Card {
        -String cardId
        -String cardHolderName
        -String cardNumber
        -String cardType
        -String expiryDate
        -String cvv
    }
    class PAYMENT {
        -String cardId
        -String cardHolderName
        -String cardNumber
        -String cardType
    }
    CUSTOMER "1" -- "0..*" ORDER : places
    CUSTOMER "1" -- "0..*" Card : has
    ORDER "1" *-- "1..*" ORDERITEM : contains
    ORDER "1" -- "1" SHIPMENT : tracked
    ORDER "1" -- "1" PAYMENT : paid by
    ORDERITEM "0..*" -- "1" PRODUCT : links
    SHIPMENT "1" -- "0..*" PRODUCT : views
    Card "1" -- "0..*" PAYMENT : used for
