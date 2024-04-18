package com.example.factories;

import com.example.checkboxes.Checkbox;

import com.example.buttons.Button;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}