'KotlinLightCodeInsightFixtureTestCase' @ [54:44] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'testDataPath' @ [56:29] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [56:42] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (File(extraFilePath).isFile) listOf(testDataPath, extraFilePath) else listOf(testDataPath)' @ [57:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'File' @ [57:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'extraFilePath' @ [57:34] ==> val extraFilePath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'isFile' @ [57:49] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'listOf' @ [57:57] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testDataPath' @ [57:64] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[ValueParameterDescriptorImpl]

'extraFilePath' @ [57:78] ==> val extraFilePath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'listOf' @ [57:98] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'testDataPath' @ [57:105] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[ValueParameterDescriptorImpl]

'lazinessModeByFileText' @ [60:28] ==> private final fun lazinessModeByFileText(testDataPath: String): LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest[SimpleFunctionDescriptorImpl]

'testDataPath' @ [60:51] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [61:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest[JavaPropertyDescriptor]

'configureByFiles' @ [61:19] ==> @NotNull public abstract fun configureByFiles(@NotNull vararg p0: (String..String?)): (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'testFiles' @ [61:37] ==> val testFiles: List<String> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'toTypedArray' @ [61:47] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'myFixture' @ [63:22] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest[JavaPropertyDescriptor]

'file' @ [63:32] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'File' @ [64:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [64:29] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[ValueParameterDescriptorImpl]

'testLightClass' @ [65:9] ==> private fun testLightClass(expected: File, testData: File, normalize: (String) -> String, findLightClass: (String) -> PsiClass?): Unit defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'replaceExtension' @ [65:40] ==> @NotNull public open fun replaceExtension(@NotNull p0: File, @Nullable p1: String?): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testData' @ [65:57] ==> val testData: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'testData' @ [65:76] ==> val testData: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'LightClassTestCommon' @ [65:88] ==> public object LightClassTestCommon defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'removeEmptyDefaultImpls' @ [65:109] ==> public final fun removeEmptyDefaultImpls(text: String): String defined in org.jetbrains.kotlin.asJava.LightClassTestCommon[DeserializedSimpleFunctionDescriptor]

'it' @ [65:133] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'LightClassLazinessChecker' @ [66:27] ==> public object LightClassLazinessChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[FakeCallableDescriptorForObject]

'Tracker' @ [66:53] ==> public constructor Tracker(fqName: String) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[ClassConstructorDescriptorImpl]

'fqName' @ [66:61] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [67:13] ==> public final val AbstractIdeLightClassTest.project: Project[MyPropertyDescriptor]

'withServiceRegistered' @ [67:21] ==> public inline fun <reified T : Any, R> ComponentManager.withServiceRegistered(instance: StubComputationTracker, body: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> StubComputationTracker
    <R> -> PsiClass?

'tracker' @ [67:78] ==> val tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[LocalVariableDescriptor]

'findClass' @ [68:17] ==> private fun findClass(fqName: String, ktFile: KtFile?, project: Project): PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [68:27] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [68:35] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'project' @ [68:43] ==> public final val AbstractIdeLightClassTest.project: Project[MyPropertyDescriptor]

'apply' @ [68:53] ==> @InlineOnly public inline fun <T> PsiClass.apply(block: PsiClass.() -> Unit): PsiClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'LightClassLazinessChecker' @ [69:21] ==> public object LightClassLazinessChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[FakeCallableDescriptorForObject]

'check' @ [69:47] ==> public final fun check(lightClass: KtLightClass, tracker: LightClassLazinessChecker.Tracker, lazinessMode: LightClassLazinessChecker.Mode): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'this' @ [69:53] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tracker' @ [69:75] ==> val tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[LocalVariableDescriptor]

'lazinessMode' @ [69:84] ==> val lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest[LocalVariableDescriptor]

'tracker' @ [70:21] ==> val tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>[LocalVariableDescriptor]

'allowLevel' @ [70:29] ==> public final fun allowLevel(newAllowed: LightClassLazinessChecker.Tracker.Level): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[SimpleFunctionDescriptorImpl]

'EXACT' @ [70:40] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'PsiElementChecker' @ [71:21] ==> public object PsiElementChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file PsiElementChecker.kt[FakeCallableDescriptorForObject]

'checkPsiElementStructure' @ [71:39] ==> public final fun checkPsiElementStructure(lightClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.PsiElementChecker[SimpleFunctionDescriptorImpl]

'this' @ [71:64] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.doTest.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'File' @ [78:16] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [78:21] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.lazinessModeByFileText[ValueParameterDescriptorImpl]

'readText' @ [78:35] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'run' @ [78:46] ==> @InlineOnly public inline fun <T, R> String.run(block: String.() -> LightClassLazinessChecker.Mode): LightClassLazinessChecker.Mode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Mode

'substringAfter' @ [79:28] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [79:60] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LightClassLazinessChecker' @ [80:13] ==> public object LightClassLazinessChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[FakeCallableDescriptorForObject]

'values' @ [80:44] ==> public final fun values(): Array<LightClassLazinessChecker.Mode> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [80:53] ==> public inline fun <T> Array<out LightClassLazinessChecker.Mode>.firstOrNull(predicate: (LightClassLazinessChecker.Mode) -> Boolean): LightClassLazinessChecker.Mode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Mode

'it' @ [80:67] ==> value-parameter it: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.lazinessModeByFileText.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [80:70] ==> public final val name: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[DeserializedPropertyDescriptor]

'argument' @ [80:78] ==> val argument: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeLightClassTest.lazinessModeByFileText.<anonymous>[LocalVariableDescriptor]

'LightClassLazinessChecker' @ [80:92] ==> public object LightClassLazinessChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[FakeCallableDescriptorForObject]

'AllChecks' @ [80:123] ==> enum entry AllChecks defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[FakeCallableDescriptorForObject]

'INSTANCE' @ [84:89] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'KotlinDaemonAnalyzerTestCase' @ [87:52] ==> public constructor KotlinDaemonAnalyzerTestCase() defined in org.jetbrains.kotlin.idea.KotlinDaemonAnalyzerTestCase[JavaClassConstructorDescriptor]

'super' @ [89:9] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [89:15] ==> @Override protected/*protected and package*/ open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.KotlinDaemonAnalyzerTestCase[JavaMethodDescriptor]

'getTestName' @ [91:24] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[JavaMethodDescriptor]

'isAllFilesPresentTest' @ [92:29] ==> public open fun isAllFilesPresentTest(p0: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testName' @ [92:51] ==> val testName: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'getTestsRoot' @ [94:43] ==> public open fun getTestsRoot(@NotNull p0: Class<*>): (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [94:56] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[LazyClassReceiverParameterDescriptor]

'java' @ [94:68] ==> public val <T> KClass<out AbstractIdeCompiledLightClassTest>.java: Class<out AbstractIdeCompiledLightClassTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractIdeCompiledLightClassTest

'getTestName' @ [94:77] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[JavaMethodDescriptor]

'assertTrue' @ [96:16] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'filePath' @ [96:48] ==> val filePath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'File' @ [96:59] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filePath' @ [96:64] ==> val filePath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'exists' @ [96:74] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'MockLibraryUtil' @ [98:26] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileJvmLibraryToJar' @ [98:42] ==> @JvmStatic @JvmOverloads public final fun compileJvmLibraryToJar(sourcesPath: String, jarName: String, addSources: Boolean = ..., allowKotlinSources: Boolean = ..., extraOptions: List<String> = ..., extraClasspath: List<String> = ..., useJava9: Boolean = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'filePath' @ [98:65] ==> val filePath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'libName' @ [98:75] ==> private final fun libName(): String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[SimpleFunctionDescriptorImpl]

'+' @ [99:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toSystemIndependentName' @ [99:44] ==> @NotNull public open fun toSystemIndependentName(@NonNls @NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'libraryJar' @ [99:68] ==> val libraryJar: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'absolutePath' @ [99:79] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'addModuleLibrary' @ [100:36] ==> public open fun addModuleLibrary(@NotNull p0: Module, @NotNull p1: String): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[JavaMethodDescriptor]

'module' @ [100:53] ==> public final val AbstractIdeCompiledLightClassTest.module: (Module..Module?)[MyPropertyDescriptor]

'jarUrl' @ [100:61] ==> val jarUrl: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.setUp[LocalVariableDescriptor]

'+' @ [103:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [103:40] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest[JavaMethodDescriptor]

'File' @ [106:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [106:33] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest[ValueParameterDescriptorImpl]

'replaceExtension' @ [107:44] ==> @NotNull public open fun replaceExtension(@NotNull p0: File, @Nullable p1: String?): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testDataFile' @ [108:17] ==> val testDataFile: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest[LocalVariableDescriptor]

'let' @ [109:11] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'if (it.exists()) it else KotlinTestUtils.replaceExtension(testDataFile, "java")' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'it' @ [109:21] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [109:24] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'it' @ [109:34] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'replaceExtension' @ [109:58] ==> @NotNull public open fun replaceExtension(@NotNull p0: File, @Nullable p1: String?): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testDataFile' @ [109:75] ==> val testDataFile: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest[LocalVariableDescriptor]

'testLightClass' @ [110:9] ==> private fun testLightClass(expected: File, testData: File, normalize: (String) -> String, findLightClass: (String) -> PsiClass?): Unit defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'expectedFile' @ [110:24] ==> val expectedFile: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest[LocalVariableDescriptor]

'testDataFile' @ [110:38] ==> val testDataFile: File defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest[LocalVariableDescriptor]

'it' @ [110:54] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'findClass' @ [111:13] ==> private fun findClass(fqName: String, ktFile: KtFile?, project: Project): PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[SimpleFunctionDescriptorImpl]

'it' @ [111:23] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [111:33] ==> public final val AbstractIdeCompiledLightClassTest.project: (Project..Project?)[MyPropertyDescriptor]

'apply' @ [111:43] ==> @InlineOnly public inline fun <T> PsiClass.apply(block: PsiClass.() -> Unit): PsiClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'PsiElementChecker' @ [112:17] ==> public object PsiElementChecker defined in org.jetbrains.kotlin.idea.caches.resolve in file PsiElementChecker.kt[FakeCallableDescriptorForObject]

'checkPsiElementStructure' @ [112:35] ==> public final fun checkPsiElementStructure(lightClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.PsiElementChecker[SimpleFunctionDescriptorImpl]

'this' @ [112:60] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.AbstractIdeCompiledLightClassTest.doTest.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'LightClassTestCommon' @ [119:5] ==> public object LightClassTestCommon defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'testLightClass' @ [119:26] ==> @JvmOverloads public final fun testLightClass(expectedFile: File, testDataFile: File, findLightClass: (String) -> PsiClass?, normalizeText: (String) -> String = ...): Unit defined in org.jetbrains.kotlin.asJava.LightClassTestCommon[DeserializedSimpleFunctionDescriptor]

'expected' @ [120:13] ==> value-parameter expected: File defined in org.jetbrains.kotlin.idea.caches.resolve.testLightClass[ValueParameterDescriptorImpl]

'testData' @ [121:13] ==> value-parameter testData: File defined in org.jetbrains.kotlin.idea.caches.resolve.testLightClass[ValueParameterDescriptorImpl]

'findLightClass' @ [122:13] ==> value-parameter findLightClass: (String) -> PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.testLightClass[ValueParameterDescriptorImpl]

'text' @ [125:17] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.caches.resolve.testLightClass.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [126:26] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [127:26] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [128:26] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [129:26] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [130:26] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'removeLinesStartingWith' @ [131:26] ==> private fun String.removeLinesStartingWith(prefix: String): String defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[SimpleFunctionDescriptorImpl]

'+' @ [131:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'METADATA_FQ_NAME' @ [131:75] ==> public final val METADATA_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'asString' @ [131:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'run' @ [132:26] ==> @InlineOnly public inline fun <T, R> String.run(block: String.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'normalize' @ [132:30] ==> value-parameter normalize: (String) -> String defined in org.jetbrains.kotlin.idea.caches.resolve.testLightClass[ValueParameterDescriptorImpl]

'?:' @ [138:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiClass?, right: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiClass?

'getInstance' @ [138:26] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [138:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.findClass[ValueParameterDescriptorImpl]

'findClass' @ [138:47] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [138:57] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.findClass[ValueParameterDescriptorImpl]

'allScope' @ [138:83] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [138:92] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.findClass[ValueParameterDescriptorImpl]

'findChildrenOfType' @ [139:24] ==> @NotNull public open fun <T : (PsiElement..PsiElement?)> findChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<out (KtClassOrObject..KtClassOrObject?)>): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtClassOrObject

'ktFile' @ [139:43] ==> value-parameter ktFile: KtFile? defined in org.jetbrains.kotlin.idea.caches.resolve.findClass[ValueParameterDescriptorImpl]

'java' @ [139:74] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'find' @ [140:21] ==> @InlineOnly public inline fun <T> Iterable<(KtClassOrObject..KtClassOrObject?)>.find(predicate: ((KtClassOrObject..KtClassOrObject?)) -> Boolean): KtClassOrObject? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'fqName' @ [140:28] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.findClass[ValueParameterDescriptorImpl]

'endsWith' @ [140:35] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [140:44] ==> value-parameter it: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.caches.resolve.findClass.<anonymous>[ValueParameterDescriptorImpl]

'nameAsName' @ [140:47] ==> public final val KtClassOrObject.nameAsName: Name?[MyPropertyDescriptor]

'asString' @ [140:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'let' @ [141:22] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> KtLightClassForSourceDeclaration?): KtLightClassForSourceDeclaration? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> KtLightClassForSourceDeclaration?

'KtLightClassForSourceDeclaration' @ [141:28] ==> public companion object defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[FakeCallableDescriptorForObject]

'create' @ [141:61] ==> public final fun create(classOrObject: KtClassOrObject): KtLightClassForSourceDeclaration? defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [141:68] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.findClass.<anonymous>[ValueParameterDescriptorImpl]

'NONE' @ [154:29] ==> enum entry NONE defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'newLevel' @ [156:21] ==> value-parameter newLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[ValueParameterDescriptorImpl]

'ordinal' @ [156:30] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[DeserializedPropertyDescriptor]

'field' @ [156:41] ==> var field: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[SyntheticFieldDescriptor]

'ordinal' @ [156:47] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[DeserializedPropertyDescriptor]

'error' @ [157:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'level' @ [157:69] ==> private final var level: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'newLevel' @ [157:79] ==> value-parameter newLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[ValueParameterDescriptorImpl]

'allowedLevel' @ [157:99] ==> private final var allowedLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'newLevel' @ [159:21] ==> value-parameter newLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[ValueParameterDescriptorImpl]

'ordinal' @ [159:30] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[DeserializedPropertyDescriptor]

'allowedLevel' @ [159:40] ==> private final var allowedLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'ordinal' @ [159:53] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[DeserializedPropertyDescriptor]

'error' @ [160:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'level' @ [160:69] ==> private final var level: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'newLevel' @ [160:79] ==> value-parameter newLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[ValueParameterDescriptorImpl]

'allowedLevel' @ [160:99] ==> private final var allowedLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'field' @ [162:17] ==> var field: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[SyntheticFieldDescriptor]

'newLevel' @ [162:25] ==> value-parameter newLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.<set-level>[ValueParameterDescriptorImpl]

'NONE' @ [165:36] ==> enum entry NONE defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'fqName' @ [174:17] ==> private final val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'javaFileStub' @ [174:27] ==> value-parameter javaFileStub: PsiJavaFileStub defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.onStubComputed[ValueParameterDescriptorImpl]

'classes' @ [174:40] ==> public final val PsiJavaFileStub.classes: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'single' @ [174:48] ==> public fun <T> Array<out (PsiClass..PsiClass?)>.single(): (PsiClass..PsiClass?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'qualifiedName' @ [174:57] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'context' @ [175:17] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.onStubComputed[ValueParameterDescriptorImpl]

'error' @ [175:63] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'context' @ [175:88] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.onStubComputed[ValueParameterDescriptorImpl]

'level' @ [176:13] ==> private final var level: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'when (context.mode) {
                IDELightClassConstructionContext.Mode.LIGHT -> LIGHT
                IDELightClassConstructionContext.Mode.EXACT -> EXACT
            }' @ [176:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LightClassLazinessChecker.Tracker.Level, entry1: LightClassLazinessChecker.Tracker.Level): LightClassLazinessChecker.Tracker.Level[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Level

'context' @ [176:27] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.onStubComputed[ValueParameterDescriptorImpl]

'mode' @ [176:35] ==> public final val mode: IDELightClassConstructionContext.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext[DeserializedPropertyDescriptor]

'LIGHT' @ [177:55] ==> enum entry LIGHT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'LIGHT' @ [177:64] ==> enum entry LIGHT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'EXACT' @ [178:55] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.IDELightClassConstructionContext.Mode[FakeCallableDescriptorForObject]

'EXACT' @ [178:64] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'assert' @ [183:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'level' @ [183:20] ==> private final var level: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'expectedLevel' @ [183:29] ==> value-parameter expectedLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.checkLevel[ValueParameterDescriptorImpl]

'allowedLevel' @ [187:13] ==> private final var allowedLevel: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[PropertyDescriptorImpl]

'newAllowed' @ [187:28] ==> value-parameter newAllowed: LightClassLazinessChecker.Tracker.Level defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.allowLevel[ValueParameterDescriptorImpl]

'lightClass' @ [193:13] ==> value-parameter lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [193:24] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'isLocal' @ [193:38] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'tracker' @ [195:9] ==> value-parameter tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'allowLevel' @ [195:17] ==> public final fun allowLevel(newAllowed: LightClassLazinessChecker.Tracker.Level): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[SimpleFunctionDescriptorImpl]

'LIGHT' @ [195:28] ==> enum entry LIGHT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'lazinessMode' @ [197:13] ==> value-parameter lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'AllChecks' @ [197:34] ==> enum entry AllChecks defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[FakeCallableDescriptorForObject]

'tracker' @ [198:13] ==> value-parameter tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'allowLevel' @ [198:21] ==> public final fun allowLevel(newAllowed: LightClassLazinessChecker.Tracker.Level): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[SimpleFunctionDescriptorImpl]

'EXACT' @ [198:32] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'LazinessInfo' @ [202:28] ==> public constructor LazinessInfo(lightClass: KtLightClass, lazinessMode: LightClassLazinessChecker.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[ClassConstructorDescriptorImpl]

'lightClass' @ [202:41] ==> value-parameter lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'lazinessMode' @ [202:53] ==> value-parameter lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'tracker' @ [204:9] ==> value-parameter tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'allowLevel' @ [204:17] ==> public final fun allowLevel(newAllowed: LightClassLazinessChecker.Tracker.Level): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[SimpleFunctionDescriptorImpl]

'EXACT' @ [204:28] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'lightClass' @ [206:9] ==> value-parameter lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'clsDelegate' @ [206:20] ==> public abstract val clsDelegate: PsiClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'tracker' @ [208:9] ==> value-parameter tracker: LightClassLazinessChecker.Tracker defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[ValueParameterDescriptorImpl]

'checkLevel' @ [208:17] ==> public final fun checkLevel(expectedLevel: LightClassLazinessChecker.Tracker.Level): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker[SimpleFunctionDescriptorImpl]

'EXACT' @ [208:28] ==> enum entry EXACT defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Tracker.Level[FakeCallableDescriptorForObject]

'lazinessInfo' @ [210:9] ==> val lazinessInfo: LightClassLazinessChecker.LazinessInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.check[LocalVariableDescriptor]

'checkConsistency' @ [210:22] ==> public final fun checkConsistency(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[SimpleFunctionDescriptorImpl]

'classInfo' @ [214:25] ==> private final fun classInfo(psiClass: PsiClass): LightClassLazinessChecker.ClassInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'lightClass' @ [214:35] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'lightClass' @ [215:28] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'fields' @ [215:39] ==> public final val KtLightClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'asList' @ [215:46] ==> public fun <T> Array<out (PsiField..PsiField?)>.asList(): List<(PsiField..PsiField?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'keysToMap' @ [215:55] ==> public fun <K, V> Iterable<(PsiField..PsiField?)>.keysToMap(value: ((PsiField..PsiField?)) -> LightClassLazinessChecker.FieldInfo): Map<(PsiField..PsiField?), LightClassLazinessChecker.FieldInfo> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <V> -> FieldInfo

'fieldInfo' @ [215:67] ==> private final fun fieldInfo(field: PsiField): LightClassLazinessChecker.FieldInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'it' @ [215:77] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.fieldsToInfo.<anonymous>[ValueParameterDescriptorImpl]

'lightClass' @ [216:29] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'methods' @ [216:40] ==> public final val KtLightClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'asList' @ [216:48] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asList(): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'keysToMap' @ [216:57] ==> public fun <K, V> Iterable<(PsiMethod..PsiMethod?)>.keysToMap(value: ((PsiMethod..PsiMethod?)) -> LightClassLazinessChecker.MethodInfo): Map<(PsiMethod..PsiMethod?), LightClassLazinessChecker.MethodInfo> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <V> -> MethodInfo

'methodInfo' @ [216:69] ==> private final fun methodInfo(method: PsiMethod, lazinessMode: LightClassLazinessChecker.Mode): LightClassLazinessChecker.MethodInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'it' @ [216:80] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.methodsToInfo.<anonymous>[ValueParameterDescriptorImpl]

'lazinessMode' @ [216:84] ==> private final val lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'lightClass' @ [217:28] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'innerClasses' @ [217:39] ==> public final val KtLightClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'map' @ [217:52] ==> public inline fun <T, R> Array<out (PsiClass..PsiClass?)>.map(transform: ((PsiClass..PsiClass?)) -> LightClassLazinessChecker.LazinessInfo): List<LightClassLazinessChecker.LazinessInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R> -> LazinessInfo

'LazinessInfo' @ [217:58] ==> public constructor LazinessInfo(lightClass: KtLightClass, lazinessMode: LightClassLazinessChecker.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[ClassConstructorDescriptorImpl]

'it' @ [217:71] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.innerClasses.<anonymous>[ValueParameterDescriptorImpl]

'lazinessMode' @ [217:91] ==> private final val lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'lazinessMode' @ [221:17] ==> private final val lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'NoConsistency' @ [221:38] ==> enum entry NoConsistency defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[FakeCallableDescriptorForObject]

'component1' @ [224:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiField..PsiField?), LightClassLazinessChecker.FieldInfo>.component1(): (PsiField..PsiField?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <V> -> FieldInfo

'component2' @ [224:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiField..PsiField?), LightClassLazinessChecker.FieldInfo>.component2(): LightClassLazinessChecker.FieldInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <V> -> FieldInfo

'fieldsToInfo' @ [224:45] ==> public final val fieldsToInfo: Map<(PsiField..PsiField?), LightClassLazinessChecker.FieldInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'field' @ [225:33] ==> val field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'clsDelegate' @ [225:56] ==> public abstract val clsDelegate: PsiField defined in org.jetbrains.kotlin.asJava.elements.KtLightField[DeserializedPropertyDescriptor]

'assertEquals' @ [226:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: LightClassLazinessChecker.FieldInfo, actual: LightClassLazinessChecker.FieldInfo, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> FieldInfo

'fieldInfo' @ [226:30] ==> private final fun fieldInfo(field: PsiField): LightClassLazinessChecker.FieldInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'delegate' @ [226:40] ==> val delegate: PsiField defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'lightFieldInfo' @ [226:51] ==> val lightFieldInfo: LightClassLazinessChecker.FieldInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'checkAnnotationConsistency' @ [227:17] ==> private final fun checkAnnotationConsistency(modifierListOwner: KtLightElement<*, PsiModifierListOwner>): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'field' @ [227:44] ==> val field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'component1' @ [229:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiMethod..PsiMethod?), LightClassLazinessChecker.MethodInfo>.component1(): (PsiMethod..PsiMethod?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <V> -> MethodInfo

'component2' @ [229:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(PsiMethod..PsiMethod?), LightClassLazinessChecker.MethodInfo>.component2(): LightClassLazinessChecker.MethodInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <V> -> MethodInfo

'methodsToInfo' @ [229:47] ==> public final val methodsToInfo: Map<(PsiMethod..PsiMethod?), LightClassLazinessChecker.MethodInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'method' @ [230:33] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'clsDelegate' @ [230:58] ==> public abstract val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'assertEquals' @ [231:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: LightClassLazinessChecker.MethodInfo, actual: LightClassLazinessChecker.MethodInfo, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> MethodInfo

'methodInfo' @ [231:30] ==> private final fun methodInfo(method: PsiMethod, lazinessMode: LightClassLazinessChecker.Mode): LightClassLazinessChecker.MethodInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'delegate' @ [231:41] ==> val delegate: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'lazinessMode' @ [231:51] ==> private final val lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'lightMethodInfo' @ [231:66] ==> val lightMethodInfo: LightClassLazinessChecker.MethodInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'checkAnnotationConsistency' @ [232:17] ==> private final fun checkAnnotationConsistency(modifierListOwner: KtLightElement<*, PsiModifierListOwner>): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'method' @ [232:44] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'method' @ [233:17] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency[LocalVariableDescriptor]

'parameterList' @ [233:24] ==> public final val KtLightMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [233:38] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'forEach' @ [233:49] ==> public inline fun <T> Array<out (PsiParameter..PsiParameter?)>.forEach(action: ((PsiParameter..PsiParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'checkAnnotationConsistency' @ [234:21] ==> private final fun checkAnnotationConsistency(modifierListOwner: KtLightElement<*, PsiModifierListOwner>): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'it' @ [234:48] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo.checkConsistency.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [238:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: LightClassLazinessChecker.ClassInfo, actual: LightClassLazinessChecker.ClassInfo, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ClassInfo

'classInfo' @ [238:26] ==> private final fun classInfo(psiClass: PsiClass): LightClassLazinessChecker.ClassInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'lightClass' @ [238:36] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'clsDelegate' @ [238:47] ==> public abstract val clsDelegate: PsiClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'classInfo' @ [238:61] ==> public final val classInfo: LightClassLazinessChecker.ClassInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'checkAnnotationConsistency' @ [239:13] ==> private final fun checkAnnotationConsistency(modifierListOwner: KtLightElement<*, PsiModifierListOwner>): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'lightClass' @ [239:40] ==> private final val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'innerClasses' @ [241:13] ==> public final val innerClasses: List<LightClassLazinessChecker.LazinessInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[PropertyDescriptorImpl]

'forEach' @ [241:26] ==> @HidesMembers public inline fun <T> Iterable<LightClassLazinessChecker.LazinessInfo>.forEach(action: (LightClassLazinessChecker.LazinessInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LazinessInfo

'LazinessInfo' @ [241:34] ==> public constructor LazinessInfo(lightClass: KtLightClass, lazinessMode: LightClassLazinessChecker.Mode) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.LazinessInfo[ClassConstructorDescriptorImpl]

'modifierListOwner' @ [246:13] ==> value-parameter modifierListOwner: KtLightElement<*, PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency[ValueParameterDescriptorImpl]

'modifierListOwner' @ [248:9] ==> value-parameter modifierListOwner: KtLightElement<*, PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency[ValueParameterDescriptorImpl]

'clsDelegate' @ [248:27] ==> public abstract val clsDelegate: PsiModifierListOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'modifierList' @ [248:39] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'annotations' @ [248:54] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'groupBy' @ [248:66] ==> public inline fun <T, K> Array<out (PsiAnnotation..PsiAnnotation?)>.groupBy(keySelector: ((PsiAnnotation..PsiAnnotation?)) -> String): Map<String, List<(PsiAnnotation..PsiAnnotation?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)
    <K> -> String

'delegateAnnotation' @ [249:13] ==> value-parameter delegateAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [249:32] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'map' @ [250:11] ==> public inline fun <K, V, R> Map<out String, List<(PsiAnnotation..PsiAnnotation?)>>.map(transform: (Map.Entry<String, List<(PsiAnnotation..PsiAnnotation?)>>) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<(com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)>
    <R> -> Unit

'component1' @ [251:14] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<(PsiAnnotation..PsiAnnotation?)>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<(com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)>

'component2' @ [251:22] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<(PsiAnnotation..PsiAnnotation?)>>.component2(): List<(PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<(com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)>

'modifierListOwner' @ [253:37] ==> value-parameter modifierListOwner: KtLightElement<*, PsiModifierListOwner> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency[ValueParameterDescriptorImpl]

'modifierList' @ [253:82] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'annotations' @ [253:96] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'filter' @ [253:109] ==> public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.filter(predicate: ((PsiAnnotation..PsiAnnotation?)) -> Boolean): List<(PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'it' @ [253:118] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [253:121] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [253:138] ==> val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'orEmpty' @ [253:147] ==> @InlineOnly public inline fun <T> List<(PsiAnnotation..PsiAnnotation?)>?.orEmpty(): List<(PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'if (fqName != Nullable::class.java.name && fqName != NotNull::class.java.name) {
                assertEquals(clsAnnotations.size, lightAnnotations.size, "Missing $fqName annotation")
            }
            else {
                // having duplicating nullability annotations is fine
                // see KtLightNullabilityAnnotation
                assertTrue(lightAnnotations.isNotEmpty(), "Missing $fqName annotation")
            }' @ [254:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fqName' @ [254:17] ==> val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'Nullable' @ [254:27] ==> public constructor Nullable(value: String = ...) defined in org.jetbrains.annotations.Nullable[JavaClassConstructorDescriptor]

'java' @ [254:43] ==> public val <T> KClass<Nullable>.java: Class<Nullable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Nullable

'name' @ [254:48] ==> public final val <T : (Any..Any?)> Class<Nullable>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Nullable

'fqName' @ [254:56] ==> val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'NotNull' @ [254:66] ==> public constructor NotNull(value: String = ..., exception: KClass<out (Exception..Exception?)> = ...) defined in org.jetbrains.annotations.NotNull[JavaClassConstructorDescriptor]

'java' @ [254:81] ==> public val <T> KClass<NotNull>.java: Class<NotNull> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NotNull

'name' @ [254:86] ==> public final val <T : (Any..Any?)> Class<NotNull>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NotNull

'assertEquals' @ [255:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'clsAnnotations' @ [255:30] ==> val clsAnnotations: List<(PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'size' @ [255:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lightAnnotations' @ [255:51] ==> val lightAnnotations: List<(PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'size' @ [255:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fqName' @ [255:84] ==> val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [260:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lightAnnotations' @ [260:28] ==> val lightAnnotations: List<(PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [260:45] ==> @InlineOnly public inline fun <T> Collection<(PsiAnnotation..PsiAnnotation?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'fqName' @ [260:69] ==> val fqName: String defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'clsAnnotations' @ [262:13] ==> val clsAnnotations: List<(PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'zip' @ [262:28] ==> public infix fun <T, R> Iterable<(PsiAnnotation..PsiAnnotation?)>.zip(other: Iterable<(PsiAnnotation..PsiAnnotation?)>): List<Pair<(PsiAnnotation..PsiAnnotation?), (PsiAnnotation..PsiAnnotation?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)
    <R> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'lightAnnotations' @ [262:32] ==> val lightAnnotations: List<(PsiAnnotation..PsiAnnotation?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>[LocalVariableDescriptor]

'forEach' @ [262:50] ==> @HidesMembers public inline fun <T> Iterable<Pair<(PsiAnnotation..PsiAnnotation?), (PsiAnnotation..PsiAnnotation?)>>.forEach(action: (Pair<(PsiAnnotation..PsiAnnotation?), (PsiAnnotation..PsiAnnotation?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?), (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)>

'component1' @ [263:18] ==> public final operator fun component1(): (PsiAnnotation..PsiAnnotation?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [263:33] ==> public final operator fun component2(): (PsiAnnotation..PsiAnnotation?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [264:17] ==> public fun <T : Any> assertNotNull(actual: PsiJavaCodeReferenceElement?, message: String? = ...): PsiJavaCodeReferenceElement defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiJavaCodeReferenceElement

'lightAnnotation' @ [264:31] ==> val lightAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'nameReferenceElement' @ [264:49] ==> public final val PsiAnnotation.nameReferenceElement: PsiJavaCodeReferenceElement?[MyPropertyDescriptor]

'lightAnnotation' @ [265:21] ==> val lightAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [266:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String?>, actual: List<String?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'clsAnnotation' @ [266:34] ==> val clsAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'values' @ [266:48] ==> private final fun PsiAnnotation.values(): List<String?> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'lightAnnotation' @ [266:58] ==> val lightAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'values' @ [266:74] ==> private final fun PsiAnnotation.values(): List<String?> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'assertEquals' @ [267:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (PsiAnnotation..PsiAnnotation?), actual: (PsiAnnotation..PsiAnnotation?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'clsAnnotation' @ [267:34] ==> val clsAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lightAnnotation' @ [267:49] ==> val lightAnnotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkAnnotationConsistency.<anonymous>.<anonymous>[LocalVariableDescriptor]

'clsDelegate' @ [267:65] ==> public open val clsDelegate: PsiAnnotation defined in org.jetbrains.kotlin.asJava.elements.KtLightAbstractAnnotation[DeserializedPropertyDescriptor]

'parameterList' @ [273:42] ==> public final val PsiAnnotation.parameterList: PsiAnnotationParameterList[MyPropertyDescriptor]

'attributes' @ [273:56] ==> public final val PsiAnnotationParameterList.attributes: (Array<(PsiNameValuePair..PsiNameValuePair?)>..Array<out (PsiNameValuePair..PsiNameValuePair?)>)[MyPropertyDescriptor]

'map' @ [273:67] ==> public inline fun <T, R> Array<out (PsiNameValuePair..PsiNameValuePair?)>.map(transform: ((PsiNameValuePair..PsiNameValuePair?)) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiNameValuePair..com.intellij.psi.PsiNameValuePair?)
    <R> -> String?

'it' @ [273:73] ==> value-parameter it: (PsiNameValuePair..PsiNameValuePair?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.values.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [273:76] ==> public final val PsiNameValuePair.value: PsiAnnotationMemberValue?[MyPropertyDescriptor]

'stringValue' @ [273:82] ==> public fun PsiAnnotationMemberValue?.stringValue(): String? defined in org.jetbrains.plugins.groovy.lang.psi.impl[DeserializedSimpleFunctionDescriptor]

'with' @ [281:49] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiClass, block: PsiClass.() -> LightClassLazinessChecker.ClassInfo): LightClassLazinessChecker.ClassInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> ClassInfo

'psiClass' @ [281:54] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.classInfo[ValueParameterDescriptorImpl]

'checkModifierList' @ [282:9] ==> private final fun checkModifierList(modifierList: PsiModifierList): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'modifierList' @ [282:27] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'ClassInfo' @ [283:9] ==> public constructor ClassInfo(fieldNames: Collection<String>, methodNames: Collection<String>, modifiers: List<String>) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.ClassInfo[ClassConstructorDescriptorImpl]

'fields' @ [283:19] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'names' @ [283:26] ==> private final fun Array<out PsiMember>.names(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'methods' @ [283:35] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'names' @ [283:43] ==> private final fun Array<out PsiMember>.names(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'MODIFIERS' @ [283:64] ==> public final val MODIFIERS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'asList' @ [283:74] ==> public fun <T> Array<out (String..String?)>.asList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [283:83] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'modifierList' @ [283:92] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'hasModifierProperty' @ [283:107] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'it' @ [283:127] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.classInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'with' @ [291:46] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiField, block: PsiField.() -> LightClassLazinessChecker.FieldInfo): LightClassLazinessChecker.FieldInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField
    <R> -> FieldInfo

'field' @ [291:51] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.fieldInfo[ValueParameterDescriptorImpl]

'checkModifierList' @ [292:9] ==> private final fun checkModifierList(modifierList: PsiModifierList): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'modifierList' @ [292:27] ==> public final val PsiField.modifierList: PsiModifierList?[MyPropertyDescriptor]

'FieldInfo' @ [294:9] ==> public constructor FieldInfo(name: String, modifiers: List<String>) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.FieldInfo[ClassConstructorDescriptorImpl]

'name' @ [295:17] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'MODIFIERS' @ [295:37] ==> public final val MODIFIERS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'asList' @ [295:47] ==> public fun <T> Array<out (String..String?)>.asList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [295:56] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'modifierList' @ [295:65] ==> public final val PsiField.modifierList: PsiModifierList?[MyPropertyDescriptor]

'hasModifierProperty' @ [295:80] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'it' @ [295:100] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.fieldInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'with' @ [307:69] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiMethod, block: PsiMethod.() -> LightClassLazinessChecker.MethodInfo): LightClassLazinessChecker.MethodInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> MethodInfo

'method' @ [307:74] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.methodInfo[ValueParameterDescriptorImpl]

'checkModifierList' @ [308:9] ==> private final fun checkModifierList(modifierList: PsiModifierList): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'method' @ [308:27] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.methodInfo[ValueParameterDescriptorImpl]

'modifierList' @ [308:34] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'MethodInfo' @ [310:9] ==> public constructor MethodInfo(name: String, modifiers: List<String>, isConstructor: Boolean, parameterCount: Int, isVarargs: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.MethodInfo[ClassConstructorDescriptorImpl]

'name' @ [311:17] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'relevantModifiers' @ [311:23] ==> private final fun PsiMethod.relevantModifiers(lazinessMode: LightClassLazinessChecker.Mode): List<(String..String?)> defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker[SimpleFunctionDescriptorImpl]

'lazinessMode' @ [311:41] ==> value-parameter lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.methodInfo[ValueParameterDescriptorImpl]

'isConstructor' @ [312:17] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [312:32] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.methodInfo[ValueParameterDescriptorImpl]

'parameterList' @ [312:39] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [312:53] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'isVarArgs' @ [312:70] ==> public final val PsiMethod.isVarArgs: Boolean[MyPropertyDescriptor]

'when {
        containingClass!!.isInterface -> PsiModifier.MODIFIERS.filter {
            // we have custom strategy for interface members with implementation
            it !in modifiersHackedForInterfaceMembersWithImplementation
        }
        else -> PsiModifier.MODIFIERS.asList()
    }' @ [316:67] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(String..String?)>, entry1: List<(String..String?)>): List<(String..String?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(kotlin.String..kotlin.String?)>

'containingClass' @ [317:9] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'isInterface' @ [317:27] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'MODIFIERS' @ [317:54] ==> public final val MODIFIERS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'filter' @ [317:64] ==> public inline fun <T> Array<out (String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [319:13] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.relevantModifiers.<anonymous>[ValueParameterDescriptorImpl]

'modifiersHackedForInterfaceMembersWithImplementation' @ [319:20] ==> private val modifiersHackedForInterfaceMembersWithImplementation: List<String> defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[PropertyDescriptorImpl]

'MODIFIERS' @ [321:29] ==> public final val MODIFIERS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'asList' @ [321:39] ==> public fun <T> Array<out (String..String?)>.asList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'filter' @ [322:7] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'lazinessMode' @ [324:9] ==> value-parameter lazinessMode: LightClassLazinessChecker.Mode defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.relevantModifiers[ValueParameterDescriptorImpl]

'NoLaziness' @ [324:30] ==> enum entry NoLaziness defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.Mode[FakeCallableDescriptorForObject]

'it' @ [324:44] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.relevantModifiers.<anonymous>[ValueParameterDescriptorImpl]

'visibilityModifiers' @ [324:51] ==> private val visibilityModifiers: List<String> defined in org.jetbrains.kotlin.idea.caches.resolve in file AbstractIdeLightClassTest.kt[PropertyDescriptorImpl]

'filter' @ [325:7] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'modifierList' @ [325:16] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'hasModifierProperty' @ [325:29] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'it' @ [325:49] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.relevantModifiers.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [329:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'modifierList' @ [329:34] ==> value-parameter modifierList: PsiModifierList defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkModifierList[ValueParameterDescriptorImpl]

'parent' @ [329:47] ==> public final val PsiModifierList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isAnnotationType' @ [329:69] ==> public final val PsiClass.isAnnotationType: Boolean[MyPropertyDescriptor]

'!' @ [331:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationClass' @ [331:14] ==> val isAnnotationClass: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkModifierList[LocalVariableDescriptor]

'modifierList' @ [333:13] ==> value-parameter modifierList: PsiModifierList defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkModifierList[ValueParameterDescriptorImpl]

'annotations' @ [333:26] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'modifierList' @ [336:13] ==> value-parameter modifierList: PsiModifierList defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.checkModifierList[ValueParameterDescriptorImpl]

'findAnnotation' @ [336:26] ==> @Nullable public abstract fun findAnnotation(@NotNull @NonNls p0: String): PsiAnnotation? defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'mapTo' @ [340:48] ==> public inline fun <T, R, C : MutableCollection<in String>> Array<out PsiMember>.mapTo(destination: LinkedHashSet<String> /* = LinkedHashSet<String> */, transform: (PsiMember) -> String): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMember
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'LinkedHashSet' @ [340:54] ==> public final fun <E> <init>(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'it' @ [340:73] ==> value-parameter it: PsiMember defined in org.jetbrains.kotlin.idea.caches.resolve.LightClassLazinessChecker.names.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [340:76] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'listOf' @ [343:68] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ABSTRACT' @ [343:87] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'DEFAULT' @ [343:109] ==> public const final val DEFAULT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'listOf' @ [344:35] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PRIVATE' @ [344:54] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PROTECTED' @ [344:75] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PUBLIC' @ [344:98] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'lines' @ [347:12] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filterNot' @ [347:20] ==> public inline fun <T> Iterable<String>.filterNot(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [347:32] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.removeLinesStartingWith.<anonymous>[ValueParameterDescriptorImpl]

'trimStart' @ [347:35] ==> @InlineOnly public inline fun String.trimStart(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [347:47] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [347:58] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.caches.resolve.removeLinesStartingWith[ValueParameterDescriptorImpl]

'joinToString' @ [347:68] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

