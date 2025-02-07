package com.sachin.streams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class StreamsRecord
{
    record Car(String type, String make, String model, int cap) {}

    // get list of all sedan cars
    void sedanCars(List<Car> cars)
    {
        List<Car> sedan = cars.stream().filter(car -> car.type.equals("sedan")).collect(Collectors.toList());
        sedan.forEach(System.out::println);
    }

    // get list of all cars type using map
    void getCarsTypes(List<Car> cars)
    {
        List<String> types = cars.stream().map(car -> car.make).toList();
        types.forEach(System.out::println);
    }

    // get make and model
    void getMakeModel(List<Car> cars)
    {
        List<String> types = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();
        types.forEach(System.out::println);
    }

    // get the list of Map by sedans and hatchbacks
    void mapBoolean(List<Car> cars)
    {
        Map<Boolean, List<Car>> sedans = cars.stream().collect(partitioningBy(car -> car.type.equals("sedan")));
        System.out.println(sedans);
    }

    // Cars by Model and Engine Capacity
    void modelEngine(List<Car> cars)
    {
        Map<String, Map<String, Integer>> groupCars = cars.stream().collect(groupingBy(Car::type, toMap(Car::model, Car::cap)));
        System.out.println(groupCars);
    }

    public static void main(String[] args)
    {
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 2000),
                new Car("sedan", "Audi", "A5", 2000),
                new Car("sedan", "Merc", "E-Class", 2500),
                new Car("hatchback", "Honda", "Civic", 1500),
                new Car("hatchback", "Toyota", "Camry", 2500)
        );

        StreamsRecord sr = new StreamsRecord();

        sr.sedanCars(cars);
        sr.getCarsTypes(cars);
        sr.getMakeModel(cars);
        sr.mapBoolean(cars);
        sr.modelEngine(cars);
    }
}
