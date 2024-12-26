package com.airkurs.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashMap;
import java.util.Map;

public class DestinationValidator implements ConstraintValidator<ValidDestination, String> {

    private final Map<String, String> validDestinations = new HashMap<String, String>() {{
        put("KRO", "Курган");
        put("URS", "Курск Восточный");
        put("LPK", "Липецк");
        put("GDX", "Магадан Сокол");
        put("MQF", "Магнитогорск");
        put("MCX", "Махачкала Уйташ");
        put("MRV", "Минеральные Воды");
        put("VKO", "Москва Внуково");
        put("DME", "Москва Домодедово");
        put("SVO", "Москва Шереметьево");
        put("MMK", "Мурманск");
        put("NAL", "Нальчик");
        put("NJC", "Нижневартовск");
        put("GOJ", "Нижний Новгород Стригино");
        put("OVB", "Новосибирск Толмачёво");
        put("NSK", "Норильск Алыкель");
        put("OMS", "Омск Центральный");
        put("REN", "Оренбург Центральный");
        put("PEE", "Пермь Большое Савино");
        put("PKC", "Петропавловск-Камчатский Елизово");
        put("ROV", "Ростов-на-Дону Платов");
        put("LED", "Санкт-Петербург Пулково");
        put("AER", "Сочи Адлер");
        put("CEK", "Челябинск Баландино");
        put("UUS", "Южно-Сахалинск Хомутово");
        put("YKS", "Якутск");
        put("ABA", "Абакан");
        put("BAX", "Барнаул");
        put("KEJ", "Кемерово");
        put("KJA", "Красноярск Емельяново");
        put("KZN", "Казань");
        put("ASF", "Астрахань Нариманово");
        put("KUF", "Самара Курумоч");
        put("SGC", "Сургут");
        put("SVX", "Екатеринбург Кольцово");
        put("TYA", "Тюмень Рощино");
        put("HTA", "Чита Кадала");
        put("TOF", "Томск Богашёво");
        put("KHV", "Хабаровск Новый");
        put("IKT", "Иркутск");
        put("AAQ", "Анапа Витязево");
        put("GDZ", "Геленджик");
        put("EGO", "Белгород");
    }};

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && validDestinations.containsValue(value);
    }
}
