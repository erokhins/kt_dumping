'KotlinLightCodeInsightFixtureTestCase' @ [35:40] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'getTestName' @ [37:24] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'when {
            testName.endsWith("WithAnnotation") -> KotlinLightProjectDescriptor.INSTANCE
            testName.endsWith("WithRuntime") -> KotlinWithJdkAndRuntimeLightProjectDescriptor.INSTANCE
            else -> KotlinLightCodeInsightFixtureTestCaseBase.JAVA_LATEST
        }' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LightProjectDescriptor, entry1: LightProjectDescriptor, entry2: LightProjectDescriptor): LightProjectDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LightProjectDescriptor

'testName' @ [39:13] ==> val testName: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.getProjectDescriptor[LocalVariableDescriptor]

'endsWith' @ [39:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [39:81] ==> public final val INSTANCE: (KotlinLightProjectDescriptor..KotlinLightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightProjectDescriptor[JavaPropertyDescriptor]

'testName' @ [40:13] ==> val testName: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.getProjectDescriptor[LocalVariableDescriptor]

'endsWith' @ [40:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [40:95] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'JAVA_LATEST' @ [41:63] ==> public final val JAVA_LATEST: (LightProjectDescriptor..LightProjectDescriptor?) defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaPropertyDescriptor]

'Language' @ [53:13] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'Language' @ [53:47] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'javaText' @ [56:13] ==> value-parameter @Language javaText: String? = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'myFixture' @ [57:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'configureByText' @ [57:23] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'getTestName' @ [57:42] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'javaText' @ [57:68] ==> value-parameter @Language javaText: String? = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'trimIndent' @ [57:77] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [60:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'configureByText' @ [60:19] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'getTestName' @ [60:38] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'text' @ [60:62] ==> value-parameter @Language text: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'trimIndent' @ [60:67] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertInjectionPresent' @ [62:9] ==> protected final fun assertInjectionPresent(languageId: String?, unInjectShouldBePresent: Boolean): Unit defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[SimpleFunctionDescriptorImpl]

'languageId' @ [62:32] ==> value-parameter languageId: String? = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'unInjectShouldBePresent' @ [62:44] ==> value-parameter unInjectShouldBePresent: Boolean = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'shreds' @ [64:13] ==> value-parameter shreds: List<AbstractInjectionTest.ShredInfo>? = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'editor' @ [65:33] ==> public final val AbstractInjectionTest.editor: Editor[MyPropertyDescriptor]

'document' @ [65:40] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'shreds' @ [65:72] ==> public final var DocumentWindowImpl.shreds: Place[MyPropertyDescriptor]

'map' @ [65:79] ==> public inline fun <T, R> Iterable<(PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?)>.map(transform: ((PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?)) -> AbstractInjectionTest.ShredInfo): List<AbstractInjectionTest.ShredInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiLanguageInjectionHost.Shred..com.intellij.psi.PsiLanguageInjectionHost.Shred?)
    <R> -> ShredInfo

'ShredInfo' @ [66:17] ==> public constructor ShredInfo(range: TextRange, hostRange: TextRange, prefix: String = ..., suffix: String = ...) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.ShredInfo[ClassConstructorDescriptorImpl]

'it' @ [66:27] ==> value-parameter it: (PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [66:30] ==> public final val PsiLanguageInjectionHost.Shred.range: TextRange[MyPropertyDescriptor]

'it' @ [66:37] ==> value-parameter it: (PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'rangeInsideHost' @ [66:40] ==> public final val PsiLanguageInjectionHost.Shred.rangeInsideHost: TextRange[MyPropertyDescriptor]

'it' @ [66:57] ==> value-parameter it: (PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'prefix' @ [66:60] ==> public final val PsiLanguageInjectionHost.Shred.prefix: String[MyPropertyDescriptor]

'it' @ [66:68] ==> value-parameter it: (PsiLanguageInjectionHost.Shred..PsiLanguageInjectionHost.Shred?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'suffix' @ [66:71] ==> public final val PsiLanguageInjectionHost.Shred.suffix: String[MyPropertyDescriptor]

'assertOrderedEquals' @ [69:13] ==> public open fun <T : (Any..Any?)> assertOrderedEquals(@NotNull p0: (MutableIterable<(AbstractInjectionTest.ShredInfo..AbstractInjectionTest.ShredInfo?)>..Iterable<(AbstractInjectionTest.ShredInfo..AbstractInjectionTest.ShredInfo?)>), @NotNull p1: (MutableCollection<out (AbstractInjectionTest.ShredInfo..AbstractInjectionTest.ShredInfo?)>..Collection<(AbstractInjectionTest.ShredInfo..AbstractInjectionTest.ShredInfo?)>)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ShredInfo

'actualShreds' @ [70:21] ==> val actualShreds: List<AbstractInjectionTest.ShredInfo> defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[LocalVariableDescriptor]

'sortedBy' @ [70:34] ==> public inline fun <T, R : Comparable<Int>> Iterable<AbstractInjectionTest.ShredInfo>.sortedBy(crossinline selector: (AbstractInjectionTest.ShredInfo) -> Int?): List<AbstractInjectionTest.ShredInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShredInfo
    <R : Comparable<R>> -> Int

'it' @ [70:45] ==> value-parameter it: AbstractInjectionTest.ShredInfo defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [70:48] ==> public final val range: TextRange defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.ShredInfo[PropertyDescriptorImpl]

'startOffset' @ [70:54] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'shreds' @ [71:21] ==> value-parameter shreds: List<AbstractInjectionTest.ShredInfo>? = ... defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest[ValueParameterDescriptorImpl]

'sortedBy' @ [71:28] ==> public inline fun <T, R : Comparable<Int>> Iterable<AbstractInjectionTest.ShredInfo>.sortedBy(crossinline selector: (AbstractInjectionTest.ShredInfo) -> Int?): List<AbstractInjectionTest.ShredInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShredInfo
    <R : Comparable<R>> -> Int

'it' @ [71:39] ==> value-parameter it: AbstractInjectionTest.ShredInfo defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doInjectionPresentTest.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [71:42] ==> public final val range: TextRange defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.ShredInfo[PropertyDescriptorImpl]

'startOffset' @ [71:48] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'assertFalse' @ [76:18] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'InjectLanguageAction' @ [77:30] ==> public constructor InjectLanguageAction() defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaClassConstructorDescriptor]

'isAvailable' @ [77:53] ==> public open fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaMethodDescriptor]

'project' @ [77:65] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [77:74] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [77:84] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [77:92] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [77:102] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'languageId' @ [79:13] ==> value-parameter languageId: String? defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.assertInjectionPresent[ValueParameterDescriptorImpl]

'editor' @ [80:33] ==> public final val AbstractInjectionTest.editor: Editor[MyPropertyDescriptor]

'injectedFile' @ [80:59] ==> public final val EditorWindow.injectedFile: PsiFile[MyPropertyDescriptor]

'assertEquals' @ [81:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'languageId' @ [81:54] ==> value-parameter languageId: String? defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.assertInjectionPresent[ValueParameterDescriptorImpl]

'injectedFile' @ [81:66] ==> val injectedFile: PsiFile? defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.assertInjectionPresent[LocalVariableDescriptor]

'language' @ [81:80] ==> public final val PsiFile.language: Language[MyPropertyDescriptor]

'id' @ [81:90] ==> public final val Language.id: String[MyPropertyDescriptor]

'unInjectShouldBePresent' @ [84:13] ==> value-parameter unInjectShouldBePresent: Boolean defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.assertInjectionPresent[ValueParameterDescriptorImpl]

'assertTrue' @ [85:22] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'UnInjectLanguageAction' @ [86:33] ==> public constructor UnInjectLanguageAction() defined in org.intellij.plugins.intelliLang.inject.UnInjectLanguageAction[JavaClassConstructorDescriptor]

'isAvailable' @ [86:58] ==> public open fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in org.intellij.plugins.intelliLang.inject.UnInjectLanguageAction[JavaMethodDescriptor]

'project' @ [86:70] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [86:79] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [86:89] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [86:97] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [86:107] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'Language' @ [90:37] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'myFixture' @ [91:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'configureByText' @ [91:19] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'getTestName' @ [91:38] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'text' @ [91:62] ==> value-parameter @Language text: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.assertNoInjection[ValueParameterDescriptorImpl]

'trimIndent' @ [91:67] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [93:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'InjectLanguageAction' @ [94:29] ==> public constructor InjectLanguageAction() defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaClassConstructorDescriptor]

'isAvailable' @ [94:52] ==> public open fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaMethodDescriptor]

'project' @ [94:64] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [94:73] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [94:83] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [94:91] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [94:101] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'Language' @ [97:41] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'Language' @ [97:77] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'myFixture' @ [98:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'setCaresAboutInjection' @ [98:19] ==> public abstract fun setCaresAboutInjection(p0: Boolean): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'myFixture' @ [100:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'configureByText' @ [100:19] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'getTestName' @ [100:38] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'before' @ [100:62] ==> value-parameter @Language before: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doRemoveInjectionTest[ValueParameterDescriptorImpl]

'trimIndent' @ [100:69] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [102:18] ==> public open fun assertTrue(p0: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'UnInjectLanguageAction' @ [102:29] ==> public constructor UnInjectLanguageAction() defined in org.intellij.plugins.intelliLang.inject.UnInjectLanguageAction[JavaClassConstructorDescriptor]

'isAvailable' @ [102:54] ==> public open fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in org.intellij.plugins.intelliLang.inject.UnInjectLanguageAction[JavaMethodDescriptor]

'project' @ [102:66] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [102:75] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [102:85] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [102:93] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [102:103] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'invokeImpl' @ [103:32] ==> public open fun invokeImpl(p0: (Project..Project?), p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Unit defined in org.intellij.plugins.intelliLang.inject.UnInjectLanguageAction[JavaMethodDescriptor]

'project' @ [103:43] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [103:52] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [103:62] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [103:70] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [103:80] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'myFixture' @ [105:9] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'checkResult' @ [105:19] ==> public abstract fun checkResult(@NotNull p0: String): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'after' @ [105:31] ==> value-parameter @Language after: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doRemoveInjectionTest[ValueParameterDescriptorImpl]

'trimIndent' @ [105:37] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Language' @ [108:45] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'Language' @ [108:81] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'doTest' @ [109:9] ==> protected final fun doTest(injectable: Injectable, @Language before: String, @Language after: String): Unit defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[SimpleFunctionDescriptorImpl]

'FileReferenceInjector' @ [109:16] ==> public constructor FileReferenceInjector() defined in org.intellij.plugins.intelliLang.references.FileReferenceInjector[JavaClassConstructorDescriptor]

'before' @ [109:41] ==> value-parameter @Language before: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doFileReferenceInjectTest[ValueParameterDescriptorImpl]

'after' @ [109:49] ==> value-parameter @Language after: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doFileReferenceInjectTest[ValueParameterDescriptorImpl]

'Language' @ [112:50] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'Language' @ [112:86] ==> public constructor Language(value: String, prefix: String = ..., suffix: String = ...) defined in org.intellij.lang.annotations.Language[JavaClassConstructorDescriptor]

'getProjectInstance' @ [113:43] ==> public open fun getProjectInstance(p0: (Project..Project?)): (Configuration..Configuration?) defined in org.intellij.plugins.intelliLang.Configuration[JavaMethodDescriptor]

'project' @ [113:62] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'advancedConfiguration' @ [113:71] ==> public final val Configuration.advancedConfiguration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?)[MyPropertyDescriptor]

'configuration' @ [114:23] ==> val configuration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[LocalVariableDescriptor]

'isSourceModificationAllowed' @ [114:37] ==> public final var Configuration.AdvancedConfiguration.isSourceModificationAllowed: Boolean[MyPropertyDescriptor]

'configuration' @ [116:9] ==> val configuration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[LocalVariableDescriptor]

'isSourceModificationAllowed' @ [116:23] ==> public final var Configuration.AdvancedConfiguration.isSourceModificationAllowed: Boolean[MyPropertyDescriptor]

'myFixture' @ [118:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'configureByText' @ [118:23] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'getTestName' @ [118:42] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaMethodDescriptor]

'before' @ [118:66] ==> value-parameter @Language before: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[ValueParameterDescriptorImpl]

'trimIndent' @ [118:73] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invokeImpl' @ [119:34] ==> public open fun invokeImpl(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?), p3: (Injectable..Injectable?)): Unit defined in org.intellij.plugins.intelliLang.inject.InjectLanguageAction[JavaMethodDescriptor]

'project' @ [119:45] ==> public final val AbstractInjectionTest.project: Project[MyPropertyDescriptor]

'myFixture' @ [119:54] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'editor' @ [119:64] ==> public final val JavaCodeInsightTestFixture.editor: (Editor..Editor?)[MyPropertyDescriptor]

'myFixture' @ [119:72] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'file' @ [119:82] ==> public final val JavaCodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'injectable' @ [119:88] ==> value-parameter injectable: Injectable defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[ValueParameterDescriptorImpl]

'myFixture' @ [120:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest[JavaPropertyDescriptor]

'checkResult' @ [120:23] ==> public abstract fun checkResult(@NotNull p0: String): Unit defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'after' @ [120:35] ==> value-parameter @Language after: String defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[ValueParameterDescriptorImpl]

'trimIndent' @ [120:41] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'configuration' @ [123:13] ==> val configuration: (Configuration.AdvancedConfiguration..Configuration.AdvancedConfiguration?) defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[LocalVariableDescriptor]

'isSourceModificationAllowed' @ [123:27] ==> public final var Configuration.AdvancedConfiguration.isSourceModificationAllowed: Boolean[MyPropertyDescriptor]

'allowed' @ [123:57] ==> val allowed: Boolean defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.doTest[LocalVariableDescriptor]

'create' @ [127:49] ==> @NotNull public open fun create(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'start' @ [127:56] ==> value-parameter start: Int defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.range[ValueParameterDescriptorImpl]

'end' @ [127:63] ==> value-parameter end: Int defined in org.jetbrains.kotlin.psi.AbstractInjectionTest.range[ValueParameterDescriptorImpl]

