/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework14

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class MainScreen(semanticProvides: SemanticsNodeInteractionsProvider) :

    ComposeScreen<MainScreen>(semanticProvides) {

    val settingIcon: Any
        get() {
            TODO()
        }
    val centerAlignedTopAppBar = KNode(semanticProvides) {
        hasTestTag("niaTopAppBar")
    }

    val searchIcon = KNode(semanticProvides) {
        hasContentDescription("Search")
        hasParent(androidx.compose.ui.test.hasTestTag("niaTopAppBar"))
        useUnmergedTree = true
    }

//    val titleText = KNode(semanticProvides){
//        hasTestTag(C.Upper_TITLE_TEXT)
//        useUnmergedTree = true
//    }

    val settingsIcon = KNode(semanticProvides){
        hasContentDescription("Settings")
        hasParent(androidx.compose.ui.test.hasTestTag("niaTopAppBar"))
        useUnmergedTree = true
    }

    val doneButton = KNode(semanticProvides) {
        hasText("Done")
    }

    val headlinesIcon = KNode(semanticProvides) {
        hasContentDescription("Headlines")

    }

    val uiIcon = KNode(semanticProvides) {
        hasContentDescription("UI")

    }
    val composeIcon = KNode(semanticProvides) {
        hasContentDescription("Compose")
    }
}