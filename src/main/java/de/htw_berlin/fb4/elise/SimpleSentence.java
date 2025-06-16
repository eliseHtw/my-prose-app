/*
 * Copyright (C) 2025 eliseHtw
 *
 * This program is free software under the terms of GPLv3.
 * See the GNU General Public License for more details.
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.elise;

import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Represents a simple sentence with a fixed text content.
 */
public class SimpleSentence implements Sentence {
    /**
     * Returns the fixed sentence content.
     *
     * @return the fixed sentence "Ich esse heute Abend Salat"
     */
    @Override
    public String get() {
        return "Ich esse heute Abend Salat";
    }
}