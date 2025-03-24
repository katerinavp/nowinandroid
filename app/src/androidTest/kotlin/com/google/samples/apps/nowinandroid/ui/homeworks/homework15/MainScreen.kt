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

package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.FOR_YOU_SCREEN_SUBTITLE
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.FOR_YOU_SCREEN_TITLE
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.NIA_TOP_APP_BAR
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.NIA_TOP_APP_BAR_SEARCH
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.NIA_TOP_APP_BAR_SETTINGS
import com.google.samples.apps.nowinandroid.core.designsystem.theme.Constants.NIA_TOP_APP_BAR_TITLE
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class MainScreen(semanticProvides: SemanticsNodeInteractionsProvider) :

    ComposeScreen<MainScreen>(semanticProvides) {

    val centerAlignedTopAppBar = KNode(semanticProvides) {
        hasTestTag(NIA_TOP_APP_BAR)
    }

    val searchIcon = KNode(semanticProvides) {
        hasContentDescription("Search")
        hasParent(androidx.compose.ui.test.hasTestTag(NIA_TOP_APP_BAR_SEARCH))
    }

    val titleText = KNode(semanticProvides){
        hasTestTag(NIA_TOP_APP_BAR_TITLE)
    }

    val settingsIcon = KNode(semanticProvides){
        hasContentDescription("Settings")
        hasTestTag(NIA_TOP_APP_BAR_SETTINGS)
    }

    val doneButton = KNode(semanticProvides) {
        hasText("Done")
    }

    val forYouScreenTitle = KNode(semanticProvides) {
        hasTestTag(FOR_YOU_SCREEN_TITLE)

    }
    val forYouScreenSubTitle = KNode(semanticProvides) {
        hasTestTag(FOR_YOU_SCREEN_SUBTITLE)

    }
    val uiIcon = KNode(semanticProvides) {
        hasContentDescription("UI")

    }
    val composeIcon = KNode(semanticProvides) {
        hasContentDescription("Compose")
    }
}