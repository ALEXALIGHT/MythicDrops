package com.tealcube.minecraft.bukkit.mythicdrops.api.items;

/*
 * #%L
 * MythicDrops
 * %%
 * Copyright (C) 2013 - 2015 TealCube
 * %%
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 * #L%
 */


import org.bukkit.Material;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class that simplifies creating books with names, lore, and pages.
 */
public class MythicTome extends MythicItemStack {

    /**
     * Instantiates a new MythicTome with a specified {@link MaterialData} of a {@link TomeType}. It is also
     * instantiated with a specified title and author, specified lore and pages.
     *
     * @param tomeType Type of tome to create
     * @param title    Name of the tome
     * @param author   Author of the tome
     * @param lore     Lore of the tome
     * @param pages    Pages for the tome
     */
    public MythicTome(TomeType tomeType, String title, String author, String[] lore,
                      String... pages) {
        this(tomeType, title, author, Arrays.asList(lore), pages);
    }

    /**
     * Instantiates a new MythicTome with a specified {@link MaterialData} of a {@link TomeType}. It is also
     * instantiated with a specified title and author, specified lore and pages.
     *
     * @param tomeType Type of tome to create
     * @param title    Name of the tome
     * @param author   Author of the tome
     * @param lore     Lore of the tome
     * @param pages    Pages for the tome
     */
    public MythicTome(TomeType tomeType, String title, String author, List<String> lore,
                      String[] pages) {
        super(tomeType.toMaterial());
        ItemMeta itemMeta = getItemMeta();
        List<String> coloredLore = new ArrayList<>();
        for (String s : lore) {
            coloredLore.add(s.replace('&', '\u00A7').replace("\u00A7\u00A7", "&"));
        }
        if (itemMeta instanceof BookMeta) {
            BookMeta bookMeta = (BookMeta) itemMeta;
            bookMeta.setTitle(title.replace('&', '\u00A7').replace("\u00A7\u00A7", "&"));
            bookMeta.setAuthor(author);
            bookMeta.setLore(coloredLore);
            bookMeta.setPages(pages);
            setItemMeta(bookMeta);
        } else {
            itemMeta.setDisplayName(title.replace('&', '\u00A7').replace("\u00A7\u00A7", "&"));
            itemMeta.setLore(coloredLore);
            setItemMeta(itemMeta);
        }
        setAmount(1);
    }

    /**
     * An Enum holding the different varieties of Tomes allowed to be created.
     */
    public enum TomeType {
        /**
         * Represents the {@link Material#WRITTEN_BOOK}
         */
        WRITTEN_BOOK(Material.WRITTEN_BOOK),
        /**
         * Represents the {@link Material#BOOK}
         */
        BOOK(Material.BOOK),
        /**
         * Represents the {@link Material#BOOK_AND_QUILL}
         */
        BOOK_AND_QUILL(Material.BOOK_AND_QUILL),
        /**
         * Represents the {@link Material#ENCHANTED_BOOK}
         */
        ENCHANTED_BOOK(Material.ENCHANTED_BOOK);
        private final Material material;

        private TomeType(Material mat) {
            this.material = mat;
        }

        /**
         * Returns a {@link Material} represented by the TomeType.
         *
         * @return Material represented by the TomeType
         */
        public Material toMaterial() {
            return material;
        }
    }
}
