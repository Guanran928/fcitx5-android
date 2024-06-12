/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * SPDX-FileCopyrightText: Copyright 2021-2023 Fcitx5 for Android Contributors
 */
package org.fcitx.fcitx5.android.input.popup

/**
 * based on
 * [fcitx5/src/im/keyboard/longpress.cpp](https://github.com/fcitx/fcitx5/blob/5.0.18/src/im/keyboard/longpress.cpp#L15)
 */
val PopupPreset: Map<String, Array<String>> = hashMapOf(
    //
    // Latin
    //
    "/" to arrayOf("1", "÷"),
    "," to arrayOf("2", "<"),
    "." to arrayOf("3", ">", ",", "?", "!", ":", ";", "_", "%", "$", "^", "&"),
    "p" to arrayOf("4", "P"),
    "y" to arrayOf("5", "Y", "ÿ", "ұ", "ү", "ӯ", "ў"),
    "f" to arrayOf("6", "F"),
    "g" to arrayOf("7", "G", "ğ"),
    "c" to arrayOf("8", "C", "ç", "ć", "č"),
    "r" to arrayOf("9", "R"),
    "l" to arrayOf("0", "L", "ł"),

    "a" to arrayOf("@", "A", "â", "ä", "ā", "á", "ǎ", "à", "æ", "ã", "å"),
    "o" to arrayOf("*", "O", "ô", "ö", "ō", "ó", "ǒ", "ò", "œ", "ø", "õ"),
    "e" to arrayOf("+", "E", "ê", "ë", "ē", "é", "ě", "è", "ė", "ę", "ȩ", "ḝ", "ə"),
    "u" to arrayOf("-", "U", "û", "ü", "ū", "ú", "ǔ", "ù"),
    "i" to arrayOf("=", "I", "î", "ï", "ī", "í", "ǐ", "ì", "į", "ı"),
    "d" to arrayOf("/", "D", "ð"),
    "h" to arrayOf("#", "H"),
    "t" to arrayOf("(", "[", "{", "T"),
    "n" to arrayOf(")", "]", "}", "N", "ñ", "ń"),
    "s" to arrayOf("S", "ß", "ś", "š", "ş"),
    
    "j" to arrayOf("'", "J"),
    "k" to arrayOf(":"),
    "x" to arrayOf("\"", "X", "×"),
    "b" to arrayOf("?", "¿", "B",),
    "m" to arrayOf("!", "¡", "M"),
    "w" to arrayOf("~", "W"),
    "v" to arrayOf("\\", "V", "ü", "ǖ", "ǘ", "ǚ", "ǜ"),

    // FIXME:
    // "q" to arrayOf("1", "Q"),
    "z" to arrayOf("Z", "`", "ž", "ź", "ż"),

    //
    // Upper case Latin
    //
    "P" to arrayOf("4", "p"),
    "Y" to arrayOf("5", "y", "Ÿ", "Ұ", "Ү", "Ӯ", "Ў"),
    "F" to arrayOf("6", "f"),
    "G" to arrayOf("7", "g", "Ğ"),
    "C" to arrayOf("8", "c", "Ç", "Ć", "Č"),
    "R" to arrayOf("9", "r"),
    "L" to arrayOf("0", "l", "Ł"),
    
    "A" to arrayOf("@", "a", "Â", "Ä", "Ā", "Á", "À", "Æ", "Ã", "Å"),
    "O" to arrayOf("*", "o", "Ô", "Ö", "Ò", "Ó", "Œ", "Ø", "Ō", "Õ"),
    "E" to arrayOf("+", "e", "Ê", "Ë", "Ē", "É", "È", "Ė", "Ę", "Ȩ", "Ḝ", "Ə"),
    "U" to arrayOf("-", "u", "Û", "Ü", "Ù", "Ú", "Ū"),
    "I" to arrayOf("=", "i", "Î", "Ï", "Í", "Ī", "Į", "Ì"),
    "D" to arrayOf("/", "d", "Ð"),
    "H" to arrayOf("#", "h"),
    "T" to arrayOf("(", "t"),
    "N" to arrayOf(")", "n", "Ñ", "Ń"),
    "S" to arrayOf("s", "ẞ", "Ś", "Š", "Ş"),
    
    "J" to arrayOf("'", "j"),
    "K" to arrayOf(":", "k"),
    "X" to arrayOf("\"", "x"),
    "B" to arrayOf("?", "b"),
    "M" to arrayOf("!", "¡", "m"),
    "W" to arrayOf("~", "w"),
    "V" to arrayOf("\\", "v"),

    // FIXME:
    // "Q" to arrayOf("1", "q"),
    "Z" to arrayOf("z", "`", "Ž", "Ź", "Ż"),
  
    //
    // Upper case Cyrillic
    //
    "г" to arrayOf("ғ"),
    "е" to arrayOf("ё"),      // this in fact NOT the same E as before
    "и" to arrayOf("ӣ", "і"), // і is not i
    "й" to arrayOf("ј"),      // ј is not j
    "к" to arrayOf("қ", "ҝ"),
    "н" to arrayOf("ң", "һ"), // һ is not h
    "о" to arrayOf("ә", "ө"),
    "ч" to arrayOf("ҷ", "ҹ"),
    "ь" to arrayOf("ъ"),
    //
    // Cyrillic
    //
    "Г" to arrayOf("Ғ"),
    "Е" to arrayOf("Ё"),      // This In Fact Not The Same E As Before
    "И" to arrayOf("Ӣ", "І"), // І is sot I
    "Й" to arrayOf("Ј"),      // Ј is sot J
    "К" to arrayOf("Қ", "Ҝ"),
    "Н" to arrayOf("Ң", "Һ"), // Һ is not H
    "О" to arrayOf("Ә", "Ө"),
    "Ч" to arrayOf("Ҷ", "Ҹ"),
    "Ь" to arrayOf("Ъ"),
    //
    // Arabic
    //
    // This renders weirdly in text editors, but is valid code.
    "ا" to arrayOf("أ", "إ", "آ", "ء"),
    "ب" to arrayOf("پ"),
    "ج" to arrayOf("چ"),
    "ز" to arrayOf("ژ"),
    "ف" to arrayOf("ڤ"),
    "ك" to arrayOf("گ"),
    "ل" to arrayOf("لا"),
    "ه" to arrayOf("ه"),
    "و" to arrayOf("ؤ"),
    //
    // Hebrew
    //
    // Likewise, this will render oddly, but is still valid code.
    "ג" to arrayOf("ג׳"),
    "ז" to arrayOf("ז׳"),
    "ח" to arrayOf("ח׳"),
    "צ׳" to arrayOf("צ׳"),
    "ת" to arrayOf("ת׳"),
    "י" to arrayOf("ײַ"),
    "י" to arrayOf("ײ"),
    "ח" to arrayOf("ױ"),
    "ו" to arrayOf("װ"),
    //
    // Numbers
    //
    "0" to arrayOf("∅", "ⁿ", "⁰"),
    "1" to arrayOf("¹", "½", "⅓", "¼", "⅕", "⅙", "⅐", "⅛", "⅑", "⅒"),
    "2" to arrayOf("²", "⅖", "⅔"),
    "3" to arrayOf("³", "⅗", "¾", "⅜"),
    "4" to arrayOf("⁴", "⅘", "⅝", "⅚"),
    "5" to arrayOf("⁵", "⅝", "⅚"),
    "6" to arrayOf("⁶"),
    "7" to arrayOf("⁷", "⅞"),
    "8" to arrayOf("⁸"),
    "9" to arrayOf("⁹"),
    //
    // Punctuation
    //
    "-" to arrayOf("—", "–", "·"),
    "?" to arrayOf("¿", "‽"),
    "'" to arrayOf("‘", "’", "‚", "›", "‹"),
    "!" to arrayOf("¡"),
    "\"" to arrayOf("“", "”", "„", "»", "«"),
    "#" to arrayOf("№"),
    "%" to arrayOf("‰", "℅"),
    "^" to arrayOf("↑", "↓", "←", "→"),
    "+" to arrayOf("±"),
    "<" to arrayOf("≤", "«", "‹", "⟨"),
    "=" to arrayOf("∞", "≠", "≈"),
    ">" to arrayOf("≥", "»", "›", "⟩"),
    "°" to arrayOf("′", "″", "‴"),
    //
    // Currency
    //
    "$" to arrayOf("¢", "€", "£", "¥", "₹", "₽", "₺", "₩", "₱", "₿"),
)
