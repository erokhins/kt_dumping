'KotlinLightCodeInsightFixtureTestCase' @ [26:40] ==> public constructor KotlinLightCodeInsightFixtureTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[ClassConstructorDescriptorImpl]

'super' @ [31:9] ==> <this> defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [31:15] ==> protected open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'savedImportsOnPasteSetting' @ [32:9] ==> private final var savedImportsOnPasteSetting: Int defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[PropertyDescriptorImpl]

'getInstance' @ [32:58] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'ADD_IMPORTS_ON_PASTE' @ [32:72] ==> public final var ADD_IMPORTS_ON_PASTE: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'getInstance' @ [33:29] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'ADD_IMPORTS_ON_PASTE' @ [33:43] ==> public final var ADD_IMPORTS_ON_PASTE: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'YES' @ [33:86] ==> public const final val YES: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'getInstance' @ [37:29] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'ADD_IMPORTS_ON_PASTE' @ [37:43] ==> public final var ADD_IMPORTS_ON_PASTE: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'savedImportsOnPasteSetting' @ [37:66] ==> private final var savedImportsOnPasteSetting: Int defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[PropertyDescriptorImpl]

'super' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [38:15] ==> protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase[SimpleFunctionDescriptorImpl]

'File' @ [42:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [42:25] ==> protected for synthetic extension final val AbstractCopyPasteTest.testDataPath: String[MyPropertyDescriptor]

'separator' @ [42:45] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'dependencyFileName' @ [42:57] ==> value-parameter dependencyFileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureByDependencyIfExists[ValueParameterDescriptorImpl]

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [43:14] ==> val file: File defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureByDependencyIfExists[LocalVariableDescriptor]

'exists' @ [43:19] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'if (dependencyFileName.endsWith(".java")) {
            //allow test framework to put it under right directory
            myFixture.addClass(FileUtil.loadFile(file, true)).containingFile
        }
        else {
            myFixture.configureByFile(dependencyFileName)
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiFile?, elseBranch: PsiFile?): PsiFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiFile?

'dependencyFileName' @ [44:20] ==> value-parameter dependencyFileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureByDependencyIfExists[ValueParameterDescriptorImpl]

'endsWith' @ [44:39] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [46:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[JavaPropertyDescriptor]

'addClass' @ [46:23] ==> public abstract fun addClass(@NotNull @NonNls @Language p0: String): (PsiClass..PsiClass?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'loadFile' @ [46:41] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'file' @ [46:50] ==> val file: File defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureByDependencyIfExists[LocalVariableDescriptor]

'containingFile' @ [46:63] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'myFixture' @ [49:13] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[JavaPropertyDescriptor]

'configureByFile' @ [49:23] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'dependencyFileName' @ [49:39] ==> value-parameter dependencyFileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureByDependencyIfExists[ValueParameterDescriptorImpl]

'if (File(testDataPath + File.separator + fileName).exists()) {
            return myFixture.configureByFile(fileName) as KtFile
        }
        else {
            return myFixture.configureByText(fileName, DEFAULT_TO_FILE_TEXT) as KtFile
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'File' @ [54:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [54:18] ==> protected for synthetic extension final val AbstractCopyPasteTest.testDataPath: String[MyPropertyDescriptor]

'separator' @ [54:38] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'fileName' @ [54:50] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureTargetFile[ValueParameterDescriptorImpl]

'exists' @ [54:60] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'myFixture' @ [55:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[JavaPropertyDescriptor]

'configureByFile' @ [55:30] ==> public abstract fun configureByFile(@NotNull p0: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'fileName' @ [55:46] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureTargetFile[ValueParameterDescriptorImpl]

'myFixture' @ [58:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[JavaPropertyDescriptor]

'configureByText' @ [58:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'fileName' @ [58:46] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest.configureTargetFile[ValueParameterDescriptorImpl]

'DEFAULT_TO_FILE_TEXT' @ [58:56] ==> private final val DEFAULT_TO_FILE_TEXT: String defined in org.jetbrains.kotlin.idea.AbstractCopyPasteTest[PropertyDescriptorImpl]

