'LightPlatformTestCase' @ [27:34] ==> public constructor LightPlatformTestCase() defined in com.intellij.testFramework.LightPlatformTestCase[JavaClassConstructorDescriptor]

'listOf' @ [29:32] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [30:29] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [31:31] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'loadKotlinIntentions' @ [34:30] ==> private final fun loadKotlinIntentions(): List<IntentionActionBean> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [35:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'intentionTools' @ [36:22] ==> val intentionTools: List<IntentionActionBean> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'tool' @ [37:29] ==> val tool: IntentionActionBean defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'className' @ [37:34] ==> @Tag public final var className: (String..String?) defined in com.intellij.codeInsight.intention.IntentionActionBean[JavaPropertyDescriptor]

'className' @ [38:29] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'substringAfterLast' @ [38:39] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [38:63] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [39:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'shortName' @ [39:73] ==> val shortName: String defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'if (!directory.exists() || !directory.isDirectory) {
                errors.append("No description directory for intention '").append(className).append("'\n")
            }
            else {
                val necessaryNames = when {
                    shortName.isMavenIntentionName() -> necessaryMavenNames
                    shortName.isXmlIntentionName() -> necessaryXmlNames
                    else -> necessaryNormalNames
                }
                for (fileName in necessaryNames) {
                    val file = directory.resolve(fileName)
                    if (!file.exists() || !file.isFile) {
                        errors.append("No description file $fileName for intention '").append(className).append("'\n")
                    }
                }
            }' @ [40:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'!' @ [40:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'directory' @ [40:18] ==> val directory: File defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'exists' @ [40:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [40:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'directory' @ [40:41] ==> val directory: File defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'isDirectory' @ [40:51] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'errors' @ [41:17] ==> val errors: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'append' @ [41:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [41:75] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [41:82] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'append' @ [41:93] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when {
                    shortName.isMavenIntentionName() -> necessaryMavenNames
                    shortName.isXmlIntentionName() -> necessaryXmlNames
                    else -> necessaryNormalNames
                }' @ [44:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>, entry2: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'shortName' @ [45:21] ==> val shortName: String defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'isMavenIntentionName' @ [45:31] ==> private final fun String.isMavenIntentionName(): Boolean defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[SimpleFunctionDescriptorImpl]

'necessaryMavenNames' @ [45:57] ==> public final val necessaryMavenNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[PropertyDescriptorImpl]

'shortName' @ [46:21] ==> val shortName: String defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'isXmlIntentionName' @ [46:31] ==> private final fun String.isXmlIntentionName(): Boolean defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[SimpleFunctionDescriptorImpl]

'necessaryXmlNames' @ [46:55] ==> public final val necessaryXmlNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[PropertyDescriptorImpl]

'necessaryNormalNames' @ [47:29] ==> public final val necessaryNormalNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest[PropertyDescriptorImpl]

'necessaryNames' @ [49:34] ==> val necessaryNames: List<String> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'directory' @ [50:32] ==> val directory: File defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'resolve' @ [50:42] ==> public fun File.resolve(relative: String): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'fileName' @ [50:50] ==> val fileName: String defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'!' @ [51:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [51:26] ==> val file: File defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'exists' @ [51:31] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [51:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [51:44] ==> val file: File defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'isFile' @ [51:49] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'errors' @ [52:25] ==> val errors: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'append' @ [52:32] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fileName' @ [52:61] ==> val fileName: String defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'append' @ [52:88] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'className' @ [52:95] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'append' @ [52:106] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEmpty' @ [57:24] ==> public open fun assertEmpty(p0: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'errors' @ [57:36] ==> val errors: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.testDescriptionsAndShortNames[LocalVariableDescriptor]

'toString' @ [57:43] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'startsWith' @ [60:49] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [62:47] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [62:68] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getArea' @ [65:41] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'getExtensionPoint' @ [65:55] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensionPoint(@NotNull p0: ExtensionPointName<(IntentionActionBean..IntentionActionBean?)>): ExtensionPoint<(IntentionActionBean..IntentionActionBean?)> defined in com.intellij.openapi.extensions.ExtensionsArea[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IntentionActionBean

'EP_INTENTION_ACTIONS' @ [65:90] ==> public final val EP_INTENTION_ACTIONS: (ExtensionPointName<(IntentionActionBean..IntentionActionBean?)>..ExtensionPointName<(IntentionActionBean..IntentionActionBean?)>?) defined in com.intellij.codeInsight.intention.IntentionManager[JavaPropertyDescriptor]

'extensionPoint' @ [66:16] ==> val extensionPoint: ExtensionPoint<(IntentionActionBean..IntentionActionBean?)> defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.loadKotlinIntentions[LocalVariableDescriptor]

'extensions' @ [66:31] ==> public final val <T : (Any..Any?)> ExtensionPoint<(IntentionActionBean..IntentionActionBean?)>.extensions: (Array<(IntentionActionBean..IntentionActionBean?)>..Array<out (IntentionActionBean..IntentionActionBean?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInsight.intention.IntentionActionBean..com.intellij.codeInsight.intention.IntentionActionBean?)

'toList' @ [66:42] ==> public fun <T> Array<out (IntentionActionBean..IntentionActionBean?)>.toList(): List<(IntentionActionBean..IntentionActionBean?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.intention.IntentionActionBean..com.intellij.codeInsight.intention.IntentionActionBean?)

'filter' @ [66:51] ==> public inline fun <T> Iterable<(IntentionActionBean..IntentionActionBean?)>.filter(predicate: ((IntentionActionBean..IntentionActionBean?)) -> Boolean): List<(IntentionActionBean..IntentionActionBean?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.intention.IntentionActionBean..com.intellij.codeInsight.intention.IntentionActionBean?)

'it' @ [67:13] ==> value-parameter it: (IntentionActionBean..IntentionActionBean?) defined in org.jetbrains.kotlin.idea.intentions.IntentionDescriptionTest.loadKotlinIntentions.<anonymous>[ValueParameterDescriptorImpl]

'pluginDescriptor' @ [67:16] ==> public final var IntentionActionBean.pluginDescriptor: (PluginDescriptor..PluginDescriptor?)[MyPropertyDescriptor]

'pluginId' @ [67:33] ==> public final val PluginDescriptor.pluginId: (PluginId..PluginId?)[MyPropertyDescriptor]

'KOTLIN_PLUGIN_ID' @ [67:62] ==> public final val KOTLIN_PLUGIN_ID: (PluginId..PluginId?) defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaPropertyDescriptor]

