Feature: Deliver
    Scenario Outline: Whenever Rental is OrderPlaced, DeliveryStarted
        Given OrderPlaced ( ) is published and  ( ) is present
        When StartDelivery
        Then DeliveryStarted ( ) should publish

        Examples:
            |
            |      |   |    |


