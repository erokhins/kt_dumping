'arrayOf' @ [28:37] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'compile' @ [30:38] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'compile' @ [32:37] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'createTestFiles' @ [35:21] ==> private fun createTestFiles(file: File, expectedText: String): List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests[SimpleFunctionDescriptorImpl]

'file' @ [35:37] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'fileContent' @ [35:43] ==> value-parameter fileContent: String defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'testFiles' @ [36:9] ==> val testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'filter' @ [36:19] ==> public inline fun <T> Iterable<CodegenTestCase.TestFile>.filter(predicate: (CodegenTestCase.TestFile) -> Boolean): List<CodegenTestCase.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [36:28] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [36:31] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [36:36] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isNotEmpty' @ [36:56] ==> @InlineOnly public inline fun <T> Collection<CodegenTestCase.TestFile>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'testFiles' @ [40:19] ==> val testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'filter' @ [40:29] ==> public inline fun <T> Iterable<CodegenTestCase.TestFile>.filter(predicate: (CodegenTestCase.TestFile) -> Boolean): List<CodegenTestCase.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [40:38] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [40:41] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [40:46] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [41:9] ==> val ktFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'isEmpty' @ [41:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'file' @ [43:28] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'path' @ [43:33] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'replace' @ [43:38] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [43:61] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Ref' @ [44:22] ==> public constructor Ref<T : (Any..Any?)>() defined in com.intellij.openapi.util.Ref[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FqName

'testFiles' @ [45:20] ==> val testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'size' @ [45:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'testFiles' @ [46:23] ==> val testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'map' @ [46:33] ==> public inline fun <T, R> Iterable<CodegenTestCase.TestFile>.map(transform: (CodegenTestCase.TestFile) -> TestClassInfo): List<TestClassInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> TestClassInfo

'if (isSingle) it.name else file.name.substringBeforeLast(".kt") + "/" + it.name' @ [47:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isSingle' @ [47:28] ==> val isSingle: Boolean defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'it' @ [47:38] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [47:41] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'file' @ [47:51] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'name' @ [47:56] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'substringBeforeLast' @ [47:61] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [47:96] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [47:99] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'TestClassInfo' @ [48:9] ==> public constructor TestClassInfo(name: String, content: String, oldPackage: FqName, newClassId: FqName) defined in org.jetbrains.kotlin.android.tests.TestClassInfo[ClassConstructorDescriptorImpl]

'fileName' @ [49:17] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[LocalVariableDescriptor]

'changePackage' @ [50:17] ==> private fun changePackage(newPackagePrefix: String, text: String, oldPackage: Ref<FqName>): String defined in org.jetbrains.kotlin.android.tests[SimpleFunctionDescriptorImpl]

'newPackagePrefix' @ [50:31] ==> val newPackagePrefix: String defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'it' @ [50:49] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [50:52] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'oldPackage' @ [50:61] ==> val oldPackage: Ref<FqName> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'oldPackage' @ [51:17] ==> val oldPackage: Ref<FqName> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'get' @ [51:28] ==> public final fun get(): (FqName..FqName?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'getGeneratedClassName' @ [52:17] ==> private fun getGeneratedClassName(file: File, text: String, newPackagePrefix: String, oldPackage: FqName): FqName defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[SimpleFunctionDescriptorImpl]

'File' @ [52:39] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [52:44] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[LocalVariableDescriptor]

'it' @ [52:55] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [52:58] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'newPackagePrefix' @ [52:67] ==> val newPackagePrefix: String defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'oldPackage' @ [52:85] ==> val oldPackage: Ref<FqName> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'get' @ [52:96] ==> public final fun get(): (FqName..FqName?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'resultFiles' @ [57:5] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'forEach' @ [57:17] ==> @HidesMembers public inline fun <T> Iterable<TestClassInfo>.forEach(action: (TestClassInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo

'file' @ [59:9] ==> value-parameter file: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [59:14] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'resultFiles' @ [59:24] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'fold' @ [59:36] ==> public inline fun <T, R> Iterable<TestClassInfo>.fold(initial: String, operation: (String, TestClassInfo) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo
    <R> -> String

'file' @ [59:41] ==> value-parameter file: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [59:46] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'patchClassForName' @ [60:13] ==> private fun patchClassForName(className: FqName, oldPackage: FqName, text: String): String defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[SimpleFunctionDescriptorImpl]

'param' @ [60:31] ==> value-parameter param: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newClassId' @ [60:37] ==> public final val newClassId: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'param' @ [60:49] ==> value-parameter param: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldPackage' @ [60:55] ==> public final val oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'r' @ [60:67] ==> value-parameter r: String defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultFiles' @ [65:5] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'forEach' @ [65:17] ==> @HidesMembers public inline fun <T> Iterable<TestClassInfo>.forEach(action: (TestClassInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo

'file' @ [67:9] ==> value-parameter file: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [67:14] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'resultFiles' @ [67:24] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'fold' @ [67:36] ==> public inline fun <T, R> Iterable<TestClassInfo>.fold(initial: String, operation: (String, TestClassInfo) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo
    <R> -> String

'file' @ [67:41] ==> value-parameter file: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [67:46] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'r' @ [68:13] ==> value-parameter r: String defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'patchImports' @ [68:15] ==> private fun String.patchImports(oldPackage: FqName, newPackage: FqName): String defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[SimpleFunctionDescriptorImpl]

'param' @ [68:28] ==> value-parameter param: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'oldPackage' @ [68:34] ==> public final val oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'param' @ [68:46] ==> value-parameter param: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newPackage' @ [68:52] ==> public final val newPackage: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'patchSelfImports' @ [69:11] ==> private fun String.patchSelfImports(newPackage: FqName): String defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[SimpleFunctionDescriptorImpl]

'file' @ [69:28] ==> value-parameter file: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'newPackage' @ [69:33] ==> public final val newPackage: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'resultFiles' @ [72:5] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'forEach' @ [72:17] ==> @HidesMembers public inline fun <T> Iterable<TestClassInfo>.forEach(action: (TestClassInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo

'resultFile' @ [73:13] ==> value-parameter resultFile: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:24] ==> public final val name: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'endsWith' @ [73:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resultFile' @ [73:48] ==> value-parameter resultFile: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:59] ==> public final val name: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'endsWith' @ [73:64] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filesHolder' @ [74:13] ==> value-parameter filesHolder: CodegenTestsOnAndroidGenerator.FilesWriter defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'addFile' @ [74:25] ==> public open fun addFile(name: (String..String?), content: (String..String?)): Unit defined in org.jetbrains.kotlin.android.tests.CodegenTestsOnAndroidGenerator.FilesWriter[JavaMethodDescriptor]

'resultFile' @ [74:33] ==> value-parameter resultFile: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [74:44] ==> public final val name: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'resultFile' @ [74:50] ==> value-parameter resultFile: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [74:61] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'resultFiles' @ [78:20] ==> val resultFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'filter' @ [78:32] ==> public inline fun <T> Iterable<TestClassInfo>.filter(predicate: (TestClassInfo) -> Boolean): List<TestClassInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo

'hasBoxMethod' @ [78:41] ==> private fun hasBoxMethod(text: String): Boolean defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[SimpleFunctionDescriptorImpl]

'it' @ [78:54] ==> value-parameter it: TestClassInfo defined in org.jetbrains.kotlin.android.tests.genFiles.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [78:57] ==> public final var content: String defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'boxFiles' @ [79:9] ==> val boxFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'size' @ [79:18] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'println' @ [80:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [80:42] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.genFiles[ValueParameterDescriptorImpl]

'boxFiles' @ [82:12] ==> val boxFiles: List<TestClassInfo> defined in org.jetbrains.kotlin.android.tests.genFiles[LocalVariableDescriptor]

'last' @ [82:21] ==> public fun <T> List<TestClassInfo>.last(): TestClassInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClassInfo

'newClassId' @ [82:28] ==> public final val newClassId: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'createTestFiles' @ [87:33] ==> @NotNull public open fun <M : (Any..Any?), F : (Any..Any?)> createTestFiles(@Nullable p0: String?, p1: (String..String?), p2: (KotlinTestUtils.TestFileFactory<(Void..Void?), (CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..KotlinTestUtils.TestFileFactory<(Void..Void?), (CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>?)): (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]
Inferred types:
    <M : (Any..Any?)> -> Void
    <F : (Any..Any?)> -> TestFile

'file' @ [87:49] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.createTestFiles[ValueParameterDescriptorImpl]

'name' @ [87:54] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'expectedText' @ [87:60] ==> value-parameter expectedText: String defined in org.jetbrains.kotlin.android.tests.createTestFiles[ValueParameterDescriptorImpl]

'KotlinTestUtils.TestFileFactoryNoModules<CodegenTestCase.TestFile>' @ [87:83] ==> public constructor TestFileFactoryNoModules<F : (Any..Any?)>() defined in org.jetbrains.kotlin.test.KotlinTestUtils.TestFileFactoryNoModules[JavaClassConstructorDescriptor]
Inferred types:
    <F : (Any..Any?)> -> TestFile

'TestFile' @ [89:36] ==> public constructor TestFile(@NotNull p0: String, @NotNull p1: String) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaClassConstructorDescriptor]

'fileName' @ [89:45] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.android.tests.createTestFiles.<no name provided>.create[ValueParameterDescriptorImpl]

'text' @ [89:55] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.createTestFiles.<no name provided>.create[ValueParameterDescriptorImpl]

'files' @ [92:12] ==> val files: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>) defined in org.jetbrains.kotlin.android.tests.createTestFiles[LocalVariableDescriptor]

'text' @ [96:12] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.hasBoxMethod[ValueParameterDescriptorImpl]

'contains' @ [96:17] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newClassId' @ [100:22] ==> public final val newClassId: FqName defined in org.jetbrains.kotlin.android.tests.TestClassInfo[PropertyDescriptorImpl]

'parent' @ [100:33] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packagePattern' @ [105:19] ==> private val packagePattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[PropertyDescriptorImpl]

'matcher' @ [105:34] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [105:42] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'if (matcher.find()) {
        val oldPackageName = matcher.toMatchResult().group(1)
        oldPackage.set(FqName(oldPackageName))
        return matcher.replaceAll("package $newPackagePrefix.$oldPackageName")
    }
    else {
        oldPackage.set(FqName.ROOT)
        val packageDirective = "package $newPackagePrefix;\n"
        if (text.contains("@file:")) {
            val index = text.lastIndexOf("@file:")
            val packageDirectiveIndex = text.indexOf("\n", index)
            return text.substring(0, packageDirectiveIndex + 1) + packageDirective + text.substring(packageDirectiveIndex + 1)
        }
        else {
            return packageDirective + text
        }
    }' @ [106:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'matcher' @ [106:9] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'find' @ [106:17] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [107:30] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'toMatchResult' @ [107:38] ==> public open fun toMatchResult(): (MatchResult..MatchResult?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'group' @ [107:54] ==> public abstract fun group(p0: Int): (String..String?) defined in java.util.regex.MatchResult[JavaMethodDescriptor]

'oldPackage' @ [108:9] ==> value-parameter oldPackage: Ref<FqName> defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'set' @ [108:20] ==> public final fun set(@Nullable p0: FqName?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'FqName' @ [108:24] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'oldPackageName' @ [108:31] ==> val oldPackageName: (String..String?) defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'matcher' @ [109:16] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'replaceAll' @ [109:24] ==> public open fun replaceAll(p0: (String..String?)): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'newPackagePrefix' @ [109:45] ==> value-parameter newPackagePrefix: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'oldPackageName' @ [109:63] ==> val oldPackageName: (String..String?) defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'oldPackage' @ [112:9] ==> value-parameter oldPackage: Ref<FqName> defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'set' @ [112:20] ==> public final fun set(@Nullable p0: FqName?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'ROOT' @ [112:31] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'newPackagePrefix' @ [113:42] ==> value-parameter newPackagePrefix: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'if (text.contains("@file:")) {
            val index = text.lastIndexOf("@file:")
            val packageDirectiveIndex = text.indexOf("\n", index)
            return text.substring(0, packageDirectiveIndex + 1) + packageDirective + text.substring(packageDirectiveIndex + 1)
        }
        else {
            return packageDirective + text
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'text' @ [114:13] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'contains' @ [114:18] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [115:25] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'lastIndexOf' @ [115:30] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [116:41] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'indexOf' @ [116:46] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [116:60] ==> val index: Int defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'text' @ [117:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'substring' @ [117:25] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageDirectiveIndex' @ [117:38] ==> val packageDirectiveIndex: Int defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'packageDirective' @ [117:67] ==> val packageDirective: String defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'text' @ [117:86] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'substring' @ [117:91] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageDirectiveIndex' @ [117:101] ==> val packageDirectiveIndex: Int defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'packageDirective' @ [120:20] ==> val packageDirective: String defined in org.jetbrains.kotlin.android.tests.changePackage[LocalVariableDescriptor]

'text' @ [120:39] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.changePackage[ValueParameterDescriptorImpl]

'FqName' @ [127:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'newPackagePrefix' @ [127:32] ==> value-parameter newPackagePrefix: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'!' @ [128:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'oldPackage' @ [128:10] ==> value-parameter oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'isRoot' @ [128:21] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'packageFqName' @ [129:9] ==> var packageFqName: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'packageFqName' @ [129:25] ==> var packageFqName: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'child' @ [129:39] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [129:50] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'oldPackage' @ [129:61] ==> value-parameter oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'asString' @ [129:72] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FILE_NAME_ANNOTATIONS' @ [131:24] ==> private val FILE_NAME_ANNOTATIONS: Array<String> defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[PropertyDescriptorImpl]

'text' @ [132:13] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'contains' @ [132:18] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotation' @ [132:27] ==> val annotation: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'text' @ [133:27] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'indexOf' @ [133:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotation' @ [133:40] ==> val annotation: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'text' @ [134:39] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'substring' @ [134:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [134:54] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'indexOf' @ [134:59] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indexOf' @ [134:74] ==> val indexOf: Int defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'text' @ [134:88] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'indexOf' @ [134:93] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indexOf' @ [134:108] ==> val indexOf: Int defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'packageFqName' @ [135:20] ==> var packageFqName: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'child' @ [135:34] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [135:45] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'annotationParameter' @ [135:56] ==> val annotationParameter: String defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'PackagePartClassUtils' @ [139:12] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getPackagePartFqName' @ [139:34] ==> @JvmStatic public final fun getPackagePartFqName(packageFqName: FqName, fileName: String): FqName defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [139:55] ==> var packageFqName: FqName defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[LocalVariableDescriptor]

'file' @ [139:70] ==> value-parameter file: File defined in org.jetbrains.kotlin.android.tests.getGeneratedClassName[ValueParameterDescriptorImpl]

'name' @ [139:75] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'text' @ [143:12] ==> value-parameter text: String defined in org.jetbrains.kotlin.android.tests.patchClassForName[ValueParameterDescriptorImpl]

'replace' @ [143:17] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [143:26] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'oldPackage' @ [143:51] ==> value-parameter oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.patchClassForName[ValueParameterDescriptorImpl]

'child' @ [143:62] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'className' @ [143:68] ==> value-parameter className: FqName defined in org.jetbrains.kotlin.android.tests.patchClassForName[ValueParameterDescriptorImpl]

'shortName' @ [143:78] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [143:91] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'toRegex' @ [143:113] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [143:124] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'className' @ [143:145] ==> value-parameter className: FqName defined in org.jetbrains.kotlin.android.tests.patchClassForName[ValueParameterDescriptorImpl]

'asString' @ [143:155] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'oldPackage' @ [147:9] ==> value-parameter oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.patchImports[ValueParameterDescriptorImpl]

'isRoot' @ [147:20] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'this' @ [147:35] ==> <this> defined in org.jetbrains.kotlin.android.tests.patchImports[ReceiverParameterDescriptorImpl]

'this' @ [149:12] ==> <this> defined in org.jetbrains.kotlin.android.tests.patchImports[ReceiverParameterDescriptorImpl]

'replace' @ [149:17] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [149:26] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'oldPackage' @ [149:41] ==> value-parameter oldPackage: FqName defined in org.jetbrains.kotlin.android.tests.patchImports[ValueParameterDescriptorImpl]

'asString' @ [149:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'toRegex' @ [149:64] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [149:75] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newPackage' @ [149:87] ==> value-parameter newPackage: FqName defined in org.jetbrains.kotlin.android.tests.patchImports[ValueParameterDescriptorImpl]

'asString' @ [149:98] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'this' @ [154:19] ==> <this> defined in org.jetbrains.kotlin.android.tests.patchSelfImports[ReceiverParameterDescriptorImpl]

'importPattern' @ [155:19] ==> private val importPattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.android.tests in file AndroidTestGenerator.kt[PropertyDescriptorImpl]

'matcher' @ [155:33] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'this' @ [155:41] ==> <this> defined in org.jetbrains.kotlin.android.tests.patchSelfImports[ReceiverParameterDescriptorImpl]

'matcher' @ [156:12] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'find' @ [156:20] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [157:34] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'toMatchResult' @ [157:42] ==> public open fun toMatchResult(): (MatchResult..MatchResult?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'group' @ [157:58] ==> public abstract fun group(p0: Int): (String..String?) defined in java.util.regex.MatchResult[JavaMethodDescriptor]

'compile' @ [158:44] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'possibleSelfImport' @ [158:78] ==> val possibleSelfImport: (String..String?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'classOrObjectPattern' @ [159:13] ==> val classOrObjectPattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'matcher' @ [159:34] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'newText' @ [159:42] ==> var newText: String defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'find' @ [159:51] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'newText' @ [160:13] ==> var newText: String defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'newText' @ [160:23] ==> var newText: String defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'replace' @ [160:31] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [160:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'possibleSelfImport' @ [160:51] ==> val possibleSelfImport: (String..String?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'+' @ [160:71] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newPackage' @ [160:83] ==> value-parameter newPackage: FqName defined in org.jetbrains.kotlin.android.tests.patchSelfImports[ValueParameterDescriptorImpl]

'child' @ [160:94] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [160:105] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'possibleSelfImport' @ [160:116] ==> val possibleSelfImport: (String..String?) defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

'asString' @ [160:137] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'newText' @ [163:12] ==> var newText: String defined in org.jetbrains.kotlin.android.tests.patchSelfImports[LocalVariableDescriptor]

