package org.example;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ============ 1. shouldWakeUp ============
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (!isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    // ============ 2. hasTeen ============
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) || 
               (secondAge >= 13 && secondAge <= 19) || 
               (thirdAge >= 13 && thirdAge <= 19);
    }

    // ============ 3. isCatPlaying ============
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // ============ 4. area (Dikdörtgen) ============
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    // ============ 5. area (Daire) ============
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}