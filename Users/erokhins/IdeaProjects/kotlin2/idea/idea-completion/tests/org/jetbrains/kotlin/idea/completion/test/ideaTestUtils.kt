'configureWithExtraFile' @ [25:5] ==> public fun CodeInsightTestFixture.configureWithExtraFile(path: String, vararg extraNameParts: String = ..., relativePaths: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]

'path' @ [25:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFileAbs[ValueParameterDescriptorImpl]

'extraNameParts' @ [25:35] ==> value-parameter vararg extraNameParts: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFileAbs[ValueParameterDescriptorImpl]

'arrayOf' @ [28:97] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'if (relativePaths) File(testDataPath, this) else File(this)' @ [29:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'relativePaths' @ [29:37] ==> value-parameter relativePaths: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[ValueParameterDescriptorImpl]

'File' @ [29:52] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [29:57] ==> public final var CodeInsightTestFixture.testDataPath: String[MyPropertyDescriptor]

'this' @ [29:71] ==> <this> defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile.toFile[ReceiverParameterDescriptorImpl]

'File' @ [29:82] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'this' @ [29:87] ==> <this> defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile.toFile[ReceiverParameterDescriptorImpl]

'getNameWithoutExtension' @ [31:36] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'path' @ [31:60] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[ValueParameterDescriptorImpl]

'arrayOf' @ [32:22] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'extraNameParts' @ [33:36] ==> value-parameter vararg extraNameParts: String = ... defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[ValueParameterDescriptorImpl]

'flatMap' @ [34:14] ==> public inline fun <T, R> Array<out String>.flatMap(transform: (String) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'extensions' @ [34:24] ==> val extensions: Array<String> defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[LocalVariableDescriptor]

'map' @ [34:35] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'noExtensionPath' @ [34:50] ==> val noExtensionPath: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[LocalVariableDescriptor]

'it' @ [34:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile.<anonymous>[ValueParameterDescriptorImpl]

'ext' @ [34:70] ==> value-parameter ext: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [35:14] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [35:23] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile.<anonymous>[ValueParameterDescriptorImpl]

'toFile' @ [35:26] ==> local final fun String.toFile(): File defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[SimpleFunctionDescriptorImpl]

'exists' @ [35:35] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'configureByFiles' @ [37:5] ==> @NotNull public abstract fun configureByFiles(@NotNull vararg p0: (String..String?)): (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>) defined in com.intellij.testFramework.fixtures.CodeInsightTestFixture[JavaMethodDescriptor]

'listOf' @ [37:24] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'path' @ [37:31] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[ValueParameterDescriptorImpl]

'extraPaths' @ [37:39] ==> val extraPaths: List<String> defined in org.jetbrains.kotlin.idea.completion.test.configureWithExtraFile[LocalVariableDescriptor]

'toTypedArray' @ [37:51] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'Suppress' @ [40:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'assertInstanceOf' @ [41:70] ==> @Contract public open fun <T : (Any..Any?)> assertInstanceOf(p0: (Any..Any?), @NotNull p1: Class<(T..T?)>): (T..T?) defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'this' @ [41:87] ==> <this> defined in org.jetbrains.kotlin.idea.completion.test.assertInstanceOf[ReceiverParameterDescriptorImpl]

'java' @ [41:102] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

